import java.util.*;
public class casestudy1 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int Michael, Bruce =0;
		Random random =  new Random();
		Michael = random.nextInt(100); //Both write nos. on their chit
		Bruce = random.nextInt(100);
		System.out.println("Michael writes:" + Michael);
		System.out.println("Bruce writes:" + Bruce);
		if(Michael > Bruce)
			System.out.println("Mike gets the girl");
		else if(Bruce > Michael)
			System.out.println("BRuce gets the girl");
		else
			System.out.println("Both remain single");
	}
}
