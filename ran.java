import java.util.Random;
public class ran {
    public static void main(String[] args) {
        String[] cats = {"Берсерк", "mr. Fresh", "mr. Chief", "Komaru", "Floppa", "Maxwell", "Bender", "Dave The Magical Cheese Wizard", "Burger"};
        Random random = new Random();
        int index = random.nextInt(cats.length);
        System.out.println(cats[index]);
        switch (cats[index]){
            case "Берсерк":
                System.out.print("Берсерк");
                break;
            case "mr. Fresh":
                System.out.println("смотрит на тебя с высока");
                break;
            case "mr. Chief":
                System.out.println("face the camera");
                break;
            case "Komaru":
                System.out.println("бананчики");
                break;
            case "Floppa":
                System.out.println("Пельмени");
                break;
            case "Maxwell":
                System.out.println("*имбовая музыка*");
                break;
            case "Bender":
                System.out.println("Huh?");
                break;
            case "Dave The Magical Cheese Wizard":
                System.out.println("gjcjcyb [eqws htkmyj");
                break;
            case "Burger":
                System.out.println("burger, get off the chair!!!");
                break;
        }
    }
}
