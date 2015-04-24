/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package game;

import java.awt.Image;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;

public class Hero {
    private String Name = "Player";
    private String Source_NORMAL = "Hero_Normal_32x64.png";
    private String Source_DOWN = "Hero_Down_32x64";
    private String Source_UP = "Hero_Up_32x64";
    private int Zustand = 0;
    


    
    private int x,y;
    private int dx,dy;
    

    
    public Hero() {
        
        
        x = 40;
        y = 460;
    }
    public void move() {
        x += dx;
        y += dy;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public Image getImage() {
        switch(Zustand) {
            case 2:
                ImageIcon Image_Up = new ImageIcon(this.getClass().getResource(Source_UP));
                Image Look_Up = Image_Up.getImage();
                return Look_Up;
            
            case 3: 
                ImageIcon Image_Down = new ImageIcon(this.getClass().getResource(Source_DOWN));
                Image Look_Down = Image_Down.getImage();
                return Look_Down;
                
            default: 
                ImageIcon Image_Normal = new ImageIcon(this.getClass().getResource(Source_NORMAL));
                Image Look_Normal = Image_Normal.getImage();
                return Look_Normal;
        }
        
    }
    public String getName() {
        return Name;
    }
    
    public void keyPressed(KeyEvent e) {

        int key = e.getKeyCode();

        if (key == KeyEvent.VK_LEFT) {
            dx = -1;
        }

        if (key == KeyEvent.VK_RIGHT) {
            dx = 1;
        }

        if (key == KeyEvent.VK_UP) {
            Zustand = 2;
        }

        if (key == KeyEvent.VK_DOWN) {
            Zustand = 3;
        }
    }

    public void keyReleased(KeyEvent e) {
        int key = e.getKeyCode();

        if (key == KeyEvent.VK_LEFT) {
            dx = 0;
        }

        if (key == KeyEvent.VK_RIGHT) {
            dx = 0;
        }

        if (key == KeyEvent.VK_UP) {
            Zustand = 0;
        }

        if (key == KeyEvent.VK_DOWN) {
            Zustand = 0;
        }
    }
    
}
