---
layout: post
title: "Sejarah Perkembangan PHP"
date: 2014-11-25 14:41
comments: true
categories: tulisan php 
---

<b>PHP: Hypertext Preprocessor</b> adalah bahasa skrip yang dapat ditanamkan atau disisipkan ke dalam HTML.
PHP banyak dipakai untuk memrogram situs web dinamis. PHP dapat digunakan untuk membangun sebuah CMS.

<!--more-->

<H4>PHP/FI : Personal Home Page/Forms Interpreter</H4>

Sejarah PHP bermula pada tahun 1994 ketika programmer kelahiran Denmark yang sekarang berdomisili di Canada, 
Rasmus Lerdorf membuat sebuah script (kode program) dengan bahasa Perl untuk web pribadinya. 
Script ini salah satunya digunakan untuk menampilkan resume pribadi dan mencatat jumlah pengunjung ke website tersebut.

Namun dengan alasan untuk meningkatkan performa, 
Rasmus Lerdorf kemudian membuat ulang kode program tersebut dalam bahasa C. 
Ia juga mengembangkannya lebih lanjut sehingga memiliki kemampuan untuk bekerja dengan form HTML dan juga database.

Lerdorf menyebut kode program ini sebagai Personal Home Page/Forms Interpreter atau PHP/FI. 
Inilah asal mula penamaan PHP digunakan. 
PHP/FI dapat digunakan untuk membuat aplikasi web dinamis sederhana.

Lerdorf kemudian merilis kode tersebut ke publik dengan sebutan Personal Home Page Tools (PHP Tools) version 1.0. 
Perilisan ini diumumkan pada 8 Juni 1995 di alamat comp.infosystems.www.authoring.cgi, sebuah group diskusi Usenet.

Isi dari pengumuman tersebut:
```
From: rasmus@io.org (Rasmus Lerdorf)
Subject: Announce: Personal Home Page Tools (PHP Tools)
Date: 1995/06/08
Message-ID: <3r7pgp$aa1@ionews.io.org>#1/1
organization: none
newsgroups: comp.infosystems.www.authoring.cgi

Announcing the Personal Home Page Tools (PHP Tools) version 1.0.
These tools are a set of small tight cgi binaries written in C.
They perform a number of functions including:

. Logging accesses to your pages in your own private log files
. Real-time viewing of log information
. Providing a nice interface to this log information
. Displaying last access information right on your pages
. Full daily and total access counters
. Banning access to users based on their domain
. Password protecting pages based on users' domains
. Tracking accesses ** based on users' e-mail addresses **
. Tracking referring URL's - HTTP_REFERER support
. Performing server-side includes without needing server support for it
. Ability to not log accesses from certain domains (ie. your own)
. Easily create and display forms
. Ability to use form information in following documents

Here is what you don't need to use these tools:
. You do not need root access - install in your ~/public_html dir
. You do not need server-side includes enabled in your server
. You do not need access to Perl or Tcl or any other script interpreter
. You do not need access to the httpd log files

The only requirement for these tools to work is that you have
the ability to execute your own cgi programs. Ask your system
administrator if you are not sure what this means.

The tools also allow you to implement a guestbook or any other
form that needs to write information and display it to users
later in about 2 minutes.

The tools are in the public domain distributed under the GNU
Public License. Yes, that means they are free!
For a complete demonstration of these tools, point your browser
at: http://www.io.org/~rasmus

--
Rasmus Lerdorf
rasmus@io.org

http://www.io.org/~rasmus
```
Alamat website yang tertera di atas sudah tidak dipakai lagi, 
namun setidaknya dari pengumuman ini kita dapat mengetahui bahwa kebutuhan programmer saat itu 
salah satunya adalah mencari cara untuk membuat halaman yang dapat diproteksi dengan password, 
kemudahan dalam membuat form, dan kemampuan mengakses data dari halaman lain.

Pengumuman itu juga mencerminkan bahwa PHP pada awalnya adalah sebuah framework bahasa C 
yang memiliki banyak fungsi dalam mengembangkan web, 
bukan sebuah bahasa pemograman utuh seperti yang kita kenal sekarang.

<H4>PHP/FI : Personal Home Page/Forms Interpreter 2</H4>

Seiring dengan pengembangan dan penambahan fitur web pada saat itu, 
pada April 1996, Rasmus Lerdorf mengumumkan PHP/FI versi 2.0. 
PHP versi 2 ini dirancang Lerdorf pada saat mengerjakan sebuah proyek di University of Toronto 
yang membutuhkan pengolahan data dan tampilan web yang rumit. 
PHP/FI versi 1 sebenarnya sudah mencukupi, 
namun performa yang dihasilkan dirasakan belum cukup, 
sehingga butuh penambahan fitur lanjutan.

Berikut adalah email dari Lerdorf yang ditujukan kepada group diskusi Usenet pada tahun 1996.
```
From: rasmus@madhaus.utcs.utoronto.ca (Rasmus Lerdorf)
Subject: ANNOUNCE: PHP/FI Server-side HTML-Embedded Scripting Language
Date: 1996/04/16
Newsgroups: comp.infosystems.www.authoring.cgi
 
PHP/FI is a server-side HTML embedded scripting language. It has built-in
access logging and access restriction features and also support for
embedded SQL queries to mSQL and/or Postgres95 backend databases.
 
It is most likely the fastest and simplest tool available for creating
database-enabled web sites.
It will work with any UNIX-based web server on every UNIX flavour out
there. The package is completely free of charge for all uses including
commercial.
 
Feature List:
. Access Logging
Log every hit to your pages in either a dbm or an mSQL database.
Having hit information in a database format makes later analysis easier.
. Access Restriction
Password protect your pages, or restrict access based on the refering URL
plus many other options.
. mSQL Support
Embed mSQL queries right in your HTML source files
. Postgres95 Support
Embed Postgres95 queries right in your HTML source files
. DBM Support
DB, DBM, NDBM and GDBM are all supported
. RFC-1867 File Upload Support
Create file upload forms
. Variables, Arrays, Associative Arrays
. User-Defined Functions with static variables + recursion
. Conditionals and While loops
Writing conditional dynamic web pages could not be easier than with
the PHP/FI conditionals and looping support
. Extended Regular Expressions
Powerful string manipulation support through full regexp support
. Raw HTTP Header Control
Lets you send customized HTTP headers to the browser for advanced
features such as cookies.
. Dynamic GIF Image Creation
Thomas Boutell's GD library is supported through an easy-to-use set of
tags.
 
It can be downloaded from the File Archive at: <URL:http://www.vex.net/php>
--
 
Rasmus Lerdorf
rasmus@vex.net
```

Didalam email tersebut, dijelaskan juga penambahan fitur-fitur baru di dalam PHP/FI versi 2. 
Dalam pengumuman ini jugalah pertama kalinya kata “scripting language” (bahasa script) digunakan dalam PHP.

Alasan utama untuk perilisan versi kedua ini dikarenakan tuntutan 
programmer web yang saat itu menginginkan lebih dari sekedar kumpulan fungsi-fungsi, 
namun juga membutuhkan fitur logika seperti “if” dan “else”.

<H4>PHP: Hypertext Preprocessor 3</H4>

Evolusi PHP berikutnya terjadi pada pertengahan tahun 1997, 
PHP versi 2 telah menarik banyak perhatian programmer, 
namun bahasa ini memiliki masalah dengan kestabilan yang kurang bisa diandalkan. 
Hal ini lebih dikarenakan Lerdorf hanya bekerja sendiri untuk mengembangkan PHP.

Pada saat itulah Zeev Suraski dan Andi Gutmans, 
2 orang programmer asal Israel ikut mengambil bagian dan membuat ulang parsing engine yang menjadi dasar dari PHP agar lebih stabil.

Dengan dukungan dari banyak programmer lainnya, 
Proyek PHP secara perlahan beralih dari proyek satu orang menjadi proyek massal yang lebih akrab kita kenal sebagai open-source project. 
PHP selanjutnya dikembangkan oleh The PHP Group yang merupakan kumpulan banyak programmer dari seluruh dunia.

PHP versi 3 resmi dirilis pada Juni 1998:
```
June 6, 1998 -- The PHP Development Team announced the release of PHP 3.0,
the latest release of the server-side scripting solution already in use on
over 70,000 World Wide Web sites.
 
This all-new version of the popular scripting language includes support
for all major operating systems (Windows 95/NT, most versions of Unix,
and Macintosh) and web servers (including Apache, Netscape servers,
WebSite Pro, and Microsoft Internet Information Server).
PHP 3.0 also supports a wide range of databases, including Oracle, Sybase,
Solid, MySQ, mSQL, and PostgreSQL, as well as ODBC data sources.
 
New features include persistent database connections, support for the
SNMP and IMAP protocols, and a revamped C API for extending the language
with new features.
 
"PHP is a very programmer-friendly scripting language suitable for
people with little or no programming experience as well as the
seasoned web developer who needs to get things done quickly. The
best thing about PHP is that you get results quickly,"
said Rasmus Lerdorf, one of the developers of the language.
 
"Version 3 provides a much more powerful, reliable, and efficient
implementation of the language, while maintaining the ease of use and
rapid development that were the key to PHP's success in the past,"
added Andi Gutmans, one of the implementors of the new language core.
 
"At Circle Net we have found PHP to be the most robust platform for
rapid web-based application development available today," said Troy
Cobb, Chief Technology Officer at Circle Net, Inc. "Our use of PHP
has cut our development time in half, and more than doubled our client
satisfaction. PHP has enabled us to provide database-driven dynamic
solutions which perform at phenomenal speeds."
 
PHP 3.0 is available for free download in source form and binaries for
several platforms at http://www.php.net/.
 
The PHP Development Team is an international group of programmers who
lead the open development of PHP and related projects.
For more information, the PHP Development Team can be contacted at
core@php.net.
```

Perilisan PHP versi 3 juga ditandai dengan penamaan singkatan PHP baru yang sebelumnya PHP/FI: 
Personal Home Page Tools, menjadi PHP: Hypertext Preprocessor. 
Kepanjangan PHP sebagai PHP: Hypertext Preprocessor disebut juga sebagai kepanjangan rekursrif, 
sebuah istilah dalam pemograman dimana suatu fungsi memanggil dirinya sendiri. 
Jadi, sejak PHP versi 3, PHP adalah singkatan dari PHP: Hypertext Preprocessor.

Setelah perilisan PHP 3.0, PHP semakin populer digunakan di seluruh dunia. 
Dan sejak saat itu, penggunaan PHP sebagai bahasa pemograman web menjadi sebuah standar bagi programmer.

<H4>PHP: Hypertext Preprocessor 4</H4>

Segera setelahnya, Zeev Suraski dan Andi Gutmans juga berbagai 
programmer di seluruh dunia mengembangkan PHP lebih jauh lagi dengan memperkenalkan banyak fitur lanjutan, 
seperti layer abstraksi antara PHP dengan web server, menambahkan mekanisme thread-safety, dan two-stage parsing. 
Parsing baru ini dikembangkan oleh Zeev dan Andi, dan dinamakan Zend engine. Akhirnya pada 22 May 2000 diluncurkan PHP 4.0

PHP versi 4 juga menyertakan fitur pemograman objek / Object Oriented Programming, walaupun belum sempurna.
<img src="{{root_url}}/images/blog/tulisan/sejarah-php/pembuat-php.jpg" style="border:1px solid grey;margin-top:0.8em">

<H4>PHP: Hypertext Preprocessor 5</H4>

Versi PHP terakhir hingga saat ini, yaitu PHP 5.0 diluncurkan pada 13 Juli 2004. 
PHP 5 ini telah mendukung penuh pemograman object dan peningkatan performa melalui Zend engine versi 2.

Beberapa penambahan fitur meliputi PDO (PHP Data Objects) untuk pengaksesan database, closures, trait, dan namespaces.

Hingga artikel ini di-update pada September 2014, versi stabil terakhir dari PHP adalah versi 5.6.0.

<H4>PHP: Hypertext Preprocessor 6</H4>

PHP versi 6 juga telah lama dikembangkan, bahkan sejak tahun 2005. 
Fokus pengembangan PHP 6 terutama dalam mendukung Unicode, 
namun dikarenakan beberapa alasan seperti kurangnya programmer, 
dan performa yang tidak memuaskan, 
pengembangan PHP 6 dihentikan dan fitur yang ada dimasukkan kedalam PHP 5.

<H4>PHP: Hypertext Preprocessor 7</H4>

Pada tahun 2014, sebuah proyek lanjutan PHP mulai mengemuka, yakni PHP 7. 
Kalangan programmer sedikit bingung dengan penamaan versi PHP yang akan dirilis ini, 
apakah akan menyebutnya sebagai PHP 6 atau PHP 7. 
Walaupun PHP versi 6 telah resmi ditinggalkan, 
namun banyak artikel dan buku yang ditulis mengenai PHP 6. 
Setelah mengambil voting, nama PHP versi 7 akhirnya menjadi keputusan final.

PHP 7 berkembang dari proyek experimen yang dinamakan PHPNG (PHP Next Generation). 
Proyek PHPNG ini bertujuan untuk menyusun ulang kode PHP untuk meningkatkan performa. 
Pada Juli 2014, sebuah percobaan mendapati hasil bahwa PHPNG mengalami peningkatan performa hampir 100% dari versi PHP sebelumnya.

Masih belum jelas kapan PHP 7 akan dirilis, 
namun melihat perkembangan yang terus dilakukan, 
masa depan PHP akan tetap menjadi salah satu bahasa pemograman paling populer di dunia.

Untuk mengikuti perkembangan PHP, anda bisa membacanya di halaman web resi PHP : www.php.net.


<b>Sumber : </b>
> <a href="http://www.duniailkom.com/sejarah-php-dan-perkembangan-versi-php/">www.duniailkom.com</a> <br />
> <a href="http://id.wikipedia.org/wiki/PHP">id.wikipedia.org</a><br />
> <a href="http://www.php.net">www.php.net</a><br />
> <a href="#">Programming PHP, Third Edition – O’Reilly Media</a>
