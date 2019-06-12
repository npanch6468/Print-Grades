import java.util.Scanner;
public class printGrades {
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        char yorn;
        do {
            System.out.print("Enter exam grade: ");
            int grade = scan.nextInt();
            if (grade >= 97 && grade <= 100) {
                System.out.println("Good job, your grade is a A+");
            } else if (grade >= 94 && grade <= 96) {
                System.out.println("Good job, your grade is a A");
            } else if (grade >= 90 && grade <= 93) {
                System.out.println("Good job, your grade is a A-");
            } else if (grade >= 87 && grade <= 89) {
                System.out.println("Good job, your grade is a B+");
            } else if (grade >= 84 && grade <= 86) {
                System.out.println("Good job, your grade is a B");
            } else if (grade >= 80 && grade <= 83) {
                System.out.println("Good job, your grade is a B-");
            } else if (grade >= 77 && grade <= 79) {
                System.out.println("Good job, your grade is a C+");
            } else if (grade >= 74 && grade <= 76) {
                System.out.println("Good job, your grade is a C");
            } else if (grade >= 70 && grade <= 73) {
                System.out.println("Good job, your grade is a C-");
            } else if (grade >= 60 && grade <= 69) {
                System.out.println("your grade is a D");
            } else {
                System.out.println("Go back to School!");
            }

            System.out.println("Do you want to enter another score (Y/N)?");
            yorn = scan.next().charAt(0);
        }while(yorn == 'Y');
    }
}
