import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
	    Scanner in=new Scanner(System.in);
	    while(in.hasNextInt())
	    {
	        int p=in.nextInt();
	        int a=in.nextInt();
	        int h=in.nextInt();
	        int w=in.nextInt();
	        int k[]=new int[w];
	        int min=Integer.MAX_VALUE;
	        for(int i=0;i<h;i++)
	        {
	            int r=in.nextInt();
	            for(int j=0;j<w;j++)
	            {
	                k[j]=in.nextInt();
	                if(k[j]>=p && ((r*p)<=a))
	                {
	                    int temp=r*p;
	                    if(temp<min)
	                    min=temp;
	                }
	            }
	        }
	                if(min>a)
	                System.out.println("stay home");
	                else
	                System.out.println(min);
	    }
	}
}
	    
	                
	                
	           

