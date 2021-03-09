package com.dosonping.modelViewController;
//使用 StudentController 方法来演示 MVC 设计模式的用法。
public class MVCPatternDemo {
    public static void main(String[] args) {
        Student student = retrieveStudentFromDatabase();

        StudentView view = new StudentView();
        StudentController controller = new StudentController(student,view);
        controller.updateView();

        controller.setStudentName("John");

        controller.updateView();
    }
    private static Student retrieveStudentFromDatabase() {
        Student student = new Student();
        student.setRollNo("10");
        student.setName("Robert");
        return student;
    }
}
