package com.dosonping.transferObjectPattern;

public class TransferObjectPatternDemo {
    public static void main(String[] args) {
        StudenBO studentBusinessObject = new StudenBO();
        //输出所以学生
        for (StudentVO student :
                studentBusinessObject.getAllStudents()) {
            System.out.println("Student: [RollNo : " + student.getRollNo() + ", Name: " + student.getName() + "]");
        }

        //更新学生
        StudentVO student = studentBusinessObject.getAllStudents().get(0);
        student.setName("Michael");
        studentBusinessObject.updateStudent(student);

        //获取学生
        StudentVO student0 = studentBusinessObject.getStudent(0);
        System.out.println("Student: [RollNo : " + student0.getRollNo() + ", Name: " + student0.getName() + "]");
    }
}
