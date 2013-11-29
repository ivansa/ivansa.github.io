---
layout: post
title: "Program Qbasic Manipulasi Data"
date: 2013-11-27 12:51
comments: true
categories: qbasic
---

manipulasi data adalah proses pengolahan data menjadi informasi yang kita butuhkan di dalam program. <br>
manipulasi data dapat berupa shorting, calculating, mengambil sebagian karakter, konversi, operasi aritmatika atau editing.

<!-- more -->

<b>Fungsi String : </b>
<table border=1 style="width:100%">
	<tr>
		<td>LEN</td>
		<td><center>:</center></td>
		<td>Menghitung jumlah karakter dari suatu string.</td>
	</tr>
	<tr>
		<td>LEFT$</td>
		<td><center>:</center></td>
		<td>Mengambil sejumlah karakter dari posisi kiri</td>
	</tr>
	<tr>
		<td>RIGHT$</td>
		<td><center>:</center></td>
		<td>Mengambil sejumlah karakter dari posisi kanan.</td>
	</tr>
	<tr>
		<td>MID$</td>
		<td><center>:</center></td>
		<td>Mengambil sejumlah karakter ditengah pada posisi tertentu.</td>
	</tr>
	<tr>
		<td>VAL</td>
		<td><center>:</center></td>
		<td>Mengkonversi data string menjadi data numerik.</td>
	</tr>
	<tr>
		<td>STR$</td>
		<td><center>:</center></td>
		<td>Mengkonversi data numerik menjadi data string.</td>
	</tr>
</table>


<b>Fungsi Aritmatika : </b>
<table border=1>
	<tr>
		<td>SIN</td>
		<td><center>:</center></td>
		<td>Menghitung harga sinus suatu sudut yang dinyatakan dalam radian.</td>
	</tr>
	<tr>
		<td>COS</td>
		<td><center>:</center></td>
		<td>Menghitung harga cosinus suatu sudut yang dinyatakan dalam radian.</td>
	</tr>
	<tr>
		<td>ABS</td>
		<td><center>:</center></td>
		<td>Mengambil harga mutlak dari suatu ekspresi numerik.</td>
	</tr>
	<tr>
		<td>SQR</td>
		<td><center>:</center></td>
		<td>Menghitung akar kuadrat suatu bilangan.</td>
	</tr>
	<tr>
		<td>INT</td>
		<td><center>:</center></td>
		<td>Membulatkan suatu pecahan ke bilangan bulat terkecil.</td>
	</tr>
	<tr>
		<td>MOD</td>
		<td><center>:</center></td>
		<td>Menghitung sisa pembagian dari dua buah operasi.</td>
	</tr>
</table>

<b>Contoh Program : </b>
```vbnet
CLS

DIM a AS STRING
DIM b AS INTEGER

INPUT "Masukan Text : ", a
INPUT "Masukan Angka : ", b

PRINT "Jumlah Karakter : "; LEN(a)
PRINT "2 Huruf dari kiri : "; LEFT$(a,2)
PRINT "2 Huruf dari kanan : "; RIGHT$(a,2)
PRINT "2 Huruf dimulai dari urutan ke 3 : "; MID$(a,3,2)
PRINT "Konversi ke Angka : "; VAL(a)
PRINT "Konversi ke String : "; STR$(b)

PRINT

PRINT "Sin : "; SIN(b)
PRINT "Cos : "; COS(b)
PRINT "Nilai Mutlak : "; ABS(b)
PRINT "Akar : "; SQR(b)
PRINT "Pembulatan : "; INT(b)
PRINT "Mod 2 : "; b MOD 2

END
```
<b>Output :</b>
<img src="{{root_url}}/images/blog/qbasic/qbasic-output6.png" style="border:1px solid grey;margin-top:0.8em">
