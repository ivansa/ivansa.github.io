---
layout: post
title: "Membuat Refresh Page PHP Sederhana"
date: 2014-02-15 08:41
comments: true
categories: php
---

Membuat Page refresh otomatis dalam beberapa detik sekali, menggunakan fungsi meta pada html.
<!--more-->

```php
<?php
$page = $_SERVER['PHP_SELF'];
$sec = "10";
?>
<html>
    <head>
    <meta http-equiv="refresh" content="<?php echo $sec?>;URL='<?php echo $page?>'">
    </head>
    <body> 
    <?php
        echo "Watch the page reload itself in 10 second!";
    ?>
    </body>
</html>
```
