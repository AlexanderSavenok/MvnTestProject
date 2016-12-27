package shop;

/**
 * Created by AlexanderSavenok on 12/27/2016.
 */
public class RealItem extends Item {

    //final static Logger logger = Logger.getLogger(RealItem.class);


    private double weight;

    public void setWeight(double weight) {
        this.weight = weight;

        //logger.info("Weight is set for Real Item object" + getWeight());
    }

    public double getWeight() {return this.weight;}

    public String toString() {
        return super.toString() + "weight: " + weight;
    }
}
