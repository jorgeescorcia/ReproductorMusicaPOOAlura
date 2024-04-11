package com.alurareproductoraudio.principal;

import com.alurareproductoraudio.modelos.Cancion;
import com.alurareproductoraudio.modelos.MisFavoritos;
import com.alurareproductoraudio.modelos.Podcast;

public class Principal {
    public static void main(String[] args) {


        Cancion micancion = new Cancion();
        micancion.setTitulo("Despacio");
        micancion.setCantante("Jorge Escorcia");


        Podcast miPodcast = new Podcast();
        miPodcast.setTitulo("Escorcia Podcast");
        miPodcast.setPresentador("Andres Escorcia");
        miPodcast.setDescripcion("Podscast Escrocia 2.0");

//Cancion
        for (int i = 0; i <100 ; i++) {
            micancion.meGusta();

        }

        for (int i = 0; i <5000 ; i++) {
            micancion.reproducir();

        }
//Podcast
        for (int i = 0; i <350 ; i++) {
            miPodcast.meGusta();

        }

        for (int i = 0; i <8000 ; i++) {
            miPodcast.reproducir();

        }

        System.out.println("Total Megusta: "+micancion.getTotalMeGusta());
        System.out.println("Total Reproducciones: "+micancion.getTotalDeReproducciones());

        MisFavoritos favoritos = new MisFavoritos();
        favoritos.adicione(miPodcast);
        favoritos.adicione(micancion);

    }
}
