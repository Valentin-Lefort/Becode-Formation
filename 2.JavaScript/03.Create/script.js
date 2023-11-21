let member = [
  "Alexandre Vandewiele",
  "Antoine Lansman",
  "Bastien Venturi",
  "Carole Gérard",
  "Dorian Vanden Eynde",
  "Elisabeth Leyder",
  "Elodie Ali",
  "Justin Michel",
  "Justine Frigo",
  "Justine Leleu",
  "Kimi Lefort",
  "Layla",
  "Lidwine Carenne",
  "Lucas Beauloi",
  "Marie Tara",
  "Mathias Barbier",
  "Okly",
  "Pierre Marien",
  "Robin Piot",
  "Rosalie Boulard",
  "Stephane Comblez",
  "Tim Besmet",
  "Toms",
  "Valentin Lefort",
  "Alexandre Vens",
  "Virginie Dourson"
];

shuffleArray(member);

let team = document.querySelectorAll("article");

member.forEach(addSec);

function addSec(str) {
  let newSec = document.createElement("section");
  let para = document.createElement("p");
  let team1 = document.querySelectorAll("p");
  let para1 = document.createTextNode(str);
  para.appendChild(para1);
  newSec.appendChild(para);
  document.querySelector("article").appendChild(newSec);

  for (element of team1) {
    let randomColor = random_bg_color();
    element.style.backgroundColor = randomColor;

    // Calculate the brightness of the background color
    let bgColorArray = randomColor.match(/\d+/g).map(Number); // Extract RGB values
    let brightness = rgbToLightness(bgColorArray);


    if (brightness > 0.6) {
      element.style.color = 'black';
    } else {
      element.style.color = 'white';
    }
  }
}
addSec();

function random_bg_color() {
  let x = Math.floor(Math.random() * 256); // Math random 0 > 255
  let y = Math.floor(Math.random() * 256); // Math random 0 > 255
  let z = Math.floor(Math.random() * 256); // Math random 0 > 255
  let bgColor = "rgb(" + x + "," + y + "," + z + ")"; // Prend les chiffre rando et en créer un rgb aleatoire

  return bgColor;
}

function rgbToLightness(arrayRgb) {
  arrayRgb.sort((a, b) => a - b);
  return (arrayRgb[0] + arrayRgb[2]) / 510;
}

function shuffleArray(array) {
  for (let i = array.length - 1; i > 0; i--) {
    const j = Math.floor(Math.random() * (i + 1));
    [array[i], array[j]] = [array[j], array[i]];
  }
}