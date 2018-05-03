import java.awt.Color;

import org.jointheleague.graphical.robot.Robot;

public class RobotGraffiti {
public static void main(String[] args) {
	// Make a new robot
	Robot susy = new Robot(); 
	susy.setPenColor(Color.yellow);
	susy.miniaturize();
	//pen down 
	susy.penDown();
	//set speed
	susy.setSpeed(150);
	//move robot 
	susy.move(200);
	//turn robot
	susy.turn(180);
	//move robot
	susy.move(100);
	//turn robot
	susy.turn(250);
	//move robot 
	susy.move(100);
	//turn robot 
	susy.turn(180);
	//move
	susy.move(100);
	//turn
	susy.turn(250);
}
}
