import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PhrasedNumberTest {


    @Test
    void testingIntegerToOrdinalConversion() {

        assertEquals("first", PhrasedNumber.enumNames.get(0));
        assertEquals("second", PhrasedNumber.enumNames.get(1));
        assertEquals("third", PhrasedNumber.enumNames.get(2));
        assertEquals("fourth", PhrasedNumber.enumNames.get(3));
        assertEquals("fifth", PhrasedNumber.enumNames.get(4));
        assertEquals("sixth", PhrasedNumber.enumNames.get(5));
        assertEquals("seventh", PhrasedNumber.enumNames.get(6));


    }
}



