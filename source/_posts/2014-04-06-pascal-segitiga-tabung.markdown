---
layout: post
title: "Pascal : Luas Segitiga Dan Volume Tabung"
date: 2014-04-06 09:41
comments: true
categories: pascal
---

Berikut merupakan contoh program sederhana dengan rumus luas segitiga dan volume tabung :

<!--more-->

<b>Luas Segitiga : </b>

```pascal
program LuasSegitiga;

uses crt;

var a,t : Integer;
luas : Real;

Begin
        clrscr;
        write('Alas : ');readln(a);
        write('Tinggi : ');readln(t);
        luas := a*t/2;
        write('Luas Segitiga adalah ',luas:3:1);
        readln;
end.


```

<b>Volume Tabung : </b>

```pascal
program VolumeTabung;

uses crt;

var r,t : Integer;
volume : Real;

Begin
        clrscr;
        write('Jari-jari : ');readln(r);
        write('Tinggi : ');readln(t);
        volume := (3.14*r*r)*t;
        write('Volume tabung adalah ',volume:3:1);
        readln;

end.
```

<b>Penulisan variable real (volume:3:1):</b>
> volume adalah nama variabel,<br />
> 3 merupakan banyaknya digit angka sebelum desimal/koma (123.),<br />
> 1 merupakan banyaknya digit angka setelah desimal/koma (.9) 

