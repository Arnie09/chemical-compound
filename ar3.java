import java.io.*;
class ar3
{
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    public void main()throws IOException
    {
        int ar[]=new int [10];
        int i=0;
        while(i<10)
        {
            System.out.println("Enter the elements");
            int n=Integer.parseInt(br.readLine());
            if(n>0)
            {
                ar[i]=n;
                i++;
            }
        }
        int j=0;
        for (j=0;j<10;j++)
        {
            System.out.println(ar[j]);
        }
    }
}
    