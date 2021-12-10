import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.Arrays;

import static java.lang.System.*;
import static org.junit.jupiter.api.Assertions.*;

public class RunWithDrawalsTest {

    int[] billType = {1000, 500, 100};

    RunWithDrawals run = new RunWithDrawals();

    @Test
    void testingFirstWithDrawal1() {
        int[] billTypeQuantity = {2, 3, 5};
        int[] withdrawalAmount = {1500};


        String input = "\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        setIn(in);
        run.runWithDrawals(billType, billTypeQuantity, withdrawalAmount);


        int expectedBalance = 2500;
        assertEquals(expectedBalance, run.currentBalance(billTypeQuantity));
        System.out.println("Remaining Balance:" + run.currentBalance(billTypeQuantity));
        assertEquals(Arrays.toString(billTypeQuantity), Arrays.toString(new int[]{1, 2, 5}));
    }

    @Test
    void testingFirstWithdrawal2() {
        int[] billTypeQuantity = {2, 3, 5};
        int[] withdrawalAmount = {1500};


        PrintStream oldOut = System.out;
        ByteArrayOutputStream os = new ByteArrayOutputStream();
        System.setOut(new PrintStream(os));

        String input = "\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        setIn(in);
        run.runWithDrawals(billType, billTypeQuantity, withdrawalAmount);

        String actualOutput = new String(os.toByteArray());
        System.setOut(oldOut);
        out.println(actualOutput);
        assertTrue(actualOutput.contains("Sum of 1500 withdrawn successfully!"));
        System.out.println("Remaining Balance:" + run.currentBalance(billTypeQuantity));

    }

    @Test
    void testingSecondWithDrawal1() {
        int[] billTypeQuantity = {1, 2, 5};
        int[] withdrawalAmount = {700};

        String input = "\n";

        InputStream in = new ByteArrayInputStream(input.getBytes());

        setIn(in);

        run.runWithDrawals(billType, billTypeQuantity, withdrawalAmount);

        int expectedBalance = 1800;
        assertEquals(expectedBalance, run.currentBalance(billTypeQuantity));
        System.out.println("Remaining Balance:" + run.currentBalance(billTypeQuantity));
        assertEquals(Arrays.toString(billTypeQuantity), Arrays.toString(new int[]{1, 1, 3}));

    }

    @Test
    void testingSecondWithdrawal2() {
        int[] billTypeQuantity = {1, 2, 5};
        int[] withdrawalAmount = {700};


        PrintStream oldOut = System.out;
        ByteArrayOutputStream os = new ByteArrayOutputStream();
        System.setOut(new PrintStream(os));

        String input = "\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        setIn(in);
        run.runWithDrawals(billType, billTypeQuantity, withdrawalAmount);


        String actualOutput = new String(os.toByteArray());
        System.setOut(oldOut);
        out.println(actualOutput);
        assertTrue(actualOutput.contains("Sum of 700 withdrawn successfully!"));
        System.out.println("Remaining Balance:" + run.currentBalance(billTypeQuantity));

    }

    @Test
    void testingThirdWithDrawal1() {
        int[] billTypeQuantity = {1, 1, 3};
        int[] withdrawalAmount = {400};

        String input = "\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        setIn(in);
        run.runWithDrawals(billType, billTypeQuantity, withdrawalAmount);

        int expectedBalance = 1800;
        assertEquals(expectedBalance, run.currentBalance(billTypeQuantity));
        System.out.println("Remaining Balance:" + run.currentBalance(billTypeQuantity));
        assertEquals(Arrays.toString(billTypeQuantity), Arrays.toString(new int[]{1, 1, 3}));


    }


    @Test
    void testingThirdWithdrawal2() {
        int[] billTypeQuantity = {1, 1, 3};
        int[] withdrawalAmount = {400};


        PrintStream oldOut = System.out;
        ByteArrayOutputStream os = new ByteArrayOutputStream();
        System.setOut(new PrintStream(os));

        String input = "\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        setIn(in);
        run.runWithDrawals(billType, billTypeQuantity, withdrawalAmount);

        String actualOutput = new String(os.toByteArray());
        System.setOut(oldOut);
        out.println(actualOutput);
        assertTrue(actualOutput.contains("Sum of 400 can not be withdrawn"));


    }

    @Test
    void testingFourthWithDrawal1() {
        int[] billTypeQuantity = {1, 1, 3};
        int[] withdrawalAmount = {1100};

        String input = "\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        setIn(in);
        run.runWithDrawals(billType, billTypeQuantity, withdrawalAmount);

        int expectedBalance = 700;
        assertEquals(expectedBalance, run.currentBalance(billTypeQuantity));
        System.out.println(run.currentBalance(billTypeQuantity));
        assertEquals(Arrays.toString(billTypeQuantity), Arrays.toString(new int[]{0, 1, 2}));


    }

    @Test
    void testingFourthWithdrawal2() {
        int[] billTypeQuantity = {1, 1, 3};
        int[] withdrawalAmount = {1100};


        PrintStream oldOut = System.out;
        ByteArrayOutputStream os = new ByteArrayOutputStream();
        System.setOut(new PrintStream(os));

        String input = "\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        setIn(in);
        run.runWithDrawals(billType, billTypeQuantity, withdrawalAmount);


        String actualOutput = new String(os.toByteArray());
        System.setOut(oldOut);
        out.println(actualOutput);
        assertTrue(actualOutput.contains("Sum of 1100 withdrawn successfully!"));
        System.out.println("Remaining Balance:" + run.currentBalance(billTypeQuantity));

    }

    @Test
    void testingFifthWithDrawal1() {
        int[] billTypeQuantity = {0, 1, 2};
        int[] withdrawalAmount = {1000};

        String input = "\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        setIn(in);
        run.runWithDrawals(billType, billTypeQuantity, withdrawalAmount);

        int expectedBalance = 700;
        assertEquals(expectedBalance, run.currentBalance(billTypeQuantity));
        System.out.println(run.currentBalance(billTypeQuantity));
        assertEquals(Arrays.toString(billTypeQuantity), Arrays.toString(new int[]{0, 1, 2}));


    }

    @Test
    void testingFifthWithdrawal2() {
        int[] billTypeQuantity = {0, 1, 2};
        int[] withdrawalAmount = {1000};


        PrintStream oldOut = System.out;
        ByteArrayOutputStream os = new ByteArrayOutputStream();
        System.setOut(new PrintStream(os));

        String input = "\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        setIn(in);
        run.runWithDrawals(billType, billTypeQuantity, withdrawalAmount);


        String actualOutput = new String(os.toByteArray());
        System.setOut(oldOut);
        out.println(actualOutput);
        assertTrue(actualOutput.contains("Sum of 1000 can not be withdrawn"));
        System.out.println("Remaining Balance:" + run.currentBalance(billTypeQuantity));

    }

    @Test
    void testingSixthWithDrawal1() {
        int[] billTypeQuantity = {0, 1, 2};
        int[] withdrawalAmount = {700};

        String input = "\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        setIn(in);
        run.runWithDrawals(billType, billTypeQuantity, withdrawalAmount);

        int expectedBalance = 0;
        assertEquals(expectedBalance, run.currentBalance(billTypeQuantity));
        System.out.println(run.currentBalance(billTypeQuantity));
        assertEquals(Arrays.toString(billTypeQuantity), Arrays.toString(new int[]{0, 0, 0}));


    }

    @Test
    void testingSixthWithdrawal2() {
        int[] billTypeQuantity = {0, 1, 2};
        int[] withdrawalAmount = {700};


        PrintStream oldOut = System.out;
        ByteArrayOutputStream os = new ByteArrayOutputStream();
        System.setOut(new PrintStream(os));

        String input = "\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        setIn(in);
        run.runWithDrawals(billType, billTypeQuantity, withdrawalAmount);


        String actualOutput = new String(os.toByteArray());
        System.setOut(oldOut);
        out.println(actualOutput);
        assertTrue(actualOutput.contains("Sum of 700 withdrawn successfully!"));
        System.out.println("Remaining Balance:" + run.currentBalance(billTypeQuantity));

    }

    @Test
    void testingSeventhWithDrawal1() {
        int[] billTypeQuantity = {0, 0, 0};
        int[] withdrawalAmount = {300};

        String input = "\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        setIn(in);
        run.runWithDrawals(billType, billTypeQuantity, withdrawalAmount);

        int expectedBalance = 0;
        assertEquals(expectedBalance, run.currentBalance(billTypeQuantity));
        System.out.println(run.currentBalance(billTypeQuantity));
        assertEquals(Arrays.toString(billTypeQuantity), Arrays.toString(new int[]{0, 0, 0}));

    }

    @Test
    void testingSeventhWithdrawal2() {
        int[] billTypeQuantity = {0, 0, 0};
        int[] withdrawalAmount = {300};


        PrintStream oldOut = System.out;
        ByteArrayOutputStream os = new ByteArrayOutputStream();
        System.setOut(new PrintStream(os));

        String input = "\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        setIn(in);
        run.runWithDrawals(billType, billTypeQuantity, withdrawalAmount);


        String actualOutput = new String(os.toByteArray());
        System.setOut(oldOut);
        out.println(actualOutput);
        assertTrue(actualOutput.contains("Sum of 300 can not be withdrawn"));
        System.out.println("Remaining Balance:" + run.currentBalance(billTypeQuantity));

    }

}




