import java.io.*;
class project1
{   
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public void main()throws IOException
    {
        System.out.println("         MENU");
         System.out.println("Press 1 to check whther a number is magic number");
         System.out.println("Press 2 to check whther a number is special number");
         System.out.println("Press 3 to check whther a number is automorphic number");
         System.out.println("Press 4 to check whther a number is armstrong number");
         int ch=Integer.parseInt(br.readLine());
         switch(ch)
         {
             case 1:magic();
                    break;
             case 2:special();
                    break;
             case 3:automorphic();
                    break;
             case 4:armstrong();
                    break;
             default:System.out.println("Please enter proper values");
            }
        }
    public void magic()throws IOException
      {
        System.out.println("Enter the number to be checked");
        int n=Integer.parseInt(br.readLine());
        int sum=0,flag,d=0;
        do
        {
            flag=0;
            while(n%10==0) //Remove Excess Multiple of 10
                n/=10;
            while(n%10!=0||n>0) //Summing Up the Digits
            { sum+=(n%10);    n/=10; }
            if(sum>=10)
            {
                n=sum;  sum=0;
            }
            else
            flag=1;
        }while(flag==0);
        if(sum==1) System.out.println("Magic number");
        else   System.out.println("Non Magic number");
    }
    public void special()throws IOException
    {
        System.out.println("Enter any no"); 
     int n=Integer.parseInt(br.readLine()); 
     int num=n;int x=0;int sum=0; 
      while(n>0) 
     { x=n%10; 
      sum=sum+fact(x); 
       n=n/10; 
      } 
      if (sum==num) 
     System.out.println("No is special"); 
     else 
     System.out.println("No is not special"); 
   } 
   public int fact(int n) 
    { 
    int i,f=1; 
    for (i=1;i<n;i++) 
    { 
    f=f*1; 
   } 
   return f; 
   } 
   public void automorphic()throws IOException
   {
       int m,b,p;
       double r=0;
       System.out.println("Enter a number");
       int n=Integer.parseInt(br.readLine());
       m=n;
       p=m*m;
       int c=0;
        do
        {
        c++;
        m=m/10;
      }while(m!=0);
     int q= p%(int)Math.pow(10,c);

      if(n==q)
      System.out.println(n+" is an Automorphic number");
     else
     System.out.println(n+" is not an Automorphic number");
   }
   public void armstrong()throws IOException
   {
       int n, sum = 0, temp, r;
       System.out.println("Enter a number to check if it is an armstrong number");      
      n = Integer.parseInt(br.readLine());
 
      temp = n;
 
      while( temp != 0 )
      {
         r = temp%10;
         sum = sum + r*r*r;
         temp = temp/10; 
      }
 
      if ( n == sum )
         System.out.println("Entered number is an armstrong number.");
      else
         System.out.println("Entered number is not an armstrong number.");         
   }
        }
    
          