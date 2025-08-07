package Students;

public class StudentOfSlytherin extends StudentOfHogwarts {
    // Свойства факультета Слизерин
    // хитрость
    private int cunning;

    // решительность
    private int determination;

    // честолюбие
    private int ambition;

    // изворотливость
    private int resourcefulness;

    // жажда власти
    private int thirstForPower;

    public int getCunning() {
        return cunning;
    }

    public int getDetermination() {
        return determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public int getThirstForPower() {
        return thirstForPower;
    }

    public void setCunning(int cunning) {
        this.cunning = cunning;
    }

    public void setDetermination(int determination) {
        this.determination = determination;
    }

    public void setAmbition(int ambition) {
        this.ambition = ambition;
    }

    public void setResourcefulness(int resourcefulness) {
        this.resourcefulness = resourcefulness;
    }

    public void setThirstForPower(int thirstForPower) {
        this.thirstForPower = thirstForPower;
    }

    public StudentOfSlytherin(String name, int powerOfWithcraft, int distanceOfTransgression, int cunning, int determination, int ambition, int resourcefulness, int thirstForPower) {
        this.setName(name);
        this.setPowerOfWitchcraft(powerOfWithcraft);
        this.setDistanceOfTransgression(distanceOfTransgression);
        this.setCunning(cunning);
        this.setDetermination(determination);
        this.setAmbition(ambition);
        this.setResourcefulness(resourcefulness);
        this.setThirstForPower(thirstForPower);
    }

    public void PrintQualitiesSpecial()
    {
        System.out.println("Особые качества");
        String qualitiesSpecial = "Хитрость: " + cunning + ", решительность: " + determination + ", честолюбие: " + ambition + ", изворотливость: " + resourcefulness + ", жажда власти: " + thirstForPower;
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
        int sum = this.getPowerOfWitchcraft() + this.getDistanceOfTransgression() + this.getCunning() + this.getDetermination() + this.getAmbition() + this.getResourcefulness() + this.getThirstForPower();
        return sum;
    }

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