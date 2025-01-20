import java. util.*;
class student
{   
    Scanner sc=new Scanner (System.in);
    int roll;
    int marks;
    char grade;
    student()
    {
        roll = marks = 0;
        grade = '\0';
    }
    student(int r,int m)
    {
        roll=r;
        marks=m;
        grade='\0';
    }
    void input()
    {
        System.out.println("ntr the roll and marks");
        roll=sc.nextInt();
        marks=sc.nextInt();
    }
    void calculate()
    {
        if(marks>90)
        grade='a';
        else if (marks>80)
        grade='b';
        else grade='c';
    }
    void display()
    {
      System.out.println(roll+"             "+marks+"                 "+grade);
    }
}
public class initial
{
    public void main()
    {
        student ob=new student();
        student ob1=new student(10,90);
        ob.input();
        ob.calculate();
        ob.display();
        ob1.calculate();
        ob1.display();
    }
}

   