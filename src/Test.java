public class Test {
    public static void main(String[] args){

        Course course1 = new Course("MIS102","Computer Programing II",
                "Tolga ERDEM","Java How to Program, 9th Edition");

        Course course2 = new Course("MIS204","Database Management",
                "Vildan KAYAKURT","An Introduction to Database Systems, 8th Edition");

        Student student1 = new Student(30040715,"Meltem"," KAYA",
                "Management Information Systems");
        Student student2 = new Student(30040721,"Muahmmed Yavuz"," KILIÇ",
                "Management Information Systems");

        Course[] courses = {course1,course2};
        for (Course course : courses) {
            System.out.println(course.courseID + "--" + course.courseName + "\n" + course.courseInstructor
                    + "\n" + course.courseBook);
            System.out.println("-----------------------------");
        }

        Student[] students = {student1,student2};
        for (Student student : students) {
            System.out.println(student.studentID + "\n" + student.studentName +
                    student.studentLastName + "\n" + student.studentDepartment);
            System.out.println("-----------------------------");

        }

        StudentManager studentManager = new StudentManager();
        studentManager.addStudent(student1);
        studentManager.addStudent(student2);


    }
}
