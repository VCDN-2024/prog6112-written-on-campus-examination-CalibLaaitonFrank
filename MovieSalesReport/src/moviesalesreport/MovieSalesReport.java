
package moviesalesreport;

public class MovieSalesReport {
    public static void main(String[] args) {
        String[] movies = {"Napoleon", "Oppenheimer"};
        int[][] ticketSales = {
            {3000, 1500, 1700}, // Napoleon
            {3500, 1200, 1600}  // Oppenheimer
        };

        int[] totalSales = new int[movies.length];
        MovieTickets movieTickets = new MovieTickets();

        System.out.println("MOVIE TICKET SALES REPORT - 2024\n");
        System.out.println("JAN\tFEB\tMAR");
        
        for (int i = 0; i < movies.length; i++) {
            System.out.print(movies[i] + "\t");
            for (int j = 0; j < ticketSales[i].length; j++) {
                System.out.print(ticketSales[i][j] + "\t");
                totalSales[i] += ticketSales[i][j];
            }
            System.out.println();
        }

        System.out.println("\nTotal movie ticket sales for Napoleon: " + totalSales[0]);
        System.out.println("Total movie ticket sales for Oppenheimer: " + totalSales[1]);

        String topMovie = movieTickets.TopMovieString(movies, totalSales);
        System.out.println("Top performing movie: " + topMovie);
    }
}

//Title: Concert Ticket Sales App, Author: ChatGPT, Date:N/A, Code version: 1, Availability: https://chatgpt.com/ c/66f19fe7-6e10-8003-b6b2-bb02977305bd