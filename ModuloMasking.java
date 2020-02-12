import java.util.Scanner;
public class ModuloMasking {
    public static void main(String[] args) {
      // brug scanner til at hente alder og højde (i cm)
      // lav et nyt tal stort nok til at gemme hvert tal
      // gem alder i den lave ende
      // gem højde i den høje ende
      // brug division og modulo til at hente de to tal ud igen
      Scanner myScan = new Scanner(System.in);
      System.out.println("Alder: ");
      int age = myScan.nextInt();
      System.out.println("Height: ");
      int height = myScan.nextInt();
      // 45 175 
      int totalTal = height * 10000;
      totalTal = totalTal + age;
      System.out.println("Samlet: " + totalTal);
      int MyHeight = totalTal/10000;
      int MyAge = totalTal%10000;
      System.out.println("Delt igen: " + MyHeight + " og " + MyAge);
    }
}
