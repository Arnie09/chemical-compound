import java.io.*;
class caller
{
    BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
    public void main()throws IOException
    {
         System.out.println("Please enter the coordinates for the 1st point");
        int a=Integer.parseInt(br.readLine());
        int b=Integer.parseInt(br.readLine());
        System.out.println("Please enter the coordinates of the 2nd point");
        int c=Integer.parseInt(br.readLine());
        int d=Integer.parseInt(br.readLine());
        for(int i=1;i<10;i++)
        {
        distance ob=new distance(a,b,c,d);
        ob.calculate();
    }
}
}
