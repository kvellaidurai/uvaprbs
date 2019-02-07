import java.util.*;
class GFG {
	public static void main (String[] args) {
		Scanner in=new Scanner(System.in);
		int d=1;
		while(in.hasNext()){
		    int n=in.nextInt();
		    if(n==0)
		    break;
		    int a[]=new int[n];
		    int t=0;
		    for(int i=0;i<n;i++){
		        a[i]=in.nextInt();
		        t+=a[i];}
		    int exp=t/n;
		    int res=0;
		    for(int j=0;j<n;j++){
		        if(a[j]>exp)
		        res+=a[j]-exp;}
		System.out.println("Set #" + d++);
		System.out.println("The minimum number of moves is "+ res +".\n");}	}}
		    

