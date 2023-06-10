package Audios;

public class Musica extends Audio implements Classifica{
    private String cantor;

    private String estilo;

    public String getCantor() {
        return cantor;
    }

    public void setCantor(String cantor) {
        this.cantor = cantor;
    }

    public String getEstilo() {
        return estilo;
    }

    public void setEstilo(String estilo) {
        this.estilo = estilo;
    }

    @Override
    public String getClassifica() {
        if (getTotalReproducao() >= 1000) {
            return getTitulo() + " Está Bombando! Ouvir agora?";

        }else{
            return "Adicionar "+getTitulo() +  " a sua playlist?";
        }
    }
}
