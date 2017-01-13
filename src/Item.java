
public class Item {
	
	private String name;
	private double price;
	
	public Item(String nameIn, double priceIn){
		name = nameIn;
		price = priceIn;
	}
	
	public void setName(String str){
		name = str;
	}
	public void setPrice(double pri){
		price = pri;
	}
	
	public String getName(){
		return name;
	}
	public double getPrice(){
		return price;
	}
	
	
}
