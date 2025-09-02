package workshop;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Book class for individual book details
class Book {
    String author;
    boolean issued;
    Book nextBook;

    Book(String author) {
        this.author = author;
        this.issued = false;
        this.nextBook = null;
    }

    @Override
    public String toString() {
        return author + (issued ? " (issued)" : "");
    }
}

// Shelf class for a genre and linked list of books
class Shelf {
    String genre;
    Book listOfBook;

    Shelf(String genre, Book firstBook) {
        this.genre = genre;
        this.listOfBook = firstBook;
    }
}

public class BookShelf {

    static List<Shelf> shelfList = new ArrayList<>();

    static {
        System.out.println("Welcome to library");
    }

    // Add a book to the proper shelf or create new shelf if needed
    public static void put(String genre, String author) {
        Book newBook = new Book(author);

        for (Shelf shelf : shelfList) {
            if (shelf.genre.equals(genre)) {
                newBook.nextBook = shelf.listOfBook;
                shelf.listOfBook = newBook;
                return;
            }
        }

        // If genre not found, create new shelf
        Shelf newShelf = new Shelf(genre, newBook);
        shelfList.add(newShelf);
    }

    // Remove a book by author and genre
    public static void remove(String author, String genre) {
        for (Shelf shelf : shelfList) {
            if (shelf.genre.equals(genre)) {
                Book curr = shelf.listOfBook;
                Book prev = null;

                while (curr != null) {
                    if (curr.author.equals(author)) {
                        if (prev == null) {
                            shelf.listOfBook = curr.nextBook; // head book
                        } else {
                            prev.nextBook = curr.nextBook;
                        }
                        System.out.println("Book removed successfully");
                        return;
                    }
                    prev = curr;
                    curr = curr.nextBook;
                }
            }
        }
        System.out.println("Book not found");
    }

    // Display all books by genre
    public static void displayBooksInShelf() {
        if (shelfList.isEmpty()) {
            System.out.println("No books in the library.");
            return;
        }

        for (Shelf shelf : shelfList) {
            System.out.print(shelf.genre + " -> ");
            Book current = shelf.listOfBook;
            while (current != null) {
                System.out.print(current + (current.nextBook != null ? ", " : ""));
                current = current.nextBook;
            }
            System.out.println();
        }
    }

    // Main method for user interaction
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter 1 to add book ");
        System.out.println("Enter 2 to remove book");
        System.out.println("Enter 3 to display Book in shelf with genre");

        while (true) {
            System.out.print("Enter your choice: ");

            if (!input.hasNextInt()) {
                System.out.println("Invalid input. Please enter a number (1, 2, or 3).");
                input.nextLine();
                continue;
            }

            int choice = input.nextInt();
            input.nextLine(); // clear newline

            switch (choice) {
                case 1:
                    System.out.print("Enter the name of author: ");
                    String authorName = input.nextLine();
                    System.out.print("Enter the genre name: ");
                    String genre = input.nextLine();
                    put(genre, authorName);
                    break;

                case 2:
                    System.out.print("Enter the name of author: ");
                    String author = input.nextLine();
                    System.out.print("Enter the genre name: ");
                    String genreToRemove = input.nextLine();
                    remove(author, genreToRemove);
                    break;

                case 3:
                    displayBooksInShelf();
                    break;

                default:
                    System.out.println("Exiting program.");
            }
            input.close();
        }
    }
}
