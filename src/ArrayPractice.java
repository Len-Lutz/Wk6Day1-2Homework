import java.util.*;

public class ArrayPractice {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        ArrayList<Integer> numList = new ArrayList<>(5);
        int tempInt;

        System.out.println("Please enter a number:");
        tempInt = Integer.parseInt(userInput.nextLine());
        numList.add(tempInt);
        System.out.println("Please enter a second number:");
        tempInt = Integer.parseInt(userInput.nextLine());
        numList.add(tempInt);
        System.out.println("Please enter a third number:");
        tempInt = Integer.parseInt(userInput.nextLine());
        numList.add(tempInt);
        System.out.println("Please enter a fourth number:");
        tempInt = Integer.parseInt(userInput.nextLine());
        numList.add(tempInt);
        System.out.println("Please enter a final number:");
        tempInt = Integer.parseInt(userInput.nextLine());
        numList.add(tempInt);

        System.out.println("The ArrayList = " + numList);
        Integer sum = 0;
        Integer product = 1;
        Integer largest = 0;
        Integer smallest = numList.get(0);

        for (Integer num : numList) {
            sum += num;
            product *= num;
            if(num > largest) {
                largest = num;
            }
            if (num < smallest) {
                smallest = num;
            }
        }

        System.out.printf("Sum = %d\n", sum);
        System.out.printf("Product = %d\n", product);
        System.out.printf("largest = %d\n", largest);
        System.out.printf("Smallest = %d\n", smallest);

    }
}
