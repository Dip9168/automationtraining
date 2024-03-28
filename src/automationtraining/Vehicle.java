package automationtraining;

public class Vehicle {
public static void main(String[] args) {
	car c1= new car();
	c1.model="Audi";
	c1.price=50000;
	
	
car c2= new car();
	c2.model="Ford";
	c2.price=60000;
	
	c1.speed("The speed is minimum");
	c2.speed("The speed is maximum");
}

}








class car {
	String model;
	int price;
	String colour;

	void speed(String content) {
		System.out.println(model + "-" + content);
	}
}