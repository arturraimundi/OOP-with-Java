import Audios.Musica;
import Audios.Podcast;

public class Main {
    public static void main(String[] args) {
        Musica minhaMusica = new Musica();
        minhaMusica.setTitulo("I WAS MADE FOR LOVING");
        minhaMusica.setCantor("Algum cara da kiss");
        minhaMusica.setEstilo("Rock");

        Podcast meuPodcast = new Podcast();
        meuPodcast.setTitulo("Flow");
        for(int i = 0; i < 1000; i++){
            minhaMusica.curtir();
            minhaMusica.reproduzir();
            meuPodcast.curtir();
            meuPodcast.reproduzir();
            System.out.println(meuPodcast.getCurtidas()+" e "+ meuPodcast.getTotalReproducao() + " e "+ meuPodcast.getClassifica());
            System.out.println(minhaMusica.getCurtidas()+" E " + minhaMusica.getTotalReproducao() + "E" + minhaMusica.getClassifica());
        }





        }
}
