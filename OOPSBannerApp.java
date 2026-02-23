/**
 * UC5:  Render OOPS as Banner using Inline Array Initialization
 * Prints OOPS using 7-line, 9-width grid format using asterisks (*) and spaces( ) to form each letter 
 * Combining array declaration and initialization with `String.join()` method
 */
public class OOPSBannerApp {
    public static void main(String[] args) {
        String[] lines = {
            String.join("   ", " ** ", " ** ", " ** ", " ** "),
            String.join("   ", "*     ", "     ", "     ", "      "),
            String.join("   ", "*     ", "     ", "     ", "      "),
            String.join("   ", "*     ", "     ", " ** ", " *** "),
            String.join("   ", "*     ", "     ", "      ", "      *"),
            String.join("   ", "*     ", "     ", "      ", "      *"),
            String.join("   ", " ** ", " ** ", "*      ", " *** ")
        };
       for (String line : lines) {
            System.out.println(line);
        }
    }
}