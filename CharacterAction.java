import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import javax.swing.*;

public class CharacterAction {
    public imagePath charData = new imagePath();// use for take every character's things
    public List<Character> manCharacters= new ArrayList<>();// store man character;
    public List<Character> girlChracters= new ArrayList<>();
    Timer timer1;
    Timer timer2;

    public CharacterAction() {

        timer1 = new Timer(2000, new ActionListener() {
            int index;

            @Override
            public void actionPerformed(ActionEvent e) {
                // random a new character to the list
                Character tmp;
                if ((int) (Math.random() * 2) == 1) {
                    index = (new Random()).nextInt(charData.people.size());
                    System.out.println("random a new character! index is : "+index);
                    if (charData.people.get(index).character == 0 || charData.people.get(index).character == 1) {// is
                                                                                                                 // boy
                                                                                                                 // character
                        tmp = charData.people.get(index);
                        // tmp.chaLabel.setIcon(charData);
                        if (tmp.direction == 0) {// to left
                            tmp.chaLabel.setIcon(charData.imagesL[tmp.character][0]);
                        } else {
                            tmp.chaLabel.setIcon(charData.imagesR[tmp.character][0]);
                        }
                        manCharacters.add(tmp);

                    } else {
                        tmp = charData.people.get(index);
                        // tmp.chaLabel.setIcon(charData);
                        if (tmp.direction == 0) {// to left
                            tmp.chaLabel.setIcon(charData.imagesL[tmp.character][0]);
                        } else {// to right
                            tmp.chaLabel.setIcon(charData.imagesR[tmp.character][0]);
                        }
                        girlChracters.add(tmp);

                    }
                }

            }

        });
        timer1.start();

        timer2 = new Timer(80, new ActionListener() {
            Character tmp;

            @Override
            public void actionPerformed(ActionEvent e) {
                // chage the position of each character in the list
                for (int i = 0; i < manCharacters.size(); ++i) {
                    if (manCharacters.get(i).x > 1600 || manCharacters.get(i).x < -30) {// get over the bouundry
                       // System.out.println("remove one");
                        //manCharacters.remove(i);
                        break;
                    } else {
                        tmp = manCharacters.get(i);
                        if (tmp.direction == 0) {
                            // to left;
                            tmp.x -= 30;
                            tmp.imgIndex = (tmp.imgIndex + 1) % (charData.imagesL[tmp.character].length);
                        } else {// to right;
                            tmp.x += 30;
                            tmp.imgIndex = (tmp.imgIndex + 1) % (charData.imagesR[tmp.character].length);
                        }

                        manCharacters.set(i, tmp);

                    }
                }
                for (int i = 0; i < girlChracters.size(); ++i) {
                    if (girlChracters.get(i).x > 1500 || girlChracters.get(i).x < 0) {// get over the bouundry
                        girlChracters.remove(i);
                    } else {
                        tmp = girlChracters.get(i);
                        if (tmp.direction == 0) {
                            // to left;
                            tmp.x -= 30;

                            tmp.imgIndex = (tmp.imgIndex + 1) % (charData.imagesL[tmp.character].length);
                            tmp.chaLabel.setIcon(charData.imagesL[tmp.character][tmp.imgIndex]);
                        } else {// to right;
                            tmp.x += 30;
                            tmp.imgIndex = (tmp.imgIndex + 1) % (charData.imagesR[tmp.character].length);
                            tmp.chaLabel.setIcon(charData.imagesR[tmp.character][tmp.imgIndex]);
                        }

                        girlChracters.set(i, tmp);

                    }
                }

            }

        });
        timer2.start();

    }

}
