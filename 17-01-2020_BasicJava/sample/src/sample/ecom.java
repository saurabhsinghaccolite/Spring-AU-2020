package sample;

import java.util.*;

public class ecom
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		product parr[] = new product[5];
		parr[0] = new product(1, "kitkat              ", 10, 50);
		parr[1] = new product(2, "maggi noodles 8 pack", 10, 80);
		parr[2] = new product(3, "cold drink 2 ltr    ", 10, 90);
		parr[3] = new product(4, "mixed fruit fuice 1 ltr", 10, 100);
		System.out.println("Product id \t Product name \t\t   Quantity \t\t Cost");
		for (int i = 0; i < 4; i++)
		{
			System.out.println(parr[i].getId() + "\t\t" + parr[i].getName() + "\t\t" + parr[i].getQty() + "\t\t"
					+ parr[i].getRate());
		}

		cart obj = new cart(parr);
		int ch = 0;

		try 
		{
			while (ch != -1) {
				System.out.println("Press\n 1: Add a product to the cart\r\n" + "2. Remove a product from the cart\r\n"
						+ "3. View the items in the cart\r\n" + "4. Place the order\r\n" + "5. Cancel the order\n" + "-1. Exit");
				ch = sc.nextInt();
				switch (ch) 
				{
				case 1:
					System.out.println("enter the product id");
					int i = sc.nextInt();
					if(i>0&&i<5)
					{
						System.out.println("enter the quantity");
						int q = sc.nextInt();
						if (parr[i - 1].getQty() < q) 
						{
							System.out.println("Not available");
						} else 
						{
							parr[i - 1].setQty(parr[i - 1].getQty() - q);
							obj.qty[i - 1]+=q;
						}
					}
					else
					{
						System.out.println("Wrong item id");
					}
					break;
					
				case 2:
					System.out.println("enter product id");
					int x=sc.nextInt();
					obj.remove(x);
					break;
				case 3:
					obj.display();
					break;
				case 4:
					obj.display();
					obj.totalbill();
					return;
				case 5:
					obj = new cart(parr);
					System.out.println("cart cleared!!");
					break;
				case -1:
					break;
				default:
					System.out.println("wrong input!!");
				}
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println("THANKS !!");
	}

}
