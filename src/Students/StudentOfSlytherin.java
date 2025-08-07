package Students;

public class StudentOfSlytherin extends Student {
    /*// Сила колдовства (в баллах)
    int powerOfWitchcraft;

    // Расстояние трансгрессии
    int distanceOfTransgression;*/

    // Свойства факультета Слизерин
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

    public StudentOfSlytherin(String name, int powerOfWithcraft, int distanceOfTransgression, int cunning, int determination, int ambition, int resourcefulness, int thirstForPower) {
        this.name = name;
        this.powerOfWitchcraft = powerOfWithcraft;
        this.distanceOfTransgression = distanceOfTransgression;
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.thirstForPower = thirstForPower;
    }

    public void PrintQualitiesSpecial()
    {
        System.out.println("Особые качества");
        String qualitiesSpecial = "Хитрость: " + cunning + ", решительность: " + determination + ", честолюбие: " + ambition + ", изворотливость: " + resourcefulness + ", жажда власти: " + thirstForPower;
        System.out.println(qualitiesSpecial);
    }

    public void PrintQualitiesAll()
    {
        System.out.println(name);
        PrintQualitiesCommon();
        PrintQualitiesSpecial();
        System.out.println();
    }

    // Получить сумму всех качеств
    public int GetSumAll()
    {
        int sum = powerOfWitchcraft + distanceOfTransgression + cunning + determination + ambition + resourcefulness + thirstForPower;
        return sum;
    }
}