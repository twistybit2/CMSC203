package Assignment6;

public class Coffee extends Beverage{
	
	private boolean extraShot;
	private boolean extraSyrup;
	private static final double SHOT_COST = 0.5;
    private static final double SYRUP_COST = 0.5;

	public Coffee(String name, Type type, Size size) {
		super(name, type, size);
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	public Coffee(String name, Type type, Size size, boolean extraShot, boolean extraSyrup) {
		super(name, type, size);
		this.extraShot = extraShot;
		this.extraSyrup = extraSyrup;
	}




	public Coffee(String bevName, Size size, boolean extraShot2, boolean extraSyrup2) {
		// TODO Auto-generated constructor stub
		
		super(bevName, Type.COFFEE, size);
		this.extraShot = extraShot2;
		this.extraSyrup = extraSyrup2;
	
	
	}




	//price from abstract
	@Override
    public double calcPrice() {
        double price = addSizePrice();
        if (extraShot) {
        	price += SHOT_COST;
        }
        if (extraSyrup) {
        	price += SYRUP_COST;
        }
        return price;
    }
	
	//tostring
    @Override
    public String toString() {
        return super.toString() + ", Extra Shot: " + extraShot + ", Extra Syrup: " + extraSyrup + ", Price: " + calcPrice();
    }
    
    
    
    //equals
    @Override
    public boolean equals(Object obj) {
        if (!super.equals(obj)) {
        	return false;
        }
        Coffee other = (Coffee) obj;
        return extraShot == other.extraShot && extraSyrup == other.extraSyrup;
    }
    
    
    
    
    
    //warning: getters and setters below

	public boolean isExtraShot() {
		return extraShot;
	}

	public void setExtraShot(boolean extraShot) {
		this.extraShot = extraShot;
	}

	public boolean isExtraSyrup() {
		return extraSyrup;
	}

	public void setExtraSyrup(boolean extraSyrup) {
		this.extraSyrup = extraSyrup;
	}

	public static double getShotCost() {
		return SHOT_COST;
	}

	public static double getSyrupCost() {
		return SYRUP_COST;
	}
    
    
    
    

}
