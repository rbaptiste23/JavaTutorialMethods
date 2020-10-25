class Robot {
	
	
	public void speak(String text) {
		System.out.println(text);
	}
	
	public void jump(int height) {
		System.out.println("Jumping: " + height);
		System.out.println("Jumping: " + height);
		System.out.println("Jumping: " + height);
	}
	
	public void move (String direction, double distance) {
		System.out.println("Moving " + distance + " meters in direction " + direction );
	}
	
	public void stop(byte val) {
		System.out.println("This is my byte " + val);
		System.out.println("This is my byte " + val);
		System.out.println("This is my byte " + val);
	}

	
}


public class App {

	public static void main(String[] args) {
     Robot sam = new Robot();
     sam.speak("Hi I'm Sam");
     sam.jump(55);
     sam.move("East", 5.5);
     byte b = -24;
     
     sam.stop(b);
     sam.stop(b);
     
     
     

	}

}
