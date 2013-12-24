---
layout: post
title: "Adb No Permissions On Ubuntu"
date: 2013-11-28 14:51
comments: true
categories: android
---

This blog post explains how to fix the no permissions error the Android Debugger displays when running the adb devices command Linux. The solutions presented here have been tested and found working on Ubuntu Lucid, but they should also work on other Ubuntu and Linux versions as well. 

<!-- more -->

This official help center page has many working and non-working answers to the problem, and many comments. The root cause of the problem is that the current user doesn't have sufficient permissions to access the USB device file created when the phone was connected in USB debug mode. 

Killing all running adb server instances with sudo killall adb, disconnecting the phone, reconnecting the phone, and then running sudo adb devices instead (so adb gets run as root) fixes the problem. 

Alternatively, it is possible to implement a long-term fix which doesn't require sudo, thus it works with e.g. IntelliJ IDE integration: 

* Create a file named /tmp/android.rules with the following contents (hex vendor numbers were taken from the vendor list page): 
```
SUBSYSTEM=="usb", ATTRS{idVendor}=="0bb4", MODE="0666"
SUBSYSTEM=="usb", ATTRS{idVendor}=="0e79", MODE="0666"
SUBSYSTEM=="usb", ATTRS{idVendor}=="0502", MODE="0666"
SUBSYSTEM=="usb", ATTRS{idVendor}=="0b05", MODE="0666"
SUBSYSTEM=="usb", ATTRS{idVendor}=="413c", MODE="0666"
SUBSYSTEM=="usb", ATTRS{idVendor}=="0489", MODE="0666"
SUBSYSTEM=="usb", ATTRS{idVendor}=="091e", MODE="0666"
SUBSYSTEM=="usb", ATTRS{idVendor}=="18d1", MODE="0666"
SUBSYSTEM=="usb", ATTRS{idVendor}=="0bb4", MODE="0666"
SUBSYSTEM=="usb", ATTRS{idVendor}=="12d1", MODE="0666"
SUBSYSTEM=="usb", ATTRS{idVendor}=="24e3", MODE="0666"
SUBSYSTEM=="usb", ATTRS{idVendor}=="2116", MODE="0666"
SUBSYSTEM=="usb", ATTRS{idVendor}=="0482", MODE="0666"
SUBSYSTEM=="usb", ATTRS{idVendor}=="17ef", MODE="0666"
SUBSYSTEM=="usb", ATTRS{idVendor}=="1004", MODE="0666"
SUBSYSTEM=="usb", ATTRS{idVendor}=="22b8", MODE="0666"
SUBSYSTEM=="usb", ATTRS{idVendor}=="0409", MODE="0666"
SUBSYSTEM=="usb", ATTRS{idVendor}=="2080", MODE="0666"
SUBSYSTEM=="usb", ATTRS{idVendor}=="0955", MODE="0666"
SUBSYSTEM=="usb", ATTRS{idVendor}=="2257", MODE="0666"
SUBSYSTEM=="usb", ATTRS{idVendor}=="10a9", MODE="0666"
SUBSYSTEM=="usb", ATTRS{idVendor}=="1d4d", MODE="0666"
SUBSYSTEM=="usb", ATTRS{idVendor}=="0471", MODE="0666"
SUBSYSTEM=="usb", ATTRS{idVendor}=="04da", MODE="0666"
SUBSYSTEM=="usb", ATTRS{idVendor}=="05c6", MODE="0666"
SUBSYSTEM=="usb", ATTRS{idVendor}=="1f53", MODE="0666"
SUBSYSTEM=="usb", ATTRS{idVendor}=="04e8", MODE="0666"
SUBSYSTEM=="usb", ATTRS{idVendor}=="04dd", MODE="0666"
SUBSYSTEM=="usb", ATTRS{idVendor}=="0fce", MODE="0666"
SUBSYSTEM=="usb", ATTRS{idVendor}=="0930", MODE="0666"
SUBSYSTEM=="usb", ATTRS{idVendor}=="19d2", MODE="0666"
```

* Run the following commands (without the leading $): 
```
$ sudo cp /tmp/android.rules /etc/udev/rules.d/51-android.rules
$ sudo chmod 644   /etc/udev/rules.d/51-android.rules
$ sudo chown root /etc/udev/rules.d/51-android.rules
$ sudo service udev restart
$ sudo killall adb
```

* Disconnect the USB cable between the phone and the computer. 
* Reconnect the phone. 
* Run adb devices to confirm that now it has permission to access the phone. 

> Please note that it's possible to use , USER="$LOGINNAME" instead of , MODE="0666" in the .rules file, substituting $LOGINNAME for your login name, i.e. what id -nu prints. 

##### Sumber : <a href="ptspts.blogspot.co.il/2011/10/how-to-fix-adb-no-permissions-error-on.html">ptspts.blogspot.co.il/2011/10/how-to-fix-adb-no-permissions-error-on.html</a>
