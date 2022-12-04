
package osIMODEL;
public class session_layer extends abstruct_layer{
     public session_layer(int level) {
        this.level=level;
    }

    
    @Override
    protected void write(String message) {
        System.out.println("Layer   :: session_layer "+message);
        
    }
}
