package inventorymanager;
import grocerystore.GroceryStore;

public class InventoryManager{
	
	/**
	 * find the index of a grocery item 
	 * in the inventory based on name
	 * @param inventory, the list of the grocery item
	 * @param name, the name of the grocery item
	 * @return the index if it is match the name
	 * @return -1 if it didn't match any of the grocery item
	 */
	public static int findItemIndex(String[][] inventory, String name) {
		String[][] inv = inventory;
		String itemName = name;
		
		if(!itemName.equalsIgnoreCase("exit")) {
			for(int i = 0; i<inv.length; i++) {
				if(inv[i][0].equalsIgnoreCase(itemName)){
					return i;
				}
			}
			System.out.println("Invalid item name. Please try again.");
		}
		
		return -1;
		
	}
	
	/**
	 * to update the inventory after a successful purchase or restock transaction
	 * @param inventory, the list of the grocery item
	 * @param groceryIndex, the index of the grocery item
	 * @param quantity, the number of item that going to replace the old stock
	 */
	public static void updateInventory(String [][] inventory, int groceryIndex, int quantity){

		String newStock = Integer.toString(quantity);
		inventory[groceryIndex][1] = newStock;	
		
		
	}
	
	

}
