---
layout: post
title: "Tipe Data Dalam PHP"
date: 2014-12-03 14:41
comments: true
categories: tulisan php 
---

Setiap bahasa pemprograman pada umumnya pasti memiliki tipe data yang akan digunakan untuk 
menentukan tipe/jenis/sifat dari suatu variable. Pada kesempatan kali ini saya akan menuliskan beberapa 
tipe data yang ada di bahasa pemprograman PHP.

<!--more--> 

Berikut ini 8 macam tipe data pada PHP, diantaranya :

<h4>1. Integer</h4>
Tipe data integer adalah tipe data yang berguna untuk menyimpan bilangan bulat, 
bukan desimal. Sebagai contoh <code>(1),(2),(3),(4),(5),(-1),(-2),(-3),(-4) dan lain-lain</code>.
data ini memiliki range antara <code>-2,147,483,648</code> sampai dengan <code>+2,147,483,648</code> platform 32 bit.

Namun bila terdapat data diluar jangkauan tersebut, maka secara otomatis PHP akan mengkonversikannya ke dalam tipe data Floating Point. 
Integer merupakan Tipe Data yang berisikan bilangan bulat negatif dan positif atautanpa ada nilai pecahan.

Tipe ini juga dapat dinyatakan dalam bentuk oktal (berbasis 8), desimal (berbasis 10), heksadesimal (berbasis 16). Seperti dalam contoh berikut :

```php
<?php
	$oktal = 031;

	$desimal = 25;
	$heksadesimal = 0x10;
?>
```

<h4>2. Double Floating</h4>
Tipe data floating point numbers biasa juga disebut dengan “double”, 
”float” atau “real” adalah tipe data yang berguna untuk menyimpan bilangan desimal. 

Sebagai contoh <code>(0.1),(1.3),(1.7),(1.8),(9.7),(2.4) dan lain-lain</code>.

Contoh penulisannya :

```php
<?php
	$a = 1.234;
	$b = 1.2e3;
	$c = 2E-6;
	$d = 1.2E8;
?>
```

<h4>3. Boolean</h4>
Tipe Data ini adalah tipe data yang paling sederhana. Hanya berupa <code>true</code> atau <code>false</code>.
Cara memasukan ke dalam variabel adalah dengan memberikan nilai true atau false pada variabel tersebut.

Penulisannya tidak dipengaruhi penggunaan huruf besar atau kecil.<br />
Contoh penulisannya :

```php
<?php
	$a = TRUE; //bernilai 1
	$b = true; //bernilai 1
	$c = FALSE; //bernilai 0
	$d = false; //bernilai 0
?>
```

Setiap Tipe Data dalam PHP mempunyai Boolean untuk melakukan Seleksi Kondisi. 
dan Tipe Data tersebut akan memberikan nilai true atau false pada seleksi kondisi tersebut.
<ul>
	<li>Pada Variabel yang bertipe Data integer=0 (nol) mempunyai boolean false, selain itu true.</li>
	<li>Pada Variabel yang bertipe Data float=0.0 (nol) mempunyai boolean false, selain itu true.</li>
	<li>Array yang tidak mempunyai element mempunyai boolean false, selain itu true.</li>
	<li>Objek yang tidak mempunyai member mempunyai boolean false, selain itu true.</li>
	<li>Tipe NULL dan Variabel yang belum terisi mempunyai boolean false.</li>
</ul>

<h4>4. String</h4>
String adalah sebuah tipe data yang terdiri dari kata, bisa berupa kata tunggal maupun kalimat. 
Penulisan string harus diapit oleh tanda petik, baik petik tunggal <code>(‘ ‘)</code> maupun petik ganda <code>(” “)</code>. 

Contoh penulisan tipe data string :

```php
<?php
	$kata1 = 'String yang diapit oleh petik tunggal';
	$kata2 = "String yang diapit oleh petik ganda";
?>
```

Perbedaan antara petik ganda dan petik tunggal adalah, 
ketika kita menggunakan petik tunggal maka variabel didalam petik tunggal tidak akan terbaca nilainya. 
Beda halnya dengan penggunaan petik genap yang akan membaca nilai dari suatu variabel.

Lebih spesifiknya :

```php
<?php
	$kata = "halo dunia"
	echo 'Apa kabar semua, $kata';
	//Penggunaan petik tunggal, maka akan tampil (Apa kabar semua, $kata)
	echo "Apa kabar semua, $kata";
	//Penggunaan petik ganda, maka akan tampil (Apa kabar semua, halo dunia)
?>
```

Jika string yang tertutup dalam tanda kutip ganda <code>(” “)</code>, 
PHP akan menafsirkan escape sequence lebih untuk karakter khusus. 
Maka penulisan untuk karakter khusus tersebut harus ditambahkan slash didepan karakter tersebut.

<h4>5. Object</h4>
Tipe data object dibuat dengan tujuan agar para programmer terbiasa dengan OOP.
Tipe data object bisa berupa bilangan, variabel atau fungsi. 
Data ini dapat dimasukkan ke dalam kode program sehingga meringkas beberapa fungsi dan memperkecil ukuran file.

Agar lebih mudah dapat menggunakan variabel dengan nilai string :

```php
<?php
	class Nama {
		var $jenis = "halo dunia";
		function gantiNama($jenis){
			$this->jenis = $jenis;
		}
	}
	$nama = new Nama;
	echo $nama->jenis;
	$nama->gantiNama("halo semua");
	echo "<br>".$nama->jenis;

	/*
	Output :
		halo dunia
		halo semua
	*/
?>
```

<h4>6. Array</h4>
Array atau Larik merupakan Tipe Compound Primitif, 
terdapat juga pada bahasa-bahasa pemrograman lain. 
Tipe data array digunakan untuk menyimpan banyak data dalam satu variabel.

Jenis array dalam php ada 3 (tiga) macam yakni :
<ol>
	<li><b>Numeric Array</b> <br />
		
```php
<?php
	$hari[0] = "Senin";
	$hari[1] = "Selasa";
	$hari[2] = "Rabu";
	$hari[3] = "Kamis";
	$hari[4] = "Jumat";
	$hari[5] = "Sabtu";
	$hari[6] = "Minggu";
	
	for($i = 0; $i <= 6; $i++){
		echo $hari[$i]."<br />";
	}
	
?>
```

		Pada contoh numeric array diatas dapat disimpulkan bahwa pemanggilan data array tersebut menggunakan angka, 
		angka dimulai dari 0 sampai jumlah data yang dimasukkan. 
		<code>$hari[0]</code> adalah pemanggilan untuk data pertama, 
		<code>$hari[1]</code> adalah pemanggilan untuk data kedua dan seterusnya.<br /><br />
	</li>
	
	<li><b>Associative Array</b>  <br />

```php
<?php
	$hari = array("Senin" => "Ayam", 
				  "Selas" => "Lele", 
				  "Rabu" => "Pecel"
				  "Kamis" => "Teri"
				  "Jumat" => "Rendang"
				  "Sabtu" => "Tempe"
				  "Minggu" => "Tahu");
	
	//Menampilkan salah satu isi array
	echo "Menu makanan hari senin adalah $hari[Senin]";
	
?>
```

	Pada contoh associative array diatas dapat disimpulkan bahwa pemanggilan data array tersebut 
	menggunakan <code>string</code> yang ditentukan oleh kita, 
	dengan kata lain pemanggilan menggunakan angka kita ganti menjadi <code>string</code> yang kita inginkan.<br /><br />
	</li>
	
	<li><b>Multidimensional Array</b>   <br />
	Pengertian multidimension array adalah array didalam array. 
	Pemanggilan array ini bisa menggunakan numeric array maupun associative array. 
	<code>$makan[0]["pagi"]</code> dapat diartikan sebagai menampilkan nilai array pertama dan array pagi dari variabel makan, 
	<code>$makan["senin"]["pagi"]</code> dapat diartikan sebagai menampilkan nilai array senin dan array pagi dari variabel makan.
	
```php
<?php
	$makan = array(
		array("pagi" => "bubur", "siang" => "nasi", "sore" => "nasi"), 
		array("pagi" => "ayam", "siang" => "sayur", "sore" => "tahu") 
	);
	
	echo "Menu makan siang adalah $makan[0][siang] dan $makan[1][siang]"
?>
```
	
	</li>
</ol>

<h4>7. Null</h4>
NULL adalah Tipe Data yang tidak memuat apapun. 
Setiap Variabel yang diset menjadi Tipe Data NULL ini akan 
menjadikan Variabel tersebut kosong, seperti dalam penggunaan fungsi <code>unset()</code>. 

Cara untuk menset Variabel menjadi NULL adalah dengan memasukan nilai NULL pada variabel yang dimaksud seperti pada
Contoh berikut:

```php
<?php
	//Nilai awal $foo adalah 10
	$foo = 10
	//Nilai foo di ganti NULL
	$foo = NULL;
	//Penggantian nilai tersebut sama halnya dengan menggunakan unset()
	unset($foo);
?>
```

<h4>8. Resources</h4>
Tipe Data Spesial yang satu ini di khususkan untuk menyimpan resource, sumber atau alamat. 
Variabel tersebut hanya dapat diciptakan oleh suatu 
fungsi khusus yang mengembalikan nilai berupa resource seperti penggunaan fungsi <code>fopen, opendir, mysql_connect, mysql_query dan semacamnya</code>.
