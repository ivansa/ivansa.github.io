---
layout: post
title: "Program Qbasic Dengan Menu"
date: 2013-11-29 12:51
comments: true
categories: qbasic
---

Berikut merupakan contoh program QBasic menggunakan menu pemilihan, dan gabungan dari berbagai perintah.

<!-- more -->

<b>Program : </b>
```vbnet
10 CLS
20 PRINT "### Menu ###"
30 PRINT "1. Manipulasi Data"
40 PRINT "2. Looping"
50 PRINT "3. Kondisi"
60 PRINT "4. Exit"
70 INPUT "Masukan Pilihan (1,2,3,4) : ", pilihan

80 SELECT CASE pilihan
    CASE 1
        CLS
        PRINT "### 1. Manipulasi Data  ###"
        PRINT
        INPUT "Masukan Nama Anda : ", nama$
        INPUT "Left(Jumlah Karakter Yang Dipilih) : ", left
        INPUT "Mid(Jumlah Karakter Yang Dipilih) : ", midle1
        INPUT "Mid(Urutan Mulai)  ", midle2

        PRINT
        PRINT "Nama Anda Adalah "; nama$
        PRINT "Jumlah Karakter Nama Anda Adalah "; LEN(nama$)
        PRINT left; "Karakter Dari Kiri Adalah "; LEFT$(nama$, left)
        PRINT midle1; "Karakter Dimulai Dari Urutan ke "; midle2; " adalah "; MID$(nama$, midle2, midle1)
        INPUT "", enter
        GOTO 10

    CASE 2
        CLS
        PRINT "### 2. Looping  ###"
        PRINT
        INPUT "Masukan Angka : ", angka

        setengah = ABS(angka / 2)
        FOR counter1 = 1 TO angka
            IF (counter1 > setengah) THEN
                FOR counter3 = setengah TO (counter1 - setengah) STEP -1
                    PRINT "*";
                NEXT counter3

            ELSE

                FOR counter2 = 1 TO counter1
                    PRINT "*";
                NEXT counter2

            END IF

            PRINT
        NEXT counter1
        INPUT "", enter
        GOTO 10

    CASE 3
        CLS
        PRINT "### 3. Kondisi  ###"
        PRINT
        INPUT "Masukan Tahun Kelahiran : ", tahun
        LET umur = 2013 - tahun
        IF umur > 20 THEN
            PRINT "Anda Sudah Tua"
        ELSE
            PRINT "Anda Masih Muda"
        END IF
        INPUT "", enter
        GOTO 10

    CASE 4
        END
END SELECT
```
