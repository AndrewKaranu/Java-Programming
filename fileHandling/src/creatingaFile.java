
import java.io.File;
public class creatingaFile {
    public static void main(String[] args) {

        //Create a new file using the file object
        File txt = new File("abc.txt");

        //Check if file exists
        System.out.println(txt.exists());

        //Check your current working directory
        String currentDirectory = System.getProperty("user.dir");
        //Display current working directory
        System.out.println("The current working directory is: "+ currentDirectory);

        File srcFolder = new File("src");
        System.out.println(srcFolder.exists());


        //Using the file object
        //method- description
        //createNewFile()-  This function creates new empty file. The function returns true if the abstract file path does not exist and a new file is created. It returns false if the filename already exists.

        //canWrite()- This function determines whether the program can write the file denoted by the abstract path name.The function returns true if the abstract file path exists and the application is allowed to write the file.

        //canRead()- This function determines whether the program can read the file denoted by the abstract pathname. The function returns true if the abstract file path exists and the application is allowed to read the file

        //isDirectory()-This function determines whether there is a file or directory denoted by the abstract filename is Directory or not.The function returns true if the abstract file path is Directory else returns false.

        //getName()- This function returns the Name of the given file object. The function returns a string object which contains the Name of the given file object.If the abstract path does not contain any name then a null string is returned.

        //lastModified()- This function returns the time denoted by the abstract pathname was last modified.The function returns long value measured in milliseconds, representing the time the file was last modified else returns 0L if the file does not exist or if an exception occurs.

        //mkdir()- The mkdir() function is used to create a new directory denoted by the abstract pathname. The function returns true if directory is created else returns false.

        //delete()- The delete() method deletes the file or directory denoted by the abstract pathname. If the pathname is a directory, that directory must be empty to delete.

        //list()- The function returns an array of string denoting the files in a given abstract pathname if the path name is a directory else returns null. The function is an overloaded function. One of the function does not have any parameter and the other function takes FilenameFilter object as parameter
    }
}
