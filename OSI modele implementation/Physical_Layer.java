
package osIMODEL;


public class Physical_Layer extends abstruct_layer{
        public Physical_Layer(int level) {
        this.level=level;
    }

    
    @Override
    protected void write(String message) {
        
        System.out.println("Layer   :: Physical_Layer "+message);  
    }
}
