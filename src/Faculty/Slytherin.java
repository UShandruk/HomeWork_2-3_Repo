package Faculty;

import Students.StudentOfSlytherin;

// Факультет Слизерин
public class Slytherin extends Hogwarts {
    // хитрость
    int cunning;

    // решительность
    int determination;

    // честолюбие
    int ambition;

    // изворотливость
    int resourcefulness;

    // жажда власти
    int thirstForPower;

    // Сравнить учеников
    public static void CompareStudents(StudentOfSlytherin studentOne, StudentOfSlytherin studentTwo) {
        String result = "";
        int studentOneSum = studentOne.GetSumAll();
        int studentTwoSum = studentTwo.GetSumAll();

        System.out.println(studentOne.getName() + "(" + studentOneSum + ") баллов");
        System.out.println(studentTwo.getName() + "(" + studentTwoSum + ") баллов");

        if (studentOneSum > studentTwoSum) {
            System.out.println(studentOne.getName() + " - лучший Слизеринец, чем " + studentTwo.getName() + ".");
        }
    }
}
