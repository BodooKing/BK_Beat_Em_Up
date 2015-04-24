/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package game;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JPanel;
import javax.swing.Timer;

public class Board extends JPanel implements ActionListener{

    private Timer timer;
    private Hero BodooKing;

    public Board() {

        addKeyListener(new TAdapter());
        setFocusable(true);
        setBackground(Color.BLACK);
        setDoubleBuffered(true);

        BodooKing = new Hero();

        timer = new Timer(5, this);
        timer.start();
    }


    public void paint(Graphics g) {
        super.paint(g);

        Graphics2D g2d = (Graphics2D)g;
        g2d.drawImage(BodooKing.getImage(), BodooKing.getX(), BodooKing.getY(), this);

        Toolkit.getDefaultToolkit().sync();
        g.dispose();
    }


    public void actionPerformed(ActionEvent e) {
        BodooKing.move();
        repaint();  
    }


    private class TAdapter extends KeyAdapter {

        public void keyReleased(KeyEvent e) {
            BodooKing.keyReleased(e);
        }

        public void keyPressed(KeyEvent e) {
            BodooKing.keyPressed(e);
        }
    }

    
}