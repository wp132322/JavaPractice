package org.dimigo.basic;

public class Condition {

	public static void main(String[] args) {
		
		String carname = "고속버스";
		int cartype, sum = 0;
		int dis = 25;
		
		
		System.out.println("<<고속도로 통행료 계산>>");
		
		switch (carname){
		case "고속버스":
			sum	 = 850;
			cartype = 300;
			break;
		case "경차":
		sum = 300;
		cartype = 200;
		break;
		
		default:
			sum = 600;
		cartype = 200;
		break;
		}
		
		if(dis % 10==0){
				sum += (cartype*((dis/10)-1));
		}
		else{
			sum +=(cartype *(dis/10));
			
		}
		
		System.out.println("거리 :" + dis + "km");
		System.out.println("차종 : " + carname);
		System.out.println("통행료:" + sum +"원");
	}

}
