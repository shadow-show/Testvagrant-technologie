
import java.util.*;
class Product{
    Scanner in = new Scanner(System.in);
    String product_name;
    int unit_price;
    int gst;
    int quantity;
    Product(String product_name,int unit_price, int gst, int quantity){
        this.product_name = product_name;
        this.unit_price = unit_price;
        this.gst = gst;
        this.quantity = quantity;
    }
   
    public void getData(){
       System.out.println("Product Name = "+ product_name);
       System.out.println("Product quantity = "+ quantity);
       System.out.println("price = "+ price());
        
    }
    public int price(){
        int temp_price = unit_price*quantity;
        int temp2 = 100+gst;
        if(unit_price>500){
            temp_price = (unit_price*95)/100;
        }
        temp_price = (temp_price * temp2)/100;
        return temp_price;
    }
    public void setData(){
        System.out.println("Enter Product name");
        product_name = in.nextLine();
        System.out.println("Enter Product price");
        unit_price = in.nextInt();
        System.out.println("Enter GST % Applicable");
        gst = in.nextInt();
        
    }
}

    public class Main{
	public static void main(String[] args) {
	Product p = new Product("Leather Wallet",1100,18,1);
	Product p1 = new Product("Umbrella",900,12,2);
	Product p2 = new Product("Cigarette",200,28,3);
	Product p3 = new Product("Honey",100,0,4);
	
	List<Product> li = new ArrayList<Product>();
	li.add(p);
	li.add(p1);
	li.add(p2);
	li.add(p3);
	int price_ = 0;
	for(int i= 0; i< li.size(); i++) {
        price_ = price_ + li.get(i).price(); 
      }
      System.out.println("Customer have to pay Rs."+price_);
   }


	
	 
	
}
