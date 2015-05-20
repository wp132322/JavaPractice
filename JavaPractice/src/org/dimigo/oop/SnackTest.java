/**
 * 
 */
package org.dimigo.oop;

/**
 * <pre>
 *org.dimigo.oop
 *	|_ SnackTest 
 *
 *1. 개요:
 *2. 작성일 : 2015. 5. 20.
 * </pre>
 * @author	: pc1
 * @version	: 1.0
 */
public class SnackTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Snack[] snack = new Snack[]{
				new Snack("새우깡", "농심", 1100, 2),
				new Snack("콘칩", "크라운", 1200, 1),
				new Snack("허니버터칩", "해태", 1500, 4)
		};
		int total = 0;
		
		for(Snack s : snack) {
			s.printSnack();
			total += s.calcPrice();
		}
		System.out.println("총 구매 비용 :"+String.format("%,d원",total));

	}

}
