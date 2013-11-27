---
layout: post
title: "Program Qbasic Array"
date: 2013-11-26 12:51
comments: true
categories: qbasic
---

Pada post kali ini saya akan membahas tentang program Qbasic yang menggunakan array, 
penggunaan array ditujukan untuk menghemat memori, jadi memakai array sama saja menggabungkan tipe variable yang sama.

<!-- more -->

Contoh: Terdapat 2 variabel yang bertipe sama,<br>
maka bisa ditulis:<br>
> <b>a(2)</b> -> <b>a(1), a(2)</b><br>
> <b>a(1)</b> -> <b>a(0), a(1)</b>

<b>Contoh Program 1 :</b>
{% codeblock lang:vbnet %}
CLS
DIM nilai(5) AS INTEGER

INPUT "Nilai Array 1 : ",nilai(1)
INPUT "Nilai Array 2 : ",nilai(2)
INPUT "Nilai Array 3 : ",nilai(3)
INPUT "Nilai Array 4 : ",nilai(4)
INPUT "Nilai Array 5 : ",nilai(5)

PRINT
PRINT "Jumlah : "; nilai(1) + nilai(2) + nilai(3) + nilai(4) + nilai(5)

END
{% endcodeblock %}

<b>Output Program 2 :</b>
<img src="{{root_url}}/images/blog/qbasic/qbasic-output5.png" style="border:1px solid grey;margin-top:0.8em">
