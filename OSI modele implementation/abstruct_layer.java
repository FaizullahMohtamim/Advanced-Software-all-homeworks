
package osIMODEL;


public abstract class abstruct_layer {
    public static int applictaion_layer=1;
    public static int presentation_layer=2;
    public static int session_layer=3;
    public static int transport_layer=4;
     public static int network_layer=5;
     public static int dataLink_layer=6;
     public static int physical_layer=7;
     
    protected int level; 
    protected abstruct_layer next_layer;
    public void setNextLayer(abstruct_layer nextLayer){
        this.next_layer=nextLayer;
    }
    public void layerMessage(int level, String message){
        if (this.level<=level){
            write(message);
            
        }
        else
            System.out.println("level is high");
        if(next_layer!=null){
          next_layer.layerMessage(level, message);
        }
        
    }
    abstract protected void write(String message);
    
}
