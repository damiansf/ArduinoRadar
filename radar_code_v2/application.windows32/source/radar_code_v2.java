import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import processing.serial.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class radar_code_v2 extends PApplet {




Serial port;
Serial port2;
String data = "";
String Radius = "";
String Theta = "";
int index = 0;
float distance = 0;
float angle = 0;
float pi = 22.0f/7;
int count = 0;


public void setup() 
{
 
 size(1000,1000);
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

public void draw()

{


}

public void serialEvent(Serial port)
{

  data = port.readStringUntil('.');
  data = data.substring(0, data.length() - 1);  
  index = data.indexOf(",");
  Radius = data.substring(0, index);
  Theta = data.substring (index+1 , data.length());
  
   translate(500,500);
   point (0,0);
   
      distance = PApplet.parseFloat(Radius); 
      angle = PApplet.parseFloat(Theta) /180 * pi; 
      fill(30,200,30);
      ellipse(distance * cos(angle) ,  -1 * distance  * sin(angle) , 5,5);
//count= count +1;
//if (count >= 62){
 // background(0,0,0);
 // count = count-count;
//}


      

}
public void keyPressed() {
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
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "--full-screen", "--bgcolor=#666666", "--stop-color=#cccccc", "radar_code_v2" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
