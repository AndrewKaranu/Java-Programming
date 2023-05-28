import java.awt.*;
import java.util.Scanner;
import java.util.Arrays;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
//This app will allow a user to create a new movie, view all movies, modify or update a movie and delete a movie
//The app will have an interactive menu

public class Main {
    public static void main(String[] args) {
        String movieTitle[] = new  String[10];
        String movieDirector[] = new String[10];
        int movieyear[] = new int[10];

        menu(movieTitle,movieDirector,movieyear);

        }

        static void menu(String[] Title, String[] Director, int[] Year) {
            Scanner input = new Scanner(System.in);

            String menu = "CPL MOVIES SYSTEM \nWELCOME! CHOOSE AN OPTION IN THE MENU: \n1. Add a movie \n2. See the movies in your library \n3. Update a movie\n4. Find a movie by its title  \n5. To delete a movie \n6. To quit \nEnter choice: ";
            int count = 0;
            File file = new File("movies.txt");
            if (file.exists()) {
                try {
                    Scanner scanner = new Scanner(file);
                    while (scanner.hasNextLine()) {
                        Title[count] = scanner.nextLine();
                        Director[count] = scanner.nextLine();
                        Year[count] = scanner.nextInt();
                        scanner.nextLine(); // consume the newline character
                        count++;
                    }
                    scanner.close();
                } catch (FileNotFoundException e) {
                    System.out.println("Error reading file: " + e.getMessage());
                }
            }


            boolean isTrue = true;
            int userInput = 0;
             do {
                 System.out.println(menu);
                 userInput = input.nextInt();
                 input.nextLine();
//                 Scanner is not consuming the newline character (\n) after reading the integer input for the user's menu choice. As a result, when you subsequently try to read the movie title using input.nextLine(), it reads the remaining newline character instead of the actual input entered by the user.
                if (userInput == 1) {
                    //Add movies
                    System.out.println("Enter the movie name: ");
                    String movieTitle = input.nextLine();


                    System.out.println("Enter the movie director: ");
                    String movieDirector = input.nextLine();

                    System.out.println("Enter the movie release year: ");
                    int movieYear = input.nextInt();
                    input.nextLine();

                    //Add movie name,director and year to array
                    Title[count] = movieTitle;
                    Director[count] = movieDirector;
                    Year[count] = movieYear;

                    count++;
                    System.out.println(movieTitle + " (" + movieYear + ") directed by " + movieDirector+" has been added.");

                } else if (userInput == 2) {
                for (int i = 0; i < count; i++) {
                    System.out.println(Title[i] + " (" + Year[i] + ") directed by " + Director[i]);
                }
                } else if (userInput == 3) {
                    System.out.println("Enter the movie name you would like to update: ");
                    String updateTitle = input.nextLine();
                    int updateIndex = Arrays.asList(Title).indexOf(updateTitle);


                    System.out.println("Enter the updated movie title: ");
                    String newTitle = input.nextLine();

                    System.out.println("Enter the updated movie director: ");
                    String newDirector = input.nextLine();

                    System.out.println("Enter the updated movie release year: ");
                    int newYear = input.nextInt();

                    Title[updateIndex] = newTitle;
                    Director[updateIndex] = newDirector;
                    Year[updateIndex] = newYear;


                } else if (userInput == 4) {
                    System.out.println("Enter the movie title you would like to find: ");
                    String findTitle = input.nextLine();
                    int searchIndex = Arrays.asList(Title).indexOf(findTitle);
                    System.out.println("The movie you are looking for is:\n"+Title[searchIndex] + " (" + Year[searchIndex] + ") directed by " + Director[searchIndex]);


                } else if (userInput == 5) {
                    System.out.println("Enter the movie title you would like to delete: ");
                    String deleteTitle = input.nextLine();
                    int deleteIndex = Arrays.asList(Title).indexOf(deleteTitle);
                    System.out.println("Are you sure you want to delete:"+Title[deleteIndex] + " (" + Year[deleteIndex] + ") directed by " + Director[deleteIndex]+"\n1. yes \n2. no");
                    int choice = input.nextInt();
                    if (choice==1) {
                        // Delete movie at index i
                        for (int i = deleteIndex; i < count - 1; i++) {
                            Title[i] = Title[i + 1];
                            Director[i] = Director[i + 1];
                            Year[i] = Year[i + 1];
                        }
                        count--;
                        System.out.println(Title[deleteIndex] + " (" + Year[deleteIndex] + ") directed by " + Director[deleteIndex]+" has been deleted");
                    }

                } else if (userInput==6) {
                    System.out.println("Good Bye!");
                    try {
                        PrintWriter writer = new PrintWriter(file);
                        for (int i = 0; i < count; i++) {
                            writer.println(Title[i]);
                            writer.println(Director[i]);
                            writer.println(Year[i]);
                        }
                        writer.close();
                    } catch (FileNotFoundException e) {
                        System.out.println("Error writing file: " + e.getMessage());
                    }
                    break;
                } else {
                    System.out.println("Invalid input");

                }
            }  while (userInput!=6);
        }



}


