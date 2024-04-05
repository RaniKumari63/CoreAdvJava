package ProductManagementSystem;

import java.util.Scanner;

public class ProductDaoImpl {
	Scanner sc = new Scanner(System.in);
	Product[] addProducts = null;
	Product[] upProducts = null;
	int index = 0;

	public void addElements(int value) {
		for (int i = value; i < addProducts.length; i++) {
			System.out.println("Enter Product Id");
			int pid = sc.nextInt();
			System.out.println("Enter Product Name");
			String pname = sc.next();
			System.out.println("Enter Product Quantity");
			int qty = sc.nextInt();
			System.out.println("Enter Product Price");
			int price = sc.nextInt();
			Product pr = new Product(pid, pname, qty, price);
			addProducts[i] = pr;
			System.out.println("Product Record Added Successfully");
		}

	}

	public void addProducts() {
		int j = 0;
		System.out.println("How many products do you want to add");
		index = sc.nextInt();
		addProducts = new Product[index];
		addElements(j);
	}// end of addProducts

	public Product[] viewAllProducts() {
		return addProducts;
	}//end of viewAllProducts

	public Product viewProduct(int pid) {

		int k = 0;
		for (Product pr : addProducts) {
			if (pr.getPid() == pid) {
				++k;
				return pr;

			}

		}																																																																																																																																																																																																																																																																											
		if (k == 0)
			System.out.println("Given Record Not Exist");
		return null;
	} //end of viewProduct

	public void deleteProduct(int pid) {
		int k = 0;
		int j = 0;
		for (Product pr : addProducts) {

			if (pr.getPid() == pid) {
				addProducts[j] = null;
				++k;
				++j;
			} else {
				++j;

			}
		}
		if (k == 0)
			System.out.println("Given Record Not Exist");

	}//end of deleteProduct

	public void upDate() {
		upProducts = new Product[index];
		for (int i = 0; i < addProducts.length; i++) {
			upProducts[i] = addProducts[i];
		}

		System.out.println("How many products do you want to update");
		int size = sc.nextInt();

		addProducts = new Product[index + size];

		for (int i = 0; i < index; i++) {
			addProducts[i] = upProducts[i];
		}
		addElements(index);

	}
//end of upDate

public void Update(int pid)
{ Product p=new Product();
	for(Product pro:addProducts)
	{
		if(pro.getPid()==pid)
	
		{
			System.out.println("Which Student do you want to update 1)pname 2)pqty 3) price");
			int choice=sc.nextInt();
			switch(choice)
			{
			case 1:
				System.out.println("Enter Product Nmame");
				String name=sc.next();
				pro.setPname(name);
				System.out.println("Product Updated successfully");
				break;
			case 2:
				System.out.println("Enter Product Qty");
				int pqty=sc.nextInt();
				pro.setQty(pqty);
				System.out.println("Product Qty Updated successfully");
				break;
			case 3:
				System.out.println("Enter Product Price");
				int price=sc.nextInt();
				pro.setPrice(price);
				System.out.println("Product Price Updated successfully");
				break;
				default: System.out.println("Choose between 1 to 3");
				
			}
		}
	
}
}

public void buyProduct() {
	int totalprice=0;
	
	
	System.out.println("How many Products");
	int prd=sc.nextInt();
	
	
	for(int i=0;i<prd;i++) {
	System.out.println("Enter ProductName:");
    String pname=sc.next();

  for(Product p:addProducts)
  {
	  if(pname.equals(p.getPname()))
		  totalprice+=p.getQty()*p.getPrice();
  }
	}
	System.out.println("totalprice:"+totalprice);
}
}
