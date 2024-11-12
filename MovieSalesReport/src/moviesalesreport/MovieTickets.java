
package moviesalesreport;

public class MovieTickets implements IMovieTickets {

    @Override
    public int TotalMovieSales(int[] movieTicketSales) {
        int total = 0;
        for (int sales : movieTicketSales) {
            total += sales;
        }
        return total;
    }

    @Override
    public String TopMovieString(String[] movies, int[] totalSales) {
        int maxIndex = 0;
        for (int i = 1; i < totalSales.length; i++) {
            if (totalSales[i] > totalSales[maxIndex]) {
                maxIndex = i;
            }
        }
        return movies[maxIndex];
    }
}

////Title: Concert Ticket Sales App, Author: ChatGPT, Date:N/A, Code version: 1, Availability: https://chatgpt.com/ c/66f19fe7-6e10-8003-b6b2-bb02977305bd