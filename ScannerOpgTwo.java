import java.util.Scanner;

public class ScannerOpgTwo {
    public static void main(String[] args) {
      /*
       * lav scanner objekt
       * prompt bruger for afstand til skolen i km
       * læs tallet med scanner
       * prompt bruger for tid i minutter det tar
       * læs tallet med scanner
       * prompt bruger for fulde navn
       * læs navn med scanner
       * prompt bruger for postnummer
       * læs postnummer med scanner
       * udskriv "Du kører %f km i timen eller %f meter i sekundet"
       */

      int x = -19;
      System.out.println(Math.abs(x));
      Scanner myScan = new Scanner(System.in);
      System.out.println("afstand til skole:");
      int distance = myScan.nextInt();
      System.out.println("tid i  minutter til skole:");
      int timeToSchool = myScan.nextInt();
      double hastighed = (distance/1000.0)/(timeToSchool/60.0) ;
      System.out.printf("Du kører %f km i timen eller %f meter i sekundet",hastighed,hastighed);

      
    }
}
