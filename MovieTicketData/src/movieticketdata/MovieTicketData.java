
package movieticketdata;

public class MovieTicketData {
    private String movieName;
    private double ticketPrice;
    private int numberOfTickets;

    public MovieTicketData(String movieName, double ticketPrice, int numberOfTickets) {
        this.movieName = movieName;
        this.ticketPrice = ticketPrice;
        this.numberOfTickets = numberOfTickets;
    }

    public String getMovieName() {
        return movieName;
    }

    public double getTicketPrice() {
        return ticketPrice;
    }

    public int getNumberOfTickets() {
        return numberOfTickets;
    }
}

//Title: Event Ticket Gui, Author: ChatGPT, Date:N/A, Code version: 1, Availability: https://chatgpt.com/ c/66f19fe7-6e10-8003-b6b2-bb02977305bd
