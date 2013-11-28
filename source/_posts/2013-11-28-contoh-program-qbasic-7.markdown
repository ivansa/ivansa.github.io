---
layout: post
title: "Program Qbasic Genap Dan Ganjil"
date: 2013-11-26 12:51
comments: true
categories: qbasic
---

Kali ini saya akan membuat contoh pencarian bilangan genap dan ganjil, dengan penggunaan looping dan kondisi.

<!-- more -->

<b>Genap dan ganjil : </b>
```vbnet
CLS

DIM a, b AS INTEGER
INPUT "Masukan Angka : ", a

b = 1

WHILE b <= a
	IF b MOD 2 = 0 THEN
		PRINT b;" Bilangan Genap"
	ELSE
		PRINT b;" Bilangan Ganjil"
	END IF
	b = b + 1
WEND

END

```
<b>Output :</b>
<img src="{{root_url}}/images/blog/qbasic/qbasic-output7.png" style="border:1px solid grey;margin-top:0.8em">
