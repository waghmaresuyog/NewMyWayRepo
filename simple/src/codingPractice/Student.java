package codingPractice;

import java.util.ArrayList;

public class Student {

    private String name;
    private int rollNo;
    private ArrayList<String> subject;

    public Student(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
        this.subject = new ArrayList<String>();
    }

    public String getName() {
        return name;
    }

    public int getRollNo() {
        return rollNo;
    }

    public ArrayList<String> getSubject() {
        return subject;
    }

    public void addSubject(String sub) {
        subject.add(sub);
    }

    public void removeSubjet(String sub) {
        subject.remove(sub);
    }

    public void printStudentDetails() {
        System.out.println("Name is : " + name);
        System.out.println("Roll No is :" + rollNo);
    }
}
