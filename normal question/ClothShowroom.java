import java.util.*;

public class ClothShowroom {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the purchase amount:");
        double purchaseAmount = sc.nextDouble();

        System.out.println("Enter the type of item (1 for Mill Cloth, 2 for Handloom Items):");
        int itemType = sc.nextInt();

        double discount = 0.0;
        switch (itemType) 
        {
            case 1: 
                if (purchaseAmount >= 1 && purchaseAmount <= 100) 
                {
                    discount = 0.0;
                } 
                else if (purchaseAmount >= 101 && purchaseAmount <= 200) 
                {
                    discount = 5.0;
                } 
                else if (purchaseAmount >= 210 && purchaseAmount <= 300) 
                {
                    discount = 7.5;
                }
                else if (purchaseAmount > 300) 
                {
                    discount = 10.0;
                } 
                else 
                {
                    System.out.println("Invalid purchase amount.");
                    return;
                }
                break;
            case 2: 
                if (purchaseAmount >= 1 && purchaseAmount <= 100) 
                {
                    discount = 5.0;
                } 
                else if (purchaseAmount >= 101 && purchaseAmount <= 200) 
                {
                    discount = 7.5;
                } 
                else if (purchaseAmount >= 210 && purchaseAmount <= 300) 
                {
                    discount = 10.0;
                } 
                else if (purchaseAmount > 300) 
                {
                    discount = 15.0;
                } 
                else 
                {
                    System.out.println("Invalid purchase amount.");
                    return;
                }
                break;
            default:
                System.out.println("Invalid item type.");
                return;
        }

        double discountAmount = (purchaseAmount * discount) / 100;
        double netAmount = purchaseAmount - discountAmount;

        System.out.printf("Net amount to be paid: %.2f\n", netAmount);
    }
}
