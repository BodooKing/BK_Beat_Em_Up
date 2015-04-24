/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package game;

import javax.swing.JFrame;

/**
 *
 * @author Bodoo_000
 */
public class Game{
    public static void main(String[] arg) {
       JFrame Fenster = new JFrame();
        Fenster.add(new Board());

        Fenster.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Fenster.setSize(800, 600);
        Fenster.setLocationRelativeTo(null);
        Fenster.setTitle("Test");
        Fenster.setResizable(false);
        Fenster.setVisible(true);
    }
}
