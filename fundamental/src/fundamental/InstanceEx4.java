package fundamental;

public class InstanceEx4 {

	//non-static varibles we can access directly
		int x = 0;
		InstanceEx4 d=null;
		void funcitonD()
		{
			
		 d = new InstanceEx4();
			d.x =10;
			System.out.println(x);//400

			System.out.println(d.x);//10
		}

		public static void main(String[] args) 
		{
			InstanceEx4 d  = new InstanceEx4();
	d.x=400;
			d.funcitonD();
	    		System.out.println(d.d.x);//10
	       		System.out.println(d.x);//400
		}
	}


