package com.abstract5;

public class Nokia extends Mobile{
	int IEMICode=1234;;
	boolean IsSingleSIM=false;
	int SIMCard=1234;
	long MobileNo=66454346;
	@Override
	public boolean ConnectBlueTooth() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public int Dial() {
		// TODO Auto-generated method stub
		return 3432;
	}

	@Override
	public int GetIEMICode() {
		// TODO Auto-generated method stub
		return 456;
	}

	@Override
	public String GetWIFIConnection() {
		// TODO Auto-generated method stub
		return "5345345";
	}

	@Override
	public String ReceiveMessage() {
		// TODO Auto-generated method stub
		return "good";
	}

	@Override
	public String SendMessage() {
		// TODO Auto-generated method stub
		return "bye";
	}

}
