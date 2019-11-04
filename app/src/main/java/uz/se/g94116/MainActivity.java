package uz.se.g94116;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import uz.se.g94116.adapter.StudentAdapter;
import uz.se.g94116.utils.StudentUtils;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.student_recycler);
        LinearLayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        StudentAdapter adapter = new StudentAdapter(getApplicationContext(), StudentUtils.loadStudents());
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);
    }
}
