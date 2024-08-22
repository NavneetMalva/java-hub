package oops.inheritence;

import java.util.Scanner;

class Car {
    int noOfGear;
    String color;
    // Write your constructor and printCarInfo method here.
	public Car(int noOfGear, String color) {
		super();
		this.noOfGear = noOfGear;
		this.color = color;
	}
    
	public void printCarInfo() {
		System.out.println("noOfGear: "+noOfGear+"\ncolor: "+color);
	}

}

class RaceCar extends Car {
    int maxSpeed;
    // Write your constructor and printRaceCarInfo method here.

	public RaceCar(int noOfGear, String color, int maxSpeed) {
		super(noOfGear, color);
		this.maxSpeed = maxSpeed;
	}
    
	public void printRaceCarInfo() {
		System.out.println("noOfGear: "+noOfGear+"\ncolor: "+color+"\nmaxSpeed :"+maxSpeed);
	}
    
}

class CarsInfo {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter values:");
        int noOfGear = sc.nextInt();

        // [IGNORE]: Extra "end line" in previous line.
        sc.nextLine();

        String color = sc.nextLine();
        int maxSpeed = sc.nextInt();
        
        RaceCar raceCar = new RaceCar(noOfGear, color, maxSpeed);
        raceCar.printRaceCarInfo();
    }
}