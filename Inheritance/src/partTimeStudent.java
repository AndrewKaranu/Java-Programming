public class partTimeStudent extends Student{

    void displayModeOfStudy(){
        System.out.println("Mode of study: "+modeOfStudy);
    }
    public partTimeStudent(String adminNo, String firstName, String lastName, String course, String email, String modeOfStudy){
        this.adminNo = adminNo;
        this.firstName = firstName;
        this.lastName = lastName;
        this.course = course;
        this.email = email;
        this.modeOfStudy = modeOfStudy;
    }


}
