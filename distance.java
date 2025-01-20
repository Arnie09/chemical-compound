import java.io.*;
class distance
{
    int x1=0,x2=0,y1=0,y2=0;
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    distance(int a,int b,int c,int d)
    {
        
        x1=a;
        y1=b;x2=c;y2=d;
    }
    public void calculate()throws IOException
    {
        System.out.println("Please enter the coordinates for the 1st point");
         x1=Integer.parseInt(br.readLine());
         y1=Integer.parseInt(br.readLine());
        System.out.println("Please enter the coordinates of the 2nd point");
         x2=Integer.parseInt(br.readLine());
         y2=Integer.parseInt(br.readLine());
        double s1=0.0,s2=0.0,p1=0.0,p2=0.0,sum=0.0,d=0.0;
        s1=(x2-x1);
        s2=(y2-y1);
        p1=Math.pow(s1,2);
        p2=Math.pow(s2,2);
        sum=p1+p2;
        d=Math.sqrt(sum);
        System.out.println("Distance between two points is :"+d);
        System.out.println("If you want to continue....press 1 else to exit press 0");
        int ch=Integer.parseInt(br.readLine());
        switch(ch)
        {
            case 0:System.exit(0);
                   break;
            case 1:calculate();
                   break;
            default:System.out.println("Enter proper values ,please....");
        }
    }
}