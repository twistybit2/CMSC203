package Assignment6;

import java.util.*;

public class BevShop implements BevShopInterface{
	private int numOfAlcoholDrinks;
	private ArrayList<Order> orders;
	private Order currentOrder;
	
	public BevShop() {
		this.orders = new ArrayList<>();
		this.numOfAlcoholDrinks = 0;
	}
	
	@Override
	public boolean isValidTime(int time) {
		return time >= MIN_TIME && time <= MAX_TIME;
	}
	
	@Override
	public int getMaxNumOfFruits() {
		return MAX_FRUIT;
	}

	@Override
	public int getMinAgeForAlcohol() {
		// TODO Auto-generated method stub
		return MIN_AGE_FOR_ALCOHOL;
	}

	@Override
	public boolean isMaxFruit(int numOfFruits) {
		// TODO Auto-generated method stub
		return numOfFruits > MAX_FRUIT;
	}

	@Override
	public int getMaxOrderForAlcohol() {
		// TODO Auto-generated method stub
		return MAX_ORDER_FOR_ALCOHOL;
	}

	@Override
	public boolean isEligibleForMore() {
		// TODO Auto-generated method stub
		return numOfAlcoholDrinks < MAX_ORDER_FOR_ALCOHOL;
	}

	@Override
	public int getNumOfAlcoholDrink() {
		// TODO Auto-generated method stub
		return numOfAlcoholDrinks;
	}

	@Override
	public boolean isValidAge(int age) {
		// TODO Auto-generated method stub
		return age >= MIN_AGE_FOR_ALCOHOL;
	}

	@Override
	public void startNewOrder(int time, Day day, String customerName, int customerAge) {
		// TODO Auto-generated method stub
		Customer customer = new Customer(customerName, customerAge);
        currentOrder = new Order(time, day, customer);
        orders.add(currentOrder);
        numOfAlcoholDrinks = 0;
		
	}

	@Override
	public void processCoffeeOrder(String bevName, Size size, boolean extraShot, boolean extraSyrup) {
		// TODO Auto-generated method stub
        currentOrder.addNewBeverage(bevName, size, extraShot, extraSyrup);
		
	}

	@Override
	public void processAlcoholOrder(String bevName, Size size) {
		// TODO Auto-generated method stub
		if (isEligibleForMore()) {
            currentOrder.addNewBeverage(bevName, size);
            numOfAlcoholDrinks++;
        }
		
	}

	@Override
	public void processSmoothieOrder(String bevName, Size size, int numOfFruits, boolean addProtein) {
		// TODO Auto-generated method stub
		if (!isMaxFruit(numOfFruits)) {
            currentOrder.addNewBeverage(bevName, size, numOfFruits, addProtein);
        }
	}

	@Override
	public int findOrder(int orderNo) {
		// TODO Auto-generated method stub
		for (int i = 0; i < orders.size(); i++) {
            if (orders.get(i).getOrderNumber() == orderNo) {
                return i;
            }
        }
        return -1;
	}

	@Override
	public double totalOrderPrice(int orderNo) {
		// TODO Auto-generated method stub
		int index = findOrder(orderNo);
        if (index != -1) {
            return orders.get(index).calcOrderTotal();
        }
        return 0;
	}

	@Override
	public double totalMonthlySale() {
		// TODO Auto-generated method stub
		double total = 0;
        for (Order order : orders) {
            total += order.calcOrderTotal();
        }
        return total;
	}

	@Override
	public int totalNumOfMonthlyOrders() {
		// TODO Auto-generated method stub
		return orders.size();
	}

	@Override
	public Order getCurrentOrder() {
		// TODO Auto-generated method stub
		return currentOrder;
	}

	@Override
	public Order getOrderAtIndex(int index) {
		// TODO Auto-generated method stub
		if (index >= 0 && index < orders.size()) {
            return orders.get(index);
        }
        return null;
	}

	@Override
	public void sortOrders() {
		// TODO Auto-generated method stub
		for (int i = 0; i < orders.size() - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < orders.size(); j++) {
                if (orders.get(j).getOrderNumber() < orders.get(minIndex).getOrderNumber()) {
                    minIndex = j;
                }
            }
            Order temp = orders.get(i);
            orders.set(i, orders.get(minIndex));
            orders.set(minIndex, temp);
        }
		
	}
	
	@Override
    public String toString() {
        String result = "";
        for (Order order : orders) {
            result += order.toString() + "\n\n";
        }
        result += "Total Monthly Sale: $" + String.format("%.2f", totalMonthlySale());
        return result;
    }
	
	

}
