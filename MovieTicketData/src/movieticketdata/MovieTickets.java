
package movieticketdata;

public class MovieTickets implements IMovieTickets {

    @Override
    public double CalculateTotalTicketPrice(int numberOfTickets, double ticketPrice) {
        double total = numberOfTickets * ticketPrice;
        double vat = total * 0.14; // 14% VAT
        return total + vat;
    }

    @Override
    public boolean ValidateData(MovieTicketData movieTicketData) {
        if (movieTicketData.getMovieName() == null || movieTicketData.getMovieName().isEmpty()) {
            return false;
        }
        if (movieTicketData.getTicketPrice() <= 0) {
            return false;
        }
        if (movieTicketData.getNumberOfTickets() <= 0) {
            return false;
        }
        return true;
    }
}

//Title: Event Ticket Gui, Author: ChatGPT, Date:N/A, Code version: 1, Availability: https://chatgpt.com/ c/66f19fe7-6e10-8003-b6b2-bb02977305bd
