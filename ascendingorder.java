import java.util.*;
class ascendingorder
{
	public void main()
	{
		Scanner sc = new Scanner(System.in);
        System.out.println("ntr the limit");
        int n=sc.nextInt();
		int ar[]=new int [10];
		int i=0,t=0;int j=0;
	    
		for(i=0;i<n;i++)
		{ 
			System.out.println("ntr "+(i+1)+"element");
            ar[i]=sc.nextInt();
        }
        for(i=0;i<n;i++)
        {
			for(j=0;j<n-i-1;j++)
			{
				if(ar[i]>ar[j+1])
					{
						t=ar[j];
						ar[j]=ar[j+1];
						ar[j+1]=t;
				}
			}
		}
		for(i=0;i<n;i++)
		{
			System.out.println(ar[i]);
		}
	}
}


