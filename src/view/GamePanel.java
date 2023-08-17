package view;

import model.inputs.KeyboardInputs;
import model.inputs.MouseInputs;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

public class GamePanel extends JPanel {
    private MouseInputs mouseInputs;//this class will be used in mouseListener and mouseMotionListener
    private float xDelta = 100, yDelta = 100;
    private float xDir = 1f, yDir = 1f; //to bounce rectangle from screen edge, number is speed of direction
    private int frames = 0;
    private long lastCheck = 0; //check for FPS
    private Color color = new Color(150,20,90);
    private Random random;// to randomize color values

    public GamePanel() {
        random = new Random();
        this.mouseInputs = new MouseInputs(this); //initialize the mouse inputs
        addKeyListener(new KeyboardInputs(this));//keyboard inputs are drawn into the panel
        addMouseListener(mouseInputs);// inputs from mouse
        addMouseMotionListener(mouseInputs);
    }

    public void changeXDelta(int value){
        this.xDelta += value;

    }

    public void changeYDelta(int value){
        this.yDelta += value;

    }

    public void setRectPos(int x, int y){
        this.xDelta = x;
        this.yDelta = y;

    }



    public void paintComponent(Graphics g){
        super.paintComponent(g); //calling the superclass of the existing paintComponent
        // this call also cleans the surface to paint a new picture

        updateRectangle();
        g.setColor(color);
        g.fillRect((int)xDelta, (int) yDelta,200,50); //position and size of the rectangle
    }

    public void updateRectangle(){
        xDelta += xDir;

        if(xDelta > 300 || xDelta < 1){ //if value is at the edge of the screen it will reverse direction
            xDir *= -1;//times negative value to reverse the direction
            color = getRndColor();
        }

        yDelta += yDir;

        if(yDelta > 300 || yDelta < 1){
            yDir *= -1;
            color = getRndColor();
        }
    }

    public Color getRndColor(){
        int r = random.nextInt(255);//returns between including 0 - 255 as to the values for color parameters
        int g = random.nextInt(255);
        int b = random.nextInt(255);
        return new Color(r,g,b);
    }


}
