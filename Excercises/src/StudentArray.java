public class StudentArray {
    public static void main(String[] args) {
        // Create two arrays one for marks and one for grades and translate the marks to their respective grade and fill the grade array
        int marks[] = new  int[]{90,60,69,-50,102};
        String grades[] = new String[5];

        for (int i = 0; i<marks.length; i++) {
            if (marks[i]>=70 && marks[i]<=100){
                grades[i] = "A";
            } else if (marks[i]>=60 && marks[i]<=69) {
                grades[i] = "B";
            }else if (marks[i]>=50 && marks[i]<=59) {
                grades[i] = "C";
            }else if (marks[i]>=40 && marks[i]<=49) {
                grades[i] = "D";
            } else if (marks[i]>=0 && marks[i]<=39) {
                grades[i] = "E";
            } else if (marks[i]>100 || marks[i]<0){
                grades[i] = "Impossible Grade";
            }

            System.out.println("Student "+(i+1)+" has a mark of "+marks[i]+" which gives grade: "+grades[i]);
        }
        }

    }

