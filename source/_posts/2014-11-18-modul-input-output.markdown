---
layout: post
title: "Modul Input / Output"
date: 2014-11-18 12:41
comments: true
categories: tulisan komputer 
---

Modul I/O adalah interface atau central switch untuk mengendalikan satu atau lebih peripheral atau perangkat input output.

<!--more-->

<H4>Mengapa harus menggunakan modul I/O ?</H4>
<ol>
	<li>Kelajuan transfer data periferal lebih lambat dibandingkan dengan memori atau processor.</li>
	<li>Pada sisi lain transfer data periferal lebih cepat dibandingkan dengan memori atau processor. </li>
	<li>Periferal sering menggunakan format data dan panjang word yang berbeda dengan komputer.</li>
</ol>

<H4>Fungsi utama modul I/O :</H4>
<ol>
	<li>Antar-muka ke processor atau memori melalui sistem bus</li>
	<li>Antar-muka ke satu atau lebih perangkat periferal dengan link data yang sesuai</li>
</ol>

<H4>Model Umum Modul I/O :</H4>
<img src="{{root_url}}/images/blog/tulisan/modul-i-o/model_umum_modul_i_o.png" style="border:1px solid grey;margin-top:0.8em">

<h4>Perangkat Eksternal</h4>
<ul>
	<li>Perangkat eksternal adalah perangkat tambahan untuk membantu pengguna melakukan instruksi pada CPU dan menampilkan hasil I/O yang sudah di proses CPU.</li>
	<li>Contoh perangkat eksternal yaitu: keyboard yang berfungsi memberi instruksi kepada CPU untuk melakukan suatu operasi.</li>
</ul>

<h4>Klasifikasi perangkat eksternal : </h4>
<ol>
	<li>Human Readable<br />
		Perangkat yang berhubungan dengan manusia sebagai pengguna komputer.
	</li>
	<li>Machine Readable<br />
		Perangkat yang berhubungan dengan peralatan.
	</li>
	<li>Communication<br />
		Perangkat yang berhubungan dengan komunikasi jarak jauh.
	</li>
</ol>

<h4>Diagram Blog Perangkat Eksternal</h4>
<img src="{{root_url}}/images/blog/tulisan/modul-i-o/skema_perangkat_keras.jpg" style="border:1px solid grey;margin-top:0.8em">

<h4>Jalur koneksi / port perangkat eksternal :</h4>
<ol>
	<li>Port Komputer</li>
	<li>Port serial</li>
	<li>Port Paralel</li>
	<li>Universal Serial BUS</li>
	<li>USB hub</li>
	<li>PCMCIA</li>
	<li>Hub\Switch</li>
	<li>Nir Kabel</li>
</ol>

<h4>Fungsi Modul I/O : </h4>
<ol>
	<li>Control & Timing</li>
	<li>Komunikasi CPU</li>
	<li>Komunikasi Perangkat</li>
	<li>Data Buffering</li>
	<li>Deteksi Eror</li>
</ol>

<h4>Teknik operasi pada modul I/O : </h4>
<ul>
	<li>I/O terprogram</li>
	<li>I/O interrupt-driven</li>
	<li>Direct memory access (DMA)</li>
</ul>



