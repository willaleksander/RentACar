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
        String name = in.readLine();
        String line;
        Make make;
        double rate;
        int id = 1;

                ArrayList<CarInterface> cars = new ArrayList<>();


        //loop to go line by line
        line = in.readLine();
        while(line != null){

            String[] arrOfStr = name.split(":", 3);

            make = arrOfStr[0];
            rate = arrOfStr[1];
            availability = arrOfStr[2];


            //loop to create a new car 
            for(int i = 0; i < availability; i++){


                cars.add(Car car = new Car(make, rate, id));
                id++;
            }

            line = in.readLine();   
        }


        RentACarInterface rentACarInt = new RentACar(cars , name);

        

    
    }
    
}
