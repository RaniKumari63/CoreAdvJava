package com.abstract6;

public class SeniorsPass extends GeneralPass {

	int CalculateFare() {
		fare=200;
		fare+=fare*(60/100);
		return fare;
		}
}
