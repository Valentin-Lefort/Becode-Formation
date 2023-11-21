// ---------------------------------------- Exercice 1 ------------------------------------------------------

let textInputElement = document.getElementById("firstname"); // Selection de l'input

let nameSpanElement = document.getElementById("display-firstname"); // Selection du "Span"

// Ajout de l'event qui force a la releve de la touche
textInputElement.addEventListener("keyup", () => {
  let text = textInputElement.value; // définie une variable qui ou l'event va s'effectuer
  nameSpanElement.innerHTML = " " + text; // écris ce qui se trouve dans l'input dans le span
});

// ---------------------------------------- Exercice 2 ------------------------------------------------------

let adult = document.getElementById("age"); // Selectionne l'input

// Ajout de l'event qui force a la releve de la touche
adult.addEventListener("keyup", (e) => {
  // Force la touche "Entré" et que la valeur soit superieur ou égal à 18
  if (e.key === "Enter" && parseInt(adult.value) >= 18) {
    document.getElementById("a-hard-truth").style.visibility = "visible";
  } else {
    document.getElementById("a-hard-truth").style.visibility = "hidden";
  }
});

// ---------------------------------------- Exercice 3 ------------------------------------------------------

let pwd = document.getElementById("pwd"); // Selectionne l'input

// créer un event quand la touche est lacher
pwd.addEventListener("keyup", (e) => {
  // ajoute une condition qui dit que juste la touche entré fonctionne && que si la valeur est okus petit ou égal à 6
  if (e.key === "Enter" && pwd.value.length <= 6) {
    document.getElementById("pwd").style.backgroundColor = "red"; // Selectionne l'input et lui ajoute une couleur
  } else if (e.key === "Enter") {
    document.getElementById("pwd").style.backgroundColor = "green"; // Si la condition du dessus est pas accepté s'execute
  }
});

let confirm = document.getElementById("pwd-confirm");

confirm.addEventListener("keyup", (e) => {
  // Si la valeur de l'input "pwd-confirm" est stricketement égal à l'input "pwd" alors fait le changement de couleur ( ou se qui se trouve dans le if)
  if (e.key === "Enter" && pwd.value === confirm.value) {
    document.getElementById("pwd").style.backgroundColor = "green"; // Selectionne l'input et lui ajoute une couleur
    document.getElementById("pwd-confirm").style.backgroundColor = "green"; // Selectionne l'input et lui ajoute une couleur
  } else if (e.key === "Enter" && pwd.value != confirm.value) {
    alert("Bad Password"); // Si la condition du dessus est pas accepté s'execute
  }
});

// ---------------------------------------- Exercice 4 ------------------------------------------------------

let opt = document.getElementById("toggle-darkmode"); // Selectionne l'id "toggle-darkmod"

opt.addEventListener("change", (e) => {
  if (e.target.value === "dark") {
    document.body.style.backgroundColor = "black";
    document.body.style.color = "white";
  } else {
    document.body.style.backgroundColor = "white";
    document.body.style.color = "black";
  }
});
