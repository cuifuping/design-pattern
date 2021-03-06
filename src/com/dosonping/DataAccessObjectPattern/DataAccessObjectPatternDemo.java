package com.dosonping.DataAccessObjectPattern;
//使用 StudentDao 来演示数据访问对象模式的用法
public class DataAccessObjectPatternDemo {
    public static void main(String[] args) {
        StudentDao studentDao = new StudentDaoImpl();
        //输出所有的学生
        for (Student student :
                studentDao.getAllStudent()) {
            System.out.println("Student [Roll No:" + student.getRollNo() + ", name: " + student.getName() + "]");
        }

        //更新学生
        Student student = studentDao.getAllStudent().get(0);
        student.setName("michel");
        studentDao.updateStudent(student);

        //获取学生
        studentDao.getStudent(0);
        System.out.println("Student [Roll No:" + student.getRollNo() + ", name: " + student.getName() + "]");
    }
}
