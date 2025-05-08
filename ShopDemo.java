import java.util.Scanner;
class shopDemo{
	
	static String description[]={"Bread","Milk powder","Tooth paste"};
	static int unitPrice[]={160,1060,260};
	
	static Scanner sc=new Scanner (System.in);
	static Scanner sc1=new Scanner (System.in);
	static Scanner sc3=new Scanner (System.in);
	static int[] itemBasketIndex=new int[3];
	static int[] itemBasketQuantity=new int[3];
	static int basketIndex=0;
	
	static void getItems(){
		Scanner sc=new Scanner(System.in);
		System.out.println("Welcome to the Demo shop");
		
		System.out.println("Please select your item by entering the number");
		char userOption='y';
		
		
		do{
			
			
		for(int i=0; i<description.length; i++){
			System.out.println("Enter "+i+" for "+description[i]);
			
		}
		int itemIndex=sc.nextInt();
		
		System.out.println("You have choosen "+description[itemIndex]);
		System.out.println("Unit price of "+description[itemIndex]+" is "+unitPrice[itemIndex]);
		
		System.out.println("Enter the quantity");
		int quantityIndex=sc3.nextInt();
		
		itemBasketQuantity[basketIndex]=quantityIndex;
		
		
		itemBasketIndex[basketIndex]=itemIndex;

		basketIndex++;
		
		System.out.println("Enter y to continue,press any key to exit");
		
		
		userOption=sc1.nextLine().charAt(0);
		}
		
		while(userOption=='y' && basketIndex<3 );
		
	}
	
	static void showBasket(){
		
		System.out.println("No \t Item \t\t Unit Price \t Quantity \t price");
		for(int i=0; i<basketIndex; i++){
			int No= i+1;
			
			int price =unitPrice[itemBasketIndex[i]]*itemBasketQuantity[i];
			System.out.println(No+" \t" +description[itemBasketIndex[i]]+"  \t"
			+unitPrice[itemBasketIndex[i]]+" \t \t"+itemBasketQuantity[i]+" \t"+price);
		}
	}
	
	public static void main(String[] arg){
		getItems();
		showBasket();
	}
}