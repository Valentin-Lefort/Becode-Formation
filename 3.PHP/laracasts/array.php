<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Array</title>
</head>
<body>
  <h1>Langages</h1>
<?php 
  $languages = [
    [
      'name' => 'HTML',
      'author' => 'Tim Berners-Lee',
      'date' =>'1993',
      'link' => 'https://en.wikipedia.org/wiki/HTML'
    ],
    [
      'name' => 'CSS',
      'author' =>'Håkon Wium Lie',
      'date' => '1994',
      'link' => 'https://en.wikipedia.org/wiki/CSS'
    ],
    [
      'name' => 'JavaScript',
      'author' => 'Brendan Eich',
      'date' => '1995',
      'link' => 'https://en.wikipedia.org/wiki/JavaScript'
    ]
    ];
?>
  <ul>
<?php     foreach ($languages as $values){
      echo "<li> <a href='$values[link]'> $values[name] </a> <span> $values[date]</span> </li>";
    }
    ?>
  </ul>

  <a href=""></a>
</body>
</html>