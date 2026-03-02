/**
 * UC8: Use Map for Character Patterns and Render via Function
 * Store ASCII art in a HashMap and use methods to get patterns.
 *Print messages by retrieving each character’s pattern.
 */
import java.util.HashMap;
public class OOPSBannerApp {
    public static HashMap<Character, String[]> createCharacterMap() {
        HashMap<Character, String[]> charMap = new HashMap<>();
        charMap.put('O', new String[]{
                " *** ",
                "*   *",
                "*   *",
                "*   *",
                " *** "
        });

        charMap.put('P', new String[]{
                "**** ",
                "*   *",
                "**** ",
                "*    ",
                "*    "
        });

        charMap.put('S', new String[]{
                " ****",
                "*    ",
                " *** ",
                "    *",
                "**** "
        });

        return charMap;
    }

    public static void displayBanner(String message,
                                     HashMap<Character, String[]> charMap) {
        int patternHeight = charMap.get('O').length;

        for (int line = 0; line < patternHeight; line++) {
            StringBuilder sb = new StringBuilder();
            for (char ch : message.toCharArray()) {
                String[] pattern = charMap.get(ch);
                if (pattern != null) {
                    sb.append(pattern[line]).append("  "); // 2-space gap
                }
            }
            System.out.println(sb.toString());
        }
    }

    public static void main(String[] args) {
        HashMap<Character, String[]> charMap = createCharacterMap();
        String message = "OOPS";
        displayBanner(message, charMap);
    }
}