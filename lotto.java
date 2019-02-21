import java.io.*;
import java.lang.*;
import java.util.*;
public class Main {
public static void main(String[] args) throws Exception 
{
    Scanner in=new Scanner(System.in);
    PrintWriter out=new PrintWriter(System.out);
    StringBuilder sb=new StringBuilder();
    boolean first=true;
    while(true)
    {
        int n=in.nextInt();
        if(n==0)
        break;
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        a[i]=in.nextInt();
        if(first)first=false;
        else out.print("\n");
        for(int b=0;b<n;++b)
        for(int c=b+1;c<n;++c)
        for(int d=c+1;d<n;d++)
        for(int e=d+1;e<n;e++)
        for(int f=e+1;f<n;f++)
        for(int g=f+1;g<n;g++)
        out.printf("%d %d %d %d %d %d\n" ,a[b] , a[c] , a[d] , a[e] , a[f] , a[g]);
}
out.flush();
out.close();
}
}

