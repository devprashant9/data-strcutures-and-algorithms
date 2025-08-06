import java.util.*;

public class ComparableObjects {

    public static class Student implements Comparable<Student> {
        String name;
        int roll;

        Student(String name, int roll) {
            this.name = name;
            this.roll = roll;
        }

        @Override
        public int compareTo(Student obj) {
            return this.roll - obj.roll;
        }

        @Override
        public String toString() {
            return name + " (" + roll + ")";
        }
    }

    public static void main(String[] args) {
        Student obj1 = new Student("Prashant", 24);
        Student obj2 = new Student("Ankit", 22);
        Student obj3 = new Student("Nikhil", 20);

        List<Student> list = new ArrayList<>();
        list.add(obj1);
        list.add(obj2);
        list.add(obj3);

        Collections.sort(list); // sort by roll

        System.out.println(list); // sorted by roll number
    }
}
