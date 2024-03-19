import java.io.*;

import java.util.ArrayList;
import java.util.List;

import javax.swing.ImageIcon;

public class imagePath {
    // �n��images �q�o�̮�
    public ImageIcon[][] imagesR = { { new ImageIcon("zimages/man/right/normalMan__2 (5).png"),
            new ImageIcon("zimages/man/right/normalMan__2 (4).png"),
            new ImageIcon("zimages/man/right/normalMan__2 (3).png"),
            new ImageIcon("zimages/man/right/normalMan__2 (2).png"),
            new ImageIcon("zimages/man/right/normalMan__2 (1).png") },
            { new ImageIcon("zimages/specialman/right/specialMan (1).png"),
                    new ImageIcon("zimages/specialman/right/specialMan (2).png"),
                    new ImageIcon("zimages/specialman/right/specialMan (3).png"),
                    new ImageIcon("zimages/specialman/right/specialMan (4).png"),
                    new ImageIcon("zimages/specialman/right/specialMan (5).png"),
                    new ImageIcon("zimages/specialman/right/specialMan (6).png"),
                    new ImageIcon("zimages/specialman/right/specialMan (7).png") },
            {       new ImageIcon("zimages/girl/right/normalGirl (1).png"),
                    new ImageIcon("zimages/girl/right/normalGirl (2).png"),
                    new ImageIcon("zimages/girl/right/normalGirl (3).png"),
                    new ImageIcon("zimages/girl/right/normalGirl (4).png"),
                    new ImageIcon("zimages/girl/right/normalGirl (5).png") },
            {       new ImageIcon("zimages/specialgirl/right/specialGirl (1).png"),
                    new ImageIcon("zimages/specialgirl/right/specialGirl (2).png"),
                    new ImageIcon("zimages/specialgirl/right/specialGirl (3).png"),
                    new ImageIcon("zimages/specialgirl/right/specialGirl (4).png"),
                    new ImageIcon("zimages/specialgirl/right/specialGirl (5).png") } };// �񩹥k�����H���}��Ϥ�
    public ImageIcon[][] imagesL = { 
          { new ImageIcon("zimages/man/right/normalMan__1 (5).png"),
            new ImageIcon("zimages/man/right/normalMan__1 (4).png"),
            new ImageIcon("zimages/man/right/normalMan__1 (3).png"),
            new ImageIcon("zimages/man/right/normalMan__1 (2).png"),
            new ImageIcon("zimages/man/right/normalMan__1 (1).png") },
          { new ImageIcon("zimages/specialman/left/specialMan (1).png"),
            new ImageIcon("zimages/specialman/left/specialMan (2).png"),
            new ImageIcon("zimages/specialman/left/specialMan (3).png"),
            new ImageIcon("zimages/specialman/left/specialMan (4).png"),
            new ImageIcon("zimages/specialman/left/specialMan (5).png"),
            new ImageIcon("zimages/specialman/left/specialMan (6).png"),
            new ImageIcon("zimages/specialman/left/specialMan (7).png")
            },
          { new ImageIcon("zimages/girl/left/normalGirl (1).png"),
            new ImageIcon("zimages/girl/left/normalGirl (2).png"),
            new ImageIcon("zimages/girl/left/normalGirl (3).png"),
            new ImageIcon("zimages/girl/left/normalGirl (4).png"),
            new ImageIcon("zimages/girl/left/normalGirl (5).png") },
            { new ImageIcon("zimages/specialgirl/left/specialGirl (1).png"),
                    new ImageIcon("zimages/specialgirl/left/specialGirl (2).png"),
                    new ImageIcon("zimages/specialgirl/left/specialGirl (3).png"),
                    new ImageIcon("zimages/specialgirl/left/specialGirl (4).png"),
                    new ImageIcon("zimages/specialgirl/left/specialGirl (5).png") } };// �񩹥������H���}��Ϥ�

    // �ncharacter ����Ƥ]�q�o��Ū���A��z���}��}�C
    public List<Character> people;// store �@�Ǹ}���l��m
    public Character tmp;
    public imagePath() {// top(0)/mid(1)/btm(2),0(normalMan)/1(specialMan)/2(normalGirl)/3(specialGirl),x,0/1(direction),type,imageIcon's
                        // Index--->character.txt
        try (
            BufferedReader reader = new BufferedReader(new FileReader("character.txt"))) {
            String line;
            people = new ArrayList<>();
            while ((line = reader.readLine()) != null) {
                tmp = new Character(0, 0, 0, 0, 0);
                String[] data = line.split(",");
                tmp.pos = Integer.parseInt(data[0]);
                tmp.character = Integer.parseInt(data[1]);
                tmp.hp = Integer.parseInt(data[2]);
                tmp.direction = Integer.parseInt(data[3]);
                tmp.type = Integer.parseInt(data[4]);
                people.add(tmp);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
