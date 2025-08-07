package Students;

public class StudentOfGryffindor extends Student {
    // Свойства факультета Гриффиндор
    // благородство
    int nobility;

    // честь
    int honor;

    // храбрость
    int bravery;

    public StudentOfGryffindor(String name, int powerOfWithcraft, int distanceOfTransgression, int nobility, int honor, int bravery) {
        this.name = name;
        this.powerOfWitchcraft = powerOfWithcraft;
        this.distanceOfTransgression = distanceOfTransgression;
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }

    public void PrintQualitiesSpecial()
    {
        System.out.println("Особые качества");
        String qualitiesSpecial = "Благородство: " + nobility + ", честь: " + honor + ", храбрость: " + bravery;
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
        int sum = powerOfWitchcraft + distanceOfTransgression + nobility + honor + bravery;
        return sum;
    }

}