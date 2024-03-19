import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Timer;
import java.util.TimerTask;
import javax.imageio.ImageIO;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class plus extends JFrame {
    public JButton startButton;
    public CardLayout cardLayout;
    public JPanel cardPanel;
    public Timer timer;
	public int currentGroupIndex = 0;//�C���I�������ϲռ�(�@����)
    public int currentBackgroundIndex = 0;//�C���I��������(�C�դ��P)
	public int maingirlindex = 0;//�k�D���Ϥ�index //BackgroundPanel
	public int normalgirl_1index = 0;//�@��k��1�Ϥ�index //BackgroundPanel
	public int normalgirl_2index = 0;//�@��k��2�Ϥ�index //BackgroundPanel
	public int normalgirl_1X = 0;//�@��k��1 X�b��m
	public int normalgirl_2X = 0;//�@��k��2 X�b��m
	public boolean normalgirlMovingLeft = false;
	public boolean timerEnabled = true;
    public static entry b = new entry();
	//public JFrame frame = new JFrame();
    public String[][] backgroundImagePaths = {//�C�������I����
        {
            "./initial/images/init/intro1 (1).bmp" ,"./initial/images/init/intro1 (2).bmp" ,"./initial/images/init/intro1 (3).bmp",
			"./initial/images/init/intro1 (4).bmp" ,"./initial/images/init/intro1 (5).bmp" ,"./initial/images/init/intro1 (6).bmp",
			"./initial/images/init/intro1 (7).bmp" ,"./initial/images/init/intro1 (8).bmp" ,"./initial/images/init/intro1 (9).bmp",
			"./initial/images/init/intro1 (10).bmp","./initial/images/init/intro1 (11).bmp","./initial/images/init/intro1 (12).bmp",
			"./initial/images/init/intro1 (13).bmp","./initial/images/init/intro1 (14).bmp","./initial/images/init/intro1 (15).bmp",
			"./initial/images/init/intro1 (16).bmp","./initial/images/init/intro1 (17).bmp","./initial/images/init/intro1 (18).bmp",
			"./initial/images/init/intro1 (19).bmp","./initial/images/init/intro1 (20).bmp","./initial/images/init/intro1 (21).bmp",
			"./initial/images/init/intro1 (22).bmp","./initial/images/init/intro1 (23).bmp","./initial/images/init/intro1 (24).bmp",
			"./initial/images/init/intro1 (25).bmp","./initial/images/init/intro1 (26).bmp","./initial/images/init/intro1 (27).bmp",
			"./initial/images/init/intro1 (28).bmp"
        },
        {
            "./initial/images/init/intro2 (1).bmp" ,"./initial/images/init/intro2 (2).bmp" ,"./initial/images/init/intro2 (3).bmp",
			"./initial/images/init/intro2 (4).bmp" ,"./initial/images/init/intro2 (5).bmp" ,"./initial/images/init/intro2 (6).bmp",
			"./initial/images/init/intro2 (7).bmp" ,"./initial/images/init/intro2 (8).bmp" ,"./initial/images/init/intro2 (9).bmp",
			"./initial/images/init/intro2 (10).bmp","./initial/images/init/intro2 (11).bmp","./initial/images/init/intro2 (12).bmp",
			"./initial/images/init/intro2 (13).bmp","./initial/images/init/intro2 (14).bmp","./initial/images/init/intro2 (15).bmp",
			"./initial/images/init/intro2 (16).bmp","./initial/images/init/intro2 (17).bmp","./initial/images/init/intro2 (18).bmp",
			"./initial/images/init/intro2 (19).bmp","./initial/images/init/intro2 (20).bmp","./initial/images/init/intro2 (21).bmp",
			"./initial/images/init/intro2 (22).bmp"
        },
        {
            "./initial/images/init/intro3 (1).bmp" ,"./initial/images/init/intro3 (2).bmp" ,"./initial/images/init/intro3 (3).bmp",
			"./initial/images/init/intro3 (4).bmp" ,"./initial/images/init/intro3 (5).bmp" ,"./initial/images/init/intro3 (6).bmp",
			"./initial/images/init/intro3 (7).bmp" ,"./initial/images/init/intro3 (8).bmp" ,"./initial/images/init/intro3 (9).bmp",
			"./initial/images/init/intro3 (10).bmp","./initial/images/init/intro3 (11).bmp","./initial/images/init/intro3 (12).bmp",
			"./initial/images/init/intro3 (13).bmp","./initial/images/init/intro3 (14).bmp"
        },
        {
            "./initial/images/init/intro4 (1).bmp","./initial/images/init/intro4 (2).bmp","./initial/images/init/intro4 (3).bmp",
            "./initial/images/init/intro4 (4).bmp","./initial/images/init/intro4 (5).bmp"
        },
        {
            "./initial/images/init/intro5 (1).bmp" ,"./initial/images/init/intro5 (2).bmp" ,"./initial/images/init/intro5 (3).bmp",
			"./initial/images/init/intro5 (4).bmp" ,"./initial/images/init/intro5 (5).bmp" ,"./initial/images/init/intro5 (6).bmp",
			"./initial/images/init/intro5 (7).bmp" ,"./initial/images/init/intro5 (8).bmp" ,"./initial/images/init/intro5 (9).bmp",
			"./initial/images/init/intro5 (10).bmp","./initial/images/init/intro5 (11).bmp","./initial/images/init/intro5 (12).bmp",
			"./initial/images/init/intro5 (13).bmp","./initial/images/init/intro5 (14).bmp","./initial/images/init/intro5 (15).bmp"
        }
    };
	
	public String[][] maingirl={//�k�D���Ϥ�
	
		{"./initial/images/Maingirl/right/girl_walk (1).bmp","./initial/images/Maingirl/right/girl_walk (2).bmp","./initial/images/Maingirl/right/girl_walk (3).bmp",
		"./initial/images/Maingirl/right/girl_walk (4).bmp","./initial/images/Maingirl/right/girl_walk (5).bmp","./initial/images/Maingirl/right/girl_walk (6).bmp",
		"./initial/images/Maingirl/right/girl_walk (7).bmp"}
		
	};
	
	public String[][] normalgirl_1={//�@��k��1�Ϥ�
		{"./initial/images/normalGirl_1/normalGirl_1 (1).bmp","./initial/images/normalGirl_1/normalGirl_1 (2).bmp","./initial/images/normalGirl_1/normalGirl_1 (3).bmp",
	"./initial/images/normalGirl_1/normalGirl_1 (4).bmp","./initial/images/normalGirl_1/normalGirl_1 (5).bmp"}
		
	};
	public String[][] normalgirl_2={//�@��k��2�Ϥ�
		{"./initial/images/normalGirl_2/normalGirl_2 (1).bmp","./initial/images/normalGirl_2/normalGirl_2 (2).bmp","./initial/images/normalGirl_2/normalGirl_2 (3).bmp",
	"./initial/images/normalGirl_2/normalGirl_2 (4).bmp","./initial/images/normalGirl_2/normalGirl_2 (5).bmp"}
		
	};
    

    public plus() {
        setTitle("Game");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(1500, 800);
        setLocationRelativeTo(null);

        cardPanel = new JPanel();
        cardLayout = new CardLayout();
        cardPanel.setLayout(cardLayout);

        JPanel initialPanel = createInitialPanel();
        cardPanel.add(initialPanel, "InitialPanel");

        JPanel gamePanel = createGamePanel();
        cardPanel.add(gamePanel, "GamePanel");

        cardLayout.show(cardPanel, "InitialPanel");

        setContentPane(cardPanel);
    }
	
	//�C����l�e�����k�ĭ̩M�̤W�h�Ϥ�
	class BackgroundPanel extends JPanel {
    public BufferedImage bottomBackgroundImage;
    public int currentX = 0;
	public boolean normalgirlMovingLeft = false;

    public void setBottomBackgroundImage(BufferedImage image) {
        this.bottomBackgroundImage = image;
    }

    
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		if (bottomBackgroundImage != null) {
			int panelWidth = getWidth();
			int panelHeight = getHeight();

			int backgroundX = currentX % bottomBackgroundImage.getWidth();

			if (backgroundX > 0) {
				g.drawImage(bottomBackgroundImage, backgroundX - bottomBackgroundImage.getWidth(), 0, panelWidth, panelHeight, this);
        }

        g.drawImage(bottomBackgroundImage, backgroundX, 0, panelWidth, panelHeight, this);

        if (backgroundX + panelWidth < bottomBackgroundImage.getWidth()) {
            g.drawImage(bottomBackgroundImage, backgroundX + bottomBackgroundImage.getWidth(), 0, panelWidth, panelHeight, this);
        }
		
		
    }

   // ø�s�k�D��
	try {
        BufferedImage maingirlImage = ImageIO.read(new File(maingirl[0][maingirlindex]));
        g.drawImage(maingirlImage, 180, 290, 150 ,300, this);
    } catch (IOException e) {
        e.printStackTrace();
    }
	// ø�s�@��k��
	try {
        BufferedImage normalgirl_1Image = ImageIO.read(new File(normalgirl_1[0][normalgirl_1index]));
        g.drawImage(normalgirl_1Image, normalgirl_1X, 230, 150 ,300, this);
		
    } catch (IOException e) {
        e.printStackTrace();
    }
	// ø�s�@��k��
	try {
        BufferedImage normalgirl_2Image = ImageIO.read(new File(normalgirl_2[0][normalgirl_2index]));
        g.drawImage(normalgirl_2Image, normalgirl_2X, 290, 150 ,300, this);
    } catch (IOException e) {
        e.printStackTrace();
    }
	// ø�s�̤W�h����
    try {
        BufferedImage topBackgroundImage = ImageIO.read(new File("./initial/images/init/initScreen2.bmp"));
        g.drawImage(topBackgroundImage, 0, 0, getWidth(), getHeight(), this);
    } catch (IOException e) {
        e.printStackTrace();
    }
}


    public int getCurrentX() {
        return currentX;
    }

    public void setCurrentX(int x) {
        this.currentX = x;
    }
	
	
}


	//�C����l�e��
	public JPanel createInitialPanel() {
    BackgroundPanel panel = new BackgroundPanel();
    maingirlindex = 0;
	normalgirl_1index = 0;
	normalgirl_2index = 0;
    try {
        BufferedImage bottomBackgroundImage = ImageIO.read(new File("./initial/images/init/map.bmp"));
        panel.setBottomBackgroundImage(bottomBackgroundImage);
    } catch (IOException e) {
        e.printStackTrace();
    }

    panel.setLayout(null);

    JButton startButton = new JButton();
    startButton.setBounds(550, 620, 355, 120);

    try {
        Image iconImage = ImageIO.read(new File("./initial/images/button (1).bmp"));
        startButton.setIcon(new ImageIcon(iconImage));
    } catch (IOException e) {
        e.printStackTrace();
    }

    startButton.setDisabledIcon(startButton.getIcon());
    startButton.setDisabledSelectedIcon(startButton.getIcon());
    startButton.setContentAreaFilled(false);
    startButton.setBorderPainted(false);

    startButton.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            cardLayout.show(cardPanel, "GamePanel");
        }
    });

    panel.add(startButton);

    // �s�W���ϲ��ʪ��p�ɾ�
    Timer backgroundTimer = new Timer();
    Timer maingirlTimer = new Timer();
	Timer normalgirlTimer = new Timer();
    backgroundTimer.schedule(new TimerTask() {
        @Override
        public void run() {
            int currentX = panel.getCurrentX();
            panel.setCurrentX(currentX - 1); // ����ϩ������ʪ��t�סA�i�H�ھڻݨD�վ�
            panel.repaint();
        }
    }, 10, 10);

    maingirlTimer.schedule(new TimerTask() {
        @Override
        public void run() {
            maingirlindex = (maingirlindex + 1) % maingirl[0].length; 
            panel.repaint();
        }
    }, 200, 200); // ����k�D�����ʪ��t��.
	
	normalgirlTimer.schedule(new TimerTask() {
        @Override
        public void run() {
			normalgirl_1X = 1100;
			normalgirl_2X = 1300;
			if (normalgirlMovingLeft) {
				normalgirl_1index = (normalgirl_1index + 1) % normalgirl_1[0].length;
                normalgirl_2index = (normalgirl_2index + 1) % normalgirl_2[0].length;
				
				normalgirl_1X -= 10; // ����normalgirl�V�����ʪ��t��
                if (normalgirl_1X <= 600) { // �W�X�e�������normalgirl���Ϥ��M��V
                    normalgirlMovingLeft = false;
                    normalgirl_1index = 0; // ������V��A�q�Ĥ@�i�Ϥ��}�l
                }
				normalgirl_2X -= 10; // ����normalgirl�V�����ʪ��t�סA�i�H�ھڻݨD�վ�
                if (normalgirl_2X <= 600) { // �W�X�e�������normalgirl���Ϥ��M��V
                    normalgirlMovingLeft = false;
                    normalgirl_2index = 0; // ������V��A�q�Ĥ@�i�Ϥ��}�l
                }
            }
			else {
                normalgirl_1X += 10; // ����normalgirl�V�k���ʪ��t�סA�i�H�ھڻݨD�վ�
                if (normalgirl_1X >= 1200) { // �W�X�e�������normalgirl���Ϥ��M��V
                    normalgirlMovingLeft = true;
                    normalgirl_1index = 0; // ������V��A�q�Ĥ@�i�Ϥ��}�l
                }
				normalgirl_2X += 10; // ����normalgirl�V�k���ʪ��t�סA�i�H�ھڻݨD�վ�
                if (normalgirl_2X >= 1200) { // �W�X�e�������normalgirl���Ϥ��M��V
                    normalgirlMovingLeft = true;
                    normalgirl_2index = 0; // ������V��A�q�Ĥ@�i�Ϥ��}�l
                }
            }

            panel.repaint();
        }
    }, 200, 200);

    return panel;
}



	//�C������
    public JPanel createGamePanel() {
        JPanel panel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                try {
                    BufferedImage backgroundImage = ImageIO.read(new File(backgroundImagePaths[currentGroupIndex][currentBackgroundIndex]));
                    g.drawImage(backgroundImage, 0, 0, getWidth(), getHeight(), this);
                } catch (IOException e) {
                    e.printStackTrace();
                }
			
			}
        };
		
        panel.setLayout(null);

        JButton startButton = new JButton();
		startButton.setOpaque(false);
		startButton.setContentAreaFilled(false);
		startButton.setBorderPainted(false);
		startButton.setBounds(570, 660, 350, 93);
		
		JButton nextButton = new JButton();
		nextButton.setOpaque(false);
		nextButton.setContentAreaFilled(false);
		nextButton.setBorderPainted(false);
		nextButton.setBounds(1350, 380, 80, 109);
		
		JButton beforeButton = new JButton();
        beforeButton.setOpaque(false);
		beforeButton.setContentAreaFilled(false);
		beforeButton.setBorderPainted(false);
		beforeButton.setBounds(70, 380, 80, 109);
		
		JButton voiceButton = new JButton();
		voiceButton.setOpaque(false);
		voiceButton.setContentAreaFilled(false);
		voiceButton.setBorderPainted(false);
		voiceButton.setBounds(1200, 660, 90, 90);

        try { //���s�Ϥ��A�ثe�S�\�]���I���N���F
            Image iconImage = ImageIO.read(new File("./initial/images/button (1).bmp"));
            startButton.setIcon(new ImageIcon(iconImage));
			//Image before=ImageIO.read(new File("./initial/images/init/before.bmp"));
			//beforeButton.setIcon(new ImageIcon(before));
			//Image next=ImageIO.read(new File("./initial/images/init/next.bmp"));
			//nextButton.setIcon(new ImageIcon(next));
		} catch (IOException e) {
            e.printStackTrace();
        }
        startButton.setDisabledIcon(startButton.getIcon());
        startButton.setDisabledSelectedIcon(startButton.getIcon());
        startButton.setContentAreaFilled(false);
        startButton.setBorderPainted(false);
		
		beforeButton.setDisabledIcon(beforeButton.getIcon());
        beforeButton.setDisabledSelectedIcon(beforeButton.getIcon());
        beforeButton.setContentAreaFilled(false);
        beforeButton.setBorderPainted(false);

		nextButton.setDisabledIcon(nextButton.getIcon());
        nextButton.setDisabledSelectedIcon(nextButton.getIcon());
        nextButton.setContentAreaFilled(false);
        nextButton.setBorderPainted(false);
		
        nextButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
				int temp = currentGroupIndex + 1;
				currentBackgroundIndex = 0;
				if(temp>4){
					currentGroupIndex = (currentGroupIndex) % backgroundImagePaths.length;
				}
				else{
                currentGroupIndex = (currentGroupIndex + 1) % backgroundImagePaths.length;
				}
                timer.cancel();
                panel.repaint();
                String[] currentGroup = backgroundImagePaths[currentGroupIndex];
                timer = new Timer();
                timer.schedule(new TimerTask() {
                    @Override
                    public void run() {
						
                        currentBackgroundIndex = (currentBackgroundIndex + 1) % currentGroup.length;
                        panel.repaint();
                    }
                }, 250, 250);
                timerEnabled = true;
            }
        });
		beforeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
				currentBackgroundIndex = 0;
                currentGroupIndex = (currentGroupIndex -1) % backgroundImagePaths.length;
				if(currentGroupIndex < 0){
					currentGroupIndex = (currentGroupIndex +1) % backgroundImagePaths.length;
				}
				timer.cancel();
                panel.repaint();
                String[] currentGroup = backgroundImagePaths[currentGroupIndex];
                timer = new Timer();
                timer.schedule(new TimerTask() {
                    @Override
                    public void run() {
						
                        currentBackgroundIndex = (currentBackgroundIndex +1) % currentGroup.length;
                        panel.repaint();
                    }
                }, 250, 250);
                timerEnabled = true;
            }
        });
		
        startButton.addActionListener(new ActionListener(){
			@Override
            public void actionPerformed(ActionEvent e) {
                JFrame frame = (JFrame) SwingUtilities.getWindowAncestor(startButton);  // 獲取原始視窗
                System.out.print("5");
                frame.getContentPane().removeAll();  // 清除原始視窗的內容
                try {
                    gameMap otherFrame = new gameMap();
                    frame.setContentPane(otherFrame.getContentPane());  // 將另一個視窗的內容設置為原始視窗的內容
                    frame.revalidate();  // 重新驗證視窗
                } catch (IOException e1) {
                    e1.printStackTrace();

                }  // 創建另一個視窗的實例
                //frame.pack();  // 調整視窗大小以適應新的內容
    }});
    
        /*voiceButton.addActionListener(new ActionListener(){
			@Override
			//�����R��or���n
			
		});*/
		panel.add(voiceButton);
		panel.add(startButton);
		panel.add(nextButton);
        panel.add(beforeButton);
        setContentPane(panel);

        timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                if (timerEnabled) {
                    currentBackgroundIndex = (currentBackgroundIndex + 1) % backgroundImagePaths[currentGroupIndex].length;
                    panel.repaint();
                }
            }
        }, 250, 250);

        return panel;
    }
    public static void openOtherFrame(JFrame e){
        plus Plus = new plus();
            Plus.setVisible(true);
        
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
                plus Plus = new plus();
                    //Plus.b.reset.setBorderPainted(false);
                    //Plus.b.reset.setBounds(180, 650, 600, 150);
                    //Plus.b.reset.setOpaque(false); // 設置按鈕透明
                    //Plus.add(b.reset);
                    Plus.setVisible(true);
        });
    }
}
