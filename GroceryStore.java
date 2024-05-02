package grocerystore;
import java.util.Scanner;
import inventoryexception.InventoryException;
import inventorymanager.InventoryManager;


public class GroceryStore {
	
	static Scanner input = new Scanner(System.in);
	
	/*
	 * the inventory
	 */
	static String [][]inventory = {
			{"item name","Quantity"},
			{"Broccoli","14"},
			{"Sausages","35"},
			{"Bread","20"},
			{"Tortilla","40"},
			{"Eggs","48"}
		};
	
	
	/*
	 * to display the Grocery Item in the Inventory
	 */
	public static void displayInventory() {
		for(int i = 0; i<inventory.length; i++) {
			for(int j = 0; j< 1;j++) {
				if(inventory[i][j].length() < 8) {
					System.out.print(inventory[i][j] + "\t"+"\t");
					System.out.println(inventory[i][j+1]);
				}
				else {
					System.out.print(inventory[i][j] + "\t");
					System.out.println(inventory[i][j+1]);
				}
				
			}
		}
	};
	
	/*
	 * to purchase the grocery item and to reduces the stock levels
	 */
	static void purchaseItems() {
		
		String value = "";
		Boolean keepGo = true;
		
		while(!value.equalsIgnoreCase("exit") && keepGo == true) {

			System.out.println("Enter item name to purchase or 'exit' to exit:");
			value = input.next();
			int groceryIndex = InventoryManager.findItemIndex(inventory, value);
			
			while(groceryIndex != -1 && keepGo == true) {
				
				try {
					input.nextLine();
					
					System.out.println("Enter the quantity to purchase:");
					boolean hasNextInt = input.hasNextInt();
					int quantity = 0;
					
					if(hasNextInt) {
						quantity = input.nextInt();
					}
					else {
						throw new InventoryException("Please enter integer");
					}
				
				
					int stock = Integer.parseInt(inventory[groceryIndex][1]);
				
					if(quantity<=stock) {
						
						int newStock = stock-quantity;
						InventoryManager.updateInventory(inventory, groceryIndex, newStock);
						System.out.println("Purchase successful! Updated Inventory");
						keepGo = false;
						
					}
				
					else{
						System.out.println("Not enough stock available. Please choose a smaller quantity");
						
					}
					
				}
				
				catch(InventoryException e) {
					System.out.println("Please enter integer");

				}
			}
			
		}
		displayInventory();
		return;
	}	
	
	
	/*
	 * to restock the grocery item and to increases the stock levels
	 */
	static void restockItems() {
		
		String value = "";
		Boolean keepGo = true;
		
		
		while(!value.equals("exit") && keepGo == true) {
			
			System.out.print("Enter item name to restock or 'exit' to exit:");
			value = input.next();
			int groceryIndex = InventoryManager.findItemIndex(inventory, value);
			
			while(groceryIndex != -1 && keepGo == true) {
				
				try {
					input.nextLine();
					
					System.out.println("Enter the quantity to restock:");
					boolean hasNextInt = input.hasNextInt();
					int quantity = 0;
					
					if(hasNextInt) {
						quantity = input.nextInt();
					}
					else {
						throw new InventoryException("Please enter integer");
					}
					
					int stock = Integer.parseInt(inventory[groceryIndex][1]);
					int newStock = stock+quantity;
					InventoryManager.updateInventory(inventory, groceryIndex, newStock);
					System.out.println("Restock successful! Updated Inventory");
					keepGo = false;
				
				}
				catch(InventoryException e) {
					System.out.println("Please enter integer");
				}

			}
		}
		displayInventory();
		return;
	}
	
	/*
	 * to print the layout of the Menu
	 */
	static void operationsMenu() {
		System.out.println("Menu");
		System.out.println("1. Purchase items");
		System.out.println("2. Restock items");
		System.out.println("3. Exit");
		System.out.print("Choose an option:");
		
	}
	
	/*
	 * to call calls appropriate methods for either 
	 * purchasing or restocking the grocery items
	 */
	public static void manageInventory(){
		String keepContinue = "";
		
		while(!keepContinue.equalsIgnoreCase("exit")) {
			
			operationsMenu();
			
			try {
				
				boolean hasNextInt = input.hasNextInt();
				int userInput = 0;
				
				if(hasNextInt) {
					userInput = input.nextInt();
				}
				else {
					throw new InventoryException("Please enter integer");
				}
			
				
				switch(userInput) {
					case 1:
						purchaseItems();
						break;
					case 2:
						restockItems();
						break;
					case 3:
						keepContinue = "exit";
						System.out.println("bye bye");
						break;
					default:
						System.out.println("Invalid entry: enter an integer between 1 and 3");
				}
				
			}
			
			catch(InventoryException e) {
				System.out.println(e.getMessage());
				input.nextLine();
				
			}
		}
		input.close();
	}
	
}
