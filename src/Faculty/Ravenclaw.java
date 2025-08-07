package Faculty;

import Students.StudentOfRawenClaw;

// Факультет Когтевран
public class Ravenclaw extends Hogwarts {
    // ум
    int smart;

    // мудрость
    int wise;

    // остроумие
    int witty;

    // творчество
    int creative;

    // Сравнить учеников
    public static void CompareStudents(StudentOfRawenClaw studentOne, StudentOfRawenClaw studentTwo) {
        String result = "";
        int studentOneSum = studentOne.GetSumAll();
        int studentTwoSum = studentTwo.GetSumAll();

        System.out.println(studentOne.getName() + "(" + studentOneSum + ") баллов");
        System.out.println(studentTwo.getName() + "(" + studentTwoSum + ") баллов");

        if (studentOneSum > studentTwoSum) {
            System.out.println(studentOne.getName() + " - лучший Когтевранец, чем " + studentTwo.getName() + ".");
        }
    }
}