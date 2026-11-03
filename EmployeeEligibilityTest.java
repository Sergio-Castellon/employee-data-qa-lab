
public class EmployeeEligibilityTest {

    public static boolean isEligible(int age, String status) {
        return age >= 18 &&
               age <= 65 &&
               "Active".equals(status);
    }

    public static void main(String[] args) {

        System.out.println(isEligible(18, "Active"));

    }
}
