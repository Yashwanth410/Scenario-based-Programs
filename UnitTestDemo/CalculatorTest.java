public class CalculatorTest {
    @TestCase
    public void testAdd() {
        int a = 2, b = 3;
        int result = a + b;
        if (result == 5) {
            System.out.println("testAdd passed.");
        } else {
            System.out.println("testAdd failed.");
        }
    }

    @TestCase
    public void testSubtract() {
        int a = 5, b = 3;
        int result = a - b;
        if (result == 2) {
            System.out.println("testSubtract passed.");
        } else {
            System.out.println("testSubtract failed.");
        }
    }

    // Non test method
    public void helperMethod() {
        System.out.println("Helper method.");
    }
}

