//-----------------------------------------------  Exercice 1 ---------------------------------------------------

// Fonction pour écrire le texte "Keller" dans une div avec effet de machine à écrire
function KellerWriter() {
  const text = "Keller"; // Le texte à afficher
  let index = 0; // Index pour suivre la position actuelle dans le texte
  const kellerDiv = document.getElementById("keller"); // Obtenir la référence de la div

  const intervalId = setInterval(() => {
    if (index < text.length) {
      const output = text.slice(0, index + 1); // Obtenir une partie du texte
      kellerDiv.textContent = output; // Mettre à jour le contenu de la div avec la partie actuelle du texte
      index++;
    } else {
      clearInterval(intervalId); // Arrêter l'intervalle lorsque tout le texte est affiché
    }
  }, 1000); // Intervalle de 1 seconde (1000 millisecondes)
}

KellerWriter(); // Appel de la fonction pour démarrer l'effet de machine à écrire

//-----------------------------------------------  Exercice 2 ---------------------------------------------------

let sec = 0; // Initialisation des secondes à 0
let min = 0; // Initialisation des minutes à 0
let hour = 0; // Initialisation des heures à 0
let timerDiv = document.getElementById("timer"); // Obtenir la référence de la div de l'horloge

let timer = setInterval(() => {
  sec++; // Incrémentation des secondes

  if (sec === 60) {
    // Si les secondes atteignent 60
    sec = 0; // Réinitialiser les secondes
    min++; // Incrémentation des minutes

    if (min === 60) {
      // Si les minutes atteignent 60
      min = 0; // Réinitialiser les minutes
      hour++; // Incrémentation des heures

      if (hour === 24) {
        // Si les heures atteignent 24
        hour = 0; // Réinitialiser les heures pour une nouvelle journée ( copier ce qui il y a plus haut pour ajouter les jours)
      }
    }
  }

  // Formater les valeurs de sec, min et hour pour qu'elles aient toujours au moins deux chiffres
  const ModifiedSec = sec < 10 ? "0" + sec : sec; // Le "?" pose une question exemple : Es-que "sec" est inférieur à 10 si oui ajoute un 0 (09 par exemple)
  const ModifiedMin = min < 10 ? "0" + min : min;
  const ModifiedHour = hour < 10 ? "0" + hour : hour;

  // Mettre à jour le contenu de la div de l'horloge avec l'heure formatée
  timerDiv.textContent = ModifiedHour + ":" + ModifiedMin + ":" + ModifiedSec;
}, 1000); // Intervalle de 1 seconde (1000 millisecondes)
