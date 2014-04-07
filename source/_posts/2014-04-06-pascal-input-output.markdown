---
layout: post
title: "Pascal : Input-Output"
date: 2014-04-06 08:41
comments: true
categories: pascal
---

Pada pertemuan pertama semester ke 2, saya mempelajari bahasa pascal dengan bahasan Input-Output.
Berikut adalah contoh program pascal input output gunadarma :

<!--more-->

```pascal
program Ivans1;
uses crt;

var a,b,c : string; // Membuat variabel bertipe data string

begin // Memulai program
        clrscr; // Membersihkan layar
        write('Masukan Nama  : ');readln(a); 
        write('Masukan NPM   : ');readln(b);
        write('Masukan Kelas : ');readln(c);

        writeln('#########################');

        write('Nama saya adalah ',a);
        write(', NPM saya adalah ',b);
        write(', Kelas saya adalah ',c);

        readln();
end. // Mengakhiri program

```

<b>Perbedaan write, read, writeln, dan readln :</b>
> write menuliskan output ke layar,<br />
> writeln menuliskan output ke layar dan membuat baris baru(enter),<br />
> read membuat input,<br />
> readln membuat input dan membuat baris baru(enter)

