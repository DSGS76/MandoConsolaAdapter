package com.modelos;

import com.modelos.adaptador.AdaptadorMandoNintendoPlay;
import com.modelos.adaptador.AdaptadorMandoNintendoXbox;
import com.modelos.consola.ConsolaPlayStation;
import com.modelos.consola.ConsolaXbox;
import com.modelos.mando.MandoNintendo;

public class Main {
    public static void main(String[] args) {

        MandoNintendo mandoNintendo = new MandoNintendo();

        ConsolaPlayStation consolaPlayStationAdaptada = new AdaptadorMandoNintendoPlay(mandoNintendo);
        consolaPlayStationAdaptada.presionarBoton("x");

        ConsolaXbox consolaXboxAdaptada = new AdaptadorMandoNintendoXbox(mandoNintendo);
        consolaXboxAdaptada.presionarBoton("x");

    }
}