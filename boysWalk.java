
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
//import java.awt.event.MouseListener
import java.io.*;
import java.util.LinkedList;

public class boysWalk {
  public  JLabel[] label = new JLabel[3];
  public ImageIcon[] images;
  public ImageIcon[] imagesL;
  public int currentIndex = 0;
  public int currentIndexleft = 0;
  public int beforeX = 650;// record the mouse position before so that we can judge if it is left or right
  public boolean rightFlag = true;
  public int boysx = 66;
  public int boysy = 250;
  // ??m??????????
  // setTitle("Image Changer");
  public String pathLeft = "zimages/man/left/normalMan__1 ";
  public String pathRigth = "zimages/man/right/normalMan__2 ";
  public  LinkedList<JLabel> Man = new LinkedList<JLabel>();// list that store the boys we generate
  public  LinkedList<Integer> currentIndexRMan = new LinkedList<Integer>();// store left to right's man's currentIndex
  public  LinkedList<Point> placeRMan = new LinkedList<Point>();// store left to right's man's place(top, middle, bottom)
                                                               // and x y position;

  public boysWalk() throws IOException {
    // ??m??????????
    // setTitle("Image Changer");
    // ????????????????????
    Man.clear();
    currentIndexRMan.clear();
    placeRMan.clear();
    images = new ImageIcon[5];
    images[0] = new ImageIcon(pathRigth + "(5).png");
    images[1] = new ImageIcon(pathRigth + "(4).png");
    images[2] = new ImageIcon(pathRigth + "(3).png");
    images[3] = new ImageIcon(pathRigth + "(2).png");
    images[4] = new ImageIcon(pathRigth + "(1).png");

    imagesL = new ImageIcon[5];
    imagesL[0] = new ImageIcon(pathLeft + "(5).png");
    imagesL[1] = new ImageIcon(pathLeft + "(4).png");
    imagesL[2] = new ImageIcon(pathLeft + "(3).png");
    imagesL[3] = new ImageIcon(pathLeft + "(2).png");
    imagesL[4] = new ImageIcon(pathLeft + "(1).png");

    // ??????????}??m???????????
    label[0] = new JLabel(images[currentIndex]);

    // label.setLocation(50, 40);
    // label.setBounds(getWidth() / 2 - 100, 250, 165, 300);
    // getContentPane().add(label);
    // getContentPane().add(label, BorderLayout.CENTER);

    // ??????????????
    Timer timer = new Timer(80, new ActionListener() {

      @Override
      public void actionPerformed(ActionEvent e) {
        // ??????????????????????
        Point p = new Point();
        JLabel j = new JLabel();
        for (int i = 0; i < Man.size(); ++i) {

          p = placeRMan.get(i);
          // p.x += 30;//test
          if (p.x > 1450) {
            System.out.print("remove one man");
            placeRMan.remove(i);
            currentIndexRMan.remove(i);
            Man.remove(i);
            //i=i-1;
          } else {
            //placeRMan.set(i, p);
            currentIndexRMan.set(i, (currentIndexRMan.get(i) + 1) % images.length);// change to next picture
            j = Man.get(i);
            j.setIcon(images[currentIndexRMan.get(i)]);
            Man.set(i, j);// test
          }

        }
        if (rightFlag) {
          currentIndex = (currentIndex + 1) % images.length;
          label[0].setIcon(images[currentIndex]);

        } else {
          currentIndexleft = (currentIndexleft + 1) % imagesL.length;
          label[0].setIcon(imagesL[currentIndexleft]);

        }

      }

    });
    timer.start();

    Timer timer1 = new Timer(5000, new ActionListener() {

      @Override
      public void actionPerformed(ActionEvent e) {
        // ??????????????????????
        int placeToR;
        int cur = 0;
        Point p = new Point();
        JLabel j=new JLabel();
        for (int i = 0; i < 1; i++) {// i represent top, middle ,bottom
          placeToR = (int) (Math.random() * 2);// choose if top, middle,bottom, need to generate new boys
          if (placeToR == 1) {// need to add Boys;
            System.out.println("generate one man");
            System.out.println(Man.size());
            currentIndexRMan.add(cur);
            j.setIcon(images[cur]);
            Man.add(j);
            p.x = 0;
            p.y = 200;//test
            placeRMan.add(p);
          }
        }

      }

    });
    timer1.start();

    // setLayout(null);
    // setVisible(true);

    // mouseEventHandler undone
    // addMouseListener(new MouseAdapter() {

    // });
    // addMouseMotionListener(new MouseMotionAdapter() {
    // // unfinished
    // // Rectangle dirtyRegion;
    // // �p�G�ƹ��V�k����

    // // �n�O�W�@�B���ƹ��y��-> �P�_�����Ω��k
    // @Override
    // public void mouseMoved(MouseEvent e) {
    // int x = e.getX();
    // if (x > beforeX) {
    // rightFlag = true;
    // } else {
    // rightFlag = false;
    // }
    // beforeX = x;
    // repaint();
    // // mouseX = x;
    // }
    // });

  }

}
