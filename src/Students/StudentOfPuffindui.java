package Students;

public class StudentOfPuffindui extends StudentOfHogwarts {
    // Свойства факультета Пуффендуй
    // трудолюбие
    private int hardworking;

    public int getLoyal() {
        return loyal;
    }

    public void setHardworking(int hardworking) {
        this.hardworking = hardworking;
    }

    public void setLoyal(int loyal) {
        this.loyal = loyal;
    }

    public void setHonest(int honest) {
        this.honest = honest;
    }

    public int getHardworking() {
        return hardworking;
    }

    public int getHonest() {
        return honest;
    }

    // верность
    private int loyal;

    // честность
    private int honest;

    public StudentOfPuffindui(String name, int powerOfWithcraft, int distanceOfTransgression, int hardworking, int loyal, int honest) {
        this.setName(name);
        this.setPowerOfWitchcraft(powerOfWithcraft);
        this.setDistanceOfTransgression(distanceOfTransgression);
        this.setHardworking(hardworking);
        this.setLoyal(loyal);
        this.setHonest(honest);

    }


    public void PrintQualitiesSpecial()
    {
        System.out.println("Особые качества");
        String qualitiesSpecial = "Трудолюбие: " + hardworking + ", верность: " + loyal + ", честность: " + honest;
        System.out.println(qualitiesSpecial);
    }

    public void PrintQualitiesAll()
    {
        System.out.println(this.getName());
        PrintQualitiesCommon();
        PrintQualitiesSpecial();
        System.out.println();
    }

    // Получить сумму всех качеств
    public int GetSumAll()
    {
        int sum = this.getPowerOfWitchcraft() + this.getDistanceOfTransgression() + hardworking + loyal + honest;
        return sum;
    }

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