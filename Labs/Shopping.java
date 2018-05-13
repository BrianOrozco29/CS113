package labs;
import java.util.Scanner;
public class Shopping {
	public static void main(String[] args)
	{
	String item;
	String more;
	double price;
	int quantity;
	ShoppingCart cart= new ShoppingCart();
	Scanner user = new Scanner(System.in);
	
	while(true){
		System.out.println("Enter name of item to purchase ");
		item = user.nextLine();
		System.out.println("Enter price of item to purchase ");
		price = user.nextDouble();
		System.out.println("Enter Quantity of items to purchase ");
		quantity = user.nextInt();
		cart.addToCart(item, price, quantity);
		System.out.println(cart);
		
		System.out.println("Would you like to continue shopping? (y/n)");
		more = user.nextLine();
		if(more.equals('n') || more.equals('N')){
			break;
		}
	}
	System.out.println("Please pay " + cart.getTotalPrice());
	}

}
