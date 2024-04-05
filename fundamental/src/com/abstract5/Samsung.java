package com.abstract5;

public class Samsung extends Mobile{
	int IEMICode=123;;
	boolean IsSingleSIM=false;
	int SIMCard=6435;
	long MobileNo=6645699;
	@Override
	public boolean ConnectBlueTooth() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public int Dial() {
		// TODO Auto-generated method stub
		return 5885;
	}

	@Override
	public int GetIEMICode() {
		// TODO Auto-generated method stub
		return IEMICode;
	}

	@Override
	public String GetWIFIConnection() {
		// TODO Auto-generated method stub
		return "##@fdfds";
	}

	@Override
	public String ReceiveMessage() {
		// TODO Auto-generated method stub
		return "hai";
	}

	@Override
	public String SendMessage() {
		// TODO Auto-generated method stub
		return "hello";
	}

}
