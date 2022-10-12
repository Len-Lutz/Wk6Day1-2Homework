import java.util.*;

public class HashMapPractice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        HashMap<String, String> cars = new HashMap<>();
        cars.put("accord", "Honda");
        cars.put("camry", "Corolla");
        cars.put("charger", "Dodge");
        cars.put("maxima", "Nissan");

        final String vowels = "aeiouh";
        String model = "";
        String lowerCaseModel = "";
        String firstChar = "";
        while(!lowerCaseModel.equals("quit")){
            System.out.println("What kind of car are you looking for?");
            System.out.println("Enter \"Quit\" to end program.");
            model = input.nextLine();
            lowerCaseModel = model.toLowerCase();
            firstChar = lowerCaseModel.substring(0,1);
            if (cars.containsKey(lowerCaseModel)) {
                System.out.printf("Oh, you're looking for %s %s? \n", (vowels.contains(firstChar) ? "an" : "a"), model);
                System.out.printf("Our %s collection is right over here.\n\n",cars.get(lowerCaseModel));
            } else {
                if (!lowerCaseModel.equals("quit")) {
                    System.out.println("Sorry, that vehicle is out of stock.\n");
                }
            }
        }
    }
}
