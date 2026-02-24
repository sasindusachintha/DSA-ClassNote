
import java.util.Scanner;

class student {

    String name;
    int age;

    student(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

public class insertiontask {

    public static int linear(student[] std, String key) {
        int n = std.length;
        int count = 0;

        for (int i = 0; i < n; i++) {
            count++;
            if (std[i].name.equalsIgnoreCase(key)) {

                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {

        student[] std = new student[10];

        Scanner sc = new Scanner(System.in);

        String name;
        int age;

        for (int i = 0; i < 10; i++) {
            System.out.print("Enter name of student " + (i + 1) + " : ");
            name = sc.nextLine();

            System.out.print("Enter age of student " + (i + 1) + " : ");
            age = sc.nextInt();

            sc.nextLine();

            std[i] = new student(name, age);

        }

        System.out.println("Enter name to Search: ");
        String sname = sc.nextLine();

        int index = linear(std, sname);

        if (index != -1) {
            System.out.println("Student age is: " + std[index].age);
        } else {
            System.out.println("Student not found!");
        }

    }
}
