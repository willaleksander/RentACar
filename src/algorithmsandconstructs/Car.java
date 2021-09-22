/*
 * Implementation of the interface CarInterface.java
 */
package algorithmsandconstructs;

import algorithmsandconstructs.enums.Make;
import algorithmsandconstructs.enums.Month;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Willyan Aleksander
 */

public class Car implements CarInterface{
    
    private Make make;
    private Double rate;
    private Map<Month, boolean[]> availability;
    private int id;
    
    public Car(Make make, Double rate, int id) {
        this.make = make;
        this.rate = rate;
        this.availability = createAvailability();
        this.id = id;        
    }

    @Override
    public Map<Month, boolean[]> createAvailability() {
        HashMap<Month, boolean[]> availabilities = new HashMap<Month, boolean[]>();
        
        for (Month month : Month.values()){
            boolean[] days = new boolean[month.getNumberOfDays()];
            
            /* filling a array with the same values
                https://www.tutorialspoint.com/how-can-we-initialize-a-boolean-array-in-java
            */
            Arrays.fill(days, true);
            
            availabilities.put(month, days);
        }
        return availabilities;
    }

    @Override
    public Make getMake() {
        return this.make;
    }

    @Override
    public void setMake(Make make) {
        this.make = make;
    }

    @Override
    public double getRate() {
        return this.rate;
    }

    @Override
    public void setRate(double rate) {
        this.rate = rate;
    }

    @Override
    public Map<Month, boolean[]> getAvailability() {
        return availability;
    }

    @Override
    public void setAvailability(Map<Month, boolean[]> availability) {
        this.availability = availability;
    }

    @Override
    public int getId() {
        return this.id;
    }

    @Override
    public boolean isAvailable(Month month, int day) {
        return this.availability.get(month)[day-1];
    }

    @Override
    public boolean book(Month month, int day) {
        if (isAvailable(month, day)){
            this.availability.get(month)[day-1] = false;
            return true;
        }
        return false;
    }
    
}
