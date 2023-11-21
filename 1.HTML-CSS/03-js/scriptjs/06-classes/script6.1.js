class Circle {
  constructor(xPos, yPos, radius){
      this.xPos = xPos;
      this.yPos = yPos;
      this.radius = radius;
  }
  move(xOffset, yOffset){
       this.xPos = xOffset;
       this.yPos = yOffset;
  }
  get surface(){
      return ((Math.PI*this.radius*this.radius)).toFixed(2);
  }
}


let circle1 = new Circle(0,0,10);
console.log("Position: " + circle1.xPos + " , " + circle1.yPos + " Surface: " + circle1.surface);

circle1.move(10,10);
console.log("Position: " + circle1.xPos + " , " + circle1.yPos + " Surface: " + circle1.surface);