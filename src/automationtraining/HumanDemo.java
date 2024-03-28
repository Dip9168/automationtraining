package automationtraining;

public class HumanDemo {
	public static void main(String[]args) {
		Human h1= new Human();
		h1.name="Manu";
		h1.age=24;
		
		
	Human h2= new Human();
		h2.name="Renu";
		h2.age=23;
		
		h1.speak("Hello How are you?");
		h2.speak("Hey I am fine");
	}

}

class Human {
	String name;
	int age;
	String country;

	void speak(String content) {
		System.out.println(name + "-" + content);
	}
}