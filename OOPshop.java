class Item{
	String description;
	int UnitPrice;
	
	item(String desc, int unitPrice){
		description=desc;
		this.unitPrice=unitPrice;
	}
	
	
}

class Basket{
	Item itm[5];
	
	void addItem(item i){
		
	}
	
void calculatePrice(){
	
};
}

class ShopDEMO{
	public static void main(String[] arg){
		Item[] itemList=new Item[10];
		
		Basket Basket1=new Basket();
		char input='y';
		
		do{
			String desc=sc.nextLine();
			int up=sc.nextInt();
			itemList[i]=new item(desc,up);
			i++;
		}
		while()
	}
}