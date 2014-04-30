---
layout: post
title: "Install SDK Pada Ubuntu 14.04 64bit"
date: 2014-04-30 09:41
comments: true
categories: android
---

Kali ini saya akan membahas cara install SDK pada ubuntu 64 bit, pada awalnya saya juga error waktu menjalankan adb ("adb not found").
Ternyata error tersebut karna adb tidak dapat dijalankan di 64 bit.

<!--more-->

<p>
	<b>1. Pertama Download SDK : </b><br /> http://developer.android.com/sdk/index.html
</p>
<p>
	<b>2. Kedua Ekstrak SDK : </b><br /> Kalo saya install di folder /opt/
	<br />Jangan lupa set permision <code>sudo chmod -R 777 /opt/sdk</code> 
</p>
<p>
	<b>3. Ketiga Masukan PATH</b><br /> <code>sudo nano /etc/profile</code> 
</p>

> export PATH=$PATH:/opt/sdk/platform-tools <br />
> export PATH=$PATH:/opt/sdk/tools

<p>
	<b>4. Install Library 32 bit, agar dapat di jalankan</b>
</p>

> sudo apt-get install ia32-libs

Atau kalau yang atas tidak bisa, bisa pakai yang di bawah : <br />

> sudo apt-get install lib32z1 <br />
> sudo apt-get install lib32ncurses5 libstdc++6:i386

<p>
	<b>5. Reboot dulu, Selesai ^-^</b>
</p>

