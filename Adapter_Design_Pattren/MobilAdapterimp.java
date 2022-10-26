/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Adapter_Design_Pattren;

/**
 *
 * @author Mohtamim
 */
public class MobilAdapterimp implements MobilAdapter{
    private WallSocket wallSocket;

    public MobilAdapterimp(WallSocket wallSocket) {
        this.wallSocket = wallSocket;
    }
    
    @Override
    public Volt get3Volt() {
        Volt V240=wallSocket.getVolts();
        int V3=V240.getVolt()/80;
        return new Volt(V3);
    }
    
}
