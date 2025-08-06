package Students;

public class StudentOfGryffindor extends Student {
    /*// Сила колдовства (в баллах)
    int powerOfWitchcraft;

    // Расстояние трансгрессии
    int distanceOfTransgression;*/

    // Свойства факультета Гриффиндор
    // благородство
    int nobility;

    // честь
    int honor;

    // храбрость
    int bravery;

    public StudentOfGryffindor(int nobility, int honor, int bravery) {
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

    public void PrintQualitiesAll(String name)
    {
        System.out.println(name);
        PrintQualitiesCommon();
        PrintQualitiesSpecial();
        System.out.println();
    }

    public int GetSum()
    {
        int sum = nobility + honor + bravery;
        return sum;
    }

}