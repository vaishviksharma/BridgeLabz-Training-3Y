class MovieTicket {
    String movieName;
    String seatNumber;
    int price;
    boolean booking=false;

    MovieTicket(String movieName, String seatNumber, int price, boolean booking) {
        this.movieName= movieName;
        this.seatNumber= seatNumber;
        this.price= price;
        this.booking= booking;
    }



    public void displayTicketDetails() {
        System.out.println("Movie: " + movieName);
        System.out.println("Seat Number: " + seatNumber);
        System.out.println("Price: $" + price);
        if (booking) {
            System.out.println("Status: Booked");
        } else {
            System.out.println("Status: Available");
        }
    }

    public static void main(String[] args) {
        MovieTicket ticket1 = new MovieTicket("Inception", "A12", 15, true);
        ticket1.displayTicketDetails();
    }
}
