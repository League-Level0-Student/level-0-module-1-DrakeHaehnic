void setup() {
    size(500, 500);
}
void draw() {

  background(#BFF3FF);
    noStroke();
   fill(#FFEA00);
    ellipse(150, 200, 150, 150);
    ellipse(212, 200, 150, 150);

   
   if (mousePressed){
    fill(#BFF3FF);
     ellipse(75, 200, 60, 70);
   }
   
}
