package com.abstract5;

public class IPhone extends Mobile{
	int IEMICode=1834;;
	boolean IsSingleSIM=false;
	int SIMCard=1888;
	long MobileNo=44444346;
	@Override
	public boolean ConnectBlueTooth() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public int Dial() {
		// TODO Auto-generated method stub
		return 7777;
	}

	@Override
	public int GetIEMICode() {
		// TODO Auto-generated method stub
		return 4666;
	}

	@Override
	public String GetWIFIConnection() {
		// TODO Auto-generated method stub
		return "24454";
	}

	@Override
	public String ReceiveMessage() {
		// TODO Auto-generated method stub
		return "recieved ";
	}

	@Override
	public String SendMessage() {
		// TODO Auto-generated method stub
		return "send";
	}

}
