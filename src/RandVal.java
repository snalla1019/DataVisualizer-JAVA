import java.util.*;


public class RandVal {
	public static void main(String[] args) {
		RandFunc f=new RandFunc();
		f.addRandomVal();
		}
}

 class RandFunc
{
	@SuppressWarnings("unchecked")
	void addRandomVal()
	{
		@SuppressWarnings("rawtypes")
		List list = new ArrayList(); 
		list.add("I have ");
		list.add(new Integer(2));
		list.add("assignments tonight!");
		System.out.println(list);
	}
}

