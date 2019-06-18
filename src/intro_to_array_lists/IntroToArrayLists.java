package intro_to_array_lists;

import java.util.ArrayList;

public class IntroToArrayLists {
	public static void main(String[] args) {
		//1. Create an array list of Strings
		//   Don't forget to import the ArrayList class
		ArrayList<String> animals=new ArrayList<String>();
		//2. Add five Strings to your list
		animals.add("cat");
		animals.add("dog");
		animals.add("snake");
		animals.add("elephant");
		animals.add("giraffe");

		//3. Print all the Strings using a standard for-loop
		for(int i=0;i<animals.size(); i++) {
			String c=animals.get(i);
			System.out.println("animal "+(i+1)+ ": "+c);
		}
		System.out.println("\n");
		//4. Print all the Strings using a for-each loop
		for(String a : animals) {
			System.out.println(a);
		}
		System.out.println("\n");
		//5. Print only the even numbered elements in the list.
		for(int i=0; i<animals.size(); i++) {
			if(i%2==0) {
				
				System.out.println(animals.get(i));
			}
		}
		//6. Print all the Strings in reverse order.
		
		//7. Print only the Strings that have the letter 'e' in them.
	}
}
