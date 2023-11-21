// Not recursive

// let n = prompt('Put a number between 0 from 10');

// function factorial(n){
//   let answer = 1;
//   if (n == 0 || n == 1){
//     return answer;
//   }
//   else if(n > 1){
//     for(var i = n; i >= 1; i--){
//       answer = answer * i;
//     }
//     return answer;
//   }
//   else{
//     return "number has to be positive."
//   }  
// }

// answer = factorial(n)
// console.log("Factorial of " + n + " : " + answer);

// -------------------------------------------------------------------------------------

// Recursive Approach

let n = prompt('Put a number');

function factorial(n){
  if(n < 0){
      return "number has to be positive."
  }
  
  //base case
  if(n == 0 || n == 1){
      return 1;
  //recursive case
  }else{
      return n * factorial(n-1);
  }
}
answer = factorial(n)
console.log("Factorial of " + n + " : " + answer);