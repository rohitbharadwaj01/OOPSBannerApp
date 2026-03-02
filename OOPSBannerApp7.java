import java.util.HashMap;
import java.util.Map;
public class OOPSBannerApp7 {

    // Static inner class
    static class CharacterPatternMap {

        private char character;
        private String[] pattern;

        public CharacterPatternMap(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        public char getCharacter() {
            return character;
        }

        public String[] getPattern() {
            return pattern;
        }
    }

    public static void main(String[] args) {

        // Centralized pattern storage
        Map<Character, String[]> patternMap = new HashMap<>();

        // Create pattern objects
        CharacterPatternMap O = new CharacterPatternMap('O', new String[]{
                " ***** ",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                " ***** "
        });

        CharacterPatternMap P = new CharacterPatternMap('P', new String[]{
                " ***** ",
                "*     *",
                " ***** ",
                "*      ",
                "*      ",
                "*      ",
                "*      "
        });

        CharacterPatternMap S = new CharacterPatternMap('S', new String[]{
                " ***** ",
                "*      ",
                " ***** ",
                "      *",
                "      *",
                "*     *",
                " ***** "
        });

        // Store in map
        patternMap.put(O.getCharacter(), O.getPattern());
        patternMap.put(P.getCharacter(), P.getPattern());
        patternMap.put(S.getCharacter(), S.getPattern());

        String word = "OOPS";

        // Render banner
        for (int row = 0; row < 7; row++) {

            StringBuilder line = new StringBuilder();

            for (char ch : word.toCharArray()) {
                String[] pattern = patternMap.get(ch);
                line.append(pattern[row]).append("   ");
            }

            System.out.println(line);
        }
    }
}