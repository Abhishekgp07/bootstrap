// Custom exception class
class AgeException extends Exception {
    public AgeException(String message) {
        super(message);
    }
}

class TestAge {
    public void checkAge(int age) throws AgeException {
        if (age < 18) {

            throw new AgeException("Age must be 18 or older.");
        }
        System.out.println("Age is valid.");
    }

    public static void main(String[] args) {
        TestAge test = new TestAge();
        try {
            test.checkAge(20);
        } catch (AgeException e) {
            System.out.println("Caught Exception: " + e.getMessage());
        }
    }
}
