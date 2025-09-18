package exemplo_playlist.model;

import java.util.*;

public class Musica {

    private String nome;
    private String artista;
    private int ano;

    public Musica(String nome, String artista, int ano) {
        this.nome = nome;
        this.artista = artista;
        this.ano = ano;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    @Override
    public String toString() {
        return "Musica{" +
                "nome='" + nome + '\'' +
                ", artista='" + artista + '\'' +
                ", ano=" + ano +
                '}';
    }
}