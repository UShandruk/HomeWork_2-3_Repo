package Faculty;

// Факультет Пуффендуй
public class Puffendui extends Hogwarts {
    // трудолюбие
    int hardworking;

    // верность
    int loyal;

    // честность
    int honest;

    public Puffendui(int hardworking, int loyal, int honest) {
        this.hardworking = hardworking;
        this.loyal = loyal;
        this.honest = honest;
    }

    public void PrintQualitiesSpecial()
    {
        System.out.println("Особые качества");
        String qualitiesSpecial = "трудолюбие: " + hardworking + ", верность: " + loyal + ", честность: " + honest;
        System.out.println(qualitiesSpecial);
    }
}