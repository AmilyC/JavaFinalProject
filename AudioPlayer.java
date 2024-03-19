import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class AudioPlayer {
    public static Clip clip;

    public static void AudioPlayer() {
        try {
            // ???????????ä»?
            AudioInputStream audioInputStream = AudioSystem
                    .getAudioInputStream(AudioPlayer.class.getResourceAsStream("game.wav"));

            // ?å»ºé???????
            clip = AudioSystem.getClip();

            // ????????????å¹¶å???????æµ?
            clip.open(audioInputStream);

            // ?ç½®å¾ª???­æ??
            clip.loop(Clip.LOOP_CONTINUOUSLY);

            // ??­æ?¾é???
            clip.start();

            // ç­?å¾????ä¸?ä»»æ??????æ­¢æ?­æ??
            // System.in.read();

            // ???æ­¢æ?­æ?¾å¹¶?????????????????æµ?
            // clip.stop();
            // clip.close();
            audioInputStream.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public static void stop() {
        if (clip != null && clip.isRunning()) {
            clip.stop();
            clip.close();
        }
    }
}