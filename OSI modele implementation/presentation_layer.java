
package osIMODEL;


public class presentation_layer extends abstruct_layer{

   public presentation_layer(int level) {
        this.level=level;
    }

    
    @Override
    protected void write(String message) {
        System.out.println("Layer   :: presentation_layer "+message);  
    }
    
}
