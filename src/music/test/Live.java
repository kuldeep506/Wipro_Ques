package music.test;

import music.Playable;
import music.string.Veena;
import music.wind.Saxophone;

public class Live {
    public static void main(String[] arg) {
        Playable veena = new Veena();
        veena.play();

        Playable saxophone = new Saxophone();
        saxophone.play();
    }
}
