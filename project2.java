import java.io.*;
class project2
{
    BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
    public void main()throws IOException
    {
        int i =0;int j=0;int c=0;
        System.out.println("Enter the limit");
        int n=Integer.parseInt(br.readLine());
        for(i=1;i<=n;i++)
        {
            c=0;
            for(j=1;j<=i;j++)
            {
                if(i%j==0)
                c++;
            }
            if (c==2)
            pallindrome(i);
        }
    }
    public void pallindrome(int n)
    {
        
        int r=0;
        int cpy=n;int rev=0;
        while(n>0)
        {
            r=n%10;
            n=n/10;
            rev=rev*10+r;
        }
        if(rev==cpy)
        System.out.println(rev);
    }
}

            