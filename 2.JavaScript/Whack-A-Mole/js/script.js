function createMoleHoles() {
  const numHoles = parseInt(
    prompt("Combien de trous de taupes voulez-vous créer ?")
  );

  if (isNaN(numHoles) || numHoles < 1) {
    alert("Veuillez entrer un nombre valide de trous de taupes.");
    return;
  }

  const moleContainer = document.getElementById("game-container");
  moleContainer.innerHTML = "";

  const gridContainer = document.createElement("div");
  gridContainer.classList.add(
    "grid",
    "justify-items-center",
    "justify-center",
    "border-2"
  );
  gridContainer.style.gridTemplateColumns = "repeat(5, 0.1fr)";
  gridContainer.style.gap = "1%";

  for (let i = 0; i < numHoles; i++) {
    const moleHole = document.createElement("div");
    moleHole.classList.add(
      "w-24",
      "h-24",
      "bg-blue-600",
      "rounded-full",
      "cursor-crosshair",
      "relative"
    );
    moleHole.innerHTML = '<div id="mole"></div>';
    gridContainer.appendChild(moleHole);
  }

  moleContainer.appendChild(gridContainer);
  setInterval(showRandomMole, 800);
}

function showRandomMole() {
  const moleHoles = document.querySelectorAll(".bg-blue-600");
  moleHoles.forEach((moleHole) => {
    moleHole.innerHTML = "";
  });

  const randomIndex = Math.floor(Math.random() * moleHoles.length);
  const randomMoleHole = moleHoles[randomIndex];

  const mole = document.createElement("div");
  mole.classList.add(
    "w-16",
    "h-16",
    "bg-red-600",
    "rounded-full",
    "absolute",
    "top-3.5",
    "left-3.5"
  );
  randomMoleHole.appendChild(mole);
}
