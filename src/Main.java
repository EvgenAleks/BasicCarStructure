import java.awt.*;

public class Main {
    public static void main(String[] args) {

        BasicStructure audi = new BasicStructure();
        audi.color = "black";
        audi.model = "A3";
        audi.power = "210";

        Engine x = new Engine();
        x.cylinders = "4";
        x.size = "3300";
        x.weight = "420";


        Color col = new Color();

        col.colorLights = "true";
        col.colorTyre = "false";
        col.colorLights = "true";

        Lights neon = new Lights();
        neon.color = "red";
        neon.size = "16cm";
        neon.intensity = "300lumin";

    }
}