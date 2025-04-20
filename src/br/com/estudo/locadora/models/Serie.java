package br.com.estudo.locadora.models;

public class Serie extends Titulo {
    private int QtdeEpisodios;
    private int QtdeTemporadas;
    private int DuracaoEpisodio;

    public int getQtdeTemporadas() {
        return QtdeTemporadas;
    }

    public void setQtdeTemporadas(int qtdeTemporadas) {
        QtdeTemporadas = qtdeTemporadas;
    }

    public int getQtdeEpisodios() {
        return QtdeEpisodios;
    }

    public void setQtdeEpisodios(int qtdeEpisodios) {
        QtdeEpisodios = qtdeEpisodios;
    }

    public int getDuracaoEpisodio() {
        return DuracaoEpisodio;
    }

    public void setDuracaoEpisodio(int duracaoEpisodio) {
        DuracaoEpisodio = duracaoEpisodio;
    }

    public int calculaDuracaoTemporada() {
        return QtdeTemporadas * QtdeEpisodios * DuracaoEpisodio;
    }


}
