package Jogo.Model.Musica;

import javax.sound.sampled.*;
import java.io.IOException;
import java.net.URL;

public class Reproduzir {
    public void tocarMusica(String filePath) {
        try {
            URL audioFile = getClass().getResource(filePath);
            if (audioFile == null) {
                throw new IOException("File not found: " + filePath);
            }
            AudioInputStream audioStream = AudioSystem.getAudioInputStream(audioFile);
            Clip clip = AudioSystem.getClip();
            clip.open(audioStream);
            clip.start();
        } catch (UnsupportedAudioFileException | IOException | LineUnavailableException e) {
            e.printStackTrace();
        }
    }
}