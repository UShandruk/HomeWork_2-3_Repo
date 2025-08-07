package Students;

public class StudentOfPuffindui extends Student {
    /*// Сила колдовства (в баллах)
    int powerOfWitchcraft;

    // Расстояние трансгрессии
    int distanceOfTransgression;*/

    // Свойства факультета Пуффендуй
    // трудолюбие
    int hardworking;

    // верность
    int loyal;

    // честность
    int honest;

    public StudentOfPuffindui(String name, int powerOfWithcraft, int distanceOfTransgression, int hardworking, int loyal, int honest) {
        this.name = name;
        this.powerOfWitchcraft = powerOfWithcraft;
        this.distanceOfTransgression = distanceOfTransgression;
        this.hardworking = hardworking;
        this.loyal = loyal;
        this.honest = honest;

    }


    public void PrintQualitiesSpecial()
    {
        System.out.println("Особые качества");
        String qualitiesSpecial = "Трудолюбие: " + hardworking + ", верность: " + loyal + ", честность: " + honest;
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
        int sum = powerOfWitchcraft + distanceOfTransgression + hardworking + loyal + honest;
        return sum;
    }
}