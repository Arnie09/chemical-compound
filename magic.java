import java.io.*;
class magic
{
    BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
    
    
        public void magic()throws IOException
      {
          System.out.println("Enter the number to be checked");
          int n=Integer.parseInt(br.readLine());
          int s=0,r=0;
          while(n>9)
          {
              n=s;s=0;
              while(n>0)
              {
                  r=n%10;
                  n=n/10;
                  s=s+r;
                }
            }
            if(s==1)
            System.out.println("Magic number");
            else
            System.out.println("Not Magic number");
        }
    }
    