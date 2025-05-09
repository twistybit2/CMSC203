package Assignment6;

import java.util.*;

public class Order implements OrderInterface, Comparable{
	
	private int orderNumber;
    private int orderTime;
    private Day orderDay;
    private Customer customer;
    private ArrayList<Beverage> beverages;
	
	
	
	
	

    public Order(int orderTime, Day orderDay, Customer customer) {
        this.orderNumber = generateOrderNumber();
        this.orderTime = orderTime;
        this.orderDay = orderDay;
        this.customer = new Customer(customer);
        this.beverages = new ArrayList<>();
    }
    
    
    //random order number
    private int generateOrderNumber(){
    	return new Random().nextInt(80001) + 10000;
    }
    
    
    //weekend
    @Override
    public boolean isWeekend() {
        return orderDay == Day.SATURDAY || orderDay == Day.SUNDAY;
    }
    

	//Beverage
	@Override
	public Beverage getBeverage(int itemNo) {
		// TODO Auto-generated method stub
		if (itemNo >= 0 && itemNo < beverages.size()) {
            return beverages.get(itemNo);
        }
        return null;
	}
	
	//Coffee
	@Override
    public void addNewBeverage(String bevName, Size size, boolean extraShot, boolean extraSyrup) {
        beverages.add(new Coffee(bevName, size, extraShot, extraSyrup));
    }

	//Alcohonl
	@Override
	public void addNewBeverage(String bevName, Size size) {
		// TODO Auto-generated method stub
		beverages.add(new Alcohol(bevName, size, isWeekend()));
		
	}

	//Smoothy
	@Override
	public void addNewBeverage(String bevName, Size size, int numOfFruits, boolean addProtein) {
		// TODO Auto-generated method stub
		beverages.add(new Smoothie(bevName, size, numOfFruits, addProtein));
		
	}

	//calc order
	@Override
	public double calcOrderTotal() {
		// TODO Auto-generated method stub
		double total = 0.0;
        for (Beverage b : beverages) {
            total += b.calcPrice();
        }
        return total;
	}

	
	//type
	@Override
	public int findNumOfBeveType(Type type) {
		// TODO Auto-generated method stub
		int count = 0;
        for (Beverage b : beverages) {
            if (b.getType() == type) {
                count++;
            }
        }
        return count;
	}
	

	//compareTo
	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		Order wahoo = (Order) o;
		return Integer.compare(this.orderNumber, wahoo.orderNumber);
	}
	
	
	//toString
	public String toString() {
        String result = "Order #" + orderNumber + ", Time: " + orderTime +
                        ", Day: " + orderDay + ", Customer: " + customer.getName() +
                        ", Age: " + customer.getAge() + "\nBeverages:\n";

        for (Beverage b : beverages) {
            result += "  " + b.toString() + "\n";
        }

        result += "Total: $" + String.format("%.2f", calcOrderTotal());
        return result;
    }
	
	
	
	//getters and seters
	
	
	public int getOrderNumber() {
		return orderNumber;
	}


	public void setOrderNumber(int orderNumber) {
		this.orderNumber = orderNumber;
	}


	public int getOrderTime() {
		return orderTime;
	}


	public void setOrderTime(int orderTime) {
		this.orderTime = orderTime;
	}


	public Day getOrderDay() {
		return orderDay;
	}


	public void setOrderDay(Day orderDay) {
		this.orderDay = orderDay;
	}


	public ArrayList<Beverage> getBeverages() {
		return beverages;
	}


	public void setBeverages(ArrayList<Beverage> beverages) {
		this.beverages = beverages;
	}


	//deepcopy Customer
	public Customer getCustomer() {
        return new Customer(customer);
    }

    public void setCustomer(Customer customer) {
        this.customer = new Customer(customer);
    }


	
	

}
