import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class begin {
    public static Clip clip;

    public static void begin() {
        try {
            
            AudioInputStream audioInputStream = AudioSystem
                    .getAudioInputStream(begin.class.getResourceAsStream("init.wav"));

            
            clip = AudioSystem.getClip();

            
            clip.open(audioInputStream);

            
            clip.loop(Clip.LOOP_CONTINUOUSLY);//

            
            audioInputStream.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void stopBackgroundMusic() {
        if (clip != null && clip.isRunning()) {
            clip.stop();
            clip.close();
        }
    }

}