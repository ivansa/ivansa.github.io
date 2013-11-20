---
layout: post
title: "Escape Markdown Syntax"
date: 2013-11-19 08:25
comments: true
categories: pembelajaran
---

Artikel Kali ini akan membahas cara agar syntax markdown tidak terbaca di web, sehingga hanya di running sebagai string atau text saja.

<!-- more -->

Cara membuat syntax markdown menjadi string atau text adalah dengan <b>backslash</b>.<br>
Backslash akan membuat beberapa character tertentu terbaca menjadi string atau text.

<b>Contoh Character : </b>   

```
\   backslash
`   backtick
*   asterisk
_   underscore
{}  curly braces
[]  square brackets
()  parentheses
#   hash mark
+   plus sign
-   minus sign (hyphen)
.   dot
!   exclamation mark
```

<b>Contoh Penggunaan : </b>
```
## \\ \` \* \_ \{ \} \[ \] \( \) \# \+ \- \. \!
\# not h1
\## not h2
\### not h3
\+ not ul
\- not ul 
```

<b>Hasil Yang Dicetak : </b><br>
> ## \\ \` \* \_ \{ \} \[ \] \( \) \# \+ \- \. \!
> \# not h1
> \## not h2
> \### not h3
> \+ not ul
> \- not ul 
