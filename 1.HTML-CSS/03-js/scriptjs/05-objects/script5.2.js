
let randoTV = (castMembers) => {
  let newArr = [];
  for (let t = 0; t < castMembers.length; t++) {
    nCast = castMembers[Math.floor(Math.random() * castMembers.length)]
    newArr.push(nCast)
  }
  return newArr;
}

let randomized = randoTV(mySeries.castMembers);
console.log(randomized);

