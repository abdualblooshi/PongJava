
// Author: Abdulrahman Alblooshi

import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;


public class Pong extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Pong");
        GamePanel gamePanel = new GamePanel();
        primaryStage.setScene(new Scene(gamePanel, 500, 500));
        primaryStage.show();
    }

}