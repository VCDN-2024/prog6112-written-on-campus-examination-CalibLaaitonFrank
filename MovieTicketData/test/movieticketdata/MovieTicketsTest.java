/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package movieticketdata;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author lab_services_student
 */
public class MovieTicketsTest {
    
    public MovieTicketsTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of CalculateTotalTicketPrice method, of class MovieTickets.
     */
    @Test
    public void testCalculateTotalTicketPrice() {
        System.out.println("CalculateTotalTicketPrice");
        int numberOfTickets = 0;
        double ticketPrice = 0.0;
        MovieTickets instance = new MovieTickets();
        double expResult = 0.0;
        double result = instance.CalculateTotalTicketPrice(numberOfTickets, ticketPrice);
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of ValidateData method, of class MovieTickets.
     */
    @Test
    public void testValidateData() {
        System.out.println("ValidateData");
        MovieTicketData movieTicketData = null;
        MovieTickets instance = new MovieTickets();
        boolean expResult = false;
        boolean result = instance.ValidateData(movieTicketData);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
