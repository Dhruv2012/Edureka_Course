import java.util.*;
public class casestudy1 {
	
	public static ArrayList <Integer> removeDuplicate(ArrayList <Integer> input){
		ArrayList <Integer> temp = new ArrayList <Integer>();
		Iterator itr = input.iterator();
		while(itr.hasNext()) {
			Integer i = (Integer)itr.next();
			//System.out.println(i);
			if(!temp.contains(i.intValue()))
				temp.add(i.intValue());
		}
		return temp;
	}
	
	public static int removeValue(ArrayList <Integer> input, int value){
		Iterator itr = input.iterator();
		int index =0,counter=0;
		while(itr.hasNext()) {
			Integer i = (Integer)itr.next();
			//System.out.println(i);
			if(i.intValue() == value) {
				itr.remove();
				index = counter;
			}
			counter+=1;
		}
		System.out.println("Updated ArrayList after removing " + value + " is:" + input + " & index removed is " + index);
		return index;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList <Integer> list  = new ArrayList <Integer>();
		list.add(1);
		list.add(10);
		list.add(2);
		list.add(2);
		list.add(3);
		list.add(3);
		list.add(3);
		list.add(5);
		System.out.println("ArrayList with duplicates: "
                + list); 
		System.out.println("Thus arraylist can store duplicates");
		
		ArrayList <Integer> newlist = removeDuplicate(list);
		System.out.println("ArrayList without duplicates is:" + newlist);
		
		int deletedindex = removeValue(newlist,10);
		System.out.println("deleted index is:" + deletedindex);
		
	}

}
