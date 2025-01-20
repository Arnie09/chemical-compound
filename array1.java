import java.util.*;
class array1
{
    Scanner sc =new Scanner (System.in);
    public void main()
    {
        int ar1[]=new int[5];
        int i=0,k=0,j=0,l=0,m=0,n=0,s=0;
        double avg=0.0;
        for (i=0;i<5;i++)
        {
            System.out.println("enter "+(i+1)+"element");
            ar1[i]=sc.nextInt();
    }
    int ar2[]=new int[5];
    for(j=0;j<5;j++)
    {
        if (ar1[j]%2==0)
        {
        ar2[k]=ar1[j];
        k++;
        }
    }
    for(l=0;l<5;l++)
    {
        if(ar1[l]%2!=0)
        {
            ar2[k]=ar1[l];
            k++;
        }
    }
     System.out.println("old array:");
    for(m=0;m<5;m++)
    {
                System.out.print(ar1[m]+"    ");
            }
             System.out.println("");
       System.out.println("new array:");
       for(n=0;n<5;n++)
       {
           System.out.print(ar2[n]+"   ");
        }
         System.out.println("");
     for   (n=0;n<5;n++)
     {
         s=s+ar2[n];
        }
        avg=s/5.0;
        System.out.println("the average is :"+avg);
  }
}