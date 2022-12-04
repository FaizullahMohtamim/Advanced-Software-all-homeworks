
package osIMODEL;


public class NetWork_layer extends abstruct_layer{
        public NetWork_layer(int level) {
        this.level=level;
    }

    
    @Override
    protected void write(String message) {
        
        System.out.println("Layer   :: NetWork_layer "+message);  
    }
}
