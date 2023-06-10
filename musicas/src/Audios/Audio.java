package Audios;

public class Audio {
    private String titulo;
    private int curtidas;
    private int totalReproducao;
    private String classificacao;

    private int duracaoEmMinutos;



    //getter e setters
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getCurtidas() {
        return curtidas;
    }

    public void setCurtidas(int curtidas) {
        this.curtidas = curtidas;
    }

    public int getTotalReproducao() {
        return totalReproducao;
    }

    public void setTotalReproducao(int totalReproducao) {
        this.totalReproducao = totalReproducao;
    }

    public String getClassificacao() {
        return classificacao;
    }

    public void setClassificacao(String classificacao) {
        this.classificacao = classificacao;
    }

    public int getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }

    public void setDuracaoEmMinutos(int duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }


    //métodos

    public void curtir(){
        curtidas += 1;


    }
    public void descurtir(){
        curtidas -= 1;


    }
    public void reproduzir(){

        totalReproducao += 1;
    }



}
