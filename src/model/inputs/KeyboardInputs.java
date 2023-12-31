package model.inputs;

import view.GamePanel;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyboardInputs implements KeyListener {

    private GamePanel gamePanel;

    public KeyboardInputs(GamePanel gamePanel){
        this.gamePanel = gamePanel;// this is so keyboard inputs can change attributes in the game panel
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyReleased(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        switch (e.getKeyCode()) {
            case KeyEvent.VK_W -> gamePanel.changeYDelta(-5);
            case KeyEvent.VK_A -> gamePanel.changeXDelta(-5);
            case KeyEvent.VK_S -> gamePanel.changeYDelta(5);
            case KeyEvent.VK_D -> gamePanel.changeXDelta(5);
        }

    }

}
