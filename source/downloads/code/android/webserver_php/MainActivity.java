package com.ivans.php;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.ResponseHandler;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.ByteArrayEntity;
import org.apache.http.impl.client.BasicResponseHandler;
import org.apache.http.NameValuePair;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.params.BasicHttpParams;
import org.apache.http.params.HttpConnectionParams;
import org.apache.http.params.HttpParams;
import org.json.JSONArray;
import org.json.JSONObject;

import android.app.Activity;
import android.os.Bundle;
import android.os.StrictMode;
import android.util.Log;
import android.view.View;
import android.widget.Toast;




public class MainActivity extends Activity {
	/** Called when the activity is first created. */
	int TIMEOUT_MILLISEC = 10000; // = 10 seconds

	@Override
	public void onCreate(Bundle savedInstanceState) {
		try {

			super.onCreate(savedInstanceState);
			setContentView(R.layout.activity_main);
			
			StrictMode.ThreadPolicy policy = new
			StrictMode.ThreadPolicy.Builder().permitAll().build();
			StrictMode.setThreadPolicy(policy);

		} catch (Throwable t) {
			Toast.makeText(this, "Request failed: " + t.toString(),
					Toast.LENGTH_LONG).show();
		}
	}

	public void clickbuttonSent(View v) {
		try {
			JSONObject json = new JSONObject();
			json.put("username", "ivans");
			json.put("fullname", "ivans ganteng");
			HttpParams httpParams = new BasicHttpParams();
			HttpConnectionParams.setConnectionTimeout(httpParams,
					TIMEOUT_MILLISEC);
			HttpConnectionParams.setSoTimeout(httpParams, TIMEOUT_MILLISEC);
			HttpClient client = new DefaultHttpClient(httpParams);
			//
			//String url = "http://10.0.2.2:8080/sample1/webservice2.php?json={\"UserName\":1,\"FullName\":2}";
			String url = "http://192.168.0.103/webservice2.php";

			HttpPost request = new HttpPost(url);
			request.setEntity(new ByteArrayEntity(json.toString().getBytes(
					"UTF8")));
			request.setHeader("json", json.toString());
			HttpResponse response = client.execute(request);
			HttpEntity entity = response.getEntity();
			// If the response does not enclose an entity, there is no need
			if (entity != null) {
				InputStream instream = entity.getContent();

				String result = StreamConverter.convertStreamToString(instream);
				Log.i("Read from server", result);
				Toast.makeText(this,  result,
						Toast.LENGTH_LONG).show();
			}
		} catch (Throwable t) {
			Toast.makeText(this, "Request failed: " + t.toString(),
					Toast.LENGTH_LONG).show();
		}
	}

	public void clickbuttonRecieve(View v) {
		try {
			// http://androidarabia.net/quran4android/phpserver/connecttoserver.php

			// Log.i(getClass().getSimpleName(), "send  task - start");
			HttpParams httpParams = new BasicHttpParams();
			HttpConnectionParams.setConnectionTimeout(httpParams,
					TIMEOUT_MILLISEC);
			HttpConnectionParams.setSoTimeout(httpParams, TIMEOUT_MILLISEC);
			//
			HttpParams p = new BasicHttpParams();
			// p.setParameter("name", pvo.getName());

			// Instantiate an HttpClient
			HttpClient httpclient = new DefaultHttpClient(p);
			String url = "http://192.168.0.103/webservice1.php?user=1&format=json";
			HttpPost httppost = new HttpPost(url);

			// Instantiate a GET HTTP method
			try {
				Log.i(getClass().getSimpleName(), "send  task - start");
				
				//List<NameValuePair> nameValuePairs = new ArrayList<NameValuePair>(2);
				//nameValuePairs.add(new BasicNameValuePair("user", "1"));
				//httppost.setEntity(new UrlEncodedFormEntity(nameValuePairs));
				
				ResponseHandler<String> responseHandler = new BasicResponseHandler();
				String responseBody = httpclient.execute(httppost,
						responseHandler);
				// Parse
				JSONObject json = new JSONObject(responseBody);
				JSONArray jArray = json.getJSONArray("posts");
				ArrayList<HashMap<String, String>> mylist = new ArrayList<HashMap<String, String>>();

				for (int i = 0; i < jArray.length(); i++) {
					HashMap<String, String> map = new HashMap<String, String>();
					JSONObject e = jArray.getJSONObject(i);
					String s = e.getString("post");
					JSONObject jObject = new JSONObject(s);

					map.put("idusers", jObject.getString("idusers"));
					map.put("username", jObject.getString("username"));
					map.put("fullname", jObject.getString("fullname"));

					mylist.add(map);
				}
				Toast.makeText(this, responseBody, Toast.LENGTH_LONG).show();

			} catch (ClientProtocolException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			// Log.i(getClass().getSimpleName(), "send  task - end");

		} catch (Throwable t) {
			Toast.makeText(this, "Request failed: " + t.toString(),
					Toast.LENGTH_LONG).show();
		}

	}

	public class Data {
		// private List<User> users;
		public List<User> users;

		// +getters/setters
	}

	static class User {
		String idusers;
		String username;
		String fullname;
		
		public String getIdusers() {
			return idusers;
		}
		public void setIdusers(String idusers) {
			this.idusers = idusers;
		}
		public String getUsername() {
			return username;
		}
		public void setUsername(String username) {
			this.username = username;
		}
		public String getFullname() {
			return fullname;
		}
		public void setFullname(String fullname) {
			this.fullname = fullname;
		}

	}
}