package Faculty;
import Students.Student;


// Школе магии и волшебства Хогвартс
public class Hogwarts {
    // Сравнить двух учеников по силе магии
    public static void CompareStudentsByPowerOfWitchcraft(Student studentOne, Student studentTwo) {
        String result = "";
        int studentOnePower = studentOne.getPowerOfWitchcraft();
        int studentTwoPower = studentTwo.getPowerOfWitchcraft();

        if (studentOnePower > studentTwoPower) {
            System.out.println(studentOne.getName() + " обладает бОльшей мощностью магии, чем " + studentTwo.getName() + ".");
        }
        else System.out.println(studentTwo.getName() + " обладает бОльшей мощностью магии, чем " + studentOne.getName() + ".");
    }

    // Сравнить двух учеников по расстоянию трансгрессии
    public static void CompareStudentsByDistanceOfTransgression(Student studentOne, Student studentTwo) {
        String result = "";
        int studentOnePower = studentOne.getPowerOfWitchcraft();
        int studentTwoPower = studentTwo.getPowerOfWitchcraft();

        if (studentOnePower > studentTwoPower) {
            System.out.println(studentOne.getName() + " обладает бОльшим расстоянием трансгрессии, чем " + studentTwo.getName() + ".");
        }
        else System.out.println(studentTwo.getName() + " обладает бОльшим расстоянием трансгрессии, чем " + studentOne.getName() + ".");
    }
}