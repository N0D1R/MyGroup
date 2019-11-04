package uz.se.g94116.adapter;

import android.content.Context;
import android.graphics.Color;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.amulyakhare.textdrawable.TextDrawable;

import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;
import uz.se.g94116.R;
import uz.se.g94116.model.Student;

public class StudentAdapter extends RecyclerView.Adapter<StudentAdapter.MyViewHolder> {

    private List<Student> students;
    private Context context;

    public StudentAdapter(Context context, List<Student> students) {
        this.context = context;
        this.students = students;
    }

    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(context).inflate(R.layout.student_card, viewGroup, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder viewHolder, int position) {
        viewHolder.avatar.setImageDrawable(students.get(position).getAvatar());
        viewHolder.fullname.setText(students.get(position).getFullname());
        viewHolder.phone.setText(students.get(position).getPhone());
        viewHolder.address.setText(students.get(position).getAddress());

    }

    @Override
    public int getItemCount() {
        return students.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        CircleImageView avatar;
        TextView fullname;
        TextView phone;
        TextView address;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            avatar = itemView.findViewById(R.id.avatar);
            fullname = itemView.findViewById(R.id.fullname);
            phone = itemView.findViewById(R.id.phone);
            address = itemView.findViewById(R.id.address);
        }
    }

}
