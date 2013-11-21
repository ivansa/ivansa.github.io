---
layout: post
title: "Program Qbasic Kondisi"
date: 2013-11-20 09:05
comments: true
categories: qbasic
---

Kali ini saya akan memberikan contoh program qbasic dengan menggunakan kondisi.
Jadi program kali ini memakai struktur pemilihan, seperti IF-CONDITION dan SELECT-CASE.

<!-- more -->

<b>Struktur IF-THEN :</b>
```
If <condition> Then

    Do something

ElseIf <condition> Then

    Do something>

Else

    Do something

End If
```

<b>Struktur SELECT-CASE :</b>
```
SELECT CASE KeyPressed

  CASE "A"

     Do something

  CASE "B"

     Do something

  CASE ELSE

     Do something

END SELECT
```

<b>Contoh Program 1 :</b>
```
DIM Num1 AS INTEGER
DIM Num2 AS INTEGER

CLS

INPUT "Enter First Number: ", Num1    
INPUT "Enter Second Number: ", Num2   

IF Num1 > Num2 THEN
  PRINT Num1; "Is Greater Than"; Num2
ELSEIF Num2 > Num1 THEN       
  PRINT Num2; " Is Greater Than"; Num1
ELSE     
  PRINT “The Numbers Are The Same”
END IF

END
```

<b>Output Program 1 :</b>
<img src="{{root_url}}/images/blog/qbasic/qbasic-output3-1.png" style="border:1px solid grey">

<b>Contoh Program 2 :</b>
```
DIM KeyPressed AS STRING

CLS

INPUT "Please Enter A Key (A,B,C,D): ", KeyPressed
KeyPressed = UCASE$(KeyPressed)

PRINT

SELECT CASE KeyPressed
  CASE "A"
     PRINT "A Was Entered"
  CASE "B"
     PRINT "B Was Entered"
  CASE "C"
     PRINT "C Was Entered"
  CASE "D"
     PRINT "D Was Entered"
  CASE ELSE
     PRINT "Some Other Key Was Entered"
END SELECT

END
```

<table border=1>
	<tr>
		<td>UCASE$</td>
		<td>:</td>
		<td>Membuat huruf besar (Uppercase).</td>
	</tr>
</table> 

<b>Output Program 2 :</b>
<img src="{{root_url}}/images/blog/qbasic/qbasic-output3-2.png" style="border:1px solid grey">
