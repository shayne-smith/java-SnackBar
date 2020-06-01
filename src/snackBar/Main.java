package snackBar;

public class Main {

	/* 
		Customer 1 cash on hand 37.75
		Quantity of snack 4 is 21

		Customer 1 cash on hand 35.75
		Quanity of snack 3 is 29

		Customer 2 cash on hand 28.14
		Quantity of snack 4 is 19

		Customer 1 cash on hand 45.75

		Customer 1 cash on hand 44.75
		Quantity of snack 2 is 35

		Quantity of snack 3 is 41

		customer 2 cash on hand 22.14
		Quantity of snack 3 is 38
	*/

	private static void workWithData() {
		System.out.println("Welcome to the Snack Bar!!!");
		System.out.println();

		// Customer(String name, double cashOnHand)
		Customer c1 = new Customer("Jane", 45.25);
		Customer c2 = new Customer("Bob", 33.14);

		// VendingMachine(String name)
		VendingMachine vm1 = new VendingMachine("Food");
		VendingMachine vm2 = new VendingMachine("Drink");
		VendingMachine vm3 = new VendingMachine("Office");

		// Snack(String name, int quantity, double cost, int vendMachineId)
		Snack s1 = new Snack("Chips", 36, 1.75, 1);
		Snack s2 = new Snack("Chocolate Bar", 36, 1.00, 1);
		Snack s3 = new Snack("Pretzel", 30, 2.00, 1);
		Snack s4 = new Snack("Soda", 24, 2.50, 2);
		Snack s5 = new Snack("Water", 20, 2.75, 2);

		// Customer 1 (Jane) buys 3 of snack 4 (Soda)
		c1.buySnacks(3 * s4.getCost());
		s4.buySnacks(3);
		System.out.println(c1.getName() + " cash on hand " + c1.getCashOnHand());
		System.out.println("Quantity of " + s4.getName() + " is " + s4.getQuantity());
		System.out.println();

		// Customer 1 (Jane) buys 1 of snack 3 (Pretzel)
		c1.buySnacks(s3.getCost());
		s3.buySnacks(1);
		System.out.println(c1.getName() + " cash on hand " + c1.getCashOnHand());
		System.out.println("Quantity of " + s3.getName() + " is " + s3.getQuantity());
		System.out.println();

	}

	public static void main(String[] args) {
		workWithData();
	}
}