import bagel.*;

public class StartScreen {
    private final static String GAME_TITLE = "SHADOW DANCE";
    private final static int TITLE_X = 220;
    private final static int TITLE_Y = 250;
    private final static String INSTRUCTION = "SELECT LEVELS WITH\nNUMBER KEYS";
    private final static int INSTRUCTION_X = 320;
    private final static int INSTRUCTION_Y = 440;
    private final static String LEVEL_1 = "1";
    private final static String LEVEL_2 = "2";
    private final static String LEVEL_3 = "3";
    private final static String FONT_FILE = "res/FSO8BITR.TTF";
    private final static Font TITLE_FONT = new Font(FONT_FILE,64);
    private final static Font INSTRUCTION_FONT = new Font(FONT_FILE, 24);


    public static void render() {
        TITLE_FONT.drawString(GAME_TITLE, TITLE_X, TITLE_Y);
        INSTRUCTION_FONT.drawString(INSTRUCTION, INSTRUCTION_X, INSTRUCTION_Y);
        INSTRUCTION_FONT.drawString(LEVEL_1, INSTRUCTION_X + 45 , INSTRUCTION_Y + 80);
        INSTRUCTION_FONT.drawString(LEVEL_2, INSTRUCTION_X + 150 , INSTRUCTION_Y + 80);
        INSTRUCTION_FONT.drawString(LEVEL_3, INSTRUCTION_X + 255 , INSTRUCTION_Y + 80);
    }


    public class EndScreen extends StartScreen {
        public static void render() {
            System.out.println(1);
        }

    }
}
