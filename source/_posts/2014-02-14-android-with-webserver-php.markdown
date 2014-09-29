---
layout: post
title: "Android With Webserver PHP"
date: 2014-02-14 08:41
comments: true
categories: 
- android
- php
---

Membuat aplikasi android dengan webserver menggunakan php.
<!--more-->
#### 1 Buat Database test_android.
#### 2 Buat Table users(username, fullname). 
#### 3 Buat file php : 
{% include_code android/webserver_php/input_data.php %}

{% include_code android/webserver_php/select_table.php %}
#### 4 Buat android project.
#### 5 MainActivity.java.
{% include_code android/webserver_php/MainActivity.java %}

> IP didalam file sesuaikan sama ip server anda, dan juga nama file php yang dibuat tadi

#### 6 Buat java class baru "StreamConverter.java" mengubah data ke Stream agar dapat di tangkap di php.
{% include_code android/webserver_php/StreamConverter.java %}
#### 7 activity_main.xml
{% include_code android/webserver_php/activity_main.xml %}
