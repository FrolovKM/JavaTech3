package com.epam.konstantin_frolov.java.lesson3.task1;

import java.text.SimpleDateFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        new Main().run();
    }

    private void run() {
        try {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd.MM.yyyy");

            Student firstStudent = new Student("Ivan", "Ivanov", "J2EE Developer", simpleDateFormat.parse("30.05.2018"));
            Student secondStudent = new Student("Petr", "Petrov", "Java Developer", simpleDateFormat.parse("02.04.2018"));


            Course javaServletsCourse = new Course("Технология Java Servlets", 16);
            Course strutsFrameworkCourse = new Course("Struts Framework", 24);
            Course javaTechnologiesCourse = new Course("Обзор технологий Java", 8);
            Course JFCLibraryCourse = new Course("Библиотека JFC/Swing", 16);
            Course JDBCTechnologyCourse = new Course("Технология JDBC", 16);


            firstStudent.addCourse(javaServletsCourse);
            firstStudent.addCourse(strutsFrameworkCourse);

            secondStudent.addCourse(javaTechnologiesCourse);
            secondStudent.addCourse(JFCLibraryCourse);
            secondStudent.addCourse(JDBCTechnologyCourse);


            Center center = new Center();
            center.addStudent(firstStudent);
            center.addStudent(secondStudent);



            Scanner sc = new Scanner(System.in);
            System.out.println("Select operation:");
            System.out.println("1 - simple report");
            System.out.println("2 - full report");

            int key = sc.nextInt();
            if(key==1){
                center.printReport(false);
            }
            else if (key==2){
                center.printReport(true);
            }
            else System.out.println("Incorrect operation");

            sc.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}