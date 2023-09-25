import bagel.*;
import bagel.util.Point;

import java.io.BufferedReader;
import java.io.FileReader;

/**
 * Skeleton Code for SWEN20003 Project 2, Semester 2, 2023
 * Please enter your name below
 * @author Thanh Long Nguyen 1341857
 */
public class ShadowDance extends AbstractGame  {
    private final static int WINDOW_WIDTH = 1024;
    private final static int WINDOW_HEIGHT = 768;

    private final static String GAME_TITLE = "SHADOW DANCE";

    private final Image BACKGROUND_IMAGE = new Image("res/background.png");
    private final static String FONT_FILE = "res/FSO8BITR.TTF";


    private final static String LEVEL_1_CSV_FILE = "res/level1.csv";
    private final static String LEVEL_2_CSV_FILE = "res/level2.csv";
    private final static String LEVEL_3_CSV_FILE = "res/level3.csv";

    private boolean started = false;
    private boolean paused = false;
    private boolean finished = false;


    public ShadowDance(){
        super(WINDOW_WIDTH, WINDOW_HEIGHT, GAME_TITLE);
    }

    /**+
     * Method used to read file and create objects (you can change
     * this method as you wish).
     */
    private void readCSV() {

    }

    /**
     * The entry point for the program.
     */
    public static void main(String[] args) {
        ShadowDance game = new ShadowDance();
        game.run();

    }

    /**
     * Performs a state update.
     * Allows the game to exit when the escape key is pressed.
     */
    @Override
    protected void update(Input input) {

        if (input.wasPressed(Keys.ESCAPE)){
            Window.close();
        }
        BACKGROUND_IMAGE.draw(Window.getWidth()/2.0, Window.getHeight()/2.0);

        if (!started) {
            StartScreen.render();

            if (input.wasPressed(Keys.NUM_1) || input.wasPressed(Keys.NUM_2) || input.wasPressed(Keys.NUM_3)) {
                started = true;
            }
//        } else if (finished) {
//
        } else {
//            BACKGROUND_IMAGE.draw(Window.getWidth()/2.0, Window.getHeight()/2.0);
            StartScreen.EndScreen.render();
        }

    }

    private Point centerMessage(String message, Font font) {
        // Get the dimensions of the window
        int windowWidth = Window.getWidth();
        int windowHeight = Window.getHeight();

        // Calculate the width of the message using the specified font
        double messageWidth = font.getWidth(message);

        // Calculate the X and Y coordinates to center the message
        double x = (windowWidth - messageWidth) / 2.0;
        double y = windowHeight / 2.0;

        return new Point(x, y);
    }

}
