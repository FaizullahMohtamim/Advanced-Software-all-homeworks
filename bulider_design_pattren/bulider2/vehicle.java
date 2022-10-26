/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bulider_design_pattren.bulider2;

/**
 *
 * @author Mohtamim
 */
public class vehicle {

    private String engine;
    private int wheel;
    private int airbags;

    public String getEngine() {
        return engine;
    }

    public int getWheel() {
        return wheel;
    }

    public int getAirbags() {
        return airbags;
    }

    private vehicle(vehicleBuilder builder) {
        this.engine = builder.engine;
        this.wheel = builder.wheel;
        this.airbags = builder.airbags;
    }

    public static class vehicleBuilder {

        private String engine;
        private int wheel;
        private int airbags;

        public vehicleBuilder(String engine, int wheel) {
            this.engine = engine;
            this.wheel = wheel;
        }

        public vehicleBuilder setairbags(int airbags) {
            this.airbags = airbags;
            return this;
        }

        public vehicle Build() {
            return new vehicle(this);
        }

    }

}
