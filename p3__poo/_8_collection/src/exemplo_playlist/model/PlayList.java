package exemplo_playlist.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class PlayList {

    private List<Musica> musicas;
    private String nome;

    public PlayList(String nome){
        this.nome = nome;
        musicas = new ArrayList<>();
    }

    //TODO: Criar métodos para remover, atualizar músicas...
    public boolean adicionarMusica(Musica musica){
        return musicas.add(musica);
    }

    public List<Musica> getMusicas() {
        return musicas;
    }

    public void embaralharPlaylist(){
        Collections.shuffle(musicas);
    }

    public void ordenarPorAno(){
        Collections.sort(musicas, Comparator.comparing(Musica :: getAno));
    }

    //TODO: Criar outras opções de ordenação

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "PlayList{" +
                "musicas=" + musicas +
                ", nome='" + nome + '\'' +
                '}';
    }
}