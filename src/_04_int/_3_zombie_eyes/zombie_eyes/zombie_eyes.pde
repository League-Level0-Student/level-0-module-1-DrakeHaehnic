
void setup() {
  size (250, 250);
}
void draw() {
PImage face = loadImage("zombo.png");
face.resize(250, 250);
  image(face, 0, 0);
  fill(mouseX, mouseY);
  ellipse(70, 82.5, 50, 35);
  ellipse(175.5, 75, 50, 35);
  
}
