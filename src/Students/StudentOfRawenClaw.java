package Students;

public class StudentOfRawenClaw extends Student {
    /*// Сила колдовства (в баллах)
    int powerOfWitchcraft;

    // Расстояние трансгрессии
    int distanceOfTransgression;*/

    // Свойства факультета Когтевран
    // ум
    int smart;

    // мудрость
    int wise;

    // остроумие
    int witty;

    // творчество
    int creative;

    public StudentOfRawenClaw(String name, int powerOfWithcraft, int distanceOfTransgression, int smart, int wise, int witty, int creative) {
        this.name = name;
        this.powerOfWitchcraft = powerOfWithcraft;
        this.distanceOfTransgression = distanceOfTransgression;
        this.smart = smart;
        this.wise = wise;
        this.witty = witty;
        this.creative = creative;
    }

    public void PrintQualitiesSpecial()
    {
        System.out.println("Особые качества");
        String qualitiesSpecial = "Ум: " + smart + ", мудрость: " + wise + ", остроумие: " + witty + ", творчество: " + creative;
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
        int sum = powerOfWitchcraft + distanceOfTransgression + smart + wise + witty + creative;
        return sum;
    }
}