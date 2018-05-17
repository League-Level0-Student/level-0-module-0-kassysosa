import java.awt.Color;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class Checkpoint {
public static void main(String[] args) {
	String answer = JOptionPane.showInputDialog("What is your favorite color?");
	JOptionPane.showMessageDialog(null,answer + " is also my favorite color");
	Robot olive = new Robot ();
	olive.miniaturize();
	olive.sparkle();
	olive.setPenColor(Color.YELLOW);
	olive.penDown();
	olive.setSpeed(250);
	olive.move(120);
	olive.turn(120);
	olive.move(120);
	olive.turn(120);
	olive.move(120);
	
	
	
}
}
