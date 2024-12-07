package New;

public class Method {
	
	static int currentamount=1000;
	
	public static void Welcome() {
		System.out.println("Hi welcome our team");
		
	
	}
	
	public static void deposit(int amount) {
		currentamount=currentamount+amount;
		
		System.out.println("amount deposit");
		
	}
	
	public static void withdrwal(int amount) {
		currentamount=currentamount-amount;
		
		System.out.println("amount withdraw");
		
	}
	
	public static int getcurrrentbalanace() {
		
		return currentamount;
		
		
	}
	
	
	
	public static void main(String args[]) {
	
		Method bank=new Method();
		Welcome();
	 Method.deposit(1000);
		Method.withdrwal(0);
	System.out.println(Method.getcurrrentbalanace());
		
	}

}
