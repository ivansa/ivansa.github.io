<?php 
//http://localhost:8080/sample1/webservice2.php?json={%22UserName%22:1,%22FullName%22:2}
//$json=$_GET ['json'];
$json = file_get_contents('php://input');
$obj = json_decode($json);

//echo $json;


//Save
$con = mysql_connect('localhost','root','admin') or die('Cannot connect to the DB');
mysql_select_db('test_android',$con);

  /* grab the posts from the db */
  //$query = "SELECT post_title, guid FROM wp_posts WHERE post_author = $user_id AND post_status = 'publish' ORDER BY ID DESC LIMIT $number_of_posts";
mysql_query("INSERT INTO users (username, fullname)
VALUES ('".$obj->{'username'}."', '".$obj->{'fullname'}."')");

mysql_close($con);
//
  //$posts = array($json);
  $posts = array(1);
    header('Content-type: application/json');
    echo json_encode(array('posts'=>$posts));

?>
