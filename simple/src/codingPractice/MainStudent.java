package codingPractice;

public class MainStudent {
    public static void main(String[] args) {
        Student studentOne = new Student("Deepak", 01);
        Student studentTwo = new Student("Tanaji", 02);
        System.out.println("Student details is :");
        studentOne.printStudentDetails();
        studentTwo.printStudentDetails();

        System.out.println("Adding Subject to Student :" + studentOne.getName());
        studentOne.addSubject("Math");
        studentOne.addSubject("Java");
        System.out.println("Student Name : " + studentOne.getName() + "  Subject is " + studentOne.getSubject());
        System.out.println("Adding Subject to student  " + studentTwo.getName());
        studentTwo.addSubject("Matlab");
        studentTwo.addSubject("python");
        System.out.println("Student name : " + studentTwo.getName() + "  Subject is : " + studentTwo.getSubject());
        System.out.println("removing subject form " + studentOne.getName());
        studentOne.removeSubjet("Math");
        System.out.println("after removing subject of " + studentOne.getName() +
                " is : " + studentOne.getSubject());


    }
}
