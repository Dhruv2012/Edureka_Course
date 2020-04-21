//Method overloading

public class casestudy2 {
	public void area(float l,float b)
    {
         System.out.println("Area of Rectangle : "+(b*l));
    }
    public void area(float r,String s) 
    {
    	if(s == "circle")
    		System.out.println("Area of Circle : "+(3.14*r*r));
    	else if(s == "square")
    		System.out.println("Area of Square : "+(r*r));

    }
    
	public static void main(String args[])
	   {
		
		   casestudy2 a=new casestudy2();
	       a.area(4,6);
	       a.area(5,"circle");
	       a.area(4,"square");
	   }
	
}
