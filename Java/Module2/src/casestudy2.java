import java.util.*;
public class casestudy2 {
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int card_num = 11;
		Random random = new Random();
		card_num =  random.nextInt(10); // JIll chooses the card at random from 1 to 10
		String msg;
		// switch statement to get message on cards
		switch (card_num) {
        case 1:
            msg = "no. on card is 1";
            break;
        case 2:
        	msg = "no. on card is 2";
            break;
        case 3:
        	msg = "no. on card is 3";
            break;
        case 4:
        	msg = "no. on card is 4";
            break;
        case 5:
        	msg = "no. on card is 5";
            break;
        case 6:
        	msg = "no. on card is 6";
            break;
        case 7:
        	msg = "no. on card is 7";
            break;
        case 8:
        	msg = "no. on card is 8";
        	break;
        case 9:
        	msg = "no. on card is 9";
        	break;
        case 10:
        	msg = "no. on card is 10";
        	break;
        default:
        	msg = "card no. is not available";
            break;
		}
		 System.out.println("The msg is:" + msg);
	}

}
