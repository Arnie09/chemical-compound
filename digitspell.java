import java.util.*;
class digitspell
{
    public void main()
    {
        int n=0;
        Scanner sc= new Scanner (System.in);
        System.out.println("Enter a number ");
        if (sc.hasNextInt()==true)
         n= sc.nextInt();
        else
        System.out.println("enter proper values");
        int r=0;int rev=0;int p=0;
        while(n>0)
        {
            r=n%10;
            n=n/10;
            rev=rev*10+r;
        }
        while(rev>0)
        {
            p=rev%10;
            rev=rev/10;
            switch(p)
            {
                case 1:System.out.println("One");
                       break;
                 case 2:System.out.println("Two");
                       break;
                        case 3:System.out.println("Three");
                       break;
                        case 4:System.out.println("Four");
                       break;
                        case 5:System.out.println("Five");
                       break;
                        case 6:System.out.println("Six");
                       break;
                        case 7:System.out.println("Seven");
                       break;
                        case 8:System.out.println("Eight");
                       break;
                        case 9:System.out.println("Nine");
                       break;
                        case 0:System.out.println("Zero");
                       break;
                       default:System.out.println("enter proper values");
                    }
                }
            }
        }
        
                       