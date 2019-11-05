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
        TextDrawable dShablon = TextDrawable.builder()
                .beginConfig()
                .width(160)  // width in px
                .height(160) // height in px
                .endConfig()
                .buildRect("BQ", Color.BLUE);

        Student bekzod = new Student(dShablon,"Bekzod Quranboyev", "+998973001548", "Xonqa, Olaja, 56-uy");
        Student furqat = new Student(dShablon,"Furqat Aminov", "+998973116587", "Beruniy shahar, 89");
        Student akbar = new Student(dShablon,"Akbar Otaboyev", "+998973002266", "Yangiariq, Ostona, 35");
        Student doniyor = new Student(dShablon,"Doniyor Abdullayev", "+998999692421", "Bog'ot, , 35");
        Student shaxriyor = new Student(dShablon,"Shaxriyor Abdurazzaqov", "+998973002266", "Qo'shko'pir , Ostona, 35");
        Student siroj = new Student(dShablon,"Siroj Allaberganov", "+998973002266", "Xiva, Go'ja, 35");
        Student alo = new Student(dShablon,"A'lo Ataxonova", "+998973002266", "Yangiariq, Ostona, 35");
        Student javohir = new Student(dShablon,"Javohir Axmedov", "+998973002266", "Toshkent, O'rta chirchiq, 35");
        Student sarvar = new Student(dShablon,"Sarvar Azadov", "+998973002266", "Xiva, Qosma, 35");
        Student mahfuza = new Student(dShablon,"Mahfuza Bazarboyeva", "+998973002266", "Shavot, Ostona, 35");
        Student shahriyor = new Student(dShablon,"Shahriyor Ibragimov", "+998973002266", "Urganch, Ostona, 35");
        Student behzod = new Student(dShablon,"Behzod Jumabayev", "+998973002266", "Hazorasp , Yangibozor, 12");
        Student sherzod = new Student(dShablon,"Sherzod Kamolov", "+998973002266", "Bog'ot, Ostona, 35");
        Student javoxir = new Student(dShablon,"Javohir Odiljonov", "+998973002266", "Andijon, Ostona, 35");
        Student siyovush = new Student(dShablon,"Siyovush Ortiqov", "+998973002266", "Qo'shko'pir, Ostona, 35");
        Student ibrat = new Student(dShablon,"Ibrat Otaboyev", "+998973002266", "Yangiariq, Ostona, 35");
        Student munisa = new Student(dShablon,"Munisa Otaboyeva", "+998973002266", "Urganch, Ostona, 35");
        Student muso = new Student(dShablon,"Muso Qadirberganov", "+998973002266", "Gurlan, Ostona, 35");
        Student azamat = new Student(dShablon,"Azamat Quchqarov", "+998973002266", "Hazorasp, Ostona, 35");
        Student aziz = new Student(dShablon,"Aziz Rajabov", "+998973002266", "Hazorasp, Yangibozor, 35");
        Student gulshan = new Student(dShablon,"Gulshan Rupiyarova", "+998973002266", "Yangiariq, Ostona, 35");
        Student arslon = new Student(dShablon,"Arslon Sadullayev", "+998973002266", "Yangibozor, Bo'zqal'a, 3");
        Student shoxrux = new Student(dShablon,"Shaxrux Sadullayev", "+998973002266", "Yangiariq, Ostona, 35");
        Student temur = new Student(dShablon,"Temur Sapayev", "+998973002266", "Qo'shko'pir, Ostona, 35");
        Student murod = new Student(dShablon,"Murod Sapayazov", "+998973002266", "Qo'shpo'pir, Ostona, 35");
        Student xursand = new Student(dShablon,"Xursand Sherxonov", "+998973002266", "Urganch, Ostona, 35");
        Student mamur = new Student(dShablon,"Ma'mur Sultonov", "+998973002266", "Hazorasp, Boston, 35");
        Student iskandar = new Student(dShablon,"Iskandar Xaitboyev", "+998973002266", "Urganch, Ostona, 35");
        Student xayrullo = new Student(dShablon,"Xayrullo Xudoyberganov", "+998973002266", "Urganch, Ostona, 35");
        Student roza = new Student(dShablon,"Ro'za Xudoyberganova", "+998973002266", "Urganch, Ostona, 35");
        Student xasan = new Student(dShablon,"Xasan Xasanov", "+998973002266", "Hazorasp, Boston, 35");
        Student izzat = new Student(dShablon,"Izzat Karimberdiyev", "+998973002266", "Beruniy, Ostona, 35");
        Student oybek = new Student(dShablon,"Oybek Allayorov", "+998973002266", "Xonqa, Ostona, 35");

        list.add(bekzod);
        list.add(furqat);
        list.add(akbar);
        list.add(doniyor);
        list.add(shahriyor);
        list.add(siroj);
        list.add(alo);
        list.add(oybek);
        list.add(javohir);
        list.add(sarvar);
        list.add(mahfuza);
        list.add(shaxriyor);
        list.add(behzod);
        list.add(sherzod);
        list.add(javoxir);
        list.add(siyovush);
        list.add(ibrat);
        list.add(munisa);
        list.add(muso);
        list.add(azamat);
        list.add(aziz);
        list.add(gulshan);
        list.add(arslon);
        list.add(shoxrux);
        list.add(temur);
        list.add(murod);
        list.add(xursand);
        list.add(mamur);
        list.add(iskandar);
        list.add(xayrullo);
        list.add(roza);
        list.add(xasan);
        list.add(izzat);

        for (int i = 0; i < list.size(); i++) {
            String name = list.get(i).getFullname();
            String txt = name.charAt(0) + String.valueOf(name.charAt(name.lastIndexOf(' ') + 1));
            TextDrawable dList = TextDrawable.builder()
                    .beginConfig()
                    .width(160)  // width in px
                    .height(160) // height in px
                    .endConfig()
                    .buildRect(txt, Color.BLUE);
            Student student = new Student(dList, list.get(i).getFullname(),list.get(i).getPhone(), list.get(i).getAddress());
            list.set(i,student);
        }

        return list;
    }

}
