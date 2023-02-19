
// Author: Abdulrahman Alblooshi


// imported javafx

import java.util.Random;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.TextAlignment;
import javafx.stage.Stage;
import javafx.util.Duration;


public class Pong{

    // variables
    private static final int WIDTH = 800;
    private static final int HEIGHT = 600;
    private static final int PADDLE_WIDTH = 25;
    private static final int PADDLE_HEIGHT = 100;
    private static final int BALL_SIZE = 20;
    private static final int BALLX_SPEED = 5;
    private static final int BALLY_SPEED = 5;
    private double PADDLE_Y = HEIGHT / 2 - PADDLE_HEIGHT / 2;
    private double AI_Y = HEIGHT / 2 - PADDLE_HEIGHT / 2;
    private double BALL_X = WIDTH / 2 - BALL_SIZE / 2;
    private double BALL_Y = HEIGHT / 2 - BALL_SIZE / 2;
    private int playerScore = 0;
    private int aiScore = 0;
    private boolean gameStarted = false;
    private int playerX = 0;
    private int aiX = WIDTH - PADDLE_WIDTH;

    public void start (Stage stage) throws Exception {

        // Game Window
        stage.setTitle("Pong");
        Canvas canvas = new Canvas(WIDTH, HEIGHT);
        GraphicsContext gc = canvas.getGraphicsContext2D();
        Timeline timeline = new Timeline(new KeyFrame(Duration.millis(10), e -> run(gc)));
        timeline.setCycleCount(Timeline.INDEFINITE);
        
        
    }
}