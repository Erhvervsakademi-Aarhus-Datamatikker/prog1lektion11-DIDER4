package opgave05;

public class Showstock {
    public static void main(String[] args) {
        stock stock1 = new stock("ORCL","Oracle Corporation", 34.5, 34.35);
        System.out.println(stock1.getChangePercent());
    }
}
