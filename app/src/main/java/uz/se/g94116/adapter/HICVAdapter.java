package uz.se.g94116.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;
import uz.se.g94116.R;
import uz.se.g94116.model.Student;

public class HICVAdapter extends PagerAdapter {

    Context context;
    List<Student> studentList = new ArrayList<>();

    public HICVAdapter(Context context, List<Student> studentList) {
        this.context = context;
        this.studentList = studentList;
    }

    @Override
    public int getCount() {
        return studentList.size();
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object o) {
        return view.equals(o);
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
       container.removeView((View) object);
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
       View view = LayoutInflater.from(context).inflate(R.layout.hicv_student_card,container,false);
        CircleImageView imageView =view.findViewById(R.id.avatar);
        TextView fullname = view.findViewById(R.id.fullname);
        TextView phone = view.findViewById(R.id.phone);
        TextView adreess = view.findViewById(R.id.address);

        imageView.setImageDrawable(studentList.get(position).getAvatar());
        fullname.setText(studentList.get(position).getFullname());
        phone.setText(studentList.get(position).getPhone());
        adreess.setText(studentList.get(position).getAddress());

        container.addView(view);
        return view;
    }
}

