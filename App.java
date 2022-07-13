import java.util.*;

public class App {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    String message = "Vous devez choisir une valeur entre 0 et 99";

    try {

      System.out.println("Choisir une valeur entre 0 et 99");
      int val = scan.nextInt();

      String plural = "s ";
      String more = "Plus de";
      String bowl = " bolée";

      String songPart1 = "de cidre sur le mur, ";
      String songPart2 = "sans alcool. ";
      String songPart3 = "Bois en un et au suivant ! ";
      String songPart4 = "de cidre sur le mur.";
      String songPart5 = "Vas au supermarché pour en acheter, 99 bolées de cidre sur le mur.";

      if (val > 2 & val <= 99) {
        System.out.println(
            val + bowl.concat(plural).concat(songPart1) + val + bowl.concat(plural).concat(songPart2) + "\n" +
                songPart3 + (val - 1) + bowl.concat(plural).concat(songPart4));
      } else if (val == 2) {
        System.out.println(
            val + bowl.concat(plural).concat(songPart1) + val + bowl.concat(plural).concat(songPart2) + "\n" +
                songPart3 + (val - 1) + bowl.concat(" ").concat(songPart4));
      } else if (val == 1) {
        System.out
            .println(val + bowl.concat(" ").concat(songPart1) + val + bowl.concat(" ").concat(songPart2) + "\n" +
                songPart3.concat(more).concat(" ").concat(bowl).concat(plural).concat(songPart4));
      } else if (val == 0) {
        System.out.println(more.concat(bowl).concat(plural).concat(songPart1).concat(more.toLowerCase()).concat(bowl)
            .concat(plural).concat(songPart2).concat("\n").concat(songPart5));
      } else {
        System.out.println(message);
      }
    } catch (InputMismatchException e) {
      System.out.println(message);
    }
  }
}
