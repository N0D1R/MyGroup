package uz.se.g94116.utils;

import android.graphics.Color;
import android.graphics.drawable.AdaptiveIconDrawable;
import android.graphics.drawable.Drawable;

import com.amulyakhare.textdrawable.TextDrawable;

import java.util.ArrayList;
import java.util.List;

import uz.se.g94116.model.Student;

public class StudentUtils {

    public static List<Student> loadStudents(){
        List<Student> list = new ArrayList<>();
        // TODO: 04-Nov-19 Talabalar ro'yhati
        TextDrawable dBekzod = TextDrawable.builder()
                .beginConfig()
                .width(160)  // width in px
                .height(160) // height in px
                .endConfig()
                .buildRect("BQ", Color.BLUE);
        TextDrawable dFurqat = TextDrawable.builder()
                .beginConfig()
                .width(160)  // width in px
                .height(160) // height in px
                .endConfig()
                .buildRect("FA", Color.BLUE);
        TextDrawable dAkbar = TextDrawable.builder()
                .beginConfig()
                .width(160)  // width in px
                .height(160) // height in px
                .endConfig()
                .buildRect("AO", Color.BLUE);
        Student bekzod = new Student(dBekzod,"Bekzod Quranboyev", "+998973001548", "Xonqa, Olaja, 56-uy");
        Student furqat = new Student(dFurqat,"Furqat Aminov", "+998973116587", "Beruniy shahar, 89");
        Student akbar = new Student(dAkbar,"Akbar Otaboyev", "+998973002266", "Yangiariq, Ostona, 35");

        list.add(bekzod);
        list.add(furqat);
        list.add(akbar);

        return list;
    }

}
