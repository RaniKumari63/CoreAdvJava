package fundamental;

public class LocalEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//local variable are declared inside  a method,block,construtor
	//local variable are accessed within a block,constructors,method
	//temporary variables=stack=local variables=automatic variables
		//stored inside stack memory area
	//local variable created when the block is exceuted
		//once the block execution is completed then local variable is gone
	
		//scope  of local variable is the block in which we  created
	
		//we have to intialize local variables explicitly
		//before using local variables we need to intialize local variable otherwise no need to intialize
		//if we are not using local variable we no need to intialize
		//for every time method,block,constructor  calling then new local variable is created so local variables are thread safe
		//the only modifier applied to local variable is final 
		//if we apply any modifier to local variable we get iilegal start of expression
		//for every thread separate copy of local variable is created so it is thread safe
		int i=0;
		for(int j=0;j<3;j++) {
		
			i=i+j;
		}
		System.out.println(i+""+j);
	}

}
