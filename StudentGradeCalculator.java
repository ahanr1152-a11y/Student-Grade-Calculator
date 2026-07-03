import java.util.Scanner;
public class StudentGradeCalculator{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String name;
        int[] marks=new int[5];
        int total=0;
        double percentage;
        char grade;
        System.out.print("Enter Student Name:");
        name=sc.nextLine();
        for(int i=0;i<5;i++){
            System.out.print("Enter marks of Subject "+ (i+1)+": ");
            marks[i]=sc.nextInt();
            total+=marks[i];
        }
        percentage =total/5.0;
        if(percentage>=80){
            grade='A';
        }else if(percentage>=60){
            grade='B';
        }else if(percentage>=40){
            grade='C';
        }else{
            grade='D';
        }
        System.out.println("\n-----STUDENT RESULT-----");
        System.out.println("Student Nmae:"+name);
        System.out.println("Total Marks :"+total +"/500");
        System.out.println("Percentage :"+percentage +"%");
        System.out.println("Grade "+ grade);
        sc.close();
    }
}