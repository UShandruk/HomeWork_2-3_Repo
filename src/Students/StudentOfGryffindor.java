package Students;

public class StudentOfGryffindor extends StudentOfHogwarts {
    // Свойства факультета Гриффиндор
    // благородство
    private int nobility;

    // честь
    private int honor;

    // храбрость
    private int bravery;

    public int getNobility() {
        return nobility;
    }

    public int getBravery() {
        return bravery;
    }

    public int getHonor() {
        return honor;
    }

    public void setNobility(int nobility) {
        this.nobility = nobility;
    }

    public void setHonor(int honor) {
        this.honor = honor;
    }

    public void setBravery(int bravery) {
        this.bravery = bravery;
    }

    public StudentOfGryffindor(String name, int powerOfWithcraft, int distanceOfTransgression, int nobility, int honor, int bravery) {
        this.setName(name);
        this.setPowerOfWitchcraft(powerOfWithcraft);
        this.setDistanceOfTransgression(distanceOfTransgression);
        this.setNobility(nobility);
        this.setHonor(honor);
        this.setBravery(bravery);
    }

    public void PrintQualitiesSpecial()
    {
        System.out.println("Особые качества");
        String qualitiesSpecial = "Благородство: " + nobility + ", честь: " + honor + ", храбрость: " + bravery;
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
        int sum = this.getPowerOfWitchcraft() + this.getDistanceOfTransgression() + nobility + honor + bravery;
        return sum;
    }

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