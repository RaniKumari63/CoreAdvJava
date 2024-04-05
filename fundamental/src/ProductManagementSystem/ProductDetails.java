package ProductManagementSystem;

import java.util.Scanner;

import StudentManagementSystem.StudentClient;

public class ProductDetails {
Scanner sc=new Scanner(System.in);
ProductDaoImpl obj=new ProductDaoImpl();
public void prDetails()
{
	while(true)
	{
		System.out.println("----------------------------------------");
		System.out.println("                 1)AddProduct           ");
		System.out.println("                 2)ViewAllProduct       ");
		System.out.println("                 3)ViewProduct          ");
		System.out.println("                 4)DeleteProduct        ");
		System.out.println("                 5)UpdateProductARecord       ");
		System.out.println("                 6)UpdateProduct        ");
		System.out.println("                 7)BuyProduct           ");
		System.out.println("                 8)Back                 ");
		System.out.println("Enter the choice");
		int choice=sc.nextInt();
		switch(choice)
		{
		case 1:
			obj.addProducts();
			prDetails();
			 break;
		case 2:
			Product[] viewAllProduct=obj.viewAllProducts();
			if(viewAllProduct!=null)
			{
				
				for(Product pr:viewAllProduct)
				{
					if(pr!=null)
						System.out.println(pr.getPid()+"\t"+pr.getPname()+"\t"+pr.getQty()+"\t"+pr.getPrice());
					
				}
				
			}
			else
			{
				System.out.println("Record Doesn't Exist");
			}
			prDetails();
			break;
		case 3:
			 System.out.println("Enter Product Number");
			 
			 Product pr=obj.viewProduct(sc.nextInt());
			 if(pr!=null)
			 {System.out.println(pr.getPid()+"\t"+pr.getPname()+"\t"+pr.getQty()+"\t"+pr.getPrice());
				
			 }
			 else
			 {System.out.println("Record Doesn't Exist");
				 
			 
			 }
			prDetails();
			break;
			
		case 4:
			System.out.println("Enter Product Id:");
			 obj.deleteProduct(sc.nextInt());
			prDetails();
			break;
		case 5:
			obj.upDate();
			prDetails();
			break;
		case 6:System.out.println("Enter Product Id:");
		       int upid=sc.nextInt();
			obj.Update(upid);
			break;
			
		case 7:
			obj.buyProduct();
			prDetails();
			break;
		
		case 8:
			ProductClient.main(null);
			break;
			
			default:
				System.out.println("Choose 1 to 5 between");
		}//end of switch
	}//end of while
}
	
}
