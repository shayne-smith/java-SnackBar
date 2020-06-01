package snackBar;

public class Main {

	private static void workWithData() {

		Customer c1 = new Customer("Jane", 45.25);
		Customer c2 = new Customer("Bob", 33.14);

		VendingMachine vm1 = new VendingMachine("Food");
		VendingMachine vm2 = new VendingMachine("Drink");
		VendingMachine vm3 = new VendingMachine("Office");

		Snack s1 = new Snack("Chips", 36, 1.75, 1);
		Snack s2 = new Snack("Chocolate Bar", 36, 1.00, 1);
		Snack s3 = new Snack("Pretzel", 30, 2.00, 1);
		Snack s4 = new Snack("Soda", 24, 2.50, 2);
		Snack s5 = new Snack("Water", 20, 2.75, 2);

		// Customer 1 (Jane) buys 3 of snack 4 (Soda)
		c1.buySnacks(3 * s4.getCost());
		s4.buySnacks(3);
		System.out.println(c1.getName() + " cash on hand $" + c1.getCashOnHand());
		System.out.println("Quantity of " + s4.getName() + " is " + s4.getQuantity());
		System.out.println();

		// Customer 1 (Jane) buys 1 of snack 3 (Pretzel)
		c1.buySnacks(s3.getCost());
		s3.buySnacks(1);
		System.out.println(c1.getName() + " cash on hand $" + c1.getCashOnHand());
		System.out.println("Quantity of " + s3.getName() + " is " + s3.getQuantity());
		System.out.println();

		// Customer 2 (Bob) buys 2 of snack 4 (Soda)
		c2.buySnacks(2 * s4.getCost());
		s4.buySnacks(2);
		System.out.println(c2.getName() + " cash on hand $" + c2.getCashOnHand());
		System.out.println("Quantity of " + s4.getName() + " is " + s4.getQuantity());
		System.out.println();

		// Customer 1 (Jane) finds $10
		c1.addCashOnHand(10.00);
		System.out.println(c1.getName() + " cash on hand $" + c1.getCashOnHand());
		System.out.println();

 		// Customer 1 (Jane) buys 1 of snack 2 (Chocolate Bar)
 		c1.buySnacks(1 * s2.getCost());
		s2.buySnacks(1);
		System.out.println(c1.getName() + " cash on hand $" + c1.getCashOnHand());
		System.out.println("Quantity of " + s2.getName() + " is " + s2.getQuantity());
		System.out.println();

 		// Add 12 more items to snack 3 (Pretzel)
		s3.addQuantity(12);
		System.out.println("Quantity of " + s3.getName() + " is " + s3.getQuantity());
		System.out.println();

		// Customer 2 (Bob) buys 3 of snack 3 (Pretzel)
		c2.buySnacks(3 * s3.getCost());
		s3.buySnacks(3);
		System.out.println(c2.getName() + " cash on hand $" + c2.getCashOnHand());
		System.out.println("Quantity of " + s3.getName() + " is " + s3.getQuantity());
		System.out.println();

		System.out.println("Stretch Goals");
		System.out.println();

		System.out.println("Snack: " + s1.getName());
		System.out.println("Vending Machine: " + vm1.getName());
		System.out.println("Quantity: " + s1.getQuantity());
		System.out.print("Total Cost: $");
		System.out.printf("%.2f%n%n", (s1.getQuantity() * s1.getCost()));

		// Snack: Chocolate Bar
		System.out.println("Snack: " + s2.getName());
		System.out.println("Vending Machine: " + vm1.getName());
		System.out.println("Quantity: " + s2.getQuantity());
		System.out.print("Total Cost: $");
		System.out.printf("%.2f%n%n", (s2.getQuantity() * s2.getCost()));

		// Snack: Pretzel
		System.out.println("Snack: " + s3.getName());
		System.out.println("Vending Machine: " + vm1.getName());
		System.out.println("Quantity: " + s3.getQuantity());
		System.out.print("Total Cost: $");
		System.out.printf("%.2f%n%n", (s3.getQuantity() * s3.getCost()));

		// Snack: Soda
		System.out.println("Snack: " + s4.getName());
		System.out.println("Vending Machine: " + vm2.getName());
		System.out.println("Quantity: " + s4.getQuantity());
		System.out.print("Total Cost: $");
		System.out.printf("%.2f%n%n", (s4.getQuantity() * s4.getCost()));

		// Snack: Water
		System.out.println("Snack: " + s5.getName());
		System.out.println("Vending Machine: " + vm2.getName());
		System.out.println("Quantity: " + s5.getQuantity());
		System.out.print("Total Cost: $");
		System.out.printf("%.2f%n", (s5.getQuantity() * s5.getCost()));
	}

	public static void main(String[] args) {
		workWithData();
	}
}