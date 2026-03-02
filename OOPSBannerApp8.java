import java.util.HashMap;
import java.util.Map;

public class OOPSBannerApp8 {

    public static void main(String[] args) {

        Map<Character, String[]> patternMap = initializePatterns();

        String word = "OOPS";

        renderBanner(word, patternMap);
    }

    // Initialize all character patterns
    private static Map<Character, String[]> initializePatterns() {

        Map<Character, String[]> map = new HashMap<>();

        map.put('O', new String[]{
                " ***** ",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                " ***** "
        });

        map.put('P', new String[]{
                " ***** ",
                "*     *",
                " ***** ",
                "*      ",
                "*      ",
                "*      ",
                "*      "
        });

        map.put('S', new String[]{
                " ***** ",
                "*      ",
                " ***** ",
                "      *",
                "      *",
                "*     *",
                " ***** "
        });

        return map;
    }

    // Render banner dynamically
    private static void renderBanner(String word, Map<Character, String[]> patternMap) {

        int height = 7; // number of rows in each character

        for (int row = 0; row < height; row++) {

            StringBuilder line = new StringBuilder();

            for (char ch : word.toCharArray()) {

                String[] pattern = patternMap.get(ch);

                if (pattern != null) {
                    line.append(pattern[row]).append("   ");
                }
            }

            System.out.println(line);
        }
    }
}