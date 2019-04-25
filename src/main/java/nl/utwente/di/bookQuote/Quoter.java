package nl.utwente.di.bookQuote;

public class Quoter {

    public double getBookPrice(String s) {
        if (s.equals("1")) {
            return 10.0;
        } else if (s.equals("2")) {
            return 45.0;
        } else if (s.equals("3")) {
            return (20.0);
        } else if (s.equals("4")) {
            return 35.0;
        } else if (s.equals("5")) {
            return 50.0;
        } else {
            return 0.0;
        }
    }
}
