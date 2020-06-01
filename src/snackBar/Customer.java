package snackBar;

public class Customer {
	private static int maxId = 0;

	private int id;
	private String name;
	private double cashOnHand;

	public Customer(String name, double cashOnHand) {
		maxId++;
		id = maxId;
		this.name = name;
		this.cashOnHand = cashOnHand;
	}

	// Getter Methods
	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public double getCashOnHand() {
		return cashOnHand;
	}

	// Setter Methods
	public void setName(String name) {
		this.name = name;
	}

	public void addCashOnHand(double additionalCash) {
		this.cashOnHand += additionalCash;
	}

	public void buySnacks(double totalCost) {
		this.cashOnHand -= totalCost;
	}
}