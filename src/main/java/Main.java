

public class Main {

    public static void main(String[] args) {

        int[] billType = {1000, 500, 100};
        int[] billTypeQuantity = {2, 3, 5};
        int[] withdrawalAmount = {1500, 700, 400, 1100, 1000, 700, 300};

        RunWithDrawals makeWithdrawal = new RunWithDrawals();
        makeWithdrawal.runWithDrawals(billType, billTypeQuantity, withdrawalAmount);
    }

}
