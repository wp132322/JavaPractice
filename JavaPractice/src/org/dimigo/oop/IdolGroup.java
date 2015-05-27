/**
 * 
 */
package org.dimigo.oop;

/**
 * <pre>
 *org.dimigo.oop
 *	|_ IdolGroup 
 *
 *1. 개요:
 *2. 작성일 : 2015. 5. 27.
 * </pre>
 * @author	: pc1
 * @version	: 1.0
 */
public class IdolGroup {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String [] idolGroup = {"EXID", "2NE1", "걸스데이"};
		String[] [] members = {{"Le", "정화", "하니","솔지", "혜린"},
			{"CL", "산다라박", "박봄", "민지"},
			{"유라", "소진", "민아", "혜리", "그외"}};
		for(int i = 0; i<idolGroup.length; i++){
			
			System.out.println("<<" + idolGroup[i] + "멤버 >>");
			for(String member : members[i]){
				System.out.println(member);
			}
			System.out.println();
		}
	}

}
