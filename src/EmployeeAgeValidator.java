
public class EmployeeAgeValidator {

    public static void main(String[] args) {

        // Sample employee ages for validation
        int[] ages = {17, 18, 25, 65, 66};

        // Check every age in the array
        for (int i = 0; i < ages.length; i++) {

            int age = ages[i];

            // Valid ages are between 18 and 65, inclusive
            if (age >= 18 && age <= 65) {
                System.out.println(age + ": Valid");
            } else {
                System.out.println(age + ": Invalid");
            }
        }
    }
}
