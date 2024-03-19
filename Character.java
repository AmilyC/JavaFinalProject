import java.util.LinkedList;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Character {
    public int hp; // start ?q?O?H???
    public int direction; // ????V
    public int pos;
    public int character;// ????i??:??????k??random ???: ???????F?? ?j??? ?????o??????
    public int type;
    public int x;// character's position
    public int y;// character's position
    public int imgIndex;// count for change image;
    public JLabel chaLabel = new JLabel();

    // public Random random = new Random();// ?H??????}??
    // public LinkedList<Character> = new LinkedList<Integer>();
    // ??y?@?? character ?qtxt ???random??J
    public Character(int pos, int character, int hp, int direction, int type) {
        this.type = type;
        this.pos = pos;
        this.character = character;
        this.direction = direction;
        this.hp = hp;
        imgIndex = 0;
        y = 66 * pos + 66;
        if (direction == 0) {// 0 ?O?V????
            x = 1450;
        } else {
            x = 0;
        }
    }

    // Getter and setter methods
    // ...

    public void move() {

    }
}
