// let imp = document.querySelector(".important").setAttribute("title", "This is an important item") // ajoute l'element title dans le html ( inspector only ) 

// //Select all the img tags and loop through them. If they have no important class, turn their display property to none
//     // Select all img tags
        
//         let imgTags = document.querySelectorAll('img');
        
//     // Loop through each img tag
        
//         imgTags.forEach(function(img) {
//             // Check if the img tag does not have the "important" class
//                 if (!img.classList.contains('important')) { // Exclamation mark = reverse 
//                     // Set the display property to "none" for img tags without the "important" class
//                     img.style.display = 'none';
//                 }
//             });

let prandom = document.querySelectorAll('p');

function random_bg_color() {
  let x = Math.floor(Math.random() * 256); // Math random 0 > 255
  let y = Math.floor(Math.random() * 256); // Math random 0 > 255
  let z = Math.floor(Math.random() * 256); // Math random 0 > 255
  let bgColor = "rgb(" + x + "," + y + "," + z + ")"; // Prend les chiffre rando et en créer un rgb aleatoire
  
  return bgColor;
  
}

// random_bg_color();


for (let element of prandom){
  let randomColor = random_bg_color();
  element.style.color = randomColor;
}
        