PImage pepperoni;
void setup() {
    size(500, 500);
}
void draw() {
   
  fill(#CB6C4C);
  ellipse(250, 250, 300, 300);

  
  pepperoni = loadImage("pepperoni.png");
  image(pepperoni,200,200);
  
}
