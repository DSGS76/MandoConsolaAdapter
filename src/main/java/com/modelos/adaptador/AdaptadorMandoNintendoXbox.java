package com.modelos.adaptador;

import com.modelos.consola.ConsolaXbox;
import com.modelos.mando.MandoNintendo;

public class AdaptadorMandoNintendoXbox implements ConsolaXbox {

    private final MandoNintendo mandoNintendo;

    public AdaptadorMandoNintendoXbox(MandoNintendo mandoNintendo) {
        this.mandoNintendo = mandoNintendo;
    }

    @Override
    public void presionarBoton(String boton) {
        switch (boton.toUpperCase()) {
            case "A":
                mandoNintendo.presionarBoton("B");
                break;
            case "B":
                mandoNintendo.presionarBoton("A");
                break;
            case "Y":
                mandoNintendo.presionarBoton("X");
                break;
            case "X":
                mandoNintendo.presionarBoton("Y");
                break;
            default:
                System.out.println("botón desconocido para el mando de Nintendo.");
        }
    }

}
