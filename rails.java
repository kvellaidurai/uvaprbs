import java.util.Scanner;
import java.util.Stack;
public class Main 
{
        public static void main(String[] args) 
        {
        Scanner in= new Scanner(System.in);
        while (in.hasNext()) 
        {
            int n = in.nextInt();
            if (n == 0) 
             break;
            boolean br = true;
            while (br) 
            {
                Stack<Integer> stack = new Stack<Integer>();
                int j = 0;
                for (int i = 0; i < n; i++)
                {
                    int x = in.nextInt();
                    if (x == 0) 
                    {
                        br = false;
                        break;
                    }
                    while (j < n && j != x) 
                    {
                        if (stack.size() > 0 && stack.peek() == x) 
                        break;
                        j++;
                        stack.push(j);
                    }
                    if (stack.peek() == x) 
                    {
                        stack.pop();
                    }
                }
                if (br)
                {
                    if (stack.size() == 0) 
                    {
                        System.out.println("Yes");
                    } else 
                    {
                        System.out.println("No");
                    }
                }
            }
            System.out.println();
        }
    }
}
