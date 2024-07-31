public class MVCPatternExample {
    public static void main(String[] args) {
        // Create a Student object (Model)
        Student student = new Student();
        student.setName("ELAKKIYAA");
        student.setId("12345");
        student.setGrade("A");

        // Create a StudentView object (View)
        StudentView view = new StudentView();

        // Create a StudentController object (Controller)
        StudentController controller = new StudentController(student, view);

        // Display the initial details
        controller.updateView();

        // Update the student details using the controller
        controller.setStudentName("Jane Smith");
        controller.setStudentGrade("B");

        // Display the updated details
        controller.updateView();
    }
}
