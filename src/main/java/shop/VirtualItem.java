package shop;

import org.apache.log4j.Logger;

/**
 * Created by AlexanderSavenok on 12/27/2016.
 */
public class VirtualItem extends Item {

    final static Logger logger = Logger.getLogger(VirtualItem.class);

    private double sizeOnDisk;

    public void setSizeOnDisk(double sizeOnDisk) {
        logger.info("Size is set");
        this.sizeOnDisk = sizeOnDisk;
    }

    public double getSizeOnDisk() {
        return this.sizeOnDisk;
    }

    @Override
    public String toString() {
        return super.toString() + "Size on disk: " + sizeOnDisk;
    }
}
