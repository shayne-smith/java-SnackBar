package snackBar;

public class Snack {
	private static int maxId = 0;

	private int id;
	private String name;
	private int quantity;
	private double cost;
	private int vendMachineId;

	public Snack(String name, int quantity, double cost, int vendMachineId) {
		maxId++;
		id = maxId;
		this.name = name;
		this.quantity = quantity;
		this.cost = cost;
		this.vendMachineId = vendMachineId;
	}

	/*
		get id
		set and get name
		set and get cost
		set and get vending machine id
		get quantity
		add quantity when given how many to add
		buy snack when given how many to buy
		get total cost given a quantity
	*/

	// Getter Methods
	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getQuantity() {
		return quantity;
	}

	public double getCost() {
		return cost;
	}

	public int getVendMachineId() {
		return vendMachineId;
	}

	public double getTotal(int quantity) {
		return quantity * this.cost;
	}

	// Setter Methods
	public void setName(String name) {
		this.name = name;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	public void setVendMachineId(int vendMachineId) {
		this.vendMachineId = vendMachineId;
	}

	public void addQuantity(int additionalSnacks) {
		this.quantity += additionalSnacks;
	}

	public void buySnacks(int numSnacks) {
		this.quantity -= numSnacks;
	}
}