package controller;

import view.GamePanel;
import view.GameWindow;

public class Game {

    private GameWindow gameWindow;
    private GamePanel gamePanel;

    public Game (){
        this.gamePanel = new GamePanel();
        this.gameWindow = new GameWindow(gamePanel);


    }

}
