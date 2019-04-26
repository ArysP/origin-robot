import kareltherobot.*;

public class Application implements Directions {

 public static void main(String [] args) {

  OriginRobot Orville = new OriginRobot(10, 9, East, 0);
  
        // on call to rule them all . . .
  Orville.goToOrigin();
  Orville.turnOff();
 } // end main
 
 static {

         World.setDelay(50);
         World.readWorld("plain.kwld");
         World.setVisible(true);
         World.showSpeedControl(true);

  } // end of static

 
 
 
} // end class Application
