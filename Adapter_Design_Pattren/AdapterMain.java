/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Adapter_Design_Pattren;


public class AdapterMain {
    public static void main(String[] args) {
        WallSocket wallSocket=new WallSocketimp();
        Volt v240=wallSocket.getVolts();
        System.out.println(v240);
        MobilAdapter mobilAdapter=new MobilAdapterimp(wallSocket);
        Volt V3=mobilAdapter.get3Volt();
        System.out.println(V3);
    }
}
