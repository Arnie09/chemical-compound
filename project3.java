import java.io.*;
class project3
{
    BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
    public void main()throws IOException
    {
        System.out.println("Enter 1 for 1st series ");
        System.out.println("Enter 2 for 2nd series");
        int ch=Integer.parseInt(br.readLine());
        switch(ch)
        {
            case 1:series1();
                   break;
            case 2:series2();
                   break;
            default:System.out.println("Enter proper values");
        }
    }
    public void series1()throws IOException
    {
        int i=0;int d=1,f=0;int s=0;
        System.out.println("enter  the  limit");
        int n=Integer.parseInt(br.readLine());
         System.out.println("enter  the number ");
        int x=Integer.parseInt(br.readLine());
        for(i=1;i<=n;i++)
        {
            n=(int)Math.pow(x,i);
            d=fact(x,i);
            f=n/d;
            s+=f;
        }
        System.out.println(s);
    }
    public int fact(int x,int i)
    {
        int j=1;int fac=1;
        for(j=1;j<=i;j++)
        {
            fac*=j;
        }
        return fac;
    }
    public void series2()throws IOException
    {
        int s=0;
        System.out.println("enter the limit");
        int n=Integer.parseInt(br.readLine());
         System.out.println("enter  the number ");
        int x=Integer.parseInt(br.readLine());
        int i=0;
        for(i=0;i<=n;i++)
        {
            if(i%2==0)
            {
                s+=Math.pow(x,i);
            }
            else
              s-=Math.pow(x,i);
            }
            System.out.println(s);
        }
    }
    
            
            
            
            
            
            
            
            
            
            