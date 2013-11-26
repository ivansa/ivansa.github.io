---
layout: post
title: "Program Qbasic Operator Aritmatika"
date: 2013-11-19 09:05
comments: true
categories: qbasic
---

Kali ini saya akan memberikan contoh program qbasic dengan menggunakan beberapa perintah aritmatika.

<!-- more -->

<b>Seperti :</b>

<table border=1>
	<tr>
		<td>+</td>
		<td><center>:</center></td>
		<td>Penjumlahan</td>
	</tr>
	<tr>
		<td>\-</td>
		<td><center>:</center></td>
		<td>Pengurangan</td>
	</tr>
	<tr>
		<td>*</td>
		<td><center>:</center></td>
		<td>Perkalian</td>
	</tr>
	<tr>
		<td>/</td>
		<td><center>:</center></td>
		<td>Pembagian</td>
	</tr>
	<tr>
		<td>^</td>
		<td><center>:</center></td>
		<td>Perpangkatan</td>
	</tr>
	<tr>
		<td>mod</td>
		<td><center>:</center></td>
		<td>Sisa bagi</td>
	</tr>
</table>

<!-- more -->

```vbnet
CLS

DIM nilai1 AS INTEGER
DIM nilai2 AS INTEGER

INPUT "Masukan Nilai Pertama = ", nilai1
INPUT "Masukan Nilai Kedua = ", nilai2

PRINT "Penjumlahan = "; nilai1 + nilai2
PRINT "Pengurangan = "; nilai1 - nilai2
PRINT "Perkalian = "; nilai1 * nilai2
PRINT "Pembagian = "; nilai1 / nilai2

END
```

#### Keterangan Lainnya :
<table border=1>
	<tr>
		<td>CLS</td>
		<td>:</td>
		<td>Membersihkan layar dari output sebelumnya.</td>
	</tr>
	<tr>
		<td>DIM ... AS [tipe_data]</td>
		<td>:</td>
		<td>Untuk membuat variabel.</td>
	</tr>
	<tr>
		<td>END</td>
		<td>:</td>
		<td>Mengakhiri program.</td>
	</tr>
</table> 

#### Output :
<img src="{{root_url}}/images/blog/qbasic/qbasic-output2.png" style="border:1px solid grey;margin-top:0.8em">

