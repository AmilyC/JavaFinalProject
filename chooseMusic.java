import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class chooseMusic {
    public static Clip clip;
    public static AudioInputStream audioInputStream;

    public static void chooseMusic(String str) {
        int a = Integer.parseInt(str);
        if (a < 3000) {
            try {
                audioInputStream = AudioSystem.getAudioInputStream(begin.class.getResourceAsStream("end1.wav"));
                clip = AudioSystem.getClip();
                clip.open(audioInputStream);
                // clip.loop(Clip.LOOP_CONTINUOUSLY);//
                clip.start();
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else if (a >= 3000 && a < 6000) {
            try {
                audioInputStream = AudioSystem.getAudioInputStream(begin.class.getResourceAsStream("end2.wav"));
                clip = AudioSystem.getClip();
                clip.open(audioInputStream);
                // clip.loop(Clip.LOOP_CONTINUOUSLY);//
                clip.start();
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else if (a >= 6000 && a < 9000) {
            try {
                audioInputStream = AudioSystem.getAudioInputStream(begin.class.getResourceAsStream("end3.wav"));
                clip = AudioSystem.getClip();
                clip.open(audioInputStream);
                // clip.loop(Clip.LOOP_CONTINUOUSLY);//
                clip.start();
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else if (a >= 9000 && a < 13000) {
            try {
                audioInputStream = AudioSystem.getAudioInputStream(begin.class.getResourceAsStream("end4.wav"));
                clip = AudioSystem.getClip();
                clip.open(audioInputStream);
                // clip.loop(Clip.LOOP_CONTINUOUSLY);//
                clip.start();
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else if (a >= 13000) {
            try {
                audioInputStream = AudioSystem.getAudioInputStream(begin.class.getResourceAsStream("end5.wav"));
                clip = AudioSystem.getClip();
                clip.open(audioInputStream);
                // clip.loop(Clip.LOOP_CONTINUOUSLY);//
                clip.start();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public static void stop() {
        clip.stop();
        clip.close();

    }
}

/*
 * public static void begin() {
 * try {
 * 
 * AudioInputStream audioInputStream =
 * AudioSystem.getAudioInputStream(begin.class.getResourceAsStream("init.wav"));
 * 
 * 
 * clip = AudioSystem.getClip();
 * 
 * 
 * clip.open(audioInputStream);
 * 
 * 
 * clip.loop(Clip.LOOP_CONTINUOUSLY);//
 * 
 * 
 * clip.start();
 * 
 * 
 * //System.in.read();
 * 
 * 
 * //clip.stop();
 * //clip.close();
 * audioInputStream.close();
 * } catch (Exception e) {
 * e.printStackTrace();
 * }
 * }
 * public static void stopBackgroundMusic() {
 * if (clip != null && clip.isRunning()) {
 * clip.stop();
 * clip.close();
 * }
 * }
 */