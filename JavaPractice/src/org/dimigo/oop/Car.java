/**
 * 
 */
package org.dimigo.oop;

/**
 * <pre>
 *org.dimigo.opp  
 *	|_ Car 
 *
 *1. 개요:
 *2. 작성일 : 2015. 4. 14.
 * </pre>
 * @author	: pc1
 * @version	: 1.0
 */
public class Car {
	private String company;//private
	
	private String model;//private
	
	private String color;//private
	
	private int maxSpeed;//private
	
	private int price;//private
	
	public String getCompany() {//public
		return company;
	}
	
	public String getModel() {//public
		return model;
	}
	
	public String getColor(){//public
		return color;
	}
	
	public int getMaxSpeed(){//public
		return maxSpeed;
	}
	
	public int getPrice(){//public
		return price;
		
	}

	public void setCompany(String NewCompany){//public
		company = NewCompany;
	}
	
	public void setModel(String newModel){//public
		model = newModel;
	}
	
	public void setColor(String setColor){//public
		color = setColor;
	}

	public void setMaxSpeed(int Maxspeed){//public
		maxSpeed = Maxspeed;
	}
	
	public void setPrice(int newPrice){//public
		price = newPrice;
	}
}
