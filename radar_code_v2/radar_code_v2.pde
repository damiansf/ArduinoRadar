

import processing.serial.*;
Serial port;
Serial port2;
String data = "";
String Radius = "";
String Theta = "";
int index = 0;
float distance = 0;
float angle = 0;
float pi = 22.0/7;
int count = 0;

  

void setup() 
{

  
 size(1000,700);
 background(0,0,0);
 fill(0,0,0);
  ellipse(500,500,1000,1000);
stroke(255);          // Setting the outline (stroke) to black
//fill(150);          // Setting the interior of a shape (fill) to grey
 line(500,0,500,1000);
 line(0,500,1000,500);
 line(500,500,1000,0);
 line(500,500,0,0);

port = new Serial(this, "COM5", 9600);
port.bufferUntil('.');
}

void draw()

{


}

void serialEvent(Serial port)
{

  data = port.readStringUntil('.');
  data = data.substring(0, data.length() - 1);  
  index = data.indexOf(",");
  Radius = data.substring(0, index);
  Theta = data.substring (index+1 , data.length());
  
   translate(500,500);
   point (0,0);
   
      distance = float(Radius)*-1; 
      angle = float(Theta) /180 * pi*-1; 
      fill(30,200,30);
      ellipse(distance * cos(angle) ,  -1 * distance  * sin(angle) , 5,5);
count= count +1;
println(distance*-1);
println(angle*-1);
//println(angle);
//if (count >= 62){
//background(0,0,0);
//background(0,0,0);
// fill(0,0,0);
//  ellipse(500,500,1000,1000);
//stroke(255);          // Setting the outline (stroke) to black
//fill(150);          // Setting the interior of a shape (fill) to grey
// line(500,0,500,1000);
// line(0,500,1000,500);
// line(500,500,1000,0);
// line(500,500,0,0);
 // count = count-count;
}


{

}
void keyPressed() {
background(0,0,0);
background(0,0,0);
 fill(0,0,0);
  ellipse(500,500,1000,1000);
stroke(255);          // Setting the outline (stroke) to black
//fill(150);          // Setting the interior of a shape (fill) to grey
 line(500,0,500,1000);
 line(0,500,1000,500);
 line(500,500,1000,0);
 line(500,500,0,0);
  
}
