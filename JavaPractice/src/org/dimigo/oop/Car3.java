/**
 * 
 */
package org.dimigo.oop;

/**
 * <pre>
 *org.dimigo.oop  
 *	|_ Car 
 * 
 *1. 개요:
 *2. 작성일 : 2015. 4. 15.
 * </pre> 
 * @author	: pc1
 * @version	: 1.0
 */
public class Car3 {
	private String company;//private   
	
	private String model;//private
	
	private String color;//private
	
	private int maxSpeed;//private
	
	private int price;//private
	
	public Car3(){
	}   
	public Car3(String company, String model, String color, int maxSpeed, int price){
		this.company = company;
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
		this.price = price; 
	}
	
	public Car3(String company, String model, String color, int maxSpeed){
		this(company, model, color, maxSpeed, 0);
	}
	
	public Car3(String company, String model, String color){
		this(company, model, color, 0);
	}
	
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

//	public void setCompany(String NewCompany){//public
//		company = NewCompany;
//	}
//	
//	public void setModel(String newModel){//public
//		model = newModel;
//	}
//	
//	public void setColor(String setColor){//public
//		color = setColor;
//	}
//
//	public void setMaxSpeed(int Maxspeed){//public
//		maxSpeed = Maxspeed;
//	}
//	
//	public void setPrice(int newPrice){//public
//		price = newPrice;
//	}
}
