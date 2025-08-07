package Faculty;

import Students.StudentOfPuffindui;

// Факультет Пуффендуй
public class Puffendui extends Hogwarts {
    // трудолюбие
    int hardworking;

    // верность
    int loyal;

    // честность
    int honest;

    // Сравнить учеников
    public static void CompareStudents(StudentOfPuffindui studentOne, StudentOfPuffindui studentTwo) {
        String result = "";
        int studentOneSum = studentOne.GetSumAll();
        int studentTwoSum = studentTwo.GetSumAll();

        System.out.println(studentOne.getName() + "(" + studentOneSum + ") баллов");
        System.out.println(studentTwo.getName() + "(" + studentTwoSum + ") баллов");

        if (studentOneSum > studentTwoSum) {
            System.out.println(studentOne.getName() + " - лучший Пуффендуец, чем " + studentTwo.getName() + ".");
        }
    }
}