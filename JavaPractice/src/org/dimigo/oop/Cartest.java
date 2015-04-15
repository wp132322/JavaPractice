/**
 * 
 */
package org.dimigo.oop;

/**
 * <pre>
 *org.dimigo.oop
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
		Car3 hyundai = new Car3("현대자동차","제네시스","검은색",225,50000000);
		Car3 kia = new Car3("기아자동차","K7","검은색",246);
		Car3 Samsung = new Car3("삼성자동차","SM7","검은색");
//		Car2 kia = new Car2("기아자동차","K7","검은색",246,4000000);
//		Car2 Samsung = new Car2("삼성자동차","SM7","검은색",200,38000000);
		
		//현대
//		
//		hyundai.setCompany("현대자동차");;
//		hyundai.setModel("제네시스");
//		hyundai.setColor("검은색");
//		hyundai.setMaxSpeed(225);
//		hyundai.setPrice(50000000);
//		
//		//기아
//		
//		kia.setCompany("기아자동차");
//		kia.setModel("K7");
//		kia.setColor("검은색");
//		kia.setMaxSpeed(246);
//		kia.setPrice(40000000);
//
//		//삼성
//		
//		Samsung.setCompany("삼성자동차");
//		Samsung.setModel("SM7");
//		Samsung.setColor("회색");
//		Samsung.setMaxSpeed(200);
//	    Samsung.setPrice(38000000);
	    
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
	    System.out.println("가격 :" + String.format("%,d", kia.getPrice())+"원");
	    System.out.println("");
	    
	    //삼성
	    
	    System.out.println("제조사명 :" + Samsung.getCompany());
	    System.out.println("모델명 :" + Samsung.getModel());
	    System.out.println("색상 :" + Samsung.getColor());
	    System.out.println("최대속도 :" + Samsung.getMaxSpeed());
	    System.out.println("가격 :" + String.format("%,d", Samsung.getPrice())+"원");
	    System.out.println("");
	}

}
