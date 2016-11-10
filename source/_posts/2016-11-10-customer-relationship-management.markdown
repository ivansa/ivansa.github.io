---
layout: post
title: "Customer Relationship Management"
date: 2016-11-03 15:32
comments: true
categories: tulisan
---

CRM adalah sebuah istilah industri TI untuk metodologi, strategi, perangkat lunak (software)
dan atau aplikasi berbasis web lainnya yang mampu membantu sebuah perusahaan
(enterprise, kalau besar ukurannya) untuk mengelola hubungannya dengan para pelanggan,

<!-- more -->

Atau 

CRM adalah usaha sebuah perusahaan untuk berkonsentrasi menjaga pelanggan (supaya
tidak lari ke pesaing) dengan mengumpulkan segala bentuk interaksi pelanggan baik itu lewat
telepon, email, masukan di situs atau hasil pembicaraan dengan staf sales dan marketing,

Atau

CRM adalah sebuah strategi bisnis menyeluruh dari suatu perusahaan yang memungkinkan
perusahaan tersebut secara efektif bisa mengelola hubungan dengan para pelanggan.

#### KARAKTERISTIK CRM

<hr />

CRM adalah fitur berorientasi pelanggan dengan respon layanan berdasarkan masukan pelanggan, satu-ke-satu solusi untuk kebutuhan pelanggan, komunikasi online langsung dengan pelanggan dan customer service center yang dimaksudkan untuk membantu pelanggan memecahkan masalah mereka. Ini mencakup fungsi-fungsi berikut:

<ol>
	<li>Penjualan kekuatan otomatisasi, yang mengimplementasikan analisis promosi penjualan, mengotomatiskan pelacakan sejarah rekening klien untuk penjualan berulang atau penjualan di masa depan, dan сoordinates penjualan, pemasaran, call center, dan outlet ritel.</li>
	<li>Teknologi data warehouse, digunakan untuk informasi transaksi agregat, untuk menggabungkan informasi dengan produk CRM, dan untuk memberikan indikator kinerja utama.</li>
	<li>Manajemen kesempatan yang membantu perusahaan untuk mengelola pertumbuhan tak terduga dan permintaan, dan menerapkan model peramalan yang baik untuk mengintegrasikan sejarah penjualan dengan proyeksi penjualan.</li>
	<li>Sistem CRM yang melacak dan mengukur kampanye pemasaran melalui jaringan ganda, pelacakan analisis pelanggan dengan klik pelanggan dan penjualan.</li>
</ol>

#### ARSITEKTUR CRM

<hr />

Sistem CRM ini memiliki hubungan dengan bagian-bagian lain sesuai dengan bagan berikut ini :

<img src="{{root_url}}/images/blog/crm/arsitektur.jpg" style="border:1px solid grey;margin-top:0.8em">

<b>CRM – Marketing</b>

Hubungan antar bagian ini dibutuhkan pada saat pengiriman SMS broadcast ke seluruh pelanggan. Hal ini dikarenakan isi pesan yang dikirimkan tersebut bergantung pada strategi pemasaran yang diterapkan oleh bagian marketing.

<b>CRM – Sales</b>

Hubungan ini terutama untuk penindaklanjutan keluhan pelanggan. Kasus yang berhubungan dengan sales antara lain apabila pelanggan menanyakan status order mereka yang belum ditanggapi oleh bagian sales.

<b>CRM – Service</b>

Hubungan ini untuk fasilitas service appointment folder dimana perlu adanya cross-check dengan bagian service (bengkel). Hubungan ini juga dapat digunakan untuk penindaklanjutan keluhan pelanggan. Kasus yang berhubungan dengan service antara lain apabila pelanggan menanyakan kondisi terakhir kendaraan mereka yang sedang diperbaiki.

<b>CRM – Quality Control</b>

Hubungan ini terutama untuk penindaklanjutan keluhan pelanggan. Kasus yang berhubungan dengan quality control antara lain apabila pelanggan mengeluhkan kerusakan dan kecacatan komponen kendaraan mereka, yang bukan disebabkan oleh penggunaan tetapi hasil dari produksi pabrik.

<b>CRM – Shipment</b>

Hubungan ini terutama untuk penindaklanjutan keluhan pelanggan. Kasus yang berhubungan dengan shipment antara lain apabila pelanggan menanyakan status pengiriman order mereka yang belum sampai.

<b>CRM – Branch Management</b>

Hubungan ini terutama untuk kegiatan sinkronisasi data antara pusat dan cabang. Cabang akan memberikan trigger untuk melakukan sinkronisasi. Hubungan ini juga dapat digunakan untuk information retrieval mengenai data-data yang ada di kantor cabang.

Dengan memperhatikan keterkaitan antar bagian tersebut, maka dapat dibuat skema umum dari arsitektur sistem sebagai berikut :

<img src="{{root_url}}/images/blog/crm/bagan_arsitektur.jpg" style="border:1px solid grey;margin-top:0.8em">

#### IMPLEMENTASI CRM

<hr />

Untuk mengimplementasikan sebuah strategi CRM,
diperlukan paling tidak 3 (tiga) faktor kunci yaitu 

<ol>
<li>orang-orang yang profesional (kualifikasi memadai),
</li><li>proses yang didesain dengan baik dan 
</li><li>teknologi yang memadai (leading-edge technology).
Tenaga yang profesional tidak saja mengerti
bagaimana menghadapi pelanggan tetapi juga
mengerti cara menggunakan teknologi (untuk CRM).
</li></ol>

Apapun tanpa desain yang baik akan gagal, begitu
juga CRM. Perusahaan pengguna CRM harus sudah
mengetahui tujuan (business objectives) dan tuntutan
bisnis (business requirements) yang diinginkan dari
implementasi CRM ini. Teknologi CRM paling tidak
harus memiliki elemen-elemen berikut:

<ol>
	<li>Aturan-aturan Bisnis</li>
	<li>Penggudangan Data (data warehousing)</li>
	<li>Situs (web)</li>
	<li>Pelaporan (reporting)</li>
	<li>Meja Bantu (helpdesk)</li>
</ol>