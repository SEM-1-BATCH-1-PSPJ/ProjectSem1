import java.util.*;

public class RestaurantBilling15
{
    public static void main(String[] args)
    {

        Scanner sc = new Scanner(System.in);

        // Arrays for menu items and prices
        String[] items = {
            "Plain Dosa",
            "Masala Dosa",
            "Ghee Karam Dosa",
            "Upma Dosa",
            "Rava Dosa",
            "Set Dosa",
            "70mm Dosa",
            "Idli",
            "Rava Idli",
            "Sambar Idli",
            "Wada",
            "Poori",
            "Uthappam",
            "Pongal",
            "Tea",
            "Coffee",
            "Horlicks / Boost",
            "Cold Drinks"
        };

        int[] prices = {
            55, 70, 70, 65, 65, 70, 80, 40, 50,
            50, 60, 70, 80, 70, 30, 30, 25, 25
        };

        System.out.println("Welcome To BALAJI TIFFINS!");
        System.out.println("What would you like to order?");

        System.out.println("************ BALAJI TIFFINS ****************");
        System.out.println();

        // Printing menu using arrays
        System.out.println("**TIFFINS**");
        System.out.println("");
        for (int i = 0; i < 14; i++) 
        {
            System.out.println((i + 1) + ". " + items[i] + " - Rs." + prices[i]);
        }

        System.out.println();

        System.out.println("**BEVERAGES**");
        System.out.println("");
        for (int i = 14; i < items.length; i++) 
        {
            System.out.println((i + 1) + ". " + items[i] + " - Rs." + prices[i]);
        }

        System.out.println();

        System.out.println("Note : If you don't want to order anything,");
        System.out.println("please enter a number greater than 18.");
        System.out.println();

        System.out.println("1. Dine In");
        System.out.println("2. Takeaway");

        int serviceType = sc.nextInt();

        switch (serviceType) 
        {
            case 1:
                System.out.println("You have chosen Dine-In Service");
                break;

            case 2:
                System.out.println("You have chosen Takeaway Service");
                break;

            default:
                System.out.println("Invalid Choice! Please choose either Dine-In or Takeaway.");
                return;
        }

        System.out.println();
        System.out.println("Enter Your Choice (Serial Number):");

        int choice = sc.nextInt();

        int total = 0;
        String order = "";

        do 
        {

            if (choice >= 1 && choice <= items.length)
            {

                // Array index starts from 0, so choice - 1
                int index = choice - 1;

                System.out.println("You Have Chosen " + items[index]);
                System.out.println("Price : Rs." + prices[index]);

                total += prices[index];

                order += items[index] + " - Rs." + prices[index] + "\n";

            } 
            else 
            {
                System.out.println("Sorry! This item is unavailable");
            }

            if (choice <= 18)
            {
                System.out.println();
                System.out.println("Would you like to order anything else?");
                System.out.println("Enter item number, or enter a number greater than 18 to finish.");

                choice = sc.nextInt();
            }

        } 
        while (choice <= 18);

        // Final Bill
        System.out.println();
        System.out.println("================= Final Bill =================");
        
        if (serviceType == 1) 
        {
            System.out.println("Order Type : Dine-In");
        }
        else
        {
            System.out.println("Order Type : Takeaway");
        }

        System.out.println("Items Ordered :");
        System.out.println(order);

        System.out.println("Total Amount : Rs." + total);

        System.out.println("Your Order has been placed successfully!");
        System.out.println("Thank You For Ordering From BALAJI TIFFINS!");

        System.out.println("==============================================");

        sc.close();
    }
}
