package exemplo_playlist.view;

import exemplo_playlist.model.*;

public class App {
    public static void main(String[] args) {
        PlayList playList = new PlayList("Playlist muito doida");

        playList.adicionarMusica(new Musica("Fade To Black", "Metallica", 1984));
    }
}
