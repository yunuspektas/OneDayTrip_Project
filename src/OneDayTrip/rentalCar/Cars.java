package rentalCar;

import java.util.HashMap;
import java.util.Map;

public class Cars {
    static int bakiye=20000;
    static Map<Integer, Informations> cars = new HashMap<>();

    static void birYildizliOtel() {
        Informations bircar1 = new Informations("Fiat", "Linea", "Manuel", "95 HP", 2015, 200);
        Informations bircar2 = new Informations("Renault", "Fluence", "Manuel", "110 HP", 2015, 250);
        Informations bircar3 = new Informations("Hyundai", "I20", "Automatic", "100 HP", 2017, 225);

        cars.put(1, bircar1);
        cars.put(2, bircar2);
        cars.put(3, bircar3);

        System.out.println("         Brand         Model         Gear           Motor Power     Year    Price");
        System.out.println("------------------------------------------------------------------------------");
        for (Integer w : cars.keySet()) {


            System.out.printf("%-8d %-13s %-13s %-16s %-13s %-9d %-1d\n", w,
                    cars.get(w).getMarka(), cars.get(w).getModel(),
                    cars.get(w).getVites(), cars.get(w).getMotorGucu(),
                    cars.get(w).getYil(), cars.get(w).getFiyat());


        }
        System.out.println("\nPlease select a car from the list ");
        int choose = TryCatch.intGirisi(cars.size());
        System.out.println("You chose ");
        System.out.println("         Brand         Model         Gear           Motor Power     Year    Price");
        System.out.println("------------------------------------------------------------------------------");
        if (cars.containsKey(choose)) {
            System.out.printf("%-8d %-13s %-13s %-16s %-13s %-9d %-1d\n", choose,
                    cars.get(choose).getMarka(), cars.get(choose).getModel(),
                    cars.get(choose).getVites(), cars.get(choose).getMotorGucu(),
                    cars.get(choose).getYil(), cars.get(choose).getFiyat());

            if( bakiye-cars.get(choose).getFiyat()<bakiye){

                bakiye=bakiye-cars.get(choose).getFiyat();
                System.out.println("\nHAVE A NİCE DAY");
            }else {
                System.out.println("YOU DON'T HAVE ENOUGH MONEY");
            }



        }
    }

    static void ikiYildizliOtel() {
        Informations ikicar1 = new Informations("Honda", "Tucson", "Automatic", "150 HP", 2018, 500);
        Informations ikicar2 = new Informations("Volkswagen", "Jetta", "Automatic", "145 HP", 2015, 450);
        Informations ikicar3 = new Informations("Opel", "Insignia", "Automatic", "156 HP", 2017, 550);
        cars.put(1, ikicar1);
        cars.put(2, ikicar2);
        cars.put(3, ikicar3);
        System.out.println("         Brand         Model         Gear           Motor Power     Year    Price");
        System.out.println("----------------------------------------------------------------------------------");
        for (Integer w : cars.keySet()) {


            System.out.printf("%-8d %-13s %-13s %-16s %-13s %-9d %-1d\n", w,
                    cars.get(w).getMarka(), cars.get(w).getModel(),
                    cars.get(w).getVites(), cars.get(w).getMotorGucu(),
                    cars.get(w).getYil(), cars.get(w).getFiyat());


        }
        System.out.println("\nPlease select a car from the list ");
        int choose = TryCatch.intGirisi(cars.size());
        System.out.println("You chose ");
        System.out.println("         Brand         Model         Gear           Motor Power     Year    Price");
        System.out.println("----------------------------------------------------------------------------------");
        if (cars.containsKey(choose)) {
            System.out.printf("%-8d %-13s %-13s %-16s %-13s %-9d %-1d\n", choose,
                    cars.get(choose).getMarka(), cars.get(choose).getModel(),
                    cars.get(choose).getVites(), cars.get(choose).getMotorGucu(),
                    cars.get(choose).getYil(), cars.get(choose).getFiyat());

            if( bakiye-cars.get(choose).getFiyat()<bakiye){

                bakiye=bakiye-cars.get(choose).getFiyat();
                System.out.println("\nHAVE A NİCE DAY");
            }else {
                System.out.println("YOU DON'T HAVE ENOUGH MONEY");
            }

        }
    }

    static void ucYildizliOtel() {
        Informations uccar1 = new Informations("Jeep", "Compass", "Automatic", "190 HP", 2019, 900);
        Informations uccar2 = new Informations("Audi", "A6 Sedan", "Automatic", "204 HP", 2020, 1000);
        Informations uccar3 = new Informations("Bmw", "5.20i", "Automatic", "195 HP", 2020, 1000);
        Informations uccar4 = new Informations("Volvo", "XC90", "Automatic", "235 HP", 2021, 1100);
        cars.put(1, uccar1);
        cars.put(2, uccar2);
        cars.put(3, uccar3);
        cars.put(4, uccar4);
        System.out.println("         Brand         Model         Gear           Motor Power     Year    Price");
        System.out.println("------------------------------------------------------------------------------");
        for (Integer w : cars.keySet()) {


            System.out.printf("%-8d %-13s %-13s %-16s %-13s %-9d %-1d\n", w,
                    cars.get(w).getMarka(), cars.get(w).getModel(),
                    cars.get(w).getVites(), cars.get(w).getMotorGucu(),
                    cars.get(w).getYil(), cars.get(w).getFiyat());


        }
        System.out.println("\nPlease select a car from the list ");
        int choose = TryCatch.intGirisi(cars.size());
        System.out.println("You chose ");
        System.out.println("         Brand         Model         Gear           Motor Power     Year    Price");
        System.out.println("----------------------------------------------------------------------------------");
        if (cars.containsKey(choose)) {
            System.out.printf("%-8d %-13s %-13s %-16s %-13s %-9d %-1d\n", choose,
                    cars.get(choose).getMarka(), cars.get(choose).getModel(),
                    cars.get(choose).getVites(), cars.get(choose).getMotorGucu(),
                    cars.get(choose).getYil(), cars.get(choose).getFiyat());

            if( bakiye-cars.get(choose).getFiyat()<bakiye){

                bakiye=bakiye-cars.get(choose).getFiyat();
                System.out.println("\nHAVE A NİCE DAY");
            }else {
                System.out.println("YOU DON'T HAVE ENOUGH MONEY");
            }

        }
    }

    static void dortYildizliOtel() {

        Informations dortcar1 = new Informations("Lamborghini", "Compass", "Automatic", "590 HP", 2021, 1500);
        Informations dortcar2 = new Informations("Bugatti", "A6 Sedan", "Automatic", "610 HP", 2020, 1550);
        Informations dortcar3 = new Informations("Ferrari", "5.20i", "Automatic", "600 HP", 2020, 1450);
        Informations dortcar4 = new Informations("Chevrolet", "Camaro", "Automatic", "580 HP", 2021, 1470);
        cars.put(1, dortcar1);
        cars.put(2, dortcar2);
        cars.put(3, dortcar3);
        cars.put(4, dortcar4);
        System.out.println("         Brand         Model         Gear           Motor Power     Year    Price");
        System.out.println("----------------------------------------------------------------------------------");
        for (Integer w : cars.keySet()) {


            System.out.printf("%-8d %-13s %-13s %-16s %-13s %-9d %-1d\n", w,
                    cars.get(w).getMarka(), cars.get(w).getModel(),
                    cars.get(w).getVites(), cars.get(w).getMotorGucu(),
                    cars.get(w).getYil(), cars.get(w).getFiyat());


        }
        System.out.println("\nPlease select a car from the list ");
        int choose = TryCatch.intGirisi(cars.size());
        System.out.println("You chose ");
        System.out.println("         Brand         Model         Gear           Motor Power     Year    Price");
        System.out.println("----------------------------------------------------------------------------------");
        if (cars.containsKey(choose)) {
            System.out.printf("%-8d %-13s %-13s %-16s %-13s %-9d %-1d\n", choose,
                    cars.get(choose).getMarka(), cars.get(choose).getModel(),
                    cars.get(choose).getVites(), cars.get(choose).getMotorGucu(),
                    cars.get(choose).getYil(), cars.get(choose).getFiyat());

            if( bakiye-cars.get(choose).getFiyat()<bakiye){

                bakiye=bakiye-cars.get(choose).getFiyat();
                System.out.println("\nHAVE A NİCE DAY");
            }else {
                System.out.println("YOU DON'T HAVE ENOUGH MONEY");
            }

        }
    }


}
