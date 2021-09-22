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

    public RentACar(List<CarInterface> cars, String name) {
        this.cars = cars;
        this.name = name;
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
        for (CarInterface car : this.cars){
            for (int i = day; i <= day+lengthOfRent; i++){
                if(!car.isAvailable(month, i)){
                    return false;
                }
            }                
        }
        return true;
    }

    @Override
    public int getCarAvailable(Month month, int day, Make make, int lengthOfRent) {
        int id = 0;
        for (CarInterface car : this.cars){
            if (checkAvailability(month, day, make, lengthOfRent) ){
                id = car.getId();
            }
        }
        return id;
    }

    @Override
    public boolean bookCar(Month month, int day, Make make, int lengthOfRent) {
        for (CarInterface car : this.cars){
            if (checkAvailability(month, day, make, lengthOfRent) ){
                for (int i = day; i <= day + lengthOfRent; i++ ){
                    car.book(month, day);
                }
            } else {
                return false;
            }
        }
        return true;
    }

    @Override
    public int getNumberOfCars() {
        return this.cars.size();
    }
    
}
