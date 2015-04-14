/**
 * 
 */
package org.dimigo.opp;

/**
 * <pre>
 *org.dimigo.opp
 *	|_ Cartest 
 *
 *1. 개요:
 *2. 작성일 : 2015. 4. 14.
 * </pre>
 * @author	: pc1
 * @version	: 1.0
 */
public class Cartest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Car hyundai = new Car();
		Car kia = new Car();
		Car Samsung = new Car();
		
		//현대
		
		hyundai.setCompany("현대자동차");
		hyundai.setModel("제네시스");
		hyundai.setColor("검은색");
		hyundai.setMaxSpeed(225);
		hyundai.setPrice(50000000);
		
		//기아
		
		kia.setCompany("기아자동차");
		kia.setModel("제네시스");
		kia.setColor("검은색");
		kia.setMaxSpeed(246);
		kia.setPrice(40000000);

		//삼성
		
		Samsung.setCompany("삼성자동차");
		Samsung.setModel("SM7");
		Samsung.setColor("회색");
		Samsung.setMaxSpeed(200);
	    Samsung.setPrice(38000000);
	    
	    System.out.println("<<자동차 목록>>");
	   
	    //현대
	    
	    System.out.println("제조사명 :" + hyundai.getCompany());
	    System.out.println("모델명 :" + hyundai.getModel());
	    System.out.println("색상 :" + hyundai.getColor());
	    System.out.println("최대속도 :" + hyundai.getMaxSpeed());
	    System.out.println("가격 :" + String.format("%,d", hyundai.getPrice())+"원");
	    System.out.println("");
	    
	    //기아
	    
	    System.out.println("제조사명 :" + kia.getCompany());
	    System.out.println("모델명 :" + kia.getModel());
	    System.out.println("색상 :" + kia.getColor());
	    System.out.println("최대속도 :" + kia.getMaxSpeed());
	    System.out.println("가격 :" + String.format("%,d", hyundai.getPrice())+"원");
	    System.out.println("");
	    
	    //삼성
	    
	    System.out.println("제조사명 :" + Samsung.getCompany());
	    System.out.println("모델명 :" + Samsung.getModel());
	    System.out.println("색상 :" + Samsung.getColor());
	    System.out.println("최대속도 :" + Samsung.getMaxSpeed());
	    System.out.println("가격 :" + String.format("%,d", hyundai.getPrice())+"원");
	    System.out.println("");
	}

}
