package game;

import java.awt.Image;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;

public class Hero {
    private String Name = "Player"; //TODO: show name in uppper left corner
    private String Source_NORMAL = "/Images/Hero_Normal_32x64.png";
    private String Source_DOWN = "/Images/Hero_Down_32x64.png";
    private String Source_UP = "/Images/Hero_Up_32x64.png";
    private int Zustand = 0; //2 = UP, 3=DOWN
    


    
    private int x,y;
    private int dx,dy;
    

    
    public Hero() {
        
        
        x = 40; //Startlocation
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
        try {
            switch(Zustand) {
                case 2:
                    ImageIcon Image_Up = new ImageIcon(this.getClass().getResource(Source_UP));
                    Image Look_Up = Image_Up.getImage(); //Load Image an return
                    return Look_Up;

                case 3: 
                    ImageIcon Image_Down = new ImageIcon(this.getClass().getResource(Source_DOWN));
                    Image Look_Down = Image_Down.getImage(); //Load Image an return
                    return Look_Down;

                default: 
                    ImageIcon Image_Normal = new ImageIcon(this.getClass().getResource(Source_NORMAL));
                    Image Look_Normal = Image_Normal.getImage(); //Load Image an return
                    return Look_Normal;
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
            return null;
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

    public void keyReleased(KeyEvent e) { //Return normal Statement
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
