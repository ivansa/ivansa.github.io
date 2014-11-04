---
layout: post
title: "Hirarki Memori"
date: 2014-11-04 09:41
comments: true
categories: tulisan komputer
---

Jika kita masuk kedalam dunia komputer pasti sering mendengar istilah-istilah register, cache, RAM, virtual memory. 
Istilah-istilah yang di sebutkan di atas adalah bagian dari hirarki memory yang ada dalam komputer. 

<!--more-->

<img src="{{root_url}}/images/blog/tulisan/hirarki-memori/hirarki.png" style="border:1px solid grey;margin-top:0.8em">

<b>Penggunaan memory tersebut di bagi menjadi 2 yaitu :</b><br />
<ol>
<li>tempat penyimpanan sementara (Temporary Storage)</li>
<li>tempat penyimpanan tetap (Permanent Storage). </li>
</ol>

Temporary storage digunakan saat komputer melakukan pemrosesan data, 
sedangkan Permanent Storage digunakan saat menyimpan data secara permanent.

<b>Ciri dari hirarki memori : </b><br />
<ol>
<li>peningkatan waktu akses (access time) memori (semakin ke bawah semakin lambat, semakin ke atas semakin cepat) </li>
<li>peningkatan kapasitas (semakin ke bawah semakin besar, semakin ke atas semakin kecil)</li>
<li>peningkatan jarak dengan prosesor (semakin ke bawah semakin jauh, semakin ke atas semakin dekat) </li>
<li>penurunan harga memori tiap bitnya (semakin ke bawah semakin semakin murah, semakin ke atas semakin mahal) </li>
</ol>

Memori yang lebih kecil, lebih mahal dan lebih cepat diletakkan pada urutan teratas. 
Sehingga, jika diurutkan dari yang tercepat, maka urutannya adalah sebagai berikut:

<ol>
<li><b>register mikroprosesor</b> <br />
	Ukurannya yang paling kecil tapi memiliki waktu akses yang paling cepat, umumnya hanya 1 siklus CPU saja.
	Register adalah memory internal yang didesain untuk dapat menyimpan data lebih cepat dibandingkan memory utama. 
	Register berada dalam hirarki memory tertinggi dalam struktur dia atas, hal ini menunjukkan register paling cepat dalam pengaksesan data,paling dekat dengan memory utama dan paling kecil kapstitas memorynya.
	<br /><br />
	Register memiiki 2 fungsi, yaitu:<br />
	<ul>
		<li><b>User Visibel Register</b><br />Register CPU yang dapat digunakan oleh pemrogram, dengan menggunakan set intsruksi memungkinkan satu buah register atau lebih untuk dispesifikasian sebagai operand atau alamat operand.</li>
		<li><b>Control dan Status Register</b><br />Register yang digunakan oleh unit kontrol untuk mengintrol operasi CPU dan oleh program sistem operasi untuk mengontrol eksekusi program. </li>
	</ul>
	<br /><br />
</li>
<li><b>Cache mikroprosesor</b> <br />
	Cache mikroprosesor, disusun berdasarkan kedekatannya dengan prosesor (level-1, level-2, level-3, dan seterusnya).<br /><br />
	Memori cache mikroprosesor dikelaskan ke dalam tingkatan-tingkatannya sendiri:
	<ul>
		<li><b>Level 1</b><br />Memiliki ukuran paling kecil di antara semua cache, sekitar puluhan kilobyte saja. Kecepatannya paling cepat di antara semua cache.</li>
		<li><b>Level 2</b><br />Memiliki ukuran yang lebih besar dibandingkan dengan cache level-1, yakni sekitar 64 kilobyte, 256 kilobyte, 512 kilobyte, 1024 kilobyte, atau lebih besar. Meski demikian, kecepatannya lebih lambat dibandingkan dengan level-1, dengan nilai latency kira-kira 2 kali hingga 10 kali. Cache level-2 ini bersifat opsional. Beberapa prosesor murah dan prosesor sebelum Intel Pentium tidak memiliki cache level-2.</li>
		<li><b>Level 3</b><br />memiliki ukuran yang lebih besar dibandingkan dengan cache level-2, yakni sekitar beberapa megabyte tapi agak lambat. Cache ini bersifat opsional. Umumnya digunakan pada prosesor-prosesor server dan workstation seperti Intel Xeon atau Intel Itanium. Beberapa prosesor desktop juga menawarkan cache level-3 (seperti halnya Intel Pentium Extreme Edition), meski ditebus dengan harga yang sangat tinggi. </li>
	</ul>
	<br /><br />
</li>
<li><b>Main memory</b> <br />
	memiliki akses yang jauh lebih lambat dibandingkan dengan memori cache, dengan waktu akses hingga beberapa ratus siklus CPU, tapi ukurannya mencapai satuan gigabyte. Waktu akses pun kadang-kadang tidak seragam, khususnya dalam kasus mesin-mesin Non-uniform memory access (NUMA). 
	<br /><br />
	<ul>
		<li><b>ROM</b><br />ROM ( Read Only memory) yaitu memory yang hanya bisa dibaca saja datanya atau programnya. Pada PC, ROM terdapat pada BIOS ( Basic Input Output System ) yang terdapat pada Mother Board yang berfungsi untuk men-setting peripheral yang ada pada system. Contoh: AMIBIOS, AWARD BIOS, dll. ROM untuk BIOS terdapat beragam jenis diantaranya jenis Flash EEPROM BIOS yang memiliki kemampuan untuk dapat diganti programnya dengan software yang disediakan oleh perusahhan pembuat Mother Board, yang umumnya penggantian tersebut untuk peningkatan unjuk kerja dari peripheral yang ada di Mother Board.</li>
		<li><b>RAM</b><br />RAM (Random Acces Memory) yang memiliki kemampuan untuk dirubah data atau program yang tersimpan didalamnya.</li>
	</ul>
	<br /><br />
</li>
<li><b>Penyimpan cadangan lokal</b>
	<br /><br />
	<ul>
		<li><b>Magnetic Disk</b><br />Magnetik penyimpanan data, digunakan untuk penyimpanan tersier dan off-line Pada komputer awal, penyimpanan magnetik juga digunakan untuk penyimpanan primer dalam bentuk memory magnetik drum, atau inti, memory inti tali, memory film tipis, memory twistor atau memory gelembung. Juga tidak seperti hari ini, pita magnetik sering digunakan untuk penyimpanan sekunder.</li>
		<li><b>Optical Tape</b><br />Optical tape adalah media untuk penyimpanan optik pada umumnya terdiri dari strip panjang dan sempit dari plastik ke mana pola dapat ditulis dan dari mana pola bisa dibaca kembali. Ini beberapa saham teknologi dengan stok film bioskop dan cakram optik, tetapi kompatibel dengan tidak. Motivasi di balik pengembangan teknologi ini adalah kemungkinan kapasitas penyimpanan yang jauh lebih besar daripada baik pita magnetik atau cakram optic.</li>
	</ul>
	<br /><br />
</li>
<li><b>Penyimpan cadangan jarak jauh</b> <br />
	<br /><br />
	<ul>
		<li><b>File Sistem Terdistribusi</b><br />File Sistem Terdistribusi ( Distributed File System ) adalah file sistem yang mendukung sharing files dan resources dalam bentuk penyimpanan persistent di sebuah network. </li>
		<li><b>Cloud server</b><br />Teknologi cloud memungkinkan beberapa server dijadikan "satu" berfungsi sebagai storage (disk virtual), beberapa server lain (Host) di"satu"kan berfungsi sebagai computing node (CPU virtual). Diatas platform cloud tersebut bisa berjalan beberapa server virtual (Guest). Teknologi cloud juga memungkinkan sekumpulan server virtual (Guest) membentuk suatu network VLAN seperti layaknya server-server fisik yang terhubung dengan LAN. Dimana tiap pelanggan memiliki secure VLAN masing-masing yang tidak bisa saling memasuki. Sehingga aplikasi business online anda terutama di Indonesia, yang membutuhkan konfigurasi beberapa server dapat di akomodir oleh layanan cloud server.</li>
	</ul>
</li>
</ol>

<p align="center">
<b>Sumber : </b><br />
<a href="http://en.wikipedia.org/">en.Wikipedia.org</a><br />
<a href="http://www.google.com/">www.google.com</a><br />
</p>
