/*
 * Implementation of the interface BookingSystemInterface.java
 */
package algorithmsandconstructs;

import java.io.BufferedReader;
import java.io.IOException;

/**
 *
 * @author Willyan Aleksander
 */

public class BookingSystem implements BookingSystemInterface{

    @Override
    public RentACarInterface setupRentACar(BufferedReader in) throws IOException {
        Make make;
        String name = in.readLine();
        double rate;
        int id = 1;
        int availability;

        

        RentACarInterface rentACarInt = new RentACar( , name);

        

        String[] arrOfStr = brand.split(":", 3)

        make = arrOfStr[0];
        rate = arrOfStr[1];
        availability = arrOfStr[2];

        for (int i = 0)
        Car car = new Car(make, rate, id); //class car is done
        id +=1;

        RentACar rentACar = new RentACar(); 

        List<CarInterface> cars = new ArrayList<CarInterface>();

        //start class rent a car

        for(int i = 0; i < id; i++){
            cars.add(car);
        }








     //public RentACar(List<CarInterface> cars, String name, int numberOfCars) {
    //     this.cars = cars;
    //     this.name = name;
    //     this.numberOfCars = numberOfCars;
    // }

//public Car(Make make, Double rate, int id)
        
//while to skip a line to another
//forloop from 0 to the end of availability

// while(make != null){
        //     for(int i = 0; i < availability; i++){
        //     List<CarInterface> cars = new ArrayList<CarInterface>();
        //     }
        // }



    }
    
}
