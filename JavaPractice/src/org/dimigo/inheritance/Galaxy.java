/**
 * 
 */
package org.dimigo.inheritance;

/**
 * <pre>
 *org.dimigo.inheritance 
 *	|_ Galaxy 
 *
 *1. 개요:
 *2. 작성일 : 2015. 8. 28.
 * </pre>
 * @author	: pc1
 * @version	: 1.0
 */
public class Galaxy extends SmartPhone{
	Galaxy()
	{
		
	}
	
	Galaxy(String model, String company, int price)
	{
		super(model, company, price);
	}
	
	public void pay()
	{
		System.out.print("삼성 페이로 ");
		super.pay();
	}
	
	public void useWirelessCharging()
	{
		System.out.println("무선충전기능을 사용합니다.");
	}

}
