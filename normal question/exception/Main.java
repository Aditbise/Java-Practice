import java.util.*;
public class Main {
    public static void checkString(String str) throws NoMatchException {
        if (!"India".equals(str)) {
            throw new NoMatchException("String does not match 'India'");
        }
        System.out.println("String matches 'India'");
    }

    public static void main(String[] args) {
        String testString = "USA";

        try {
            checkString(testString);
        } catch (NoMatchException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Execution completed.");
        }
    }
}
