package fundamental;

public class OperatorEx35 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int x=10,y=15;
if(++x<10 || ++y>5)
{ x++;
	}
else
{ System.out.println(x+"value"+y);
	y++;
	System.out.println(x+"value"+y);
}
System.out.println(x+"value"+y);
}
}
