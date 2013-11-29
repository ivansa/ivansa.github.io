---
layout: post
title: "Program Qbasic Prima"
date: 2013-11-28 12:51
comments: true
categories: qbasic
---

Kali ini saya akan membuat contoh pencarian bilangan prima, dengan penggunaan looping dan kondisi.

<!-- more -->

<b>Prima : </b>
```vbnet
CLS

DIM a, b, c, d AS INTEGER

INPUT "Masukan Angka : ", a

b = 1

WHILE b <= a

	c = 2
	d = 1

	DO WHILE c <= b
		IF b MOD c = 0 THEN
			d = d + 1
		END IF
		c = c + 1
	LOOP
	
	IF d = 2 THEN
		PRINT b
	END IF

	b = b + 1
WEND

END
```
<b>Output :</b>
<img src="{{root_url}}/images/blog/qbasic/qbasic-output8.png" style="border:1px solid grey;margin-top:0.8em">
