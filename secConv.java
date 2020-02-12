import java.util.Scanner;

public class secConv {
    public static void main(String[] args) {
      /*
       * think java øvelse 3.3
       */
      Scanner myScan = new Scanner(System.in);
      System.out.println("Hvor mange sekunder?");
      int secs = myScan.nextInt();

      //TODO: udregn timer,minutter og sekunder vha division og modulo
      int sec = secs % 60;
      int mins = secs / 60;
      int min = mins % 60;
      int hours = mins / 60;
      int hour = hours % 24;
      int days = hours / 24;
      System.out.printf("%d sekunder er %d dage, %d timer, %d minutter og %d sekunder%n",secs,days,hour,min,sec);
      
    }
}
