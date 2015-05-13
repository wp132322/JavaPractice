/**
 * 
 */
package org.dimigo.oop;
import java.util.Scanner;

/**
 * <pre>
 *org.dimigo.oop
 *	|_ Question 
 *
 *1. 개요:
 *2. 작성일 : 2015. 5. 12.
 * </pre>
 * @author	: pc1
 * @version	: 1.0
 */
public class Question {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); 
		String answer; 
		 		 
		System.out.println("가장 좋아하는 음식은?"); 
		answer = scanner.nextLine(); 
		if("카레".equals(answer)) { 
		System.out.println("정답입니다!! ^^"); 
		System.out.println(); 
		} else { 
		System.out.println("틀렸습니다!! ㅠㅠ"); 
		System.out.println(); 
		} 
		 		 
		System.out.println("가전 제품 살땐?"); 
				answer = scanner.nextLine(); 
		 		if("하이마트".equals(answer)) { 
		 			System.out.println("정답입니다!! ^^"); 
		 			System.out.println(); 
		 		} else { 
		 			System.out.println("틀렸습니다!! ㅠㅠ"); 
		 			System.out.println(); 
		 		} 
		 		 
		 		System.out.println("승준이가 이세상에서 제일 좋아하고 할때 행복해하는것은?"); 
		 		answer = scanner.nextLine(); 
		 		if("자바".equals(answer)) { 
		 			System.out.println("정답입니다!! ^^"); 
		 			System.out.println(); 
		 		} else { 
		 			System.out.println("틀렸습니다!! ㅠㅠ"); 
		 			System.out.println(); 


	}

	}
}
