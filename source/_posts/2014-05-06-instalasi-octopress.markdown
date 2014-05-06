---
layout: post
title: "Instalasi Octopress Di Linux"
date: 2014-05-06 08:41
comments: true
categories: octopress linux
---

Octopress adalah framework blogger static yang di buat oleh Brandon Mathis, Octropress ini berbasis jekyll.
Octopress ini juga dapat kita deploy di github. <br />Berikut adalah cara menginstall octopress yang akan di deploy di github : 

<!--more-->

<p><b>1. Download Atau Clone Octopress</b><br />
<ul>
	<li><code>$ git clone git://github.com/imathis/octopress.git yourgithubusername.github.io</code></li>
</ul>
</p>

<p><b>2. Lalu masuk kedalam folder clone tadi</b><br />
<ul>
	<li><code>$ cd yourgithubusername.github.io</code></li>
</ul>
</p>

<p><b>3. Jika belum install ruby (Kalau saya 1.9.1) <span style="color:red">(Optional)</span></b><br />
<ul>
	<li><code>$ sudo apt-get install ruby1.9.1-full</code></li>
	<li><code>$ sudo update-alternatives --config ruby</code></li>
</ul>
</p>

<p><b>4. Install bundler</b>
<ul>
	<li><code>$ sudo gem install bundler</code></li>
</ul>
</p>

<p><b>5. Jika redcloth belum ke install <span style="color:red">(Optional)</span></b>
<ul>
	<li><code>$ sudo gem install RedCloth -v '4.2.9'</code></li>
</ul>
</p>

<p><b>6. Install bundle</b>
<ul>
	<li><code>$ bundle install</code></li>
</ul>
</p>

<p><b>7. Install Theme (tema)</b>
<ul>
	<li><code>$ rake install</code></li>
</ul>
</p>

<p><b>8. Generate github pages</b>
<ul>
	<li><code>$ rake setup_github_pages</code></li>
	<li>Kemudian masukan alamat repo github anda contoh : <br /><a>https://github.com/your_username/your_username.github.io</a> atau <a>git@github.com:your_username/your_username.github.io.git</a></li>
</ul>
</p>

<p><b>9. Generate file html</b>
<ul>
	<li><code>$ rake generate</code></li>
</ul>
</p>

<p><b>10. Membuat folder deploy</b>
<ul>
	<li><code>$ mkdir _deploy</code></li>
	<li><code>$ rake deploy</code></li>
</ul>
</p>

<p><b>11. Jika gagal push master/deploy <span style="color:red">(Optional)</span></b>
<ul>
	<li><code>$ cd _deploy</code></li>
	<li><code>$ git push -f origin master</code></li>
</ul>
</p>

<p><b>12. Push source ke branch source</b>
<ul>
	<li>Kembali ke folder yourgithubusername.github.io</li>
	<li><code>$ git add .</code></li>
	<li><code>$ git commit -m 'Initial Octopress source commit'</code></li>
	<li><code>$ git push origin source</code></li>
</ul>
</p>

> Optional digunakan jika terjadi error

source : http://google.com
