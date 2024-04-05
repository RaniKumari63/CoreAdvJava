package com.abstract5;

public class MobileClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Samsung m=new Samsung();
System.out.println(m.IEMICode+"\t"+m.MobileNo+"\t"+m.SIMCard+"\t"+m.IsSingleSIM);
System.out.println(m.Dial()+"\t"+m.GetIEMICode()+"\t"+m.GetWIFIConnection()+"\t"+m.ReceiveMessage()+"\t"+m.SendMessage()+"\t"+m.ConnectBlueTooth());

Nokia n=new Nokia();
System.out.println(n.IEMICode+"\t"+n.MobileNo+"\t"+n.SIMCard+"\t"+n.IsSingleSIM);
System.out.println(n.Dial()+"\t"+n.GetIEMICode()+"\t"+n.GetWIFIConnection()+"\t"+n.ReceiveMessage()+"\t"+n.SendMessage()+"\t"+n.ConnectBlueTooth());

IPhone i=new IPhone();
System.out.println(i.IEMICode+"\t"+i.MobileNo+"\t"+i.SIMCard+"\t"+i.IsSingleSIM);
System.out.println(i.Dial()+"\t"+i.GetIEMICode()+"\t"+i.GetWIFIConnection()+"\t"+i.ReceiveMessage()+"\t"+i.SendMessage()+"\t"+i.ConnectBlueTooth());

SamsungS5 s=new SamsungS5();
System.out.println(s.IEMICode+"\t"+s.MobileNo+"\t"+s.SIMCard+"\t"+s.IsSingleSIM);
System.out.println(s.Dial()+"\t"+s.GetIEMICode()+"\t"+s.GetWIFIConnection()+"\t"+s.ReceiveMessage()+"\t"+s.SendMessage()+"\t"+s.ConnectBlueTooth());

NokiaLumis625 nl=new NokiaLumis625();
System.out.println(nl.IEMICode+"\t"+nl.MobileNo+"\t"+nl.SIMCard+"\t"+nl.IsSingleSIM);
System.out.println(nl.Dial()+"\t"+nl.GetIEMICode()+"\t"+nl.GetWIFIConnection()+"\t"+nl.ReceiveMessage()+"\t"+nl.SendMessage()+"\t"+nl.ConnectBlueTooth());

	}

}
