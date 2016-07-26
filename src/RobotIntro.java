import org.jointheleague.graphical.robot.Robot;

public class RobotIntro {
	public static void main(String[]arg){
	Robot Evan = new Robot(200, 100);
	Robot Jasper = new Robot(100, 700);
	Robot Brandon = new Robot();
	int not = 1;
	while(not<=4){
	Evan.setSpeed(10);
	Evan.setRandomPenColor();
	Evan.penDown();
	Evan.turn(85);
	Evan.move(400);
	not=not+1;
	}
	int B = 1;
	while(B<=8){
	Brandon.setSpeed(10);
	Brandon.penDown();
	Brandon.turn(45);
	Brandon.move(100);
	B=B+1;
	}
	int Circle = 1;
	while(Circle<=400){
		Jasper.setSpeed(10);
		Jasper.setRandomPenColor();
		Jasper.penDown();
		Jasper.turn(1);
		Jasper.move(1);
		Circle=Circle+1;
	}
	}
}
