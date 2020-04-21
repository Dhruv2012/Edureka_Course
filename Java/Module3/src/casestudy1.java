
public class casestudy1 {
	static double[][] multiply(double a[][], double b[][]){
		double[][] c = new double[a.length][b[0].length];
		for(int i =0;i<a.length;i++){
			for(int j=0;j<b[0].length;j++){
				for(int k =0; k<b.length;k++) {
					c[i][j]+= a[i][k]*b[k][j];
				}
			}
		}
		return c;
	}
	
	static double[][] addition(double a[][], double b[][]){
		double [][] c = new double[a.length][a[0].length];
		for(int i=0;i<a.length;i++){
			for(int j=0;j<a[0].length;j++){
					c[i][j]= a[i][j] + b[i][j];
			}
		}
		return c;
	}
	
	static double[][] transpose(double a[][]){
		double [][]c = new double[a[0].length][a.length];
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[0].length;j++)
				c[j][i] = a[i][j];
		}
		return c;
	}
	
	static double sumofdiagonals(double a[][]){
		double sum =0;
		for(int i=0;i<a.length;i++)
			sum+=a[i][i];
		return sum;
	}
	
    public static double[][] invert(double a[][]) 

    {
        int n = a.length;

        double x[][] = new double[n][n];

        double b[][] = new double[n][n];

        int index[] = new int[n];

        for (int i=0; i<n; ++i) 

            b[i][i] = 1;
        gaussian(a, index);

        for (int i=0; i<n-1; ++i)

            for (int j=i+1; j<n; ++j)

                for (int k=0; k<n; ++k)
                    b[index[j]][k]-= a[index[j]][i]*b[index[i]][k];

        for (int i=0; i<n; ++i) 
        {
            x[n-1][i] = b[index[n-1]][i]/a[index[n-1]][n-1];
            for (int j=n-2; j>=0; --j) 
            {
                x[j][i] = b[index[j]][i];
                for (int k=j+1; k<n; ++k) 
                {
                    x[j][i] -= a[index[j]][k]*x[k][i];
                }
                x[j][i] /= a[index[j]][j];
            }
        }
        return x;
    }

    public static void gaussian(double a[][], int index[]) 
    {
        int n = index.length;
        double c[] = new double[n];
        for (int i=0; i<n; ++i) 
            index[i] = i;
        for (int i=0; i<n; ++i) 
        {
            double c1 = 0;
            for (int j=0; j<n; ++j) 
            {
                double c0 = Math.abs(a[i][j]);
                if (c0 > c1) c1 = c0;

            }
            c[i] = c1;
        }
        int k = 0;
        for (int j=0; j<n-1; ++j) 
        {
            double pi1 = 0;
            for (int i=j; i<n; ++i) 
            {
                double pi0 = Math.abs(a[index[i]][j]);
                pi0 /= c[index[i]];
                if (pi0 > pi1) 
                {
                    pi1 = pi0;
                    k = i;
                }
            }
            int itmp = index[j];
            index[j] = index[k];
            index[k] = itmp;
            for (int i=j+1; i<n; ++i) 	
            {
                double pj = a[index[i]][j]/a[index[j]][j];
                a[index[i]][j] = pj;
                for (int l=j+1; l<n; ++l)
                    a[index[i]][l] -= pj*a[index[j]][l];
            }
        }
    }
	
	public static void print2D(double mat[][])		//Printing 2D ARrays 
    { 
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) 
                System.out.print(mat[i][j] + " "); 
        	System.out.println();
        }
    }
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a[][]= {{1,1,1},{1,1,1},{1,1,1}};
		double b[][] = {{2,2,2},{2,2,2},{2,2,2}};
		double mul[][] = new double[a.length][b[0].length];	 // multiplication result of a and b
		double add[][] = new double[a.length][a[0].length];	// addition result of a and b
		double trans[][] = new double[a[0].length][a.length];   // Transpose of A
		double sum = 0; 									//sum of diagonals of a matrix		
		double inverse[][] = new double[a.length][a[0].length];
		
		if(a[0].length == b.length) { // multiplication is possible as array dimensions match
			System.out.println("Matrix Multiplication result of a & b is:");
			mul = multiply(a,b);
			print2D(mul);  // print multiplication result
		}
		else
			System.out.println("Array dimesions does not match for multiplication");
		
		if((a.length == b.length) && (a[0].length == b[0].length)) { // check dimensions before addition of array
			System.out.println("Matrix Addition result of a & b is:");
			add = addition(a,b);
			print2D(add); //print addition results
		}
		else
			System.out.println("Array dimesions does not match for addition");
		
		System.out.println("Transpose of A is:");
		trans = transpose(a); 		// Get transpose of A and print it.
		print2D(trans);
		
		if(a.length == a[0].length) {//check if A is square matrix
			sum = sumofdiagonals(a);
			System.out.println("Sum of diagonals of the matrix is:" + sum);
		}
		else 
			System.out.println("Sum of diagonals of the matrix can't be found as it is not a square matrix:");
		
		inverse = invert(a);
		System.out.println("Inverse of matrix A is:");
		print2D(inverse);
		
	}

}
