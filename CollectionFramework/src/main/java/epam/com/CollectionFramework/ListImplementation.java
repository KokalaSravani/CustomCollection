package epam.com.CollectionFramework;
public class ListImplementation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> lt = new List<Integer>();
		//adding elements
		lt.add(1);
		lt.add(2);
		lt.add(3);
		lt.add(5);
		lt.add(7);
		lt.add(11);
		
		//printing list and size
		System.out.println("List is "+ lt);
		System.out.println("Size of the list is " +lt.size());
		
		//removing an element
		lt.remove(4);
		System.out.println("After removing, the list is "+lt);
		System.out.println("Size of the list is " + lt.size());
		
		//fetching the element by index
		System.out.println(lt.get(4));

	}

}