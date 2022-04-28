package tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GarriTest {

    @Test
    public static void main(String[] args){

        Account garriAccount = new Account();
        garriAccount.setName("Yellow garri");
        String newName = garriAccount.getName();
        assertEquals("Yellow garri", newName);
    }
}
