package rentalCar;

import java.util.Scanner;

public class Runner extends Cars {

    public static void main(String[] args) {


        System.out.println("WELCOME TO UNIVERSAL RENT A CAR");

        System.out.println("DO YOU HAVE A DRIVER LICENSE");
        String license = TryCatch.stringGirisi();

        if (license.equalsIgnoreCase("yes")) {
            System.out.println("PLEASE ENTER AGE");
            int age = TryCatch.intGirisiParametresiz();
            if (age > 25 && age < 65) {
                menu();

            } else {
                System.out.println("YOUR AGE IS NOT SUITABLE FOR RENTİNG A CAR\nBUT WE'LL DO IT FOR $250 ");
                String choose = TryCatch.stringGirisi();
                if (choose.equalsIgnoreCase("yes")) {
                    if(bakiye>250){
                        bakiye=bakiye-250;
                        menu();
                    }else{
                        System.out.println("SEE YOU LATER");
                    }

                } else {
                    System.out.println("SEE YOU LATER");
                }

            }
        }else {
            System.out.println("SEE YOU LATER");
        }
    }

    private static void menu() {
        Scanner scan = new Scanner(System.in);

        int secim = scan.nextInt();

        switch (secim) {

            case 1:
                birYildizliOtel();
                break;
            case 2:
                ikiYildizliOtel();
                break;

            case 3:
                ucYildizliOtel();
                break;
            case 4:
                dortYildizliOtel();
                break;
            case 5:
                System.out.println("LİMOUSINE WAİTİNG FOR YOU AT THE DOOR");
                break;
            default:
                System.out.println("bos");
        }
    }
}
