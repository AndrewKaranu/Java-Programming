import java.io.FileWriter;
import java.io.IOException;
public class writingtoFiles {
    public static void main(String[] args) throws IOException {
        //Create an instance of the Filewriter class
        FileWriter fileWriter = new FileWriter("abc.txt",false);
        //Write to file
        fileWriter.write("Sample text");

        //Insert a new line
        fileWriter.write("\n");

        //Create an array of characters to write to file

        char mycharactersArray[] = new char[]{'a','b','c'};
        fileWriter.write(mycharactersArray);


            //Close file
        fileWriter.close();

    }
}
