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
		String [] idolGroup = {"EXID", "다비치", "2-3반"};
		String[] [] members = {{"Le", "정화", "하니","솔지", "혜린"},
			{"이해리", "강민경"},
			{"강지훈", "고인혜", "김경연", "김동현", "김문섭","김병준","김수정","그외.."}};
		for(int i = 0; i<idolGroup.length; i++){
			
			System.out.println("<<" + idolGroup[i] + "멤버 >>");
			for(String member : members[i]){
				System.out.println(member);
			}
			System.out.println();
		}
	}

}
