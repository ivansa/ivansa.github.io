---
layout: post
title: "Arsitektur Telematika"
date: 2016-10-28 09:21
comments: true
categories: tulisan
---

Pembahasan kali ini adalah tentang arsitektur telematika, pada dasarnya arsitektur telematika terbagi 2 yaitu client side (Pengguna) dan server side (Penyedia).
Istilah arsitektur mengacu pada desain sebuah aplikasi, atau dimana komponen yang membentuk suatu sistem ditempatkan dan bagaimana mereka berkomunikasi.
Jadi arsitektur telematika dapat diartikan sebuah struktur desain yang secara logic dapat meningkatkan hubungan jaringan komunikasi dengan teknologi informasi.

<!-- more -->

#### PENGERTIAN ARSITEKTUR TELEMATIKA

<hr />

Istilah arsitektur mencakup merancang atau mendesain sebuah aplikasi, atau dimana komponen yang membentuk suatu sistem diolah dan ditempatkan agar komponen tersebut dapat berinteraksi. Arsitektur sistem harus berdasarkan konfigurasi sistem secara keseluruhan yang akan menjadi tempat dari DBMS, basis data dan aplikasi yang memanfaatkannya yang juga akan menentukan bagaimana pemakai dapat berinteraksi dengannya

Sehingga dapat diartikan, <b>Arsitektur</b> Telematika adalah sebuah aplikasi yang secara logic berada diantara lapisan aplikasi (application layer dan lapisan data dari sebuah arsitektur layer – layer TCP/IP) yang dapat meningkatkan hubungan jaringan komunikasi dengan teknologi informasi.

#### ARSITEKTUR CLIENT-SERVER TELEMATIKA

<hr />

<center><img src="{{root_url}}/images/blog/arsitektur_telematika/client_server.png" style="border:1px solid grey;margin-top:0.8em"></center><br />

Karena keterbatasan sistem file sharing, dikembangkanlah Arsitektur Client-Server. Arsitektur Client-Server merupakan sebuah aplikasi yang bertugas untuk membagi pekerjaan antara server(penyedia layanan) dan client. Client dan server terkadang menggunakan jaringan komputer pada hardware yang terpisah. Sedangkan server dapat menjalankan satu atau lebih program untuk memberikan data-data pada client. Arsitektur client – server telematika terdiri dari 3 buah arsitektur yakni, arsitektur sisi client, sisi servernya dan gabungan dari arsitektur client-server.

<b>1. Arsitektur  dari sisi client </b>

Arsitektur dari sisi klien mengarah pada  pelaksanaan data  pada browser sisi koneksi HTTP. Contohnya adalah JavaScript dari sisi eksekusi client dan cookie dari sisi penyimpanan pada client. Beberapa ciri khas dari sisi client, sebagai berikut :

<ul>
	<li>Selalu memulai permintaan ke server.</li>
	<li>Menunggu dan menerima balasan dari server.</li>
	<li>Biasanya terhubung ke sejumlah kecil dari server pada satu waktu.</li>
	<li>Biasanya berinteraksi langsung dengan pengguna akhir dengan menggunakan antarmuka pengguna seperti antarmuka pengguna grafis. Khusus jenis klien mencakup: web browser, e-mail klien, dan online chat klien.</li>
</ul>

<b>2. Arsitektur dari sisi server </b>

Pada sisi server, terdapat server Web khusus yang mengeksekusi perintah dengan menggunakan metode HTTP. Contoh dari sisi server adalah penggunaan CGI script yang tertanam di halaman HTML, hal tersebut dapat memicu terjadinya perintah untuk mengeksekusi. Beberapa ciri khas dari sisi server, sebagai berikut :

<ul>
	<li>Menunggu permintaan dari salah satu client.</li>
	<li>Melayani permintaan klien dan menjawab sesuai data yang diminta oleh client.</li>
	<li>Suatu server dapat berkomunikasi dengan server lain untuk melayani permintaan client.</li>
	<li>Jenis-jenisnya : web server, FTP server, database server, E-mail server, file server, print server.</li>
</ul>

Client dan server dikembangkan oleh berbagai perusahaan software besar seperti Lotus, Microsoft, Novell, Baan, Informix, Oracle, PeopleSoft, SAP, Sun, dan Sybase. Perusahaan-perusahaan tersebut telah menjadi perusahaan komputer yang stabil dan besar pada era ini.

<b>3. Arsitektur dari sisi Client – Server </b>

Arsitektur dari segi Client – Server ini terdiri dari 3 jenis yaitu, Single Tier, Two Tier, dan Three Tier (Multi Tier). 
Berikut merupakan penjelasan dari 3 jenis arsitektur client-server :

<ol type="a">
	<li><b>Arsitektur Single-Tier</b><br />
<center><img src="{{root_url}}/images/blog/arsitektur_telematika/1_tier.jpg" style="border:1px solid grey;margin-top:0.8em"></center><br />
	    Pada Arsitektur Single-Tier, semua komponen produksi dari sistem dijalankan pada komputer yang sama. 
	    Beberapa sifat dari Single-Tier antara lain :
		<ul>
			<li>Sederhana dan alternatifnya sangat mahal.</li>
			<li>Membutuhkan sedikit perlengkapan untuk dibeli dan dipelihara.</li>
			<li>Kelemahan pada keamanan dari arsitektur ini yaitu rendahnya dan kurangnya skalabilitas.</li>
		</ul><br />
	</li>
	<li><b>Arsitektur Two-tier</b><br />
<center><img src="{{root_url}}/images/blog/arsitektur_telematika/2_tier.jpg" style="border:1px solid grey;margin-top:0.8em"></center><br />
	    Pada Arsitektur Two-tier, antarmuka pengguna ditempatkan di lingkungan desktop dan sistem manajemen database. Biasanya dalam sebuah server, yang lebih kuat merupakan mesin yang menyediakan layanan bagi banyak klien. Pengolahan informasi dibagi antara sistem interface lingkungan dan lingkungan server manajemen database. Arsitektur two-tier lebih aman dan terukur daripada pendekatan single-tier. Mempunyai database pada komputer yang terpisah meningkatkan kinerja keseluruhan situs. Kelemahannya adalah biaya yang mahal dan arsitektur yang kompleks.
	<br /><br /></li>
	<li><b>Arsitektur Three-tier</b><br />
<center><img src="{{root_url}}/images/blog/arsitektur_telematika/3_tier.jpg" style="border:1px solid grey;margin-top:0.8em"></center><br />
	    Model three-tier atau multi-tier dikembangkan untuk menjawab keterbatasan pada arsitektur two-tier. Konsep model three-tier adalah model yang membagi fungsionalitas ke dalam lapisan-lapisan, aplikasi-aplikasi mendapatkan skalabilitas, keterbaharuan, dan keamanan. Three-tier client dan server arsitektur digunakan untuk meningkatkan performa untuk jumlah pengguna besar dan juga meningkatkan fleksibilitas ketika dibandingkan dengan pendekatan dua tingkat. Kekurangannya adalah pengembangan lebih sulit daripada pengembangan pada arsitektur dua lapis.Pada tiga tingkatan arsitektur, sebuah middleware digunakan diantara sistem user interface lingkungan klien dan server manajemen database lingkungan. Middleware ini diimplementasikan dalam berbagai cara seperti pengolahan transaksi monitor, pesan server atau aplikasi server.<br />
	Beberapa Keuntungan Arsitektur Three-Tier :
<ul>
	<li>Keluwesan teknologi,</li>
	<li>Mudah untuk mengubah DBMS engine,</li>
	<li>Memungkinkan pula middle tier ke platform yang berbeda,</li>
	<li>Biaya jangka panjang yang rendah,</li>
	<li>Perubahan-perubahan cukup dilakukan pada middle tier daripada pada aplikasi keseluruhan,</li>
	<li>Keunggulan kompetitif,</li>
	<li>Kemampuan untuk bereaksi terhadap perubahan bisnis dengan cepat, dengan cara mengubah modul kode daripada mengubah keseluruhan aplikasi.</li>
</ul>
	</li>
</ol>


> Sumber : <a href="https://grandispram.wordpress.com/2016/10/12/arsitektur-telematika/">grandispram.wordpress.com</a>
