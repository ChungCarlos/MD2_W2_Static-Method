package com.codegym;

public class TestStaticMethod {
    public static void main(String[] args) {
        Student.change(); // goi thay doi phuong thuc...

        // Tao moi obj...
        Student s1 = new Student(169, "Cong");
        Student s2 = new Student(196, "Tuan");
        Student s3 = new Student(111, "Dung");

        // Hien thi...
        s1.display();
        s2.display();
        s3.display();
    }
}
