package com.kh.hw.person.controller;

import com.kh.hw.person.model.vo.Employee;
import com.kh.hw.person.model.vo.Student;

public class PersonController {

    private Student s;
    private Employee e;
    private Student[] sa;
    private Employee[] ea;


    public PersonController() {
        s = new Student();
        e = new Employee();
        sa = new Student[3];
        ea = new Employee[10];
    }

    public int[] personCount() {
        int[] count = new int[2];
        int a = 0;
        int b = 0;
        for (Student student : sa) {
            if (student == null) break;
            a++;
        }
        for (Employee employee : ea) {
            if (employee == null) break;
            b++;
        }
        count[0] = a;
        count[1] = b;
        return count;
    }

    public void insertStudent(String name, int age, double height, double weight, int grade, String major) {
        s.setName(name);
        s.setAge(age);
        s.setHeight(height);
        s.setWeight(weight);
        s.setGrade(grade);
        s.setMajor(major);

        for (Student student : sa) {
            if(student == null) {
                student = s;
                break;
            }
        }
    }

    public Student[] printStudent() {
        return sa;
    }

    public void intsertEmployee(String name, int age, double height, double weight, int salary, String dept) {
        e.setName(name);
        e.setAge(age);
        e.setHeight(height);
        e.setWeight(weight);
        e.setSalary(salary);
        e.setDept(dept);


        for (Employee employee : ea) {
            if(employee == null) {
                employee = e;
                break;
            }
        }
    }

    public Employee[] printEmployee() {
        return ea;
    }

}
