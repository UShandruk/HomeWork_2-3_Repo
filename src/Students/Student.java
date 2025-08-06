package Students;

public class Student {
    public String getName() {
        return name;
    }

    // Имя
    String name;

    // Сила колдовства (в баллах)
    int powerOfWitchcraft;

    // Расстояние трансгрессии
    int distanceOfTransgression;

    public void PrintQualitiesCommon()
    {
        System.out.println("Общие качества");
        String qualitiesCommon = "Сила колдовства (в баллах): " + powerOfWitchcraft + ", Расстояние трансгрессии: " + distanceOfTransgression;
        System.out.println(qualitiesCommon);
    }
}