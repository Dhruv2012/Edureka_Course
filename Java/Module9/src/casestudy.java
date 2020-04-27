import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.*;
import java.util.Iterator;

public class casestudy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stream<String> names = Stream.of("aBc", "d", "ef");	
		List<String>strings = Arrays.asList("abc", "", "bc", "efg", "abcd","", "jkl");
		List<String> members=Arrays.asList("Abish", "Bhargavi", "Alex", "Max", "Annie");
		
		List<String> uppercase_names = names.map(String::toUpperCase).collect(Collectors.toList());
		System.out.println("After upper case conversion:" + uppercase_names);
        System.out.print("List with non-empty string is: [" );
		String x;
		Iterator iter = strings.iterator();
		while(iter.hasNext()) {
			x = iter.next().toString();
			if(x.isEmpty()) {
				//System.out.println("String is empty");
			}
			else {
				System.out.print(x + " ");
			}
		}
		System.out.println("]");
		Iterator itr = members.iterator();
		String temp;
		int count_A = 0;
		while(itr.hasNext()) {
	        temp = itr.next().toString();
			if(temp.charAt(0) == 'A')
				count_A+=1;
				
	        //System.out.println(temp);
	    }
		System.out.println("Count of strings starting with A in:" + members +  " =" + count_A);
		
	}
	

}
