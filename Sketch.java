import processing.core.PApplet;

public class Sketch extends PApplet {
	
	
  /**
   * Called once at the beginning of execution, put your size all in this method
   */
  public void settings() {
	// put your size call here
    size(400, 400);
    
  }

  /** 
   * Called once at the beginning of execution.  Add initial set up
   * values here i.e background, stroke, fill etc.
   */
  public void setup() {

    float snowballx = random(0, width);
    float snowbally = random(0, height);
    float snowballSize = random(25, 100); 


    background(210, 255, 173);

    
    fill(255,250,250);
    ellipse(snowballx, snowbally, snowballSize, snowballSize);
  }

  /**
   * Called repeatedly, anything drawn to the screen goes here
   */
  
  public void draw() {
	  
    int hour = hour();
    int minute = minute();
    String clock = hour + ":" + minute;

    fill(255,250,250);
    rect(50, 50, 300, 100);

    fill(0, 0, 0);
    textSize(75);
    text(clock, 100, 125);
    
    


    

    
  }
  
  
 
}