**
 * OOPSBannerApp UC7 – Store Character Pattern in a Class
 * Demonstrates encapsulation of character-to-pattern mapping
 * Using an inner static class and utility methods.
 */
 public class OOPSBannerApp {
    static class CharacterPatternMap {
        private final Character character;
        private final String[] pattern;
        public CharacterPatternMap(Character character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }
        public Character getCharacter() {
            return character;
        }
        public String[] getPattern() {
            return pattern;
        }
    }
    public static CharacterPatternMap[] createCharacterPatternMaps() {
        String[] oPattern = {
                " *** ",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                " *** "
        };
        String[] pPattern = {
                "** ",
                "*     *",
                "*     *",
                "** ",
                "*      ",
                "*      ",
                "*      "
        };
        String[] sPattern = {
                " *** ",
                "*      ",
                "*      ",
                " *** ",
                "      *",
                "      *",
                " *** "
        };

        String[] spacePattern = {
                "   ",
                "   ",
                "   ",
                "   ",
                "   ",
                "   ",
                "   "
        };
        return new CharacterPatternMap[]{
                new CharacterPatternMap('O', oPattern),
                new CharacterPatternMap('P', pPattern),
                new CharacterPatternMap('S', sPattern),
                new CharacterPatternMap(' ', spacePattern)
        };
    }
    public static String[] getCharacterPattern(char ch, CharacterPatternMap[] charMaps) {
        for (CharacterPatternMap map : charMaps) {
            if (map.getCharacter() == Character.toUpperCase(ch)) {
                return map.getPattern();
            }
        }
        for (CharacterPatternMap map : charMaps) {
            if (map.getCharacter() == ' ') {
                return map.getPattern();
            }
        }
        return new String[7];
    }
    public static void printMessage(String message, CharacterPatternMap[] charMaps) {
        final int HEIGHT = 7;
        for (int row = 0; row < HEIGHT; row++) {
           StringBuilder lineBuilder = new StringBuilder();
            for (int i = 0; i < message.length(); i++) {
                String[] pattern = getCharacterPattern(message.charAt(i), charMaps);
                lineBuilder.append(pattern[row]).append("  ");
            }
            System.out.println(lineBuilder);
        }
    }
    public static void main(String[] args) {
        CharacterPatternMap[] charMaps = createCharacterPatternMaps();
        String message = "OOPS";
        printMessage(message, charMaps);
    }
}
