---
layout: post
title: "Program Qbasic Input Dan Print"
date: 2013-11-19 09:05
comments: true
categories: qbasic
---

Kali ini saya akan memberikan contoh program qbasic dengan menggunakan perintah INPUT dan PRINT.
INPUT merupakan perintah untuk memberikan nilai pada variabel, sedangkan PRINT merupakan perintah untuk mencetak nilai variabel.

<!-- more -->

```
CLS

DIM nama AS STRING
DIM umur AS INTEGER

INPUT "Masukan nama anda = ", nama
INPUT "Masukan umur anda = ", umur

PRINT "Nama = "; nama
PRINT "Umur = "; umur

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
<img src="{{root_url}}/images/blog/qbasic/qbasic-output1.png" style="border:1px solid grey">

