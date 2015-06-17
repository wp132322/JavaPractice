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
public class PiggyBankTest {
	
	public static void main(String[] args) {
			FamilyMember father = new FamilyMember("아빠");  
		  	FamilyMember mom = new FamilyMember("엄마");  
		  	FamilyMember me = new FamilyMember("나");  
		 	FamilyMember sister = new FamilyMember("누나");  
		 	FamilyMember dog = new FamilyMember("박민준");
		 		
		 	FamilyMember.printMemberCnt();  
		 		 		  
		 	PiggyBank.putMoney(father, 10000);  
		 	PiggyBank.putMoney(mom, 5000);  
		 	PiggyBank.putMoney(me, 2000);  
		 	PiggyBank.putMoney(sister, 1000);  
		 	PiggyBank.putMoney(dog, 1000);  
		 	PiggyBank.putMoney(father, 10000);
		 	PiggyBank.putMoney(dog, 100000);
		 	PiggyBank.putMoney(me, 10000000);
		 	PiggyBank.putMoney(sister, 1000);
		 	PiggyBank.putMoney(mom, 10000);
		 	PiggyBank.printBalance();
		
	}

}
