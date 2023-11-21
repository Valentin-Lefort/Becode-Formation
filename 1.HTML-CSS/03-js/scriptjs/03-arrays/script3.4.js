function findMax() {
  let Arr = [1, 8 , 99 , 35 , 48];

  let min = Math.min(...Arr);
  let max = Math.max(...Arr);

  console.log("Min Value: " + min);
  console.log("Max Value: " + max);
}

findMax()