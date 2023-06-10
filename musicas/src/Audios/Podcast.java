package Audios;

public class Podcast extends Audio implements Classifica{
    private String host;
    private String descricao;

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public String getConvidado() {
        return descricao;
    }

    public void setConvidado(String convidado) {
        this.descricao= convidado;
    }
    @Override
    public String getClassifica() {
        if (getCurtidas() >= 100) {
            return getTitulo() + " Está Bombando! Ouvir agora?";

        } else {
            return "Adicionar " + getTitulo() + " a sua playlist?";
        }
    }
}
