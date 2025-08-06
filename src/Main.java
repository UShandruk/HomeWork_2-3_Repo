import Faculty.*;
import Students.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Ученики факультета Гриффиндор
        StudentOfGryffindor Harry_Potter = new StudentOfGryffindor(100, 100, 100);
        StudentOfGryffindor Hermione_Granger = new StudentOfGryffindor(90, 90, 100);
        StudentOfGryffindor Ron_Weasley = new StudentOfGryffindor(80, 80, 80);

        // Ученики факультета Слизерин
        StudentOfSlytherin Draco_Malfoy = new StudentOfSlytherin(100, 100, 100, 100, 100);
        StudentOfSlytherin Graham_Montague = new StudentOfSlytherin(90, 80, 110, 70, 100);
        StudentOfSlytherin GregoryGoyle = new StudentOfSlytherin(60, 70, 100, 90, 80);

        // Ученики факультета Пуффендуй
        StudentOfPuffindui Zachary_Smith = new StudentOfPuffindui(90, 100, 100);
        StudentOfPuffindui Cedric_Diggory = new StudentOfPuffindui(100, 100, 100);
        StudentOfPuffindui Justin_Finch_Fletchley = new StudentOfPuffindui(100, 100, 70);

        // Ученики факультета Когтевран
        StudentOfRawenClaw Zhou_Chang = new StudentOfRawenClaw(100, 100, 100, 100);
        StudentOfRawenClaw Padma_Patil = new StudentOfRawenClaw(90, 80, 100, 90);
        StudentOfRawenClaw Marcus_Belby = new StudentOfRawenClaw(80, 100, 100, 100);

        Harry_Potter.PrintQualitiesAll("Harry_Potter");
        Padma_Patil.PrintQualitiesAll("Padma_Patil");

        Gryffindor.CompareStudents(Hermione_Granger, Ron_Weasley);
    }
}