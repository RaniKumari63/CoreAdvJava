package com.abstract6;

public class FareClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SeasonalPass sp=new SeasonalPass();
		sp.CalculateFare();
		sp.PrintFare();
		OneTime ot=new OneTime();
		ot.CalculateFare();
		
		ot.PrintFare();
		FreePass fp=new FreePass();
		fp.CalculateFare();
		fp.PrintFare();
		GeneralPass gp=new GeneralPass();
		gp.CalculateFare();
		gp.PrintFare();
		ChildPass cp=new ChildPass();
		cp.CalculateFare();
		cp.PrintFare();
		AdultPass ap=new AdultPass();
		ap.CalculateFare();
		ap.PrintFare();
		PhysicallyHandicappedPass pp=new PhysicallyHandicappedPass();
		pp.CalculateFare();
		pp.PrintFare();
		SeniorsPass spp=new SeniorsPass();
		sp.CalculateFare();
		pp.PrintFare();
	}

}
