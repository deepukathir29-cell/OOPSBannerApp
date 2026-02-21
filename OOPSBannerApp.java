/**
 *UC3 - Render OOPS as Banner using String.join()
 * Prints OOPS using 7-line, 9-width grid format using asterisks (*) and spaces( ) to form each letter
 */
public class OOPSBannerApp {
   public static void main(String[] args) {
        System.out.println(String.join("  *****  " + "  *****  " + "********" + "  ****** "));
        System.out.println(String.join(" **   ** " + " **   ** " + "**     *" + " **     *"));
        System.out.println(String.join("**     **" + "**     **" + "**      *" + "**       "));
        System.out.println(String.join("**     **" + "**     **" + "******** " + "  ****** "));
        System.out.println(String.join("**     **" + "**     **" + "**       " + "       **"));
        System.out.println(String.join(" **   ** " + " **   ** " + " **      " + "*      **"));
        System.out.println(String.join("  *****  " + "  *****  " + " **      " + " ******  "));
   }
}