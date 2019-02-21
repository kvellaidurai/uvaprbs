import java.util.*;
import java.lang.*;
import java.io.*;
class Main {
	public static void main (String[] args) {
		Scanner in=new Scanner(System.in);
		int t=in.nextInt();
		while(t-->0){
		    int n=in.nextInt();
		    String s[]=new String[n];
		    int a[]=new int[n];
		    int b[]=new int[n];
		    for(int j=0;j<n;j++){
		        s[j]=in.next();
		        a[j]=in.nextInt();
		        b[j]=in.nextInt();}
		    int c=in.nextInt();
		    int d[]=new int[c];
		    for(int i=0;i<c;i++)
		    d[i]=in.nextInt();
		    for(int k=0;k<c;k++){
		       int e=0,f=0;
		       for(int l=0;l<n;l++){
		           if(d[k]>=a[l] && d[k]<=b[l]){
		               e++;
		               f=l;}}
		       if(e==1)
		       System.out.println(s[f]);
		       else
		       System.out.println("UNDETERMINED");}
		    if(t>0)
		    System.out.println();}}}
