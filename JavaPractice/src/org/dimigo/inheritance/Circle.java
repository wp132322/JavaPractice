/**
 * 
 */
package org.dimigo.inheritance;

/**
 * <pre>
 *inheritance
 *	|_ Circle 
 *
 *1. 개요:
 *2. 작성일 : 2015. 8. 17.
 * </pre>
 * @author	: pc1
 * @version	: 1.0
 */
public class Circle extends Figure { 
 	 
 	private int radius; 
 	 
 	public Circle(int radius) { 
 		this.radius = radius; 
 	} 
 	 
 	protected double calcArea() { 
 		return radius * radius * Math.PI; 
 	} 
 	 
 	protected void printCenter(){ 
 		System.out.print("원 "); 
 		super.printCenter(); 
 	} 
 	 
} 

