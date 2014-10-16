---
layout: post
title: "Pengenalan JSP"
date: 2014-10-01 09:41
comments: true
categories: tulisan
---

<p>
Java Server Pages atau JSP adalah sebuah teknologi untuk membantu software developers membuat dinamik halaman web berbasis html, xml 
ataupun tipe dokumen lain, Di release tahun 1999 oleh Sun Microsystems.
JSP mirip seperti bahasa pemprograman PHP, tetapi JSP menggunakan bahasa JAVA.
</p>

<!--more-->



<h3>Penggunaan JSP :</h3>
<p>
Untuk menggunakan JSP, kita harus menggunakan code atau tanda sebagai pembuka dan penutup (Pembatas).
</p>

Penulisan pada html :
```
<% code fragment %>
```

Penulisan pada xml :
```
<jsp:scriptlet>
   code fragment
</jsp:scriptlet>
```

contohnya :
``` 
<html>
	<head>
		<title>Hello World</title>
	</head>
	<body>
		Hello World!<br/>
		<% out.println("Your IP address is " + request.getRemoteAddr()); %>
	</body>
</html>
```

<h3>JSP Deklarations :</h3>
<p>
Berikut ini merupakan cara untuk mendeklarasikan variabel atau method dengan menggunakan kode JAVA didalam file JSP,
Anda harus mendeklarasikan terlebih dahulu sebelum anda menggunakannya, maka biasanya deklarasi berada di paling awal.
</p>

Penulisan pada html :
```
<%! declaration; [ declaration; ]+ ... %>
```

Penulisan pada xml :
```
<jsp:declaration>
   code fragment
</jsp:declaration>
```

contohnya :
``` 
<%! int i = 0; %>
<%! int a, b, c; %>
<%! Circle a = new Circle(2.0); %> 
```

<h3>JSP Expression :</h3>
<p>Sebuah ekspresi elemen mengandung bahasa script yang dievaluasi , diubah menjadi String , dan ditampilkan dalam file JSP .
Karena nilai dari sebuah ekspresi diubah menjadi String , Anda dapat menggunakan ekspresi dalam baris teks , apakah itu adalah HTML tag atau bukan dalam file JSP .
Unsur Ekspresi bisa berisi ekspresi yang valid sesuai dengan Java Language Specification tetapi Anda tidak dapat menggunakan titik koma untuk mengakhiri ekspresi .
</p>

Penulisan pada html :
```
<%= expression %>>
```

Penulisan pada xml :
```
<jsp:expression>
   expression
</jsp:expression>
```

contohnya :
``` 
<html>
	<head>
		<title>A Comment Test</title>
	</head>
	<body>
		<p>
			Today's date: <%= (new java.util.Date()).toLocaleString()%>
		</p>
	</body>
</html> 
```

<h3>JSP Comments :</h3>
<p>JSP comment menandai teks atau pernyataan di JSP harus diabaikan / tidak tereksekusi. 
Sebuah comment JSP berguna ketika anda ingin menyembunyikan atau "komentar" bagian dari halaman JSP Anda.
</p>

Penulisan pada html :
```
<%-- This is JSP comment --%>
```

contohnya :
``` 
<html>
	<head>
		<title>A Comment Test</title>
	</head>
	<body>
		<h2>A Test of Comments</h2>
		<%-- This comment will not be visible in the page source --%>
	</body>
</html> 
```

<table border="1" width="100%">
	<thead>
		<tr>
			<td><b>Syntax</b></td>
			<td><b>Purpose</b></td>
		</tr>
	</thead>
	<tbody>
		<tr>
			<td><%-- comment --%></td>
			<td>JSP comment, di abaikan oleh JSP engine</td>
		</tr>
		<tr>
			<td>&lt;!-- comment --&gt;</td>
			<td>HTML comment, di abaikan oleh browser</td>
		</tr>
		<tr>
			<td><\%</td>
			<td>Represents static <% literal.</td>
		</tr>
		<tr>
			<td>%\></td>
			<td>Represents static %> literal.</td>
		</tr>
		<tr>
			<td>\'</td>
			<td>A single quote in an attribute that uses single quotes.</td>
		</tr>
		<tr>
			<td>\"</td>
			<td>A double quote in an attribute that uses double quotes.</td>
		</tr>
	</tbody>
</table>

<h3>JSP Directives :</h3>
<p>
JSP directive mempengaruhi keseluruhan struktur kelas servlet. Ini biasanya memiliki form berikut:
</p>

```
<%@ directive attribute="value" %>
```

Terdapat 3 tipe pada directive tag :
<table border="1" width="100%">
	<thead>
		<tr>
			<td><b>Directive</b></td>
			<td><b>Description</b></td>
		</tr>
	</thead>
	<tbody>
		<tr>
			<td><%@ page ... %></td>
			<td>Mendefinisikan atribut page-dependent, <br />seperti bahasa scripting, error halaman, dan persyaratan buffering.</td>
		</tr>
		<tr>
			<td><%@ include ... %></td>
			<td>Memasukan file selama fase penerjemahan.</td>
		</tr>
		<tr>
			<td><%@ taglib ... %></td>
			<td>Mendeklarasikan tag library,  <br />yang berisi custom action, yang digunakan dalam halaman</td>
		</tr>
	</tbody>
</table>

<h3>JSP Actions :</h3>
<p>
JSP actions menggunakan constructs dalam sintaks XML untuk mengontrol perilaku mesin servlet . 
Anda dapat secara dinamis memasukkan file , menggunakan kembali komponen JavaBeans , 
meneruskan pengguna ke halaman lain , atau menghasilkan HTML untuk plugin Java .
Hanya ada satu sintaks untuk elemen Action , karena sesuai dengan standar XML :
</p>

```
<jsp:action_name attribute="value" />
```

Action elements pada dasarnya adalah predefined function dan mengikuti JSP action yang tersedia :
<table border="1" width="100%">
	<thead>
		<tr>
			<td><b>Syntax</b></td>
			<td><b>Purpose</b></td>
		</tr>
	</thead>
	<tbody>
		<tr>
			<td>jsp:include</td>
			<td>Include file pada saat halaman diminta</td>
		</tr>
		<tr>
			<td>jsp:useBean</td>
			<td>Mencari atau menggunakan javaBean</td>
		</tr>
		<tr>
			<td>jsp:setProperty</td>
			<td>Set properti dari JavaBean</td>
		</tr>
		<tr>
			<td>jsp:getProperty</td>
			<td>Get properti dari JavaBean</td>
		</tr>
		<tr>
			<td>jsp:forward</td>
			<td>Meneruskan request ke halaman baru</td>
		</tr>
		<tr>
			<td>jsp:plugin</td>
			<td>Menghasilkan kode browser khusus yang membuat OBJEK atau EMBED tag untuk plugin Java</td>
		</tr>
		<tr>
       		<td>jsp:element</td>
  			<td>Mendefinisikan elemen XML dinamis.</td>
        </tr>
        <tr>
       		<td>jsp:attribute</td>
  			<td>Mendefinisikan XML atribut yang didefinisikan secara dinamis.</td>
        </tr>
        <tr>
       		<td>jsp:body</td>
  			<td>Mendefinisikan XML body yang didefinisikan secara dinamis.</td>
        </tr>
        <tr>
       		<td>jsp:text</td>
  			<td>Mendefinisikan XML text yang didefinisikan secara dinamis.</td>
        </tr>
	</tbody>
</table>
