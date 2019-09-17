import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        BakedGoodDatabase bgd = new BakedGoodDatabase();

        System.out.println("Welcome to Cloud Nine Bakery.  Some of our products contain gluten, dairy, nuts, or soy.");
        while(true) {
            System.out.println("To search for delicious foods that you can eat, please enter the name of your diet " +
                    "\nrestriction (gluten/dairy/nuts/soy) or type all to see a list of all our foods (all): ");
            String response = key.nextLine();
            if (response.equalsIgnoreCase("gluten")) {
                System.out.println("These items contain no gluten:\n");
                for (BakedGood bakedGood : bgd.getNoGluten()){
                    System.out.println(bakedGood.getDisplayText());
                }
            }else if(response.equalsIgnoreCase("dairy")) {
                System.out.println("These items contain no dairy:\n");
                for (BakedGood bakedGood : bgd.getNoDairy()){
                    System.out.println(bakedGood.getDisplayText());
                }
            }else if(response.equalsIgnoreCase("nuts")) {
                System.out.println("These items contain no nuts:\n");
                for (BakedGood bakedGood : bgd.getNoNuts()){
                    System.out.println(bakedGood.getDisplayText());
                }
            }else if(response.equalsIgnoreCase("soy")) {
                System.out.println("These items contain no soy:\n");
                for (BakedGood bakedGood : bgd.getNoSoy()){
                    System.out.println(bakedGood.getDisplayText());
                }
            }else if(response.equalsIgnoreCase("all")) {
                System.out.println("Here is a list of all our items:\n");
                for (BakedGood bakedGood : bgd.getBakedGoods()){
                    System.out.println(bakedGood.getDisplayText());
                }
            }

            System.out.println("\nWould you like to search our list again? (yes/no) ");
            String response2 = key.nextLine();
            if(response2.equalsIgnoreCase("no")) {
                System.out.println("Thank you for visiting.  Goodbye.");
                break;
            }
        }
    }
}
