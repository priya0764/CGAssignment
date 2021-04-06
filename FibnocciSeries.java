package exercises;

import java.util.Scanner;

public class FibnocciSeries {

	public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n1=1,n2=1,n3,i;
    System.out.println("enter number");
    int terms=sc.nextInt();
    System.out.println(n1+""+n2);
    for(i=2;i<terms;i++)
    {
    	n3=n1+n2;
    	System.out.println(""+n3);
    	n1=n2;
    	n2=n3;
    }
    sc.close();
    
	}

}
