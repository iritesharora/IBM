package day6;

import java.util.Date;
import java.util.List;



public class Service {

	Cart cart = new Cart();
	Item item=new Item();
	
	public static List<Item> getItems(){
		
		return ItemDao.getItems();
	}
	
	public void addToCart(Item item) {
		List<Item> items = cart.getItems();
		items.add(item);
	}
	
	public Cart getCart() {
		return cart;
	}
	
	public Invoice generateInvoice(Customer cus){
		return new Invoice(cus, cart.getItems(), new Date());
	}
}