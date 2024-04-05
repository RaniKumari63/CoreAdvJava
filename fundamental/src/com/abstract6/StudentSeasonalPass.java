package com.abstract6;

public class StudentSeasonalPass extends Fare{

	int CalculateFare() {
		fare=200;
		fare+=fare*(30/100);
		return fare;
	}
	
	
}
