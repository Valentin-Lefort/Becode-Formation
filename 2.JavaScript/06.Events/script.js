const _initTime = Date.now();



const getElapsedTime = () => {
  return Number((Date.now() - _initTime) / 1000).toFixed(2) + "s";
};

let SectionSelect = document.querySelector("main").children[2]; // Select the thrid children of main
let ulSelect = SectionSelect.children[1]; // Selection the second children of the children select above

const clickOnSquare = (e) => {
  console.log(e.target.classList[1]);
  console.log(getElapsedTime());

  let color = document.querySelector(".displayedsquare-wrapper"); // Select the element where the div have to go
  let clone = e.target.cloneNode(true)
     // clone the element clicked in the element selected above

  clone.classList.add("displayedsquare");
  color.appendChild(clone).addEventListener('click', () => {
    alert(e.target.classList[1])
 });; // display the element

  // let list = document.querySelector("ul"); // Select the tag <ul>

  let list = document.createElement("li"); // creat the tag <li>
  console.log(list);
  list.textContent =
    getElapsedTime() + " Create the element " + e.target.classList[1]; // create a text with the what is in the function getElapsedTime() with de class

  ulSelect.appendChild(list); // show what is in the list
};


const actionSquares = document.querySelectorAll(".actionsquare");
for (let actionSquare of actionSquares) {
  actionSquare.addEventListener("click", clickOnSquare);
}


function random_bg_color() {
  let x = Math.floor(Math.random() * 256); // Math random 0 > 255
  let y = Math.floor(Math.random() * 256); // Math random 0 > 255
  let z = Math.floor(Math.random() * 256); // Math random 0 > 255
  let bgColor = "rgb(" + x + "," + y + "," + z + ")"; // Prend les chiffre rando et en créer un rgb aleatoire

  return bgColor;
}
const bgChange = document.body;

bgChange.addEventListener("keyup", (e) => {
  
  let list = document.createElement("li");
  switch (e.keyCode) {
    case 32:
      document.body.style.background = random_bg_color();
      list.textContent = getElapsedTime() + " " + random_bg_color();
      ulSelect.appendChild(list);
      break;

    case 76:
      document.querySelector("ul").removeChild(ulSelect.lastChild);
      break;

    case 83:
      document.querySelector(".displayedsquare").remove();

    default:
      break;
  }
});


