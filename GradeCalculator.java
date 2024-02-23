import java.util.Scanner;
class GradeCalculator {
    public static void main(String[] args) {
        System.out.println("                  STUDENT GRADE CALCULATOR                  ");
        float English,Maths,Physics,Chemistry,Biology,total,average;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the English mark:");
        English=sc.nextFloat();
        System.out.print("Enter the Maths mark:");
        Maths=sc.nextFloat();
        System.out.print("Enter the Physics mark:");
        Physics=sc.nextFloat();
        System.out.print("Enter the Chemistry mark:");
        Chemistry=sc.nextFloat();
        System.out.print("Enter the Biology mark:");
        Biology=sc.nextFloat();
        total=English+Maths+Physics+Chemistry+Biology;
        System.out.println("Total:"+total);
        average=total/5;
        System.out.println("Average Percentage:"+average+"%");
        if (average >=90)
            System.out.println("Grade: O");
        else if (average>=80)
            System.out.println("Grade: A+");
        else if (average>=70)
            System.out.println("Grade: A");
        else if (average>=60)
            System.out.println("Grade: B+");
        else if (average>=50)
            System.out.println("Grade: B");
        else if (average>=45)
            System.out.println("Grade: C+");
        else if (average>=40)
            System.out.println("Grade: C");
        else
            System.out.println("FAILED!");
    }
}
