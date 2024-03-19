/*import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ImageSwitcher extends JFrame {
    public JLabel label;
    public ImageIcon[] images;
    public  int currentIndex = 0;

    public ImageSwitcher() {
        // ?置窗口??
        setTitle("Image Switcher");

        // 初始化?片??
        images = new ImageIcon[3];
        images[0] = new ImageIcon("images/girl_walk1.jpg");
        images[1] = new ImageIcon("images/girl_walk2.jpg");
        images[2] = new ImageIcon("images/girl_walk3.jpg");

        // ?建??并?置初始?像
        label = new JLabel(images[currentIndex]);

        // 添加??到窗口
        getContentPane().add(label, BorderLayout.CENTER);

        // 添加鼠???事件?听器
        label.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                // 切?到下一??像
                currentIndex = (currentIndex + 1) % images.length;
                label.setIcon(images[currentIndex]);
            }
        });

        // ?置窗口大小并?示
        setSize(400, 400);
        setVisible(true);
    }

    public static void main(String[] args) {
        new ImageSwitcher();
    }
}*/
/* 
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

public class ImageSwitcher extends JFrame {
    public JLabel label;
    public ImageIcon[] images;
    public int currentIndex = 0;
    JFrame frame = new JFrame("Moving Background Example");
    public ImageSwitcher() {
        // ?置窗口??

        // 初始化?片??
        images = new ImageIcon[3];
        images[0] = new ImageIcon("images/girl_walk1.jpg");
        images[1] = new ImageIcon("images/girl_walk2.jpg");
        images[2] = new ImageIcon("images/girl_walk3.jpg");

        // ?建??并?置初始?像
        label = new JLabel(images[currentIndex]);

        // 添加??到窗口
        getContentPane().add(label, BorderLayout.CENTER);

        // ?建定?器
        Timer timer = new Timer(100, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // 切?到下一??像
                currentIndex = (currentIndex + 1) % images.length;
                label.setIcon(images[currentIndex]);
            }
        });
        timer.start();

        // ?置窗口大小并?示
        frame.setSize(400, 400);
        frame.setVisible(true);
    }
    public static void main(String args[]){
        ImageIcon image = new ImageIcon("images/bg002.jpg");
        JFrame frame = new JFrame();
        JLabel label = new JLabel();
        
          label.setSize(400, 300);
          label.setHorizontalTextPosition(JLabel.CENTER);
          label.setVerticalTextPosition(JLabel.TOP);
          frame.setIconImage(image.getImage());
          frame.setTitle("????大作??");
          frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
          frame.setSize(1000,800);
        frame.setVisible(true);
        frame.add(label);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

      }
}*/
/*
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ImageSwitcher extends JFrame {
    public JLabel label;
    public ImageIcon[] images;
    public int currentIndex = 0;

    public ImageSwitcher() {
        // 初始化?片??
        images = new ImageIcon[7];
        images[0] = new ImageIcon("test/images/forcing.jpg");
        images[1] = new ImageIcon("test/images/girl_walk2.jpg");
        images[2] = new ImageIcon("test/images/girl_walk3.jpg");
        images[3] = new ImageIcon("test/images/girl_walk4.jpg");
        images[4] = new ImageIcon("test/images/girl_walk5.jpg");
        images[5] = new ImageIcon("test/images/girl_walk6.jpg");
        images[6] = new ImageIcon("test/images/girl_walk7.jpg");

        // ?建??并?置初始?像
        label = new JLabel(images[currentIndex]);

        // 添加??到窗口
        getContentPane().add(label, BorderLayout.CENTER);

        // ?建定?器
        Timer timer = new Timer(80, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // 切?到下一??像
                currentIndex = (currentIndex + 1) % images.length;
                label.setIcon(images[currentIndex]);
            }
        });
        timer.start();

        // ?置窗口大小并?示
        setSize(1000, 900);
        setVisible(true);
    }

    public static void main(String[] args) {
        new ImageSwitcher();
    }
}
*/
/* import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

public class Bgmoving{
  public static void main(String[] args) {
    JFrame frame = new JFrame("Moving Background Example");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    JPanel panel = new JPanel() {
     public Image backgroundImage;
    public  int x = 0;

      {
        try {
          backgroundImage = ImageIO.read(getClass().getResource("images/map1.jpg"));
        } catch (IOException e) {
          e.printStackTrace();
        }

        Timer timer = new Timer(20, new ActionListener() {
          @Override
          public void actionPerformed(ActionEvent e) {
            x = x-3;
            if (x < -backgroundImage.getWidth(null)) {
              x = 0;
            }
            repaint();
          }
        });
        timer.start();
      }

      @Override
      public Dimension getPreferredSize() {
        return new Dimension(backgroundImage.getWidth(null), backgroundImage.getHeight(null));
      }

      @Override
      public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(backgroundImage, x, 0, null);
      }
    };
    frame.getContentPane().add(panel);
    frame.pack();
    frame.setVisible(true);
  }
}*/


//import javax.naming.TimeLimitExceededException;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
//import java.awt.event.MouseListener
import java.io.*;
//import java.util.HashSet;
//import java.util.LinkedList;
//import java.util.concurrent.TimeUnit;
//import java.util.concurrent.TimeoutException;
import javax.imageio.ImageIO;

public class ImageSwitcher extends gameMap {
  public JLabel label;
  public ImageIcon[] images;
  static Image image;
  public ImageIcon[] imagesL;
  public int currentIndex = 0;
  public int currentIndexleft = 0;
  public int beforeX = 650;// record the mouse position before so that we can judge if it is left or right
  public static boolean rightFlag = true;
  // public boysWalk boys = new boysWalk();
  public int boysSizeBefore = 0;
  JLabel boyLabel;
  public CharacterAction myCharacter = new CharacterAction();

  // public LinkedList<boysWalk> boys = new LinkedList<boysWalk>();
  // public boysWalk ManWalk =new boysWalk();
  public ImageSwitcher() throws IOException {
    // ??m??????????
    // setTitle("Image Changer");
    images = new ImageIcon[7];
    // ????????????????????
    image=ImageIO.read(new File("zimages/girl_walk1-removebg-preview.png"));
    //images[0] = new ImageIcon("zimages/girl_walk1-removebg-preview.png");
    images[0] = new ImageIcon(image);
    image=ImageIO.read(new File("zimages/girl_walk2-removebg-preview.png"));
    images[1] = new ImageIcon(image);
    image=ImageIO.read(new File("zimages/girl_walk3-removebg-preview.png"));
    images[2] = new ImageIcon(image);
    image=ImageIO.read(new File("zimages/girl_walk4-removebg-preview.png"));
    images[3] = new ImageIcon(image);
    image=ImageIO.read(new File("zimages/girl_walk5-removebg-preview.png"));
    images[4] = new ImageIcon(image);
    image=ImageIO.read(new File("zimages/girl_walk6-removebg-preview.png"));
    images[5] = new ImageIcon(image);
    image=ImageIO.read(new File("zimages/girl_walk7-removebg-preview.png"));
    images[6] = new ImageIcon(image);
/*
    images[1] = new ImageIcon("zimages/girl_walk2-removebg-preview.png");
    images[2] = new ImageIcon("zimages/girl_walk3-removebg-preview.png");
    images[3] = new ImageIcon("zimages/girl_walk4-removebg-preview.png");
    images[4] = new ImageIcon("zimages/girl_walk5-removebg-preview.png");
    images[5] = new ImageIcon("zimages/girl_walk6-removebg-preview.png");
    images[6] = new ImageIcon("zimages/girl_walk7-removebg-preview.png");
*/
    imagesL = new ImageIcon[7];
    image=ImageIO.read(new File("zimages/girl_walkleft(7).png"));
    imagesL[0] = new ImageIcon(image);
    image=ImageIO.read(new File("zimages/girl_walkleft(6).png"));
    imagesL[1] = new ImageIcon(image);
    image=ImageIO.read(new File("zimages/girl_walkleft(5).png"));
    imagesL[2] = new ImageIcon(image);
    image=ImageIO.read(new File("zimages/girl_walkleft(4).png"));
    imagesL[3] = new ImageIcon(image);
    image=ImageIO.read(new File("zimages/girl_walkleft(3).png"));
    imagesL[4] = new ImageIcon(image);
    image=ImageIO.read(new File("zimages/girl_walkleft(2).png"));
    imagesL[5] = new ImageIcon(image);
    image=ImageIO.read(new File("zimages/girl_walkleft(1).png"));
    imagesL[6] = new ImageIcon(image);
    /*imagesL[0] = new ImageIcon("zimages/girl_walkleft(7).png");
    imagesL[1] = new ImageIcon("zimages/girl_walkleft(6).png");
    imagesL[2] = new ImageIcon("zimages/girl_walkleft(5).png");
    imagesL[3] = new ImageIcon("zimages/girl_walkleft(4).png");
    imagesL[4] = new ImageIcon("zimages/girl_walkleft(3).png");
    imagesL[5] = new ImageIcon("zimages/girl_walkleft(2).png");
    imagesL[6] = new ImageIcon("zimages/girl_walkleft(1).png");
*/
    // ??????????}??m???????????
    label = new JLabel(images[currentIndex]);
    // label.setLocation(50, 40);
    label.setBounds(getWidth() / 2 - 50, 250, 165, 300);
    getContentPane().add(label);

    // getContentPane().add(boys.label[0]);// add man Walk to the graphic
    /* test */
    // System.out.println("boys size : " + boys.Man.size());
    // boysSizeBefore = boys.Man.size();

    // ??????????????
    Timer timer = new Timer(80, new ActionListener() {

      @Override
      public void actionPerformed(ActionEvent e) {
        // ??????????????????????
        JLabel j = new JLabel();
        Point p = new Point();
        int x, y;
        if (rightFlag) {
          currentIndex = (currentIndex + 1) % images.length;
          label.setIcon(images[currentIndex]);
          // boys.boysx+=30;// boys move

          // repaint();
        } else {
          currentIndexleft = (currentIndexleft + 1) % imagesL.length;
          label.setIcon(imagesL[currentIndexleft]);
          // boys.boysx-=30;
        } // test
          // for (int i = 0; i < boys.Man.size(); ++i) {
          // p.x=boys.placeRMan.get(i).x+30;
          // p.y=boys.placeRMan.get(i).y;
          // boys.placeRMan.set(i,p);
          // boyLabel = boys.Man.get(i);
          // boyLabel.setBounds(boys.placeRMan.get(i).x, boys.placeRMan.get(i).y, 100,
          // 300);
          // //System.out.println(boyLabel);

        // }

        // boys.label[0].setBounds(boys.boysx, boys.boysy, 100, 300);
        // Update the positions of characters in myCharacter on the panel
        for (Character character : myCharacter.manCharacters) {
          character.chaLabel.setBounds(character.x, character.y, 165, 300); // Update the label's bounds on the panel
          System.out.println("set a chracter:"+character.x);
          
          
        }
        for (Character character : myCharacter.girlChracters) {
          character.chaLabel.setBounds(character.x, character.y, 165, 300); // Update the label's bounds on the panel
          System.out.println("set a chracter:" + character.x);
        }

      }

    });

    timer.start();

    Timer timer1 = new Timer(2000, new ActionListener() {

      @Override
      public void actionPerformed(ActionEvent e) {
        // ??????????????????????
        // test
        // HashSet<Point> occupiedPositions = new HashSet<>();

        /*
         * for (int i = 0; i < boys.Man.size(); ++i) {
         * JLabel j = boys.Man.get(i);
         * Point originalPosition = boys.placeRMan.get(i);
         * Point newPosition = new Point(originalPosition.x + 40, originalPosition.y);
         * 
         * while (occupiedPositions.contains(newPosition)) {
         * newPosition.x += 40;
         * }
         * 
         * occupiedPositions.add(newPosition);
         * 
         * j.setBounds(newPosition.x, newPosition.y, 100, 300);
         * boys.placeRMan.set(i, newPosition);
         * boys.Man.set(i, j);
         * 
         * getContentPane().add(boys.Man.get(i));
         * }
         * Point p = new Point();
         * JLabel j = new JLabel();
         * 
         * 
         * }
         */
        // ??dmanCharacters????????O?_?w??K?[???O?
        for (Character character : myCharacter.manCharacters) {
          boolean isAdded = false;
          Component[] components = getComponents();
          for (Component component : components) {
            if (component instanceof JLabel && component == character.chaLabel) {
              isAdded = true;
              break;
            }
          }
          if (!isAdded) {
            // The character's label has not been added to the panel
            // Perform the necessary actions
            System.out.println("add one");
            //System.out.println(character.chaLabel);
            character.chaLabel.setBounds(character.x, character.y, 165, 300);
            getContentPane().add(character.chaLabel);
          }
        }

        // ??dgirlCharacters????????O?_?w??K?[???O?
        for (Character character : myCharacter.girlChracters) {
          boolean isAdded = false;
          Component[] components = getComponents();
          for (Component component : components) {
            if (component instanceof JLabel && component == character.chaLabel) {
              isAdded = true;
              break;
            }
          }
          if (!isAdded) {
            character.chaLabel.setBounds(character.x, character.y, 165, 300);
            System.out.println("add one");
            System.out.println(character.chaLabel);
            getContentPane().add(character.chaLabel);
            // The character's label has not been added to the panel
            // Perform the necessary actions
          }
        }

      }
    });

    timer1.start();

    setLayout(null);
    setVisible(true);

    // mouseEventHandler undone
    addMouseListener(new MouseAdapter() {

    });
    addMouseMotionListener(new MouseMotionAdapter() {
      // unfinished
      // Rectangle dirtyRegion;
      // ?p?G????V?k????

      // ?n?O?W?@?B??????y??-> ?P?_??????[??k
      @Override
      public void mouseMoved(MouseEvent e) {
        int x = e.getX();
        if (x > beforeX) {
          rightFlag = true;
          // boys.rightFlag=true;
        } else {
          rightFlag = false;
          // boys.rightFlag=false;
        }
        beforeX = x;
        repaint();
        // mouseX = x;
      }

    });

  }

}
