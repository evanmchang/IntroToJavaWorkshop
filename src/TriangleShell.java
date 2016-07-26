import org.jointheleague.graphical.robot.Robot;

public class TriangleShell {

	// 1. Create a new Robot
	Robot E = new Robot();
	
	void go() {
		//drawTriangle(100); // 3. delete this line (used only for testing)
		// 6. Make the robot go as fast as possible
		E.setSpeed(10);
		// 4. make a variable to hold the length of the triangle and set it to 50
		int y = 50;
		// 7. Do the following (up to step 10) 60 times
		for (int i = 0; i < 60; i++) {
			E.penDown();
		
			// 9. Change the color of the pen to a random color
			E.setRandomPenColor();
			// 8. Increase the length of the side by 10 pixels
			y=y+10;
			// 5. call your drawTriangle() method using your length variable
			drawTriangle(y);
			// 10. Turn the tortoise 6 degrees to the right
			E.turn(6);
		}
	}

	/* 2. fill in the method below to draw a triangle. Use the length variable for the size of the triangle. */
	private void drawTriangle(int length) {
		for (int i = 0; i < 3; i++) {
			
		
		E.move(length);
		E.turn(120);
		}
		
	}

	
	public static void main(String[] args) {
		new TriangleShell().go();
	}
}



