import java.util.*;
public class DriverShop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Item> shopList = new ArrayList<Item>();
		Scanner input = new Scanner(System.in);
		System.out.println("Please input \"go\" to begin creating your shopping list.");
		String go = input.nextLine();
		
		while (go.equals("go")){
			System.out.println("Please input the name of your item: ");
			String name = input.next();
			
			System.out.println("Please input the price of the item you just inputted before: ");
			double price = input.nextDouble();
			
			System.out.println("Item " + name + " with price: " + price + " has been created and added to cart.");
			shopList.add(new Item(name, price));
			
			System.out.println("1) Input \"go\" to add another item.\n"
							 + "2) Input \"r\" to remove an item from your cart.\n"
							 + "3) Input \"l\" to print all the items you have so far in your cart."
							 + "4) Input \"exit\" to exit the program.");
			
			String next = input.next();
			System.out.println(next);
			
			//If the person wants to remove an item. 
			if (next.equals("exit")){
				break;
			}
			
			else if (next.equals("r")){
				boolean found = false;
				System.out.println("Please enter the name of the item you would like to remove.");
				String rem = input.next();
				for (int z = 0; z < shopList.size(); z++){
					if (shopList.get(z).getName().equals(rem)){
						shopList.remove(z);
						found = true;
						break;
					}
				}
				if (found){
					System.out.println("The specified item has now been removed. You are now being returned to add another item.");
					go = "go";
				}
				else {
					System.out.println("Sorry. Your specified item has not been found. You are now being returned to add another item.");
					go = "go";
				}
			}
			else if (next.equals("l")){
				int count = 1;
				for (Item i : shopList){
					System.out.println("Item " + count + ": " + i.getName() + " with a price of " + i.getPrice() + "$");
					count++;
				}
				System.out.println("You are now being returned to add another item.");
			}
			
			
		}
		

	}

}
