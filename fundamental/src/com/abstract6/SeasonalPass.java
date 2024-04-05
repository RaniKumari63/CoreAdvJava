package com.abstract6;

public class SeasonalPass extends Fare {

	int CalculateFare() {
		fare=200;
		fare+=fare*(10/100);
		return fare;
	}
	
}
