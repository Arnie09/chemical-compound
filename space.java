import java.util.*;
class space
{
    Scanner sc= new Scanner (System.in);
    public void main()
    {
        System.out.println("Ntr");char ch='\0';
        String s1= sc.next();String s2="";int f=0;
        for(int i=0;i<s1.length();i++)
        {
            ch=s1.charAt(i);
            if(ch!=32)
            s2+=ch;
            else if(ch==32)
            {
               
                     System.out.println(s2);
                     f=0;
                    
                }
            }
        }
    }