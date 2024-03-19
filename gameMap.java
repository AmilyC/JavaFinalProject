

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import javax.imageio.*;
import java.io.*;
import java.awt.Graphics;

public class gameMap extends JFrame{

    public gameMap() throws IOException {
        // setTitle("background image");
        setSize(1500, 800);
        // setLocationRelativeTo(null);
       

        // setLayout(new BorderLayout());
        JPanel backgroundJPanel = new JPanel() {// use for background image running
            public Image backgroundImage;
            public int x1 = 0;
            public int x2 = 0;

            {
                try {
                    backgroundImage = ImageIO.read(new File("zimages/map1.bmp"));
                } catch (IOException e) {
                    e.printStackTrace();
                }

                Timer timer = new Timer(20, new ActionListener() {

                    @Override
                    public void actionPerformed(ActionEvent e) {
                        if (ImageSwitcher.rightFlag) {
                            x1 = x1 - 3;
                            if (x1 <= -backgroundImage.getWidth(null)) {
                                x1 = 0;
                            }
                        } else {
                            x2 = x2 + 3;
                            if (x2 >= backgroundImage.getWidth(null)) {
                                x2 = 0;
                            }
                        }

                        repaint();
                    }
                });
                timer.start();
            }

            @Override
            public void paintComponent(Graphics g) {
                super.paintComponent(g);

                // g.drawImage(backgroundImage, x, 0, null);
                if (ImageSwitcher.rightFlag) {
                    g.drawImage(backgroundImage, x1, 0, null);
                    if (x1 + backgroundImage.getWidth(null) < getWidth()) {// if image is not enough
                        g.drawImage(backgroundImage, x1 + backgroundImage.getWidth(null), 0, null);

                    }
                } else {
                    g.drawImage(backgroundImage, x2 - backgroundImage.getWidth(null), 0, null);
                    if (x2 < getWidth()) {// if image is not enough
                        g.drawImage(backgroundImage, x2, 0, null);

                    }
                }

            }
        };
        // setContentPane(background);
        setContentPane(backgroundJPanel);
       // pack();
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
    public static void main(){
        plus Plus = new plus();
        Plus.setVisible(true);
        System.out.print("sucess");
    }
}
