public class Format {
    public static void main(String[] args) {
      double frac = 1/3.0;
      String name = "Otto Rehagel";//15 tegn
      int myAge = 42;
      double myWeight = 89.3;
      double myBankBalance = 120001231.89;
      char myLetter = 'a';
      System.out.printf("");
      System.out.println("Kære " + name + " du skylder " + myBankBalance); 
      System.out.printf("Kære %s du skylder %f%n\n",name,myBankBalance); 
      System.out.printf("");
      System.out.println("Hej " + name + ". Du er over " + myAge + " og skylder derfor " + myBankBalance); 
      System.out.printf("Hej %s. Du er over %d og skylder derfor %.2f%n",name, myAge,myBankBalance); 
      // brug System.out.printf til at printe flg:
      // 0,33
      System.out.printf("%.2f%n",frac);
      // |   Otto Rehagel|
      System.out.printf("|%-18s|%n",name);
      //
      // 120,001,231
      // 000042
      // | a|   a|
      // | a|   a|  Otto Rehagel|
      System.out.printf("|%2c|%3c|%18s|%n",myLetter,myLetter,name);
      

    }
}
