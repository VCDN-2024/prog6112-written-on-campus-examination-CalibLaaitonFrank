/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package moviesalesreport;

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
    
    @Test
    public void CalculateTotalSales_ReturnsExpectedTotalSales() {
        MovieTickets movieTickets = new MovieTickets();
        int[] sales = {3000, 1500, 1700};
        int expectedTotal = 6200; // Expected total for Napoleon
        int actualTotal = movieTickets.TotalMovieSales(sales);
        assertEquals(expectedTotal, actualTotal);
    }
    
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
     * Test of TotalMovieSales method, of class MovieTickets.
     */
    @Test
    public void testTotalMovieSales() {
        System.out.println("TotalMovieSales");
        int[] movieTicketSales = null;
        MovieTickets instance = new MovieTickets();
        int expResult = 0;
        int result = instance.TotalMovieSales(movieTicketSales);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of TopMovieString method, of class MovieTickets.
     */
    @Test
    public void testTopMovieString() {
        System.out.println("TopMovieString");
        String[] movies = null;
        int[] totalSales = null;
        MovieTickets instance = new MovieTickets();
        String expResult = "";
        String result = instance.TopMovieString(movies, totalSales);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
@Test
    public void TopMovieSales_ReturnsTopMovie() {
        MovieTickets movieTickets = new MovieTickets();
        String[] movies = {"Napoleon", "Oppenheimer"};
        int[] sales = {6200, 6300}; // Total sales for Napoleon and Oppenheimer
        String expectedTopMovie = "Oppenheimer";
        String actualTopMovie = movieTickets.TopMovieString(movies, sales);
        assertEquals(expectedTopMovie, actualTopMovie);
    }
}

////Title: Concert Ticket Sales App, Author: ChatGPT, Date:N/A, Code version: 1, Availability: https://chatgpt.com/ c/66f19fe7-6e10-8003-b6b2-bb02977305bd