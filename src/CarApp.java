import java.util.ArrayList;
import java.util.Scanner;

public class CarApp {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int numOfCar;
		String make;
		String model;
		int year;
		double price;
		ArrayList<Car> arrList = new ArrayList<Car>();
		numOfCar=Validator.getInt(scan, "How many cars would you like to enter?: ", 1);
		for(int i = 0; i < numOfCar; i++) {
			make = Validator.getString(scan, "Car #"+(i+1)+" make: ");
			model = Validator.getString(scan, "Car #"+(i+1)+" model: ");
			year = Validator.getInt(scan, "Car #"+(i+1)+" year: ",1884);
			price = Validator.getDouble(scan, "Car #"+(i+1)+" price: ", 0);
			Car car1 = new Car(make, model,year,price);
			arrList.add(car1);
		}
		System.out.println("Current Inventory: ");
		System.out.printf("%-20s %-20s %-20s %-20s\n","Make","Model","Year","Price");
		for(int i = 0;i < arrList.size();i++) {
			String make1 = arrList.get(i).getMake();
			String model1 = arrList.get(i).getModel();
			int year1 = arrList.get(i).getYear();
			double price1 = arrList.get(i).getPrice();
			
			System.out.printf("%-20s %-20s %-20s %s%-20.2f\n", make1, model1, year1,"$", price1);
			
		}
		
		
	}
}
