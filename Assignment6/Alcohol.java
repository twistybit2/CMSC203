package Assignment6;

public class Alcohol extends Beverage {
	private boolean isWeekend;
    private static final double WEEKEND_COST = 0.6;

    
    public Alcohol(String name, Type type, Size size, boolean isWeekend) {
		super(name, type, size);
		this.isWeekend = isWeekend;
	}

	public Alcohol(String bevName, Size size, boolean weekend) {
		// TODO Auto-generated constructor stub
		super(bevName, Type.ALCOHOL, size);
		this.isWeekend = weekend;
	}

	@Override
    public double calcPrice() {
        double price = addSizePrice();
        if (isWeekend) {
        	price += WEEKEND_COST;
        }
        return price;
    }

    @Override
    public String toString() {
        return super.toString() + ", Weekend: " + isWeekend + ", Price: " + calcPrice();
    }

    @Override
    public boolean equals(Object obj) {
        Alcohol other = (Alcohol) obj;
        return isWeekend == other.isWeekend;
    }
    
    
    
    //setters and getters below

	public boolean isWeekend() {
		return isWeekend;
	}

	public void setWeekend(boolean isWeekend) {
		this.isWeekend = isWeekend;
	}

	public static double getWeekendCost() {
		return WEEKEND_COST;
	}
    
    
    
    

}
