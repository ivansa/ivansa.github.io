---
layout: post
title: "Program Qbasic Looping"
date: 2013-11-21 19:05
comments: true
categories: qbasic
---

Kali ini saya akan memberikan contoh program qbasic dengan menggunakan looping atau perulangan.<br>
Kelebihan dari perulangan adalah kita dapat menjalankan perintah yang sama secara berulang tanpa harus menuliskan code yang sama, adapun kelebihan yang lain berdasarkan kondisi yang dibutuhkan.

<!-- more -->

<b>1. Struktur FOR-NEXT :</b>
```
FOR counter = start TO end [STEP]

    [Statement Block]

NEXT counter
```

<b>2. Struktur WHILE-WEND :</b>
```
WHILE  [condition]

    [Statement Block]

WEND
```

<b>3. Struktur DO-(WHILE/UNTIL) :</b>
```
Do (While/Until)  [condition]

    [Statement Block]

Loop
```

```
Do

    [Statement Block]

Loop (While/Until) [condition]
```

----------

<b>1. Contoh Program FOR-NEXT :</b>
```vbnet
CLS

FOR counter = 1 TO 2 STEP 1
    PRINT "Ivans Ardiansyah"; counter
NEXT counter

END
```

<b>2. Contoh Program WHILE-WEND :</b>
```vbnet
CLS

counter = 1

WHILE  counter < 11
    PRINT "Ivans Ardiansyah"; counter
    counter = counter + 1
WEND

END
```

<b>3. Contoh Program DO-(WHILE/UNTIL) :</b>
```vbnet
CLS

DO UNTIL counter < 10
    PRINT "Ivans Ardiansyah"; counter
    counter = counter + 1
Loop

END
```

```vbnet
CLS

Do
    PRINT "Ivans Ardiansyah"; counter
    counter = counter + 1
Loop WHILE counter < 11

END
```

----------
<b>Output :</b>
<img src="{{root_url}}/images/blog/qbasic/qbasic-output4.png" style="border:1px solid grey">
