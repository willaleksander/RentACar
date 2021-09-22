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
        Make make = null;
        double rate = 0;
        int id = 1;

        ArrayList<CarInterface> cars = new ArrayList<>();
        
        //loop to go line by line
        line = in.readLine();
        while(line != null){

            String[] arrOfStr = name.split(":", 3);

            make = Make.parse(arrOfStr[0]);
            rate = Double.parseDouble(arrOfStr[1]);
            int availability = Integer.parseInt(arrOfStr[2]);


            //loop to create a new car 
            for(int i = 0; i < availability; i++){
                
                Car carsMade = new Car(make, rate, id);
               cars.add(carsMade);

      
                id++;
            }

            line = in.readLine();   
        }

        RentACarInterface rentACarInt = new RentACar(cars , name);

        
return rentACarInt;
    
    }
    
}
