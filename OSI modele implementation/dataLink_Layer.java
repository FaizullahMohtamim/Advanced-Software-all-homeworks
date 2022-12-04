
package osIMODEL;


public class dataLink_Layer extends abstruct_layer{
        public dataLink_Layer(int level) {
        this.level=level;
    }

    
    @Override
    protected void write(String message) {
        
        System.out.println("Layer   :: dataLink_Layer "+message);  
    }
}
