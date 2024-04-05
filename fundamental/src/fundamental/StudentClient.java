package fundamental;

import java.util.Scanner;

public class StudentClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Student addStudents[]=new Student[3];
Scanner sc=new Scanner(System.in);
for(int i=0;i<addStudents.length;++i)
{
	System.out.println("Enter Student Number:");
	int sno=sc.nextInt();
	System.out.println("Enter Student Name:");
	String sname=sc.next();
	System.out.println("Enter Student Adress:");
	String sadd=sc.next();
	Student stu=new Student(sno,sname,sadd);
	addStudents[i]=stu;
	System.out.println("Student Record Added Successfully");
	
}
System.out.println("Display Student Information:");
System.out.println("Enter Student Number");
for(Student st:addStudents)
{
	System.out.println(st.getSno()+"\t"+st.getSname()+"\t"+st.getSadd());
	
}

System.out.println("Display Student Specific Information");

System.out.println("Enter Student Number to Display");
int sno=sc.nextInt();
int count=0;
for(Student st:addStudents)
{
	if(st.getSno()==sno)
	{
		
	System.out.println(st.getSno()+"\t"+st.getSname()+"\t"+st.getSadd());
	++count;
	}
	
	
		
	
	}
if(count==0)
{
	System.out.println("Given Record Not Exist");
}
System.out.println("Display Student Specific Information");

System.out.println("Enter Student Number to Delete");
int sno1=sc.nextInt();
count=0;
int index=0;
for(Student st:addStudents)
{
	if(st.getSno()==sno1)
	{
		addStudents[index]=null;
		
	++index;
	++count;
	break;
	}else {
		++index;
	}
	}
	
	
		
	
	
	if(count==0)

	{
		System.out.println("Given Record Not Exist");
	}

	System.out.println("Display Student Information");

	for(Student st:addStudents)
	{
		if (st != null)
			System.out.println(st.getSno() + "\t" + st.getSname() + "\t" + st.getSadd());
	}

}

}
