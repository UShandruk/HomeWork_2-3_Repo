package Students;

public class StudentOfHogwarts {
    // Имя
    private String name;

    // Сила колдовства (в баллах)
    private int powerOfWitchcraft;

    // Расстояние трансгрессии
    private int distanceOfTransgression;

    public void setName(String name) {
        this.name = name;
    }

    public void setPowerOfWitchcraft(int powerOfWitchcraft) {
        this.powerOfWitchcraft = powerOfWitchcraft;
    }

    public void setDistanceOfTransgression(int distanceOfTransgression) {
        this.distanceOfTransgression = distanceOfTransgression;
    }

    public int getPowerOfWitchcraft() {
        return powerOfWitchcraft;
    }

    public int getDistanceOfTransgression() {
        return distanceOfTransgression;
    }

    public String getName() {
        return name;
    }


    public void PrintQualitiesCommon()
    {
        System.out.println("Общие качества");
        String qualitiesCommon = "Сила колдовства (в баллах): " + powerOfWitchcraft + ", Расстояние трансгрессии: " + distanceOfTransgression;
        System.out.println(qualitiesCommon);
    }

    // Сравнить двух учеников по силе магии
    public static void CompareStudentsByPowerOfWitchcraft(StudentOfHogwarts studentOne, StudentOfHogwarts studentTwo) {
        String result = "";
        int studentOnePower = studentOne.getPowerOfWitchcraft();
        int studentTwoPower = studentTwo.getPowerOfWitchcraft();

        if (studentOnePower > studentTwoPower) {
            System.out.println(studentOne.getName() + " обладает бОльшей мощностью магии, чем " + studentTwo.getName() + ".");
        }
        else System.out.println(studentTwo.getName() + " обладает бОльшей мощностью магии, чем " + studentOne.getName() + ".");
    }

    // Сравнить двух учеников по расстоянию трансгрессии
    public static void CompareStudentsByDistanceOfTransgression(StudentOfHogwarts studentOne, StudentOfHogwarts studentTwo) {
        String result = "";
        int studentOnePower = studentOne.getPowerOfWitchcraft();
        int studentTwoPower = studentTwo.getPowerOfWitchcraft();

        if (studentOnePower > studentTwoPower) {
            System.out.println(studentOne.getName() + " обладает бОльшим расстоянием трансгрессии, чем " + studentTwo.getName() + ".");
        }
        else System.out.println(studentTwo.getName() + " обладает бОльшим расстоянием трансгрессии, чем " + studentOne.getName() + ".");
    }
}