// alert("connected");

let number;

while (true) {
  const numberInput = prompt("What the number? :");

  if (numberInput === null) {
    alert("Cancelled refresh if u want retry");
    break;
  }
  
  number = parseInt(numberInput)
  
  if (!isNaN(number) && number > 0) {
    break;
  } else {
    alert("Put a num");
  }  
}

if (number !== undefined) {
  let sum = 0;

  for (let i = 0; i < number; i++) {
    let numInput;
    let num;
  
    do {
      numInput = prompt(`Entrez le nombre entre ${i + 1} sur ${number} :`);
  
      if (numInput === null){
        // alert("canceled");o 
        break;
      }
      num = parseFloat(numInput);
  
      if (isNaN(num)){
        alert("Put a valid number");
      } 
      sum += num;
      alert(`${sum}`)
    } while (isNaN(num));
    if (numInput === null) {
      break;
    }
  }
}


