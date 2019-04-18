import kareltherobot.*;
import kareltherobot.Robot;

// Notice that use use Robot as the "base" class, not UrRobot
// Robot can tell us stuff about him/her self . . .
public class OriginRobot extends Robot {

  // 1st, the constructor for our new class of robot . . .
  public OriginRobot(int Street, int Avenue, Direction direction, int Beepers) { 
  super(Street, Avenue, direction, Beepers);
  } 

  //  robot face west . . .
  public void faceWest() {
    while (!facingWest()){
      turnLeft();}
  } // end_faceWest

  // robot face south . . . 
  public void faceSouth() {    
    while (!facingSouth()){
      turnLeft();} 
  }  // end-faceSouth

  //robot face east . . .
  public void faceEast() {   
    while (!facingEast()){
    turnLeft();}  
  }//end-faceEast
  
    public void faceNorth() {   
      while (!facingNorth()){
    turnLeft();}  
  } //end-faceNorth

  // move the robot to a wall . . .
  public void goToWall() {
    while (frontIsClear()){
      move();
    }
  } // end-goToWall

  public void goToOrigin() {
    faceWest();
    goToWall();
    faceSouth();
    goToWall();
    faceNorth();

  } // end-goToOrigin

} // end-class



