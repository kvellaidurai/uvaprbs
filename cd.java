import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;
class Main
{
    public static void main (String [] abc) throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String s;
        while(!(s=br.readLine()).equals("0 0"))
        {
            StringTokenizer st=new StringTokenizer(s);
            int m=Integer.parseInt(st.nextToken());
            int n=Integer.parseInt(st.nextToken());
            HashSet<String>setm=new HashSet<>();
            for (int i=0;i<m;i++) 
            setm.add(br.readLine());
			int count=0;
			for (int i=0;i<n;i++) if (setm.contains(br.readLine())) count++;
			
			System.out.println(count);

        }
    }
}
