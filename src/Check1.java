//import java.io.InputStream;
import java.util.*;

class Check1 {
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		@SuppressWarnings("rawtypes")

		List listA = new ArrayList();
		ListFunc b = new ListFunc();
		Scanner scan = new Scanner(System.in);
		
		while(true){
		b.option();
		int a = scan.nextInt();
		switch (a) {
		case 1:	
			System.out.print("Enter a value to insert : ");
			int ele = scan.nextInt();
			b.addElement(listA, ele);
			System.out.println("-----------------End of Loop----------------\n");
			break;
		case 2 : 
			System.out.println(listA);
			System.out.println("-----------------End of Loop----------------\n");
			break;
		case 3 :
			System.exit(0);
		default:
			System.out.println("invalid Option");
			System.out.println("-----------------End of Loop----------------\n");
			break;
		}
	}
}
}


class ListFunc{
	void addElement(List<Integer> o,int e) //adding elements to arraylist
	{
		o.add(e);
	}
	
	//displays various options
	void option()
	{
		System.out.println("\n************  Menu  ************");
		System.out.println("1. Insert an Element");
		System.out.println("2. Display Elements");
		System.out.println("3. Exit");
		System.out.print("Enter your Option :");		
	}
}