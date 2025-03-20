class student{
    int rollno;
    String name;
}


public class Main {
    public static void main(String[] args) {
        
        student s1 = new student();
        s1.rollno = 4;
        s1.name = "Rajdwip";
        System.out.println(s1.rollno);
        System.out.println(s1.name);

        student s2 = new student();
        s2.name = "Satay";
        System.out.println(s2.rollno);
        System.out.println(s2.name);

    }
}
