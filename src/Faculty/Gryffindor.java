package Faculty;

import Students.Student;
import Students.StudentOfGryffindor;

import java.util.ArrayList;

// Факультет Гриффиндор
public class Gryffindor extends Hogwarts {
    // благородство
    int nobility;

    // честь
    int honor;

    // храбрость
    int bravery;

    public Gryffindor(int bravery, int honor, int nobility) {
        this.bravery = bravery;
        this.honor = honor;
        this.nobility = nobility;
    }

    // Сравнить учеников
    public static void CompareStudents(StudentOfGryffindor studentOne, StudentOfGryffindor studentTwo) {
        String result = "";
        int studentOneSum = studentOne.GetSum();
        int studentTwoSum = studentTwo.GetSum();
        if (studentOneSum > studentTwoSum) {
            System.out.println(studentOne.getName() + "(" + studentOneSum + ") баллов");
            System.out.println(studentTwo.getName() + "(" + studentTwoSum + ") баллов");
        }
    }
}