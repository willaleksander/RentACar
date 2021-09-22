/*
 * Implementation of the interface RentACarInterface.java
 */
package algorithmsandconstructs;

import algorithmsandconstructs.enums.Make;
import algorithmsandconstructs.enums.Month;
import java.util.List;

/**
 *
 * @author Willyan Aleksander
 */

public class RentACar implements RentACarInterface{
    
    private List<CarInterface> cars;
    private String name;
    private int numberOfCars;
    
    public RentACar(List<CarInterface> cars, String name, int numberOfCars) {
        this.cars = cars;
        this.name = name;
        this.numberOfCars = numberOfCars;
    }

    @Override
    public List<CarInterface> getCars() {
        return this.cars;
    }

    @Override
    public void setCars(List<CarInterface> cars) {
        this.cars = cars;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean checkAvailability(Month month, int day, Make make, int lengthOfRent) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getCarAvailable(Month month, int day, Make make, int lengthOfRent) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean bookCar(Month month, int day, Make make, int lengthOfRent) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getNumberOfCars() {
        return this.numberOfCars;
    }
    
}
