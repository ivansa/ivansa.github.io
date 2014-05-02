---
layout: post
title: "Persiapan Software Setelah Install Linux"
date: 2014-05-02 08:41
comments: true
categories: linux
---


Setelah kita selesai menginstall Linux, 
kita akan melanjutkan untuk instalasi software yang mendukung pemprograman, 
untuk itu agar lebih mudah dalam penginstalan maka komputer/laptop harus di koneksikan ke internet.

<!--more-->

<b>1. Pertama-tama kita melakukan update dan upgrade</b>

<code>$ sudo apt-get update</code> dan <code>$ sudo apt-get upgrade</code>

<b>2. Install Mysql, Apache2, PHP5,dan Phpmyadmin</b>

<code>$ sudo apt-get install mysql-server mysql-client apache2 php5 phpmyadmin</code>

<b>3. Install Jdk (Java) dan Netbeans</b>

Add Repository Java : <br />
<code>$ sudo add-apt-repository ppa:webupd8team/java</code><br /><br />
Update Repository : <br />
<code>$ sudo apt-get update</code><br /><br />

Install Java 7 : <br />
<code>$ sudo apt-get install oracle-java7-installer</code><br /><br />
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<i>Atau</i> <br /><br />
Install Java 8 : <br />
<code>$ sudo apt-get install oracle-java8-installer</code><br /><br />

Download netbeans disini :<br />
<a href="https://netbeans.org/downloads/">https://netbeans.org/downloads/</a><br />

Rename file netbeans yang di download jadi "netbeans.sh"<br /><br />
masuk ke folder tempat file netbeans.sh<br /><br />
Lalu jalankan dengan <code>$ ./netbeans.sh</code><br /><br />

> Kalo saya waktu install netbeansnya, saya install di folder /opt/netbeans

Jadi harus di path dulu, agar bisa di panggil di terminal : 
<code>sudo nano /etc/profile</code> <br />

Masukan path berikut :
> export PATH=$PATH:/opt/netbeans/bin 

Reboot

<b>4. Install Maven</b><br />
<code>sudo apt-get install maven</code>

