import java.io.*;
import java.util.Scanner;
import java.lang.Integer;

public class fileExcercise {
    //Ask user for name and age
    //Write them to a file

    public static void InputtoPrint()throws IOException{
        FileWriter fileWriter = new FileWriter("Details.txt",true);

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter your name: ");
        String name = br.readLine();

        System.out.println("Enter your age: ");
        String ageStr =  br.readLine();
        int age = Integer.parseInt(ageStr);


        fileWriter.write("Name: "+name);
        fileWriter.write("\n");
        fileWriter.write("Age: "+age);
        fileWriter.write("\n");

        System.out.println("Information successfully written to Details.txt");

        fileWriter.close();
    }



    public static void Printfromfile() throws IOException {
            FileReader fileReader = new FileReader("Details.txt");
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }

            bufferedReader.close();
        }

    public static void main(String[] args) throws IOException{
        FileWriter fileWriter = new FileWriter("Details.txt",true);

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int choice = 0;

        do {
            System.out.println("Enter a choice: \n1.Enter new details->\n2.Print all details->\n3.Exit->");
            String choicestr = br.readLine();
            choice = Integer.parseInt(choicestr);
            if (choice==1){
                InputtoPrint();
            } else if (choice==2) {
                Printfromfile();
            } else if (choice==3) {
                System.out.println("Goodbye!");
            } else {
                System.out.println("Invalid option");
            }
        } while (choice != 3);
    }

}
