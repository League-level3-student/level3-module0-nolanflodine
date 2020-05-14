package _00_IntroToArrays;

import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import org.jointheleague.graphical.robot.Robot;

public class _01_RobotRace {
	// 1. make a main method
	public static void main(String[] args) {
		
		// 2. create an array of 5 robots.
		Robot[] r = new Robot[5];
		// 3. use a for loop to initialize the robots.
		for (int i = 0; i < r.length; i++) {
			r[i] = new Robot();
			r[i].setSpeed(100);
		}
		// 4. make each robot start at the bottom of the screen, side by side, facing up
		r[0].setX(50);
		r[0].setY(452);
		r[1].setX(150);
		r[1].setY(452);
		r[2].setX(250);
		r[2].setY(452);
		r[3].setX(350);
		r[3].setY(452);
		r[4].setX(450);
		r[4].setY(452);
		// 5. use another for loop to iterate through the array and make each robot move
		// a random amount less than 50.
		boolean stop = false;
		Random rand = new Random();
		for (int j = 0; j < 9999; j++) {
			for (int i = 0; i < r.length; i++) {
				if (stop == false) {
					if (r[i].getY() >= 50) {
						r[i].move(rand.nextInt(50));
						r[i].turn(5);
						if (r[i].getY() >= 450 && r[i].getY() <= 500 && r[i].getX() < 400) {
							r[i].turn(999);
							stop = true;
						}
					}
				}
			}
		}
		// 6. use a while loop to repeat step 5 until a robot has reached the top of the
		// screen.

		// 7. declare that robot the winner and throw it a party!

		// 8. try different races with different amounts of robots.

		// 9. make the robots race around a circular track.

	}
}
