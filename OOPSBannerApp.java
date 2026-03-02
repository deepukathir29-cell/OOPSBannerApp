/**
 * UC6:  Refactor Banner Logic into Functions
 * Prints OOPS using 7-line, 9-width grid format by defining methods that generate the banner lines for each character (O, P, S) 
 * invoke these methods during array declaration to build and display the banner
 */
public class OOPSBannerApp {
    public static String[] getOPattern() {
        return new String[] {
            String.join("", "  *****  "),
            String.join("", " **   ** "),
            String.join("", " **   ** "),
            String.join("", " **   ** "),
            String.join("", " **   ** "),
            String.join("", " **   ** "),
            String.join("", "  *****  ")
        };
    }
    public static String[] getPPattern() {
        return new String[] {
            String.join("", " ******  "),
            String.join("", " **   ** "),
            String.join("", " **   ** "),
            String.join("", " ******  "),
            String.join("", " **       "),
            String.join("", " **       "),
            String.join("", " **       ")
        };
    }
    public static String[] getSPattern() {
        return new String[] {
            String.join("", "  *****  "),
            String.join("", " **       "),
            String.join("", " **       "),
            String.join("", "  *****  "),
            String.join("", "      ** "),
            String.join("", "      ** "),
            String.join("", " *****   ")
        };
    }
    public static void main(String[] args) {
        String[] oPattern = getOPattern();
        String[] pPattern = getPPattern();
        String[] sPattern = getSPattern();
        String[] banner = new String[7];
        for (int i = 0; i < oPattern.length; i++) {
            banner[i] = String.join("   ",
                    oPattern[i],
                    oPattern[i],
                    pPattern[i],
                    sPattern[i]);
        }
        for (String line : banner) {
            System.out.println(line);
        }
    }
}