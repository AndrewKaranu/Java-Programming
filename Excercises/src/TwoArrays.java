import java.util.*;
public class TwoArrays {
    //Have two arrays
    //1st 5 names
    //2nd ages
    //The two arrays correspond to each other

    //Find the smallest age
    //print name of the youngest


    public static void main(String[] args) {
        String names[] = Getusernames();
        int ages[] = Getuserages();
        smallestAge(ages,names);

    }

    public static String[] Getusernames(){
        String usernamesArray[] = new String[5];
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the student names: ");

        for (int i = 0; i<usernamesArray.length; i++){
            usernamesArray[i] = input.next();
        }

        return usernamesArray;
    }

    public static int[] Getuserages(){
        int userageArray[] = new int[5];
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the student ages: ");

        for (int i = 0; i<userageArray.length; i++){
            userageArray[i] = input.nextInt();
        }

        return userageArray;
    }
    static void smallestAge(int ages[],String names[]){
        int smallestage = ages[0];
        int youngestIndex = 0;

        for (int i = 0; i < ages.length; i++) {
            if (ages[i] > smallestage) {
                smallestage = smallestage;
            } else if (ages[i] < smallestage) {
                smallestage = ages[i];
                youngestIndex = i;
            }
        }
        System.out.println("The youngest student is "+names[youngestIndex]+" who is "+smallestage+" years old.");
    }

    }

