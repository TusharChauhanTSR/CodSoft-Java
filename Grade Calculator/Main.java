import java.util.Scanner;

class Grade {
    public String grade(int avg) {
        switch (avg / 10) {
            case 10:
                return "A+";
            case 9:
                return "A";
            case 8:
                return "B+";
            case 7:
                return "B";
            case 6:
                return "C";
            case 5:
                return "D";
            default:
                return "F";
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Grade g = new Grade();
        Scanner sc = new Scanner(System.in);

        // Taking input of how many subjects are there
        System.out.println("Enter the total number of subjects");
        int tsubs = sc.nextInt();
        int tmarks = 0;

        // Taking and adding all the marks
        for (int i = 1; i <= tsubs; i++) {
            System.out.println("Enter the marks obtained in subject " + i);
            int marks = sc.nextInt();
            tmarks += marks;

        }

        // Calculating Percentage
        int avg = tmarks / tsubs;

        // Calculating Grades
        String Grade = g.grade(avg);

        // Displaying all the Data
        System.out.println("Total marks obtained :- " + tmarks);
        System.out.println("Percentage obtained :- " + avg + "%");
        System.out.println("Grade obtained :- " + Grade);

        sc.close();
        // Lets test the code
    }
}