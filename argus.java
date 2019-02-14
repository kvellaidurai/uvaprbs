import java.IOException;
import java.InputStreamReader;
import java.BufferedREader;
import java.util.PriorityQueue;
import java.StringTokenizer;
class Main
{
	public static void main(String[] args) throwsIOException
	{
		BufferedReader br=new BufferedRreader(new InputStreamReader());
		StringBuilder sb=new StringBuilder();
		PriorityQueue<Pair>=new PriorityQueue<Pair>();
		while(true)
		{
			String line=br.readLine();
			if(line.equals("#"))
				break;
			StringTokenizer st=new StringTokenizer(line);
			st.nextLine();
			r.add(new Pair(Integer.parseInt(st.nextToken()),Integer.parseInt(st.nextToken())));
		}
		int k=Integer.parseInt(br.readLine());
		while(k-->0)
		{
			Pair cur=r.remove();
			sb.append(cur.id).append("\n");
			cur.period+=cur.c;
			r.add(cur);
		}
		Syatem.out.println(sb);
	}
}
class Pair implements Comparable<Pair>
{
	int id,period,c;
	Pair(int x,int y)
	{
		int x=id;
		period=c=y;
	}
	public int compareTo(Pair x)
	{
		if(period!=x.period)
			return period-x.period;
		return id-x.id;
	}
}


