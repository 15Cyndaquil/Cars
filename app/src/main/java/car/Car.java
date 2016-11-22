package car;

/**
 * GNU License
 * Date 11/17/2016
 * @author John Tyler Gafford
 * Purpose:
 * Car class to set color, horse power, enginge size, and make
 */

public class Car {
    private String color, make;
    private int horsePower;
    private double engineSize;
    private static int count;

    /**
     * Initialise Car with color: Blue, make: Jeep
     * Horse Power: 500, Engine Size: 6
     * adds a number to count of current initialised cars
     */
    public Car(){
        color="Blue";
        make="Jeep";
        horsePower=500;
        engineSize=6;
        count++;
    }

    /**
     *Initialise car with set parameters
     * adds a number to count of current initialised cars
     * @param color Color of a car
     * @param make Make of a car
     * @param horsePower Amount of horse power a car has
     * @param engineSize The engine size of a car
     */
    public Car(String color, int horsePower,
               double engineSize, String make){
        this.color = color;
        this.make = make;
        this.horsePower = horsePower;
        this.engineSize = engineSize;
        count++;
    }

    /**
     *
     * @return Returns color of the car
     */
    public String getColor(){return this.color;}

    /**
     *
     * @return Returns the horse power of the car
     */
    public int getHorsePower(){return this.horsePower;}

    /**
     *
     * @return Returns the engine size of the car
     */
    public double getEngineSize(){return this.engineSize;}

    /**
     *
     * @return Returns the make of the car
     */
    public String getMake(){return this.make;}

    /**
     *
     * @return Returns the amount of cars currently initialised
     */
    public static int getCount(){return count;}

    /**
     * Sets color of the car
     * @param color Color of a car
     */
    public void setColor(String color){this.color=color;}

    /**
     * Sets the horse power of the car
     * @param horsePower The horse power of a car
     */
    public void setHorsePower(int horsePower){this.horsePower=horsePower;}

    /**
     * Sets the engine size of the car
     * @param engineSize The engine size of a car
     */
    public void setEngineSize(double engineSize){this.engineSize=engineSize;}

    /**
     * Sets the make of the car
     * @param make The make of a car
     */
    public void setMake(String make){this.make=make;}

    /**
     * Sets the color, horse power, engine size, and make of the car
     * @param color The color of a car
     * @param horsePower The horse power of a car
     * @param engineSize The engine size of a car
     * @param make The make of a car
     */
    public void setColorHorseEngineMake(String color, int horsePower,
                                        double engineSize, String make){
        this.color=color;
        this.horsePower=horsePower;
        this.engineSize=engineSize;
        this.make=make;
    }

    /**
     *
     * @param obj The car you want to compare
     * @return Returns if one car is equal to another
     */
    public boolean equals(Car obj){
        boolean out=false;
        out = this.color.equals(obj.getColor())&&
                this.horsePower==obj.getHorsePower()&&
                this.engineSize==obj.getEngineSize()&&
                this.make.equals(obj.getMake());
        return out;
    }

    /**
     *
     * @return Returns the parameters of the car in String
     */
    public String toString(){
        return "Color of car: "+this.color+"!\n"+
                " Horse Power of car: "+this.horsePower+"!\n"+
                " Engine Size of car: "+this.engineSize+"!\n"+
                " Make of car: "+this.make+"!";
    }
}
