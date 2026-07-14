package oops;

class 1 {
    int roll;
    int marks;
    String name;
    void print()
    {
        System.out.println("Roll: "+roll+" Name: "+name+" Marks: "+marks);
    }
}
public class main{
    public static void main(String[]args) {
        Students std = new Students();
        std.name = "John Doe";
        std.roll = 11;
        std.marks = 85.5;

        std.print();
    }
}