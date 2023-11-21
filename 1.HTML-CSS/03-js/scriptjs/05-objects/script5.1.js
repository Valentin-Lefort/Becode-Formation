

function askTvSerie(){
  let sName = prompt('Give me a serie name');
  let sYears = prompt('Give me the years of the serie');
  let sCast = prompt('give me the number of cast of the serie');
  let nCast = [];
  for (let h = 0; h < sCast; h++) {
    let cast = prompt('Name of actor')
    //  nCast += cast + " "
    nCast.push(cast)
  }
  let myObject = {
    serieName : sName,
    serieYears : sYears,
    castMembers : nCast
  }
  return myObject;
}

let mySeries = askTvSerie()






