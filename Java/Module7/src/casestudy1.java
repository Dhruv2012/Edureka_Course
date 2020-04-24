import java.lang.*;

class Table{
	void printTable(int n) {
		for(int i=1;i<=10;i++)
		{
			System.out.println(+n+"*"+i+"="+(n*i));
			try
			{
				Thread.sleep(400);
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
			
		}
	}
}

class Mythread extends Thread{
	Table t;
	int n;
	Mythread(Table t, int n){
		this.t = t;
		this.n = n;
	}
	public void run() {
			t.printTable(n);
	}
}

public class casestudy1 {

	public static void main(String[] args) {
		//t
		Table obj = new Table();
		Mythread t1 = new Mythread(obj,5);
		Mythread t2 = new Mythread(obj,10);
		t1.start();
		try {
			t1.join();
		}
		catch(Exception e){
			
		}
		t2.start();
		try {
			t2.join();
		}
		catch(Exception e){
			
		}
	}

}
