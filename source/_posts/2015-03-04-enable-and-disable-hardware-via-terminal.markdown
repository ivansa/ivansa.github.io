---
layout: post
title: "Disable dan Enable Touchpad Di Ubuntu"
date: 2015-03-04 12:41
comments: true
categories: tulisan 
---

<b>Lihat id touchpad dengan perintah : </b>

```
xinput list
```

<b>Setelah itu anda akan mendapat output seperti berikut</b>

```
⎡ Virtual core pointer                          id=2    [master pointer  (3)]
⎜   ↳ Virtual core XTEST pointer                id=4    [slave  pointer  (2)]
⎜   ↳ SynPS/2 Synaptics TouchPad                id=12   [slave  pointer  (2)]
⎣ Virtual core keyboard                         id=3    [master keyboard (2)]
    ↳ Virtual core XTEST keyboard               id=5    [slave  keyboard (3)]
    ↳ Power Button                              id=6    [slave  keyboard (3)]
    ↳ Video Bus                                 id=7    [slave  keyboard (3)]
    ↳ Power Button                              id=8    [slave  keyboard (3)]
    ↳ Sleep Button                              id=9    [slave  keyboard (3)]
    ↳ Laptop_Integrated_Webcam_1.3M             id=10   [slave  keyboard (3)]
    ↳ AT Translated Set 2 keyboard              id=11   [slave  keyboard (3)]
    ↳ Dell WMI hotkeys                          id=13   [slave  keyboard (3)]
```

Ouput di atas menampilkan daftar device yang telah terkoneksi dengan laptop, <br />
<b>pada daftar di atas touchpad memiliki ID : 12</b>, <br />
maka untuk mendisablenya kita jalankan perintah berikut :

```
xinput set-prop 12 "Device Enabled" 0
```
