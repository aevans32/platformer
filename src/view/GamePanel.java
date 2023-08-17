package view;

import model.inputs.KeyboardInputs;
import model.inputs.MouseInputs;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class GamePanel extends JPanel {
    private MouseInputs mouseInputs;//this class will be used in mouseListener and mouseMotionListener
    private int xDelta = 100, yDelta = 100;

    public GamePanel() {
        this.mouseInputs = new MouseInputs(this); //initialize the mouse inputs
        addKeyListener(new KeyboardInputs(this));//keyboard inputs are drawn into the panel
        addMouseListener(mouseInputs);// inputs from mouse
        addMouseMotionListener(mouseInputs);
    }

    public void changeXDelta(int value){
        this.xDelta += value;
        repaint(); // repaint the game panel after an input to give impression of movement
    }

    public void changeYDelta(int value){
        this.yDelta += value;
        repaint();
    }

    public void setRectPos(int x, int y){
        this.xDelta = x;
        this.yDelta = y;
        repaint();
    }



    public void paintComponent(Graphics g){
        super.paintComponent(g); //calling the superclass of the existing paintComponent
        // this call also cleans the surface to paint a new picture
        g.fillRect(xDelta, yDelta,200,50); //position and size of the rectangle
    }


}
