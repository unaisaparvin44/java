import java.util.Scanner;

class Publisher {
    String publisherName;

    Publisher(String publisherName) {
        this.publisherName = publisherName;
    }
}

class Book extends Publisher {
    String bookTitle;

    Book(String publisherName, String bookTitle) {
        super(publisherName);
        this.bookTitle = bookTitle;
    }
}
class Literature extends Book {
    Literature(String publisherName, String bookTitle) {
        super(publisherName, bookTitle);
    }

    void display() {
        System.out.println("Literature Book:");
        System.out.println("Title: " + bookTitle);
        System.out.println("Publisher: " + publisherName);
        System.out.println("--------------------------------");
    }
}

class Fiction extends Book {
    Fiction(String publisherName, String bookTitle) {
        super(publisherName, bookTitle);
    }

    void display() {
        System.out.println("Fiction Book:");
        System.out.println("Title: " + bookTitle);
        System.out.println("Publisher: " + publisherName);
        System.out.println("--------------------------------");
    }
}


public class MainBook {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of books: ");
        int n = sc.nextInt();
        sc.nextLine();

        Book[] books = new Book[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter details for book " + (i + 1));
            System.out.print("Enter title: ");
            String title = sc.nextLine();
            System.out.print("Enter publisher: ");
            String publisher = sc.nextLine();
            System.out.print("Enter category (Literature/Fiction): ");
            String category = sc.nextLine();

            if (category.equalsIgnoreCase("Literature")) {
                books[i] = new Literature(publisher, title);
            } else if (category.equalsIgnoreCase("Fiction")) {
                books[i] = new Fiction(publisher, title);
            } else {
                System.out.println("Invalid category. Skipping book.");
                i--; // retry input
            }
        }

        System.out.println("\n--- Book Details ---");
        for (Book b : books) {
            if (b instanceof Literature) {
                ((Literature) b).display();
            } else if (b instanceof Fiction) {
                ((Fiction) b).display();
            }
        }

        sc.close();
    }
}
