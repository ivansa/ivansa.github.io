---
layout: post
title: "Komponen Sistem Pakar"
date: 2014-12-29 14:41
comments: true
categories: tulisan 
---

Sistem Berbasis Pengetahuan diturunkan dari istilah knowledge based expert system. 
Sistem ini merupakan sistem yang menggunakan pengetahuan manusia yang telah disimpan dalam 
komputer untuk menyelesaikan permasalahan yang memerlukan kepakaran seorang ahli (Buliali, dkk., 2007)

<!--more--> 

<img src="{{root_url}}/images/blog/tulisan/komponen-sistem-pakar/bagan.png" style="border:1px solid grey;margin-top:0.8em">

<h4>Pengetahuan / Knowledge</h4>
Pengetahuan merupakan kemampuan untuk membentuk model mental yang menggambarkan obyek 
dengan tepat dan mempresentasikannya dalam aksi yang dilakukan terhadap suatu obyek (Martin dan Oxman, 1988).

Pengetahuan dapat diklasifikasikan menjadi tiga, yaitu pengetahuan prosedural (procedural knowledge), 
pengetahuan deklaratif (declaratif knowlwdge), dan pengetahuan tacit (tacit knowledge). 
Pengetahuan prosedural lebih menekankan pada bagaimana melakukan sesuatu, 
pengetahuan deklaratif menjawab pertanyaan apakah sesuatu bernilai salah atau benar, 
sedangkan pengetahuan tacit merupakan pengetahuan yang tidak dapat diungkapkan dengan bahasa.

Basis pengetahuan mengandung pengetahuan untuk pemahaman, formulasi, dan penyelesaian masalah. 
Komponen sistem pakar ini disusun atas 2 elemen dasar, yaitu :
<ol>
	<li>Fakta. Informasi tentang obyek dalam area permasalahan tertentu.</li>
    <li>Aturan. Informasi tentang cara bagaimana memperoleh fakta baru dari fakta yang telah diketahui.</li>
</ol>

<!-- ============================================================================================== -->

<h4>Memori Kerja / Working Memory</h4>
Dalam sistem pakar terdapat memori kerja untuk menyimpan data hasil observasi dan 
data lainnya yang dibutuhkan selama pengolahan memori kerja tersebut berada di dalam memori komputer.

Workplace merupakan area dari sekumpulan memori kerja (working memory), 
digunakan untuk merekam kejadian yang sedang berlangsung termasuk keputusan sementara.<br />
Ada 3 keputusan yang dapat direkam :
<ol>
	<li>Rencana : Bagaimana menghadapi masalah.</li>
    <li>Agenda : aksi-aksi yang potensial yang sedang menunggu untuk dieksekusi.</li>
    <li>Solusi : calon aksi yang akan dibangkitkan.</li>
</ol>

<!-- ============================================================================================== -->

<h4>Mesin Inferensi /  Interface Engine</h4>
Elemen ini mengandung mekanisme pola pikir dan penalaran yang digunakan oleh pakar dalam menyelesaikan suatu masalah. 
Mesin inferensi adalah program komputer yang memberikan metodologi untuk 
penalaran tentang informasi yang ada dalam basis pengetahuan dan dalam workplace, dan untuk memformulasikan kesimpulan. 

Mesin inferensi berperan sebagai otak dari sistem pakar. 
Mesin inferensi berfungsi untuk memandu proses penalaran terhadap suatu kondisi, 
berdasarkan pada basis pengetahuan yang tersedia. Di dalam mesin inferensi terjadi proses untuk memanipulasi dan 
mengarahkan kaidah, model, dan fakta yang disimpan dalam basis pengetahuan dalam rangka mencapai solusi atau kesimpulan. 
Dalam prosesnya, mesin inferensi menggunakan strategi penalaran dan strategi pengendalian. 
Strategi penalaran terdiri dari strategi penalaran pasti (Exact Reasoning) dan strategi penalaran tak pasti (Inexact Reasoning). 
Exact reasoning akan dilakukan jika semua data yang dibutuhkan untuk menarik suatu kesimpulan tersedia, 
sedangkan inexact reasoning dilakukan pada keadaan sebaliknya. 
Strategi pengendalian berfungsi sebagai panduan arah dalam melakukan prose penalaran. 
Terdapat tiga tehnik pengendalian yang sering digunakan, 
yaitu forward chaining, backward chaining, dan gabungan dari kedua teknik pengendalian tersebut.

Dibawah ini ada 2 macam metode inference, yaitu :
<ol>
	<li>Forward Chaining<br />
		<p>Menggunakan himpunan aturan kondisi-aksi. 
		Dalam metode ini, data digunakan untuk menentukan aturan mana yang akan dijalankan, 
		kemudian aturan tersebut dijalankan. Mungkin proses menambahkan data ke memori kerja. 
		Proses diulang sampai ditemukan suatu hasil (Wilson,1998).</p>
		
		<p>Forward chaining merupakan grup dari multiple inferensi yang melakukan pencarian dari suatu masalah kepada solusinya</p>
		
		<p>Jika klausa premis sesuai dengan situasi (bernilai TRUE), maka proses akan meng-assert konklusi.</p>
		
		<p>Forward chaining adalah data-driven karena inferensi dimulai dengan informasi yang tersedia dan baru konklusi diperoleh.</p>
		
		<p>Jika suatu aplikasi menghasilkan tree yang lebar dan tidak dalam, maka gunakan forward chaining.</p>
	</li>
    <li>Backward Chaining<br />
		<p>Merupakan penalaran dari node tujuan dan bergerak ke belakang menuju keadaan awal, 
		dalam penalaran ke belakang prosesnya disebut terarah.</p>
		
		<p>Menggunakan pendekatan goal-driven, dimulai dari ekspektasi apa yang diinginkan terjadi (hipotesis), 
		kemudian mengecek pada sebab-sebab yang mendukung (ataupun kontradiktif) dari ekspektasi tersebut.</p>
		
		<p>Jika suatu aplikasi menghasilkan tree yang sempit dan cukup dalam, maka gunakan backward chaining.</p>
    </li>
</ol>
<!-- ============================================================================================== -->

<h4>Akuisisi Pengetahuan / Knowledge Acquisition</h4>
Akuisisi pengetahuan adalah akumulasi, transfer, dan 
transformasi keahlian dalam menyelesaikan masalah dari sumber pengetahuan ke dalam program komputer. 
Dalam tahap ini knowledge engineer berusaha menyerap pengetahuan untuk selanjutnya ditransfer ke dalam basis pengetahuan. 
Pengetahuan diperoleh dari pakar, dilengkapi dengan buku, basis data, laporan penelitian dan pengalaman pemakai.

Metode akuisisi pengetahuan :
<ol>
    <li>Wawancara<br />
		Metode yang paling banyak digunakan, 
		yang melibatkan pembicaraan dengan pakar secara langsung dalam suatu wawancara.
    </li>
    <li>Analisis protocol<br />
		Dalam metode ini pakar diminta untuk melakukan suatu pekerjaan dan 
		mengungkapkan proses pemikirannya dengan menggunakan kata-kata. 
		Pekerjaan tersebut direkam, dituliskan, dan dianalisis.
    </li>
    <li>Observasi pada pekerjaan pakar<br />
		Pekerjaan dalam bidang tertentu yang dilakukan pakar direkam dan diobservasi.
    </li>
    <li>Induksi aturan dari contoh<br />
		 Induksi adalah suatu proses penalaran dari khusus ke umum. 
		 Suatu sistem induksi aturan diberi contoh-contoh dari suatu masalah yang hasilnya telah diketahui. 
		 Setelah diberikan beberapa contoh, 
		 sistem induksi aturan tersebut dapat membuat aturan yang benar untuk kasus-kasus contoh. 
		 Selanjutnya aturan dapat digunakan untuk menilai kasus lain yang hasilnya tidak diketahui.
    </li>
</ol>

<!-- ============================================================================================== -->

<h4>Antarmuka / User Interface</h4>
Merupakan mekanisme yang digunakan oleh pengguna dan sistem pakar untuk berkomunikasi. 
Antarmuka menerima informasi dari pemakai dan mengubahnya ke dalam bentuk yang dapat diterima oleh sistem. 
Selain itu antarmuka menerima dari sistem dan menyajikannya ke dalam bentuk yang dapat dimengerti oleh pemakai. 

Representasi pengetahuan adalah suatu teknik untuk merepresentasikan basis pengetahuan yang diperoleh 
ke dalam suatu skema/diagram tertentu sehingga dapat diketahui relasi/keterhubungan antara 
suatu data dengan data yang lain. Teknik ini membantu knowledge engineer dalam memahami 
struktur pengetahuan yang akan dibuat sistem pakarnya. Terdapat beberapa 
teknik representasi pengetahuan yang biasa digunakan dalam pengembangan suatu sistem pakar, yaitu
<ol>
	<li>Rule-Based Knowledge<br />
		Pengetahuan direpresentasikan dalam suatu bentuk fakta (facts) dan aturan (rules). 
		Bentuk representasi ini terdiri atas premise dan kesimpulan.
	</li>
	<li>Frame-Based Knowledge<br />
		Pengetahuan direpresentasikan dalam suatu bentuk hirarki atau jaringan frame.
	</li>
	<li>Object-Based Knowledge<br />
		Pengetahuan direpresentasikan sebagai jaringan dari obyek-obyek. 
		Obyek adalah elemen data yang terdiri dari data dan metoda (proses).
	</li>
	<li> Case-Base Reasoning<br />
		Pengetahuan direpresentasikan dalam bentuk kesimpulan kasus (cases).
	</li>
</ol>

<!-- ============================================================================================== -->

<h4>Explanation Facility / Fasilitas Penjelasan</h4>
Elemen tambahan yang akan meningkatkan kemampuan sistem pakar. 
Digunakan untuk melacak respon dan memberikan penjelasan tentang kelakuan sistem pakar secara interaktif melalui pertanyaan :
<ol>
	<li>Mengapa suatu pertanyaan ditanyakan oleh sistem pakar ?</li>
	<li>Bagaimana konklusi dicapai ?</li>
	<li>Mengapa ada alternative yang dibatalkan ?</li>
	<li>Rencana apa yang digunakan untuk mendapatkan solusi ?</li>
</ol>

<!-- ============================================================================================== -->

<h4>Perbaikan Pengetahuan</h4>
 Pakar memiliki kemampuan untuk menganalisis dan meningkatkan kinerjanya serta kemampuan untuk belajar dari kinerjanya. 
 Kemampuan tersebut adalah penting dalam pembelajaran terkomputerisasi, 
 sehingga program akan mampu menganalisis penyebab kesuksesan dan kegagalan yang dialaminya dan 
 juga mengevaluasi apakah pengetahuan-pengetahuan yang ada masih cocok untuk digunakan di masa mendatang.

<!-- ============================================================================================== -->




> Sumber : <br /><a href="https://dimasandree.wordpress.com/2013/12/18/arsitektur-dan-komponen-sistem-pakar/">dimasandree.wordpress.com</a> 
> <br /><a href="http://seputarti.com/sistem-pakar/komponen-utama-sistem-pakar.html">seputarti.com</a> 
> <br /><a href="http://loveensimple.blogspot.com/2012/10/penerapan-sistem-pakar-dalam-berbagai.html">loveensimple.blogspot.com</a> 
