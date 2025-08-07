package Students;

public class StudentOfRawenClaw extends StudentOfHogwarts {
     // Свойства факультета Когтевран
    // ум
    private int smart;

    // мудрость
    private int wise;

    // остроумие
    private int witty;

    // творчество
    private int creative;

    public int getSmart() {
        return smart;
    }

    public int getWise() {
        return wise;
    }

    public int getWitty() {
        return witty;
    }

    public int getCreative() {
        return creative;
    }

    public void setSmart(int smart) {
        this.smart = smart;
    }

    public void setWise(int wise) {
        this.wise = wise;
    }

    public void setWitty(int witty) {
        this.witty = witty;
    }

    public void setCreative(int creative) {
        this.creative = creative;
    }

    public StudentOfRawenClaw(String name, int powerOfWithcraft, int distanceOfTransgression, int smart, int wise, int witty, int creative) {
        this.setName(name);
        this.setPowerOfWitchcraft(powerOfWithcraft);
        this.setDistanceOfTransgression(distanceOfTransgression);
        this.setSmart(smart);
        this.setWise(wise);
        this.setWitty(witty);
        this.setCreative(creative);
    }

    public void PrintQualitiesSpecial()
    {
        System.out.println("Особые качества");
        String qualitiesSpecial = "Ум: " + smart + ", мудрость: " + wise + ", остроумие: " + witty + ", творчество: " + creative;
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
        int sum = this.getPowerOfWitchcraft() + this.getDistanceOfTransgression() + smart + wise + witty + creative;
        return sum;
    }

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