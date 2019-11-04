package uz.se.g94116.utils;

import java.util.ArrayList;
import java.util.List;

import uz.se.g94116.model.Student;

public class StudentUtils {

    public static List<Student> loadStudents(){
        List<Student> list = new ArrayList<>();
        // TODO: 04-Nov-19 Talabalar ro'yhati
        Student bekzod = new Student("Bekzod Quranboyev", "+998973001548", "Xonqa, Olaja, 56-uy");
        Student furqat = new Student("Furqat Aminov", "+998973116587", "Beruniy shahar, 89");
        Student akbar = new Student("Akbar Otaboyev", "+998973002266", "Yangiariq, Ostona, 35");

        list.add(bekzod);
        list.add(furqat);
        list.add(akbar);

        return list;
    }

}
