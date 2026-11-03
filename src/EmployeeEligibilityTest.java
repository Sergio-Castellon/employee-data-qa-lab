
public class EmployeeEligibilityTest {

    // Track test results
    static int passedTests = 0;
    static int failedTests = 0;

    // Check whether an employee is eligible
    public static boolean isEligible(int age, String status) {
        return age >= 18 &&
               age <= 65 &&
               "Active".equals(status);
    }

    // Run an automated QA test
    public static void runTest(String testId, int age,
                               String status, boolean expected) {

        boolean actual = isEligible(age, status);

        if (actual == expected) {
            System.out.println(testId + ": PASS");
            passedTests++;
        } else {
            System.out.println(testId + ": FAIL");
            failedTests++;
        }
    }

    // Main method
    public static void main(String[] args) {

        // Positive tests
        runTest("TC-01", 30, "Active", true);
        runTest("TC-02", 18, "Active", true);
        runTest("TC-03", 65, "Active", true);

        // Negative tests
        runTest("TC-04", 17, "Active", false);
        runTest("TC-05", 66, "Active", false);
        runTest("TC-06", 30, "Inactive", false);

        // Additional edge cases
        runTest("TC-07", 30, "active", false);
        runTest("TC-08", -1, "Active", false);
        runTest("TC-09", 30, null, false);

        // Display test summary
        System.out.println();
        System.out.println("=== TEST SUMMARY ===");
        System.out.println("Total Tests: " + (passedTests + failedTests));
        System.out.println("Passed: " + passedTests);
        System.out.println("Failed: " + failedTests);
    }
}
