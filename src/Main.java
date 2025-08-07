import Students.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Ученики факультета Гриффиндор
        StudentOfGryffindor Harry_Potter = new StudentOfGryffindor("Гарри Поттер", 100, 100, 100, 100, 100);
        StudentOfGryffindor Hermione_Granger = new StudentOfGryffindor("Гермиона Грейнджер", 100, 90, 100, 100, 90);
        StudentOfGryffindor Ron_Weasley = new StudentOfGryffindor("Рон Уизли", 80, 80, 80,90, 70);

        // Ученики факультета Слизерин
        StudentOfSlytherin Draco_Malfoy = new StudentOfSlytherin("Драко Малфой",100, 100, 100, 100, 100, 90, 90);
        StudentOfSlytherin Graham_Montague = new StudentOfSlytherin("Грэхэм Монтегю",90, 80, 100, 70, 100, 100, 80);
        StudentOfSlytherin GregoryGoyle = new StudentOfSlytherin("Грегори Гойл",60, 70, 100, 90, 80, 100, 70);

        // Ученики факультета Пуффендуй
        StudentOfPuffindui Zachary_Smith = new StudentOfPuffindui("Захария Смит",90, 100, 100, 70, 80);
        StudentOfPuffindui Cedric_Diggory = new StudentOfPuffindui("Седрик Диггори",100, 100, 100, 90, 50);
        StudentOfPuffindui Justin_Finch_Fletchley = new StudentOfPuffindui("Джастин Финч-Флетчли",100, 100, 70, 100, 80);

        // Ученики факультета Когтевран
        StudentOfRawenClaw Zhou_Chang = new StudentOfRawenClaw("Чжоу Чанг",100, 100, 100, 100, 90, 90);
        StudentOfRawenClaw Padma_Patil = new StudentOfRawenClaw("Падма Патил",90, 80, 100, 90, 70, 80);
        StudentOfRawenClaw Marcus_Belby = new StudentOfRawenClaw("Маркус Белби",80, 100, 100, 100, 80, 100);

        System.out.println("2. Описание студента");
        Harry_Potter.PrintQualitiesAll();

        System.out.println("3. Сравнение между собой двух учеников одного факультета по свойствам");
        StudentOfGryffindor.CompareStudents(Hermione_Granger, Ron_Weasley);
        System.out.println();

        System.out.println("4.1. Сравнение между собой двух любых учеников Хогвартса по силе магии");
        StudentOfHogwarts.CompareStudentsByPowerOfWitchcraft(Marcus_Belby, Justin_Finch_Fletchley);
        System.out.println();

        System.out.println("4.2. Сравнение между собой двух любых учеников Хогвартса по расстоянию трансгрессии");
        StudentOfHogwarts.CompareStudentsByDistanceOfTransgression(Zhou_Chang, Cedric_Diggory);
    }
}