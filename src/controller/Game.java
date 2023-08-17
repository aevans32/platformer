package controller;

import view.GamePanel;
import view.GameWindow;

public class Game implements Runnable{

    private GameWindow gameWindow;
    private GamePanel gamePanel;
    private Thread gameThread;
    private final int FPS_SET = 120;//how many FPS we want to run

    public Game (){
        this.gamePanel = new GamePanel();
        this.gameWindow = new GameWindow(gamePanel);
        gamePanel.requestFocus();//this takes the inputs' logic
        startGameLoop();
    }

    // start the thread-loop
    private void startGameLoop(){
        gameThread = new Thread(this);
        gameThread.start();
    }

    @Override
    public void run() {

        double timePerFrame = 1000000000.0/FPS_SET; //double more precise than float. how long we want frames to last in nanoseconds
        long lastFrame = System.nanoTime(); //nanoTime() returns a long type
        long now = System.nanoTime();

        int frames = 0;
        long lastCheck = System.currentTimeMillis();

        while(true){
            now = System.nanoTime();
            if(now - lastFrame >= timePerFrame){
                gamePanel.repaint();
                lastFrame = now;
                frames ++;
            }



            // Old Game Loop
            if (System.currentTimeMillis() - lastCheck >= 1000){
                lastCheck = System.currentTimeMillis();
                System.out.println("FPS: " + frames);
                frames = 0;//resetting frames for elapsed since last time check
            }



        }
    }


}
