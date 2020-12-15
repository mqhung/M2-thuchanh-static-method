public class TestStaticMethod {
    public static void main(String args[]) {
        Student.change(); //calling change method

        //creating objects
        Student s1 = new Student(1, "Mai Quang Hung");

        //calling display method
        s1.display();
    }
}
