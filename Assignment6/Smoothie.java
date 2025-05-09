package Assignment6;

public class Smoothie extends Beverage{
	
	private int numOfFruits;
    private boolean addProtein;
    private static final double PROTEIN_COST = 1.5;
    private static final double FRUIT_COST = 0.5;
	
	
	public Smoothie(String name, Type type, Size size) {
		super(name, type, size);
		// TODO Auto-generated constructor stub
	}
	
	
	public Smoothie(String bevName, Size size, int numOfFruits2, boolean addProtein2) {
		// TODO Auto-generated constructor stub
		super(bevName, Type.SMOOTHIE, size);
		this.numOfFruits = numOfFruits2;
		this.addProtein = addProtein2;
	}


	//calc price
	@Override
    public double calcPrice() {
        double price = addSizePrice();
        price += numOfFruits * FRUIT_COST;
        if (addProtein) {
        	price += PROTEIN_COST;
        }
        return price;
    }
	
	

    @Override
    public String toString() {
        return super.toString() + ", Fruits: " + numOfFruits + ", Protein: " + addProtein + ", Price: " + calcPrice();
    }

    @Override
    public boolean equals(Object obj) {
        Smoothie other = (Smoothie) obj;
        return numOfFruits == other.numOfFruits && addProtein == other.addProtein;
    }
    
    
    
    //caution: settergetters


	public int getNumOfFruits() {
		return numOfFruits;
	}


	public void setNumOfFruits(int numOfFruits) {
		this.numOfFruits = numOfFruits;
	}


	public boolean isAddProtein() {
		return addProtein;
	}


	public void setAddProtein(boolean addProtein) {
		this.addProtein = addProtein;
	}


	public static double getProteinCost() {
		return PROTEIN_COST;
	}


	public static double getFruitCost() {
		return FRUIT_COST;
	}
	
	
	

}
