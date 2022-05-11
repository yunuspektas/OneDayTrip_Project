package rentalCar;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatch {

    static Scanner scan = new Scanner(System.in);
    static int giris;
    static String kelime;


    public static int intGirisi(int a) {
        try {
            giris = scan.nextInt();
            if (giris > a) {
                throw new InputMismatchException();
            }
        } catch (InputMismatchException e) {
            System.out.println("PLEASE ENTER NUMBER FROM LİST");
            scan.nextLine();
            intGirisi(a);
        }
        return giris;
    }

    public static int intGirisiParametresiz() {
        try {
            giris = scan.nextInt();

        } catch (InputMismatchException e) {
            System.out.println("PLEASE ENTER NUMBER");
            scan.nextLine();
            intGirisiParametresiz();
        }
        return giris;
    }

    public static String stringGirisi() {
        try {
            kelime = scan.nextLine();
            String kontrol = kelime.replaceAll("\\D", "");
            String kontrol2 = kelime.replaceAll("\\w", "");

            if (kelime.equalsIgnoreCase("yes") || kelime.equalsIgnoreCase("no")) {

            } else {
                throw new InputMismatchException("PLEASE ENTER YES OR NO");
            }


            if (kontrol.length() != 0 || kontrol2.length() != 0) {
                throw new InputMismatchException("harf disinda karakter yok");
            }
        } catch (InputMismatchException e) {
            System.out.println(e.getMessage());
            stringGirisi();
        }

        return kelime;
    }
}