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
        Make make = in.readLine();
        double rate = 0;
        Map<Month, boolean[]> availability = ;

        Make make = in.readLine();

        RentACarInterface rentACarInt = new RentACarInterface();

        String[] arrOfStr = brand.split(":", 3)

        make = arrOfStr[0];
        rate = arrOfStr[1];
        availability = arrOfStr[2];

        Car.setMake(make);
        Car.setRate(rate);
        

        
//while to skip a line to another
//forloop from 0 to the end of availability



    }
    
}
