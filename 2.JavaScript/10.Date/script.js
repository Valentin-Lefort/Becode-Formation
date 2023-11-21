// --------------------------------------- Exercice 1 -------------------------------------------------------

// obtenir l'heure et le jour pour une ville
function getFormattedTimeAndDay(city, elementSelector) {
  const currentTime = new Date();

  // Options pour l'heure et le jour
  const timeOptions = {
    timeZone: city,
    hour: "numeric",
    minute: "numeric",
    second: "numeric",
    hour12: false, // Utilise le format 24 heures et non AM/PM
  };

  const dayOptions = {
    timeZone: city,
    weekday: "long", // Jour de la semaine en format complet (Ex: Lundi/mardi et non 1/2)
  };

  // Obtenir l'heure modifier
  const formattedTime = currentTime.toLocaleTimeString("fr-FR", timeOptions);

  // Obtenir le jour de la semaine modifier
  const formattedDay = currentTime.toLocaleDateString("fr-FR", dayOptions);

  // Sélectionner l'élément avec le sélecteur spécifié
  const element = document.querySelector(elementSelector);

  // Mettre à jour le contenu de l'élément avec l'heure et le jour
  element.textContent = `L'heure en ${city} est ${formattedTime}. Nous somme ${formattedDay}.`;
}

// Appel la fonction pour chaque ville
getFormattedTimeAndDay("America/Anchorage", ".alaska");
getFormattedTimeAndDay("Europe/Moscow", ".moscow");
getFormattedTimeAndDay("Atlantic/Reykjavik", ".reykjavik");

// --------------------------------------- Exercice 2 -------------------------------------------------------

function timed() {
  let startDate = new Date("Aug 26 1994");
  let endDate = new Date();
  let totalDays = (endDate - startDate) / (1000 * 60 * 60 * 24);
  document.querySelector(".days").textContent +=
    "Jour mal utilisé : " + Math.round(totalDays);
}
timed();

// --------------------------------------- Exercice 3 -------------------------------------------------------

const currentTimestamp = Date.now(); // Get the current timestamp in milliseconds
const hoursToAdd = 80000;
const millisecondsInHour = 3600000; // 1 hour = 3600 seconds * 1000 milliseconds

const futureTimestamp = currentTimestamp + hoursToAdd * millisecondsInHour;
const futureDate = new Date(futureTimestamp);

// console.log(`The date and time 80,000 hours from now will be: ${futureDate}`);
document.querySelector(
  ".eighk"
).innerHTML = `La date aprés 80.000 heures passé on seras le : ${futureDate}`;

// --------------------------------------- Exercice 3.5 ------------------------------------------------------

function dateChoose() {
  document
    .querySelector("#timer")
    .addEventListener(
      "keyup",
      (e) =>
        (document.querySelector(".futur").textContent = new Date(
          new Date().getTime() + e.target.value * 60 * 60 * 1000
        ))
    );
}

dateChoose();

// --------------------------------------- Exercice 4 (Bonus) ------------------------------------------------------
setInterval(function getDiplayed() {
  const currentTime = new Date();

  // Options pour l'heure
  const timeOptions = {
    hour: "numeric",
    minute: "numeric",
    second: "numeric",
    hour12: false, // Utilise le format 24 heures et non AM/PM
  };

  const dayOptions = {
    weekday: "long", // Jour de la semaine en format complet (Ex: Lundi/mardi et non 1/2)
  };

  const timers = currentTime.toLocaleTimeString("fr-FR", timeOptions);
  document.querySelector(".hours").textContent = timers;

  const days = currentTime.toLocaleDateString("fr-FR", dayOptions);
  document.querySelector(".daysDisplay").textContent = days;

  const year = currentTime.getFullYear();
  document.querySelector(".yearDisplay").textContent = year;

  const dayNum = currentTime.getDate();
  const month = currentTime.toLocaleString("default", { month: "short" });
  document.querySelector(".middleContainer").textContent = dayNum;
  document.querySelector(".month").textContent = month;
}, 1000);

getDiplayed();
