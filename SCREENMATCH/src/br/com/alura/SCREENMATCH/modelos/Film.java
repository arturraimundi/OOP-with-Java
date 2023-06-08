package br.com.alura.SCREENMATCH.modelos;

public class Film {
//variaveis
    private String name;
    private int year, minutes;
    private boolean planinclude;
    private double somaAvaliacao;
    private int totalAvaliacao;

//MÉTODOS
    public boolean getplaninclude(){
        return planinclude;
    }
    public double getSomaAvaliacao(){
        return somaAvaliacao;
    }
    public int getTotalAvaliacao(){
        return totalAvaliacao;
    }
    //metodo para dar valor a variavel ao atributo, alt insert faz tudo automatico ou menu, ou escreve ne
    //inicio dos SETTERS
    public void setNome(String name) {//setNome vai ser o nome do metodo(ok) String name o valor da variavel entao este nome = name( o nome do string name pode ser mudado o metodo tambem)
        this.name = name;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    public void setSomaAvaliacao(double somaAvaliacao) {
        this.somaAvaliacao = somaAvaliacao;
    }

    public void setTotalAvaliacao(int totalAvaliacao) {
        this.totalAvaliacao = totalAvaliacao;
    }

    public void setPlaninclude(boolean planinclude) {

        this.planinclude = planinclude;
    }
    //Inicio dos metodos

    public void exibirFichaTecnica(){
        System.out.println("Nome do filme:"+name);
        System.out.println("Lançamento:"+year);
        System.out.printf("Duração: %d minutos", minutes);
        if(planinclude){
            System.out.println("\nIncluso ao plano");

        }else{
            System.out.println("\nNão incluso ao plano");

        }
        }

    public void avalia(int nota){
        somaAvaliacao += nota;
        totalAvaliacao++;
    }
    public double pegaMedia(){
        return somaAvaliacao/totalAvaliacao;
    }
}
