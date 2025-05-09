package Assignment6;

public abstract class Beverage {
	private String name;
	private Type type;
	private Size size;
	
	final private double PRICE = 2.0;
	final private double SIZE_PRICE = .5;
	
	public double addSizePrice() {
		
		double temp = PRICE;
		
		switch (size) { //to check what size it is
		case SMALL:
			temp += SIZE_PRICE; //applies the sizeprice
			break;
		case MEDIUM:
			temp += SIZE_PRICE*2;
			break;
		case LARGE:
			temp += SIZE_PRICE*3;
		default:
			temp = temp; //no size price added ig
		}
		
		return temp;
		
	}
	
	//abstract
	public abstract double calcPrice();

	//tostring method
	@Override
	public String toString() {
		return "Name: " + this.name + "\nSize: " + this.size;
	}
	
	//equals method
	@Override
	public boolean equals(Object obj) {
		
		boolean weGood = false;
		
		Beverage wahoo = (Beverage) obj;
		
		//check if everything lines up
		if (name.equals(wahoo.name) && type == wahoo.type && size == wahoo.size) {
			weGood = true;
		}
		
		return weGood;
	
		
		
	}
	
	//beware: CONSTRUCTORS, SETTERS, GETTERS BELOW
	
	public Beverage(String name, Type type, Size size) {
		super();
		this.name = name;
		this.type = type;
		this.size = size;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
	}

	public Size getSize() {
		return size;
	}

	public void setSize(Size size) {
		this.size = size;
	}

	public double getPRICE() {
		return PRICE;
	}

	public double getSIZE_PRICE() {
		return SIZE_PRICE;
	}

}
