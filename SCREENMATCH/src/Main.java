import br.com.alura.SCREENMATCH.modelos.Film;

public class Main {
    public static void main(String[] args) {
        Film meuFilme = new Film();
        meuFilme.setNome("O Castelo Animado");
        meuFilme.setYear(2006);
        meuFilme.setMinutes(119);
        meuFilme.setPlaninclude(true);
//uso do get para chamar metodo privado
        System.out.println("total avaliação:"+meuFilme.getTotalAvaliacao());
//chamada do void
        meuFilme.exibirFichaTecnica();
        meuFilme.avalia(8);
        meuFilme.avalia(10);
        meuFilme.avalia(10);
        meuFilme.pegaMedia();
        System.out.println("Média:"+meuFilme.pegaMedia());

        Film favorito = new Film();

        favorito.setNome("The Matrix");
        favorito.setYear(1999);
        favorito.setMinutes(135);
        favorito.setPlaninclude(true);

        favorito.exibirFichaTecnica();
        favorito.avalia(9);
        favorito.avalia(8);
        favorito.avalia(9);

        System.out.println("Média de avaliações do filme: " +favorito.pegaMedia());




    }
}

