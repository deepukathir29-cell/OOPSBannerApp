/**
 * UC4: Render OOPS as Banner using String Array and Loop
 * Prints OOPS using 7-line, 9-width grid format using asterisks (*) and spaces( ) to form each letter and using String Array and loop 
 */
public class OOPSBannerApp {
    public static void main(String[] args) {
        String[] banner = new String[7];
        banner[0] = String.join("", "  *****  ", "  *****  ", " ******** ", "  ******  ");
        banner[1] = String.join("", " **   ** ", " **   ** ", " **     * ", " **     * ");
        banner[2] = String.join("", " **   ** ", " **   ** ", " **     * ", " **       ");
        banner[3] = String.join("", " **   ** ", " **   ** ", " ******** ", "  ******  ");
        banner[4] = String.join("", " **   ** ", " **   ** ", " **        ", "       ** ");
        banner[5] = String.join("", " **   ** ", " **   ** ", " **        ", "      **  ");
        banner[6] = String.join("", "  *****  ", "  *****  ", " **        ", " ******   ");
        for (String line : banner) {
            System.out.println(line);
        }
    }
}