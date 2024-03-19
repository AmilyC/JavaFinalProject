import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
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
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;

public class but{
    public JButton reset;
    static ImageIcon again;
    static Image img;
    static Image newimg;
    public static boolean x = false;
    public but(){ 
        reset = new JButton();
        //reset.setBounds(185, 670, 250, 70);
        again = new ImageIcon("images/again_hover.png");
        img = again.getImage();
        newimg = img.getScaledInstance(370, 110, Image.SCALE_SMOOTH );
        again = new ImageIcon(newimg);
        reset.setIcon(again);
        reset.setContentAreaFilled(false);
        reset.setBorderPainted(false);
        Border emptyBorder = new EmptyBorder(0, 0, 0, 0); // 建立空的邊框
        reset.setBorder(emptyBorder); // 設置按鈕邊框為空的邊框
        reset.setOpaque(false); // 設置按鈕透明

        reset.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                JFrame frame = (JFrame) SwingUtilities.getWindowAncestor(reset);  // 獲取原始視窗
                frame.getContentPane().removeAll();  // 清除原始視窗的內容
            
                plus otherFrame = new plus();  // 創建另一個視窗的實例
                frame.setContentPane(otherFrame.getContentPane());  // 將另一個視窗的內容設置為原始視窗的內容
                //frame.pack();  // 調整視窗大小以適應新的內容
                frame.revalidate();  // 重新驗證視窗
                
               
            }

            @Override
            public void mousePressed(MouseEvent e) {
                // 按下事件
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                // 釋放事件
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                // 進入事件
                again = new ImageIcon("images/again_hover.png");
                img = again.getImage();
                newimg = img.getScaledInstance(370, 110, Image.SCALE_SMOOTH );
                again = new ImageIcon(newimg);
                // reset.setIcon(new ImageIcon("images/again_hover.png")); // 更改按鈕圖片
                reset.setIcon(again); // 更改按鈕圖片
                reset.setBorderPainted(false);
                reset.setOpaque(false); // 設置按鈕透明

            }
        

            @Override
            public void mouseExited(MouseEvent e) {
                again = new ImageIcon("images/again.png");
                img = again.getImage();
                newimg = img.getScaledInstance(370, 110, Image.SCALE_SMOOTH );
                again = new ImageIcon(newimg);
                //reset.setIcon(new ImageIcon("images/again.png")); // 更改按鈕圖片
                reset.setIcon(again); // 更改按鈕圖片
                reset.setBorderPainted(false);
                reset.setOpaque(false); // 設置按鈕透明

            }
        });
    }
}
