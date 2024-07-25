import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Animal> animals = new ArrayList<>();
        while (true) {
            System.out.println("Enter a name:");
            String animalName = scanner.nextLine();
            if (animalName.isEmpty()) {
                break;
            }
            System.out.println("Is it a dog? (Yes or no)");
            String isDog = scanner.nextLine();
           if( isDog.equalsIgnoreCase("Yes")) {
               boolean isDogBoolean = true;
               animals.add(new Animal(animalName, isDogBoolean));
           } else if( isDog.equalsIgnoreCase("No")) {
               animals.add(new Animal(animalName));
           } else {
               System.out.println("Invalid input. Please enter either 'Yes' or 'No'.");
           }
        }
        for (Animal animal: animals) {
            System.out.println("Name: " + animal.getName());
            System.out.println("Is a dog: " + animal.getIsDog());
            System.out.println(animal);
        }
        ArrayList<TvShow> showList = new ArrayList<>();
        while (true) {
            System.out.print("Enter a show title: ");
            String showTitle = scanner.nextLine();
            if (showTitle.isEmpty()) {
                break;
            }
            System.out.print("Enter the number of episodes: ");
            int numberOfEpisodes = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Enter the genre (leaving blank will make it unknown): ");
            String genre = scanner.nextLine();
            if (genre.isEmpty()) {
                showList.add(new TvShow(showTitle, numberOfEpisodes));
            }
            showList.add(new TvShow(showTitle, numberOfEpisodes, genre));
        }
        for (TvShow show: showList) {
            System.out.println("title: " + show.getTitle() + " episodes: " + show.getEpisodeCount() + " genre: "
                    + show.getGenre());
            System.out.println(show);
        }
        ArrayList<Book> books = new ArrayList<>();
        while (true) {
            System.out.print("Enter a book title: ");
            String bookTitle = scanner.nextLine();
            if (bookTitle.isEmpty()) {
                break;
            }
            System.out.print("Enter number of pages (For default put 0): ");
            int pageNum = scanner.nextInt();
            System.out.print("Enter the publication year: ");
            int publicationYear = scanner.nextInt();
            scanner.nextLine();
            if (pageNum == 0) {
                books.add(new Book(bookTitle, publicationYear));
            } else {
                books.add(new Book(bookTitle, pageNum, publicationYear));
            }
        }
        System.out.print("Do you want to see just the book titles, the page numbers," +
                " the publication year, or everything (name, pages, publication): ");
        while (scanner.hasNextLine()) {
            String choice = scanner.nextLine();
            if (choice.equalsIgnoreCase("name")) {
                for (Book book : books) {
                    System.out.println("Title: " + book.getTitle());
                }
                break;
            } else if (choice.equalsIgnoreCase("pages")) {
                for (Book book : books) {
                    System.out.println("Page counts: " + book.getPageNumber());
                }
                break;
            } else if (choice.equalsIgnoreCase("publications")) {
                for (Book book : books) {
                    System.out.println("Publication year: " + book.getPublicationYear());
                }
                break;
            } else if (choice.equalsIgnoreCase("everything")) {
                for (Book book : books) {
                    System.out.println(book);
                }
                break;
            } else {
                System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
