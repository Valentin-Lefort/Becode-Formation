// ------------------- Way One -----------------

// var data;
// let front = true;

// const authors = document.querySelectorAll(".author");

// const texts = document.querySelectorAll(".text");

// const body = document.getElementById("body");

// const button = document.querySelectorAll(".new-quote");

// const blockFront = document.querySelector(".block__front");
// const blockBack = document.querySelector(".block__back");

// const authorFront = authors[0];
// const authorBack = authors[1];

// const textFront = texts[0];
// const textBack = texts[1];

// const buttonFront = button[0];
// const buttonBack = button[1];

// // An arrow function used to get a quote randomly
// const displayQuote = () => {
//   // Generates a random number between 0
//   // and the length of the dataset
//   let index = Math.floor(Math.random() * data.length);

//   // Stores the quote present at the randomly generated index
//   let quote = data[index].text;

//   // Stores the author of the respective quote
//   let author = data[index].author;

//   // Making the author anonymous if no author is present
//   if (!author) {
//     author = "Anonymous";
//   }

//   // Replacing the current quote and the author with a new one

//   if (front) {
//     // Changing the front if back-side is displayed
//     textFront.innerHTML = quote;
//     authorFront.innerHTML = author;
//   } else {
//     // Changing the back if front-side is displayed
//     textBack.innerHTML = quote;
//     authorBack.innerHTML = author;
//   }

//   front = !front;
// };

// // Fetching the quotes from the type.fit API using promises
// fetch("https://type.fit/api/quotes")
//   .then(function (response) {
//     return response.json();
//   }) // Getting the raw JSON data
//   .then(function (data) {
//     // Storing the quotes internally upon
//     // successful completion of request
//     this.data = data;

//     // Displaying the quote When the Webpage loads
//     displayQuote();
//   });

// // Adding an onclick listener for the button
// function newQuote() {
//   // Rotating the Quote Box
//   blockBack.classList.toggle("rotateB");
//   blockFront.classList.toggle("rotateF");

//   // Displaying a new quote when the webpage loads
//   displayQuote();
// }

// ------------------- Way two -----------------

// let quote = document.getElementById("quote");
// let author = document.getElementById("author");
// let btn = document.getElementById("btn");

// const url = "https://thatsthespir.it/api";

// let getQuote = () => {
//   fetch(url)
//     .then((data) => data.json())
//     .then((item) => {
//       console.log(item.quote);
//       console.log(item.author);
//       quote.innerText = item.quote;
//       author.innerText = item.author;
//     });
// };

// window.addEventListener("load", getQuote);

// btn.addEventListener("click", getQuote);

// ----------------------------------------------------

let main = document.querySelector(".contant");
let btn = document.getElementById("btn");

function getInfo() {
  return new Promise((resolve) => {
    setTimeout(() => {
      let test = () => fetch("https://thatsthespir.it/api");
      test()
        .then((response) => response.json())
        .then((json) => {
          // let body = document.querySelector("body");

          let p = document.createElement("h3");
          p.classList.add("font-bold", "text-center");
          let divImg = document.createElement("div");
          divImg.classList.add("flex", "justify-center");
          let img = document.createElement("img");
          let quoteP = document.createElement("p");
          quoteP.classList.add("text-center");

          let author = json.author;
          let photo = json.photo;
          let quote = json.quote;

          p.textContent = author;
          img.src = photo;
          quoteP.textContent = quote;

          main.appendChild(p);
          main.appendChild(divImg);
          divImg.appendChild(img);
          main.appendChild(quoteP);

          // let trimmed = author.trimStart();
        });
      resolve("Done");
    }, 1000);
  });
}

async function test() {
  console.log("Initialized");
  const getGood = await getInfo();
  console.log(getGood);
}

let count = 0;
let p = document.createElement("p");
// p.classList = "count";
// document.body.appendChild(p);

btn.addEventListener("click", () => {
  // let body = document.querySelector("body");
  let loader = document.createElement("div");
  let loaderContainer = document.createElement("div");
  loader.classList = "loader";
  loaderContainer.classList = "container";
  let html = document.querySelector("html");
  html.appendChild(loaderContainer);
  loaderContainer.appendChild(loader);
  setTimeout(() => {
    html.removeChild(loaderContainer);
  }, 1000);
  count++;
  p.textContent = "Count: " + count;

  try {
    test();
  } catch (error) {
    console.error(error);
  }
});
