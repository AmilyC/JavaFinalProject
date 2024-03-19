import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class AudioPlayer {
    public static Clip clip;

    public static void AudioPlayer() {
        try {
            // ???????????�?
            AudioInputStream audioInputStream = AudioSystem
                    .getAudioInputStream(AudioPlayer.class.getResourceAsStream("game.wav"));

            // ?建�???????
            clip = AudioSystem.getClip();

            // ????????????并�???????�?
            clip.open(audioInputStream);

            // ?置循???��??
            clip.loop(Clip.LOOP_CONTINUOUSLY);

            // ??��?��???
            clip.start();

            // �?�????�?任�??????止�?��??
            // System.in.read();

            // ???止�?��?�并?????????????????�?
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