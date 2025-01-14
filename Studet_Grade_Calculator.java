package CodSoft;

import java.util.Scanner;

public class Studet_Grade_Calculator {
	public int rollNO;
	public String name ;
	public int maths , english , social_science , science, total;
	public float avg_per;
	Scanner sc = new Scanner(System.in);
	Studet_Grade_Calculator(int i){
    System.out.println("Enter the name of Student "+(i+1));
    name=sc.next();
    System.out.println("Enter the Roll No of Student"+(i+1));
    rollNO=sc.nextInt();
    System.out.println("Enter the mark of 'maths' subject out of 100");
    maths=sc.nextInt();
    System.out.println("Enter the mark of 'English' subject out of 100");
    english=sc.nextInt();
    System.out.println("Enter the mark of 'Social Science' subject out of 100");
    social_science=sc.nextInt();
    System.out.println("Enter the mark of 'Science' subject out of 100");
    science=sc.nextInt();
    total=maths+english+science+social_science;
    avg_per=(total/4);
    }
	public void display(int i){
    System.out.println("Name of the Student "+i+": "+name);
    System.out.println("Roll Number : "+rollNO);
    grade(total);
    System.out.println("Average Percentage : "+avg_per+"%");
    System.out.println("Total Marks : "+total);
    }
    public void grade(int total){
     if(total>=380){
            System.out.print("A");
     }
     else if(total>=320 && total<380){
           System.out.print("B");
     } 
     else if(total>=260 && total<320){
            System.out.print("C");
     }
     else{
            System.out.print("D");
     }
     }
    public static void main (String[] args) {
    Scanner s = new Scanner(System.in);
    int n = 0;
    boolean validInput = false;
    
    // Validate input until a valid integer is entered
    while (!validInput) {
        System.out.println("Enter number of students:");
        if (s.hasNextInt()) {
            n = s.nextInt();
            validInput = true;
        } 
        else {
            System.out.println("Invalid input. Please enter a valid integer.");
            s.next(); // Clear the invalid input from the scanner
        }
    }

    Studet_Grade_Calculator[] obj = new Studet_Grade_Calculator[n];
    for (int i = 0; i < n; i++) {
        obj[i] = new Studet_Grade_Calculator(i); 
    }
    for (int i = 0; i < n; i++) {
        obj[i].display(i+1);
    }
    s.close();
    }
	
}