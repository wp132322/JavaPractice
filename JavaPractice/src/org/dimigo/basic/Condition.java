package org.dimigo.basic;

public class Condition {

	public static void main(String[] args) {
		
		String carname = "고속버스";
		int cartype, pay = 0;
		int dis = 20;
	
		
		switch (carname){
		case "고속버스":
			pay	 = 850;
			cartype = 300;
			break;
		case "경차":
		pay = 300;
		cartype = 200;
		break;
		
		default:
			pay = 600;
		cartype = 200;
		break;
		}		
		
		if(dis % 10==0){
				pay += (cartype*((dis/10)-1));
		}
		else{
			pay +=(cartype *(dis/10));
			
		}
		System.out.println("<<고속도로 통행료 계산>>");
		
		System.out.println("거리 :" + dis + "km");
		
		System.out.println("차종 : " + carname);
		
		System.out.println("통행료:" + pay +"원");
	}

}
