import java.util.Scanner;


public class RunWithDrawals {

    public void runWithDrawals(int[] billType, int[] billTypeQuantity, int[] withdrawalAmount) {
        int q, x, r, counter;
        counter = 0;

        int[] array2 = new int[3];
        System.out.println("Hello and welcome to ATM,you will make 7 predefined withdrawals.Your current balance is " + currentBalance(billTypeQuantity) + "$");
        System.out.println();
        while (counter < withdrawalAmount.length) {

            System.out.print("Press Enter to make your " + PhrasedNumber.enumNames.get(counter) + " withdrawal. Amount:" + withdrawalAmount[counter] + "$");
            Scanner sc = new Scanner(System.in);
            sc.nextLine();

            r = withdrawalAmount[counter];
            for (int i = 0; i < 3; ++i) {
                q = billType[i];
                x = r / q;
                if (x <= billTypeQuantity[i]) {
                    array2[i] = x;
                    r %= q;
                }
            }
            if (r != 0) {
                System.out.println("Sum of " + withdrawalAmount[counter] + " can not be withdrawn!\n");
            } else {
                System.out.println("Sum of " + withdrawalAmount[counter] + " withdrawn successfully!");
                System.out.println("Please count your bills:");
                for (int i = 0; i < 3; i++) {
                    if (array2[i] > 0) System.out.println(billType[i] + "$:" + array2[i]);
                    billTypeQuantity[i] -= array2[i];
                }
                System.out.println();
            }
            counter++;
        }
        System.out.println("Thank you for using ATM.");
    }

    public int currentBalance(int[] array) {
        return (array[0] * 1000) + (array[1] * 500) + (array[2] * 100);
    }

}



