package fundamental;

import fundamental.Inter;
import fundamental.One;
import fundamental.Three;
import fundamental.Two;

interface Inter{}
class One{}
class Two extends One{}
class Three extends Two implements Inter{}



public class InheritanceEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		One one=new Two();
		Two two=new Three();
		Three three=new Three();
		Inter i=new Three();
	}

}
