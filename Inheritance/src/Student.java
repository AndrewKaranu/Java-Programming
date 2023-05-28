class Student{
    String adminNo;
    String firstName;
    String lastName;
    String course;
    String modeOfStudy;
    String email;

    public Student(){
        this.adminNo = "23/00001";
        this.firstName = "Andrew";
        this.lastName = "Karanu";
        this.course = "Java Programming";
        this.email = "andrew@gmail.com";
    }



    public void displayStudentInfo(){
        System.out.println(String.format("Student information\nAdmission no: %s\nFirst name: %s\nLast name: %s\nCourse: %s\nEmail: %s\nMode of study: %s",adminNo,firstName,lastName,course,email,modeOfStudy));
    }

}