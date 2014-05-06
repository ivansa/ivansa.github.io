---
layout: post
title: "Disable Pesan Error Saat Penggunaan Rake"
date: 2014-04-30 08:41
comments: true
categories: linux
---


Pertama kita harus mencari path dimana ruby kita di install,
gunakan perintah berikut : <br />
<code>$ ruby -r rubygems -e "p Gem.path"</code>

<!--more-->

Kemudian arahkan ("cd") ke folder tempat ruby anda di install, lalu cari tempat library bundler.<br />
Setelah masuk ke folder tempat library bundler, buka file <code>runtime.rb</code> dengan text editor. <br />

Kalau saya file runtime.rb ada di folder : 
> /var/lib/gems/1.9.1/gems/bundler-1.6.2/lib/bundler

Masukan <code>$VERBOSE = nil</code>, seperti pada contoh di line kedua berikut :
```
require "digest/sha1" 
$VERBOSE = nil 
module Bundler   
class Runtime < Environment
    include SharedHelpers

    def setup(*groups)
      # Has to happen first
      clean_load_path
```
