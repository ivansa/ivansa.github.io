---
layout: post
title: "Remove Duplikat Value From List"
date: 2014-03-25 08:41
comments: true
categories: java
---

Berikut merupakan cara menghilangkan data yang sama pada sebuah list atau array list pada java, ini merupakan pengalaman saya saat ingin
menghilangkan record yang sama saat query. setelah cari cari di google.. akhirnya ketemu cara berikut :

<!--more-->

```java
package java4s;
 
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
 
public class RemDupFromList {
 
    public static void main(String[] args)
    {
        List li = new ArrayList();
 
              li.add("one");
              li.add("two");
              li.add("three");
              li.add("one");//Duplicate
              li.add("one");//Duplicate
 
             // We have facility to pass a List into Set constructor and vice verse to cast      
 
                List li2 = new ArrayList(new HashSet(li)); //no order
 
             // List li2 = new ArrayList(new LinkedHashSet(li)); //If you need to preserve the order use 'LinkedHashSet'
 
             Iterator it= li2.iterator();
             while(it.hasNext())
             {
                 System.out.println(it.next());
             }
 
    }
}
```

<b>Berikut Penjelasannya :</b>

* Contoh tersebut merupakan normal list object / list sederhana yang biasa di gunakan.
* Kalau saya lebih cenderung memakai fungsi linkedhashset, karena tidak merubah susunan data yang ada.

> Output:
>
> one<br />
> two<br />
> three<br />

Sumber : http://www.java4s.com/core-java/how-to-remove-duplicate-values-from-java-listarraylist/
