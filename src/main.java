import java.util.Locale;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student st = new Student();
        Locale.setDefault(Locale.US);

        System.out.println("Student's name: ");
        st.name = sc.nextLine();
        System.out.println("Grade 1");
        st.grade1 = sc.nextDouble();
        System.out.println("Grade 2");
        st.grade2 = sc.nextDouble();
        System.out.println("Grade 3");
        st.grade3 = sc.nextDouble();

        System.out.printf("FINAL GRADE: %.2f%n", st.finalGrade());

        if (st.finalGrade() < 60) {
            System.out.println("FAILED");
            System.out.printf("Missing %.2f Points%n ", st.missingPoints());
        } else {
            System.out.println("PASS");
        }
        
        sc.close();
    }
}