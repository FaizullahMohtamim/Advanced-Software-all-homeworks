/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package osIMODEL;

public class Main {

    private static abstruct_layer getOsi() {
        abstruct_layer applicationaLayer = new application_layer(1);
        abstruct_layer presentationLayer = new presentation_layer(2);
        abstruct_layer sessionLayer = new session_layer(3);
        abstruct_layer transportLayer = new Transport_layer(4);
        abstruct_layer networklayer = new NetWork_layer(5);
        abstruct_layer datalinklayer = new dataLink_Layer(6);
        abstruct_layer physicalLayer = new Physical_Layer(7);

        applicationaLayer.setNextLayer(presentationLayer);
        presentationLayer.setNextLayer(sessionLayer);
        sessionLayer.setNextLayer(transportLayer);
        transportLayer.setNextLayer(networklayer);
        networklayer.setNextLayer(datalinklayer);
        datalinklayer.setNextLayer(physicalLayer);

        return applicationaLayer;
    }

    public static void main(String[] args) {
        abstruct_layer layerchain = getOsi();
        layerchain.layerMessage(abstruct_layer.applictaion_layer, " (Data )");
        System.out.println("--------------------------------------------------------- ");
        layerchain.layerMessage(abstruct_layer.presentation_layer, "Presentation_Layer (Data )");
        System.out.println("--------------------------------------------------------------- ");
        layerchain.layerMessage(abstruct_layer.session_layer, "Session_Layer (Data  )");
        System.out.println("---------------------------------------------------------- ");
        layerchain.layerMessage(abstruct_layer.transport_layer, " (segment  )");
        System.out.println("---------------------------------------------------------- ");
        layerchain.layerMessage(abstruct_layer.network_layer, " (packet  )");
        System.out.println("---------------------------------------------------------- ");
        layerchain.layerMessage(abstruct_layer.dataLink_layer, " (Fremes   )");
        System.out.println("---------------------------------------------------------- ");
        layerchain.layerMessage(abstruct_layer.physical_layer, " (Bits )");
        System.out.println("---------------------------------------------------------- ");
    }
}
