
package osIMODEL;

public class Transport_layer extends abstruct_layer{
     public Transport_layer(int level) {
        this.level=level;
    }

    
    @Override
    protected void write(String message) {
        
        System.out.println("Layer   :: Transport_layer "+message);  
    }
}
