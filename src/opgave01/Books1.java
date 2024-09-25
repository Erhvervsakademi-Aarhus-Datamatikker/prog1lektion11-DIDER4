package opgave01;

public class Books1 { ;
    public static void main(String[] args) {
        Book[] books = new Book[2];
        books[0] = new Book("Red riding hood","Christopher nolan", 475);
        books[1] = new Book("This is the end","Seth rogen & James franco", 360);
        System.out.println("Titlen på første bog er: " + books[0].title + "\nBogen er skrevet af: " + books[0].author + "\nBogen er " + books[0].pages + " sider lang");
        System.out.println();
        System.out.println("Titlen på anden bog er: " + books[1].title + "\nBogen er skrevet af: " + books[1].author + "\nBogen er " + books[1].pages + " sider lang");

    }
}
