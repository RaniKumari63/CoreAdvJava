public class CustomerDaoImpl implements CustomerDao
{

 

    Scanner sc=new Scanner(System.in);
    int index=0;

    @Override
    public void addCustomer() 
    {
        System.out.println("enter no.of Customers");
        index=sc.nextInt();
        for(int i=0;i<index;i++)
        {
            System.out.println("enter Customer cid");
            int cid=sc.nextInt();
            System.out.println("enter Customer First Name");
            String fname=sc.next();
            System.out.println("enter Customer last Name");
            String lname=sc.next();
            System.out.println("enter Customer Email");
            String email=sc.next();
            System.out.println("enter Customer Password");
            String password=sc.next();
            System.out.println("enter Customer Mobileno");
            long mobileno=sc.nextLong();
            Customer c=new Customer(cid,fname,lname,email,password,mobileno);
            customer.add(i,c);
            System.out.println("customer record Added Sucessfully");

        }
        // TODO Auto-generated method stub

    }

 

    @Override
    public List<Customer> viewAllCustomer() 
    {
        // TODO Auto-generated method stub
        return customer;
    }

 

    @Override
    public Customer viewCustomer(int cid) 
    {
        int k=0;
        for(Customer c:customer)
        {
            if(c.getCid()==cid)
            {
                ++k;
                return c;
            }
        }
        if(k==0)
            System.out.println("given record is doesnot exist");
        // TODO Auto-generated method stub
        return null;
    }

 

    @Override
    public void deleteCustomer(int cid) 
    {
        int j=0;
        int k=0;
        for(Customer c:customer)
        {
            if(c.getCid()==cid)
            {
                ++j;
              
                customer.remove(k);
                break;
            }
            ++k;
         }
        // TODO Auto-generated method stub
        if(j==0)
        System.out.println("Customer doesnot exists");
    }

 

    @Override
    public void buyProduct() 
    {
        int totalprice=0;
        System.out.println("enter how many products");
        int pro=sc.nextInt();
        for(int i=0;i<pro;i++)
        {
            System.out.println("enter product id");
            int pid=sc.nextInt();
            for(Product p:ProductDaoImpl.product)
            {
                if(p.getPid()==pid)
                {
                    totalprice+=p.getQty()*p.getPrice();
                }
            }
            System.out.println("totalprice="+totalprice);    
        }

        // TODO Auto-generated method stub

    }

 

