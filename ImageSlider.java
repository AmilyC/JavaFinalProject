import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.*;
import java.util.Random;
import javax.swing.JFrame;
import javax.swing.JButton;


public class ImageSlider extends JFrame{
    private JLabel imageLabel;
    private Timer timer;
    private int currentIndex=0;  
    private JButton button;
    private JButton bu;
    static but But = new but();
    static Image image;
    static ImageIcon again;
    static Image img;
    static Image newimg;
    static getout Getout = new getout();
    static int bchoice = 0;
    public int choice = (int)(Math.random()*6)+1;
    public ImageIcon[] images;
    public ImageSlider()throws IOException{
        setResizable(false);

        if(choice==1){
        images = new ImageIcon[20];
        image=ImageIO.read(new File("images/end1/loop (1).bmp"));
        //image = ImageIO.read(new File("zimages/girl_walk1-removebg-preview.png"));
        images[0] = new ImageIcon(image);
        image=ImageIO.read(new File("images/end1/loop (2).bmp"));
        images[1] = new ImageIcon(image);
        image=ImageIO.read(new File("images/end1/loop (3).bmp"));
        images[2] = new ImageIcon(image);
        image=ImageIO.read(new File("images/end1/loop (4).bmp"));
        images[3] = new ImageIcon(image);
        image=ImageIO.read(new File("images/end1/loop (5).bmp"));
        images[4] = new ImageIcon(image); 
        image=ImageIO.read(new File("images/end1/loop (1).bmp"));
        images[5] = new ImageIcon(image);       
        image=ImageIO.read(new File("images/end1/loop (2).bmp"));
        images[6] = new ImageIcon(image);
        image=ImageIO.read(new File("images/end1/loop (3).bmp"));
        images[7] = new ImageIcon(image);
        image=ImageIO.read(new File("images/end1/loop (4).bmp"));
        images[8] = new ImageIcon(image);
        image=ImageIO.read(new File("images/end1/loop (5).bmp"));
        images[9] = new ImageIcon(image); 
        image=ImageIO.read(new File("images/end1/start (1).bmp"));
        images[10] = new ImageIcon(image); 
        image=ImageIO.read(new File("images/end1/start (2).bmp"));
        images[11] = new ImageIcon(image); 
        image=ImageIO.read(new File("images/end1/start (3).bmp"));
        images[12] = new ImageIcon(image); 
        image=ImageIO.read(new File("images/end1/start (4).bmp"));
        images[13] = new ImageIcon(image); 
        image=ImageIO.read(new File("images/end1/start (5).bmp"));
        images[14] = new ImageIcon(image); 
        image=ImageIO.read(new File("images/end1/start (6).bmp"));
        images[15] = new ImageIcon(image); 
        image=ImageIO.read(new File("images/end1/start (7).bmp"));
        images[16] = new ImageIcon(image); 
        image=ImageIO.read(new File("images/end1/start (8).bmp"));
        images[17] = new ImageIcon(image); 
        image=ImageIO.read(new File("images/end1/start (9).bmp"));
        images[18] = new ImageIcon(image); 
        image=ImageIO.read(new File("images/end1/start (10).bmp"));
        images[19] = new ImageIcon(image); 
    }
    if(choice ==2){
            images = new ImageIcon[14];
            image=ImageIO.read(new File("images/end2/loop (1).bmp"));
            images[0] = new ImageIcon(image);
            image=ImageIO.read(new File("images/end2/loop (2).bmp"));
            images[1] = new ImageIcon(image);
            image=ImageIO.read(new File("images/end2/loop (3).bmp"));
            images[2] = new ImageIcon(image);
            image=ImageIO.read(new File("images/end2/loop (4).bmp"));
            images[3] = new ImageIcon(image);
            image=ImageIO.read(new File("images/end2/loop (5).bmp"));
            images[4] = new ImageIcon(image); 
            image=ImageIO.read(new File("images/end2/loop (6).bmp"));
            images[5] = new ImageIcon(image);
            image=ImageIO.read(new File("images/end2/loop (7).bmp"));
            images[6] = new ImageIcon(image);
            image=ImageIO.read(new File("images/end2/loop (8).bmp"));
            images[7] = new ImageIcon(image);
            image=ImageIO.read(new File("images/end2/start (1).bmp"));
            images[8] = new ImageIcon(image); 
            image=ImageIO.read(new File("images/end2/start (2).bmp"));
            images[9] = new ImageIcon(image); 
            image=ImageIO.read(new File("images/end2/start (3).bmp"));
            images[10] = new ImageIcon(image); 
            image=ImageIO.read(new File("images/end2/start (4).bmp"));
            images[11] = new ImageIcon(image); 
            image=ImageIO.read(new File("images/end2/start (5).bmp"));
            images[12] = new ImageIcon(image); 
            image=ImageIO.read(new File("images/end2/start (6).bmp"));
            images[13] = new ImageIcon(image);
    }
    if(choice ==3){
        images = new ImageIcon[12];
        image=ImageIO.read(new File("images/end3/loop (1).bmp"));
        images[0] = new ImageIcon(image);
        image=ImageIO.read(new File("images/end3/loop (2).bmp"));
        images[1] = new ImageIcon(image);
        image=ImageIO.read(new File("images/end3/loop (3).bmp"));
        images[2] = new ImageIcon(image);
        image=ImageIO.read(new File("images/end3/loop (4).bmp"));
        images[3] = new ImageIcon(image);
        image=ImageIO.read(new File("images/end3/loop (5).bmp"));
        images[4] = new ImageIcon(image); 
        image=ImageIO.read(new File("images/end3/loop (6).bmp"));
        images[5] = new ImageIcon(image);
        image=ImageIO.read(new File("images/end3/loop (7).bmp"));
        images[6] = new ImageIcon(image);
        image=ImageIO.read(new File("images/end3/start (1).bmp"));
        images[7] = new ImageIcon(image); 
        image=ImageIO.read(new File("images/end3/start (2).bmp"));
        images[8] = new ImageIcon(image); 
        image=ImageIO.read(new File("images/end3/start (3).bmp"));
        images[9] = new ImageIcon(image); 
        image=ImageIO.read(new File("images/end3/start (4).bmp"));
        images[10] = new ImageIcon(image); 
        image=ImageIO.read(new File("images/end3/start (5).bmp"));
        images[11] = new ImageIcon(image); 
}
if(choice ==4){
    images = new ImageIcon[12];
    image=ImageIO.read(new File("images/end4/loop (1).bmp"));
    images[0] = new ImageIcon(image);
    image=ImageIO.read(new File("images/end4/loop (2).bmp"));
    images[1] = new ImageIcon(image);
    image=ImageIO.read(new File("images/end4/loop (3).bmp"));
    images[2] = new ImageIcon(image);
    image=ImageIO.read(new File("images/end4/loop (4).bmp"));
    images[3] = new ImageIcon(image);
    image=ImageIO.read(new File("images/end4/loop (5).bmp"));
    images[4] = new ImageIcon(image); 
    image=ImageIO.read(new File("images/end4/loop (6).bmp"));
    images[5] = new ImageIcon(image);
    image=ImageIO.read(new File("images/end4/loop (7).bmp"));
    images[6] = new ImageIcon(image);
    image=ImageIO.read(new File("images/end4/start (1).bmp"));
    images[7] = new ImageIcon(image); 
    image=ImageIO.read(new File("images/end4/start (2).bmp"));
    images[8] = new ImageIcon(image); 
    image=ImageIO.read(new File("images/end4/start (3).bmp"));
    images[9] = new ImageIcon(image); 
    image=ImageIO.read(new File("images/end4/start (4).bmp"));
    images[10] = new ImageIcon(image); 
    image=ImageIO.read(new File("images/end4/start (5).bmp"));
    images[11] = new ImageIcon(image); 
}           
if(choice ==5){
    images = new ImageIcon[12];
    image=ImageIO.read(new File("images/end5/loop (1).bmp"));
    images[0] = new ImageIcon(image);
    image=ImageIO.read(new File("images/end5/loop (2).bmp"));
    images[1] = new ImageIcon(image);
    image=ImageIO.read(new File("images/end5/loop (3).bmp"));
    images[2] = new ImageIcon(image);
    image=ImageIO.read(new File("images/end5/loop (4).bmp"));
    images[3] = new ImageIcon(image);
    image=ImageIO.read(new File("images/end5/loop (5).bmp"));
    images[4] = new ImageIcon(image); 
    image=ImageIO.read(new File("images/end5/start (1).bmp"));
    images[5] = new ImageIcon(image);
    image=ImageIO.read(new File("images/end5/start (2).bmp"));
    images[6] = new ImageIcon(image);
    image=ImageIO.read(new File("images/end5/start (3).bmp"));
    images[7] = new ImageIcon(image); 
    image=ImageIO.read(new File("images/end5/start (4).bmp"));
    images[8] = new ImageIcon(image); 
    image=ImageIO.read(new File("images/end5/start (5).bmp"));
    images[9] = new ImageIcon(image); 
    image=ImageIO.read(new File("images/end5/start (6).bmp"));
    images[10] = new ImageIcon(image); 
    image=ImageIO.read(new File("images/end5/start (6).bmp"));
    images[11] = new ImageIcon(image); 
} 
if(choice ==6){
    images = new ImageIcon[6];
    image=ImageIO.read(new File("images/end6/loop (1).bmp"));
    images[0] = new ImageIcon(image);
    image=ImageIO.read(new File("images/end6/loop (2).bmp"));
    images[1] = new ImageIcon(image);
    image=ImageIO.read(new File("images/end6/loop (3).bmp"));
    images[2] = new ImageIcon(image);
    image=ImageIO.read(new File("images/end6/loop (4).bmp"));
    images[3] = new ImageIcon(image);
    image=ImageIO.read(new File("images/end6/loop (5).bmp"));
    images[4] = new ImageIcon(image); 
    image=ImageIO.read(new File("images/end6/start (1).bmp"));
    images[5] = new ImageIcon(image);
}          
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Image Slider");
        setSize(1500, 800);
        imageLabel = new JLabel();
        imageLabel.setBounds(0, 0, 1500, 800);
        getContentPane().add(imageLabel, BorderLayout.CENTER);
        timer = new Timer(200, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                currentIndex++;
                if (currentIndex >= images.length) {
                    currentIndex = 0;
                }
                updateImage();
            }
        });
        
    }

    public void startSlider() {
        currentIndex = 0;
        imageLabel.setIcon(images[0]);
        imageLabel.setBounds(200,200, 1500, 800);
        getContentPane().add(imageLabel);
        updateImage();
        timer.start();
        setVisible(true);
    }


    private void updateImage() {
        //imageLabel.setBounds(0, 0, 600, 400);
        Image image = images[currentIndex].getImage().getScaledInstance(1500, 800, Image.SCALE_SMOOTH);
        ImageIcon imageIcon = new ImageIcon(image);
        imageLabel.setIcon(imageIcon);
    }
    
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                    ImageSlider imageSlider = new ImageSlider();
                    ImageIcon restart = new ImageIcon("images/again.png");
                    img = restart.getImage();
                    newimg = img.getScaledInstance(370, 120, Image.SCALE_SMOOTH );
                    restart = new ImageIcon(newimg);
                    imageSlider.But.reset.setIcon(restart);
                    imageSlider.But.reset.setBorderPainted(false);
                    imageSlider.But.reset.setBounds(180, 650, 600, 150);
                    imageSlider.But.reset.setOpaque(false); // ³]¸m«ö¶s³z©ú
                    imageSlider.add(But.reset);
                    //imageSlider.addMouseListener(imageSlider.But.reset);
                    restart = new ImageIcon("images/exit.png");
                    img = restart.getImage();
                    newimg = img.getScaledInstance(370, 120, Image.SCALE_SMOOTH );
                    restart = new ImageIcon(newimg);
                    imageSlider.Getout.reset.setIcon(restart);
                    imageSlider.Getout.reset.setBorderPainted(false);
                    imageSlider.Getout.reset.setBounds(600, 650, 600, 150);
                    imageSlider.Getout.reset.setOpaque(false); // ³]¸m«ö¶s³z©ú
                    System.out.print(imageSlider.But.x);
                   
                    imageSlider.add(Getout.reset);
                    imageSlider.startSlider();
                
                    } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });}
}
