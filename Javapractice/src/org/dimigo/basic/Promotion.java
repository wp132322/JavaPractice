package org.dimigo.basic;

public class Promotion {

	public static void main(String[] args) {
		
		System.out.println("<<디미베네 연간 인건비>>");
		
		long month = 1700000;		//월평균급여
		int staff = 3;				//점포내 직원수
		int num = 1500;				//점포수
		
		System.out.println("월 평균 급여: " + String.format ("%,d",month) +"원");
		System.out.println("점포 내 직원 수:" + staff + "명");
		System.out.println("점포 수:" + String.format ("%,d",num) + "개");
		
		long money= month*12*staff*num;
		
		System.out.println();
		System.out.println();
		
		System.out.println("연간 인건비:" + String.format("%,d",money)+ "원");
	}

}