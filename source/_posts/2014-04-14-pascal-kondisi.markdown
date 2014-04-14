---
layout: post
title: "Pascal : Penggunaan Kondisi"
date: 2014-04-14 10:41
comments: true
categories: pascal
---

Berikut merupakan contoh program sederhana menggunakan kondisi (IF-THEN):

<!--more-->

<b>Login Sederhana : </b>

```pascal
program ivansLogin;
uses crt;

var username,password : string;

begin
        clrscr;
        write('Username : ');readln(username);
        write('Password : ');readln(password);

        if((username = 'doni') and (password = '123')) or ((username = 'santi') and (password = 'abc')) then
                writeln('Welcome')
        else if((username = 'doni') and (password <> '123')) or ((username = 'santi') and (password <> 'abc')) then
                writeln('Salah Password')
        else if((username <> 'doni') and (password = '123')) or ((username <> 'santi') and (password = 'abc')) then
                writeln('Username belum terdaftar')
        else
                writeln('Username Dan Password Salah');

end.

```

* Kondisi pertama, jika username dan password benar maka akan menghasilkan “Welcome”
* Kondisi kedua, jika username benar dan password salah maka akan menghasilkan "Salah Password"
* Kondisi Ketiga, jika username salah dan password benar maka akan menghasilkan "Username belum terdaftar"
* Kondisi terakhir merupakan kondisi selain dari konsi yang di deklarasikan, yaitu menggunakan ELSE
