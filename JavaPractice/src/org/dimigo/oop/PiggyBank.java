/**
 * 
 */ 
package org.dimigo.oop; 
 
 /**
  * <pre>
  *org.dimigo.oop
  *	|_ PiggyBankTest 
  *
  *1. 개요:
  *2. 작성일 : 2015. 6. 16.
  * </pre>
  * @author	: pc1
  * @version	: 1.0
  */
 
  public class PiggyBank { 
 	 
 	private static int balance; 
 	 
 	public static void putMoney(FamilyMember member, int amount) 
 	{ 
 		System.out.println(member.getMemberName() + amount + "원 넣음"); 
 		balance += amount; 
 	} 
 	 
 	public static void printBalance() 
 	{ 
 		System.out.println("돼지저금통 총 금액 : " + balance + "원");		 
 	} 
 
 
 	public static void main(String[] args) { 
 		// TODO Auto-generated method stub 
 
 
 	} 
 
 
} 