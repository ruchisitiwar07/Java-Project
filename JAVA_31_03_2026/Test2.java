public class Test2 {
    public static void main(String[] args) {
        int score = 75;
        char grade = 'B';

        // Check pass/fail
        if (score >= 50) {
            System.out.println("Passed");
        } else {
            System.out.println("Failed");
        }

        // Assign and print grade based on score
        if (score >= 90) {
            grade = 'A';
        } else if (score >= 75) {
            grade = 'B';
        } else if (score >= 60) {
            grade = 'C';
        } else {
            grade = 'D';
        }
        System.out.println("Grade: " + grade);
    }
}