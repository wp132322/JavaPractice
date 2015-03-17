package org.dimigo.basic;

public class PrimitiveDataType {

	public static void main(String[] args) {
		
		System.out.println("<<아이유 프로필>>");
		String name = "아이유";
		System.out.println("이름 :" + name);
		boolean sex = true;
		System.out.print("성별:");
		if(sex) {
			System.out.println("여자");
		}
		else {
			System.out.println("남자");
		}
		int d1 = 23;
		System.out.println("나이 :" + d1 + '세');
		
		double cm = 161.8;
		System.out.println("키:" + cm + "cm");
		
		float kg = 44.3f;
		System.out.println("몸무게:" + kg +"kg" );		
		
		char blood = 'A';
		System.out.println("혈액형:" + blood + '형');
		
	}

}
