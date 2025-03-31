package com.modelos.adaptador;

import com.modelos.consola.ConsolaPlayStation;
import com.modelos.mando.MandoNintendo;

public class AdaptadorMandoNintendoPlay implements ConsolaPlayStation {

    private final MandoNintendo mandoNintendo;

    public AdaptadorMandoNintendoPlay(MandoNintendo mandoNintendo) {
        this.mandoNintendo = mandoNintendo;
    }

    @Override
    public void presionarBoton(String boton) {
        switch (boton.toLowerCase()) {
            case "x":
                mandoNintendo.presionarBoton("B");
                break;
            case "circulo":
                mandoNintendo.presionarBoton("A");
                break;
            case "triangulo":
                mandoNintendo.presionarBoton("X");
                break;
            case "cuadrado":
                mandoNintendo.presionarBoton("Y");
                break;
            default:
                System.out.println("botón desconocido para el mando de Nintendo.");
        }
    }

}
