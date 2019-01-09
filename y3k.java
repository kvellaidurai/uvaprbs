/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
	public static void main (String[] args) {
	Scanner in=new Scanner(System.in);
	while(true)
	{
	    int n=in.nextInt();
	    int d=in.nextInt();
	    int m=in.nextInt();
	    int y=in.nextInt();
	    if(n==0 && d==0 && m==0 && y==0)
	    break;
	    GregorianCalendar date=new GregorianCalendar(y,m-1,d);
	    date.add(Calendar.DATE,n);
	    System.out.println(date.get(Calendar.DATE)+" "+(date.get(Calendar.MONTH)+1)+" "+date.get(Calendar.YEAR));
}
}
}
