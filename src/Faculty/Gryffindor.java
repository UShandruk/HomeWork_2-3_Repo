package Faculty;

import Students.StudentOfGryffindor;

// Факультет Гриффиндор
public class Gryffindor extends Hogwarts {
    // благородство
    int nobility;

    // честь
    int honor;

    // храбрость
    int bravery;

    // Сравнить учеников
    public static void CompareStudents(StudentOfGryffindor studentOne, StudentOfGryffindor studentTwo) {
        String result = "";
        int studentOneSum = studentOne.GetSumAll();
        int studentTwoSum = studentTwo.GetSumAll();

        System.out.println(studentOne.getName() + "(" + studentOneSum + ") баллов");
        System.out.println(studentTwo.getName() + "(" + studentTwoSum + ") баллов");

        if (studentOneSum > studentTwoSum) {
            System.out.println(studentOne.getName() + " - лучший Гриффиндорец, чем " + studentTwo.getName() + ".");
        }
    }
}