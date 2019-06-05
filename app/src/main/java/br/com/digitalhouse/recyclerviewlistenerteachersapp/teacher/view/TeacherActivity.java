package br.com.digitalhouse.recyclerviewlistenerteachersapp.teacher.view;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import br.com.digitalhouse.recyclerviewlistenerteachersapp.teacher.RecyclerViewClickListener;
import br.com.digitalhouse.recyclerviewlistenerteachersapp.teacher.adpter.RecyclerViewTeacherAdapter;
import br.com.digitalhouse.recyclerviewlistenerteachersapp.teacher.model.Teacher;
import br.com.huberhack.recyclerviewlistenerteachersapp.R;

public class TeacherActivity extends AppCompatActivity implements RecyclerViewClickListener {

    private RecyclerView recyclerView;
    private RecyclerViewTeacherAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_teacher);

        recyclerView = findViewById(R.id.recyckerViewTeacher);
        recyclerView.setLayoutManager(new GridLayoutManager(this, 2));
        adapter = new RecyclerViewTeacherAdapter(getTeachers(), this);
        recyclerView.setAdapter(adapter);
    }

    private List<Teacher> getTeachers() {
        String description = "Aqui terá uma breve descriação do professor...";

        List<Teacher> teachers = new ArrayList<>();
        teachers.add(new Teacher("Jessica","Mobile Android", R.mipmap.ic_launcher, R.drawable.teachers_background, description));
        teachers.add(new Teacher("Tairo","Mobile Android", R.mipmap.ic_launcher, R.drawable.teachers_background, description));
        teachers.add(new Teacher("Mateus","Mobile Android", R.mipmap.ic_launcher, R.drawable.teachers_background, description));
        teachers.add(new Teacher("Danilo","Mobile Android", R.mipmap.ic_launcher, R.drawable.teachers_background, description));
        teachers.add(new Teacher("Ivan","Mobile Android", R.mipmap.ic_launcher, R.drawable.teachers_background, description));
        teachers.add(new Teacher("Vini","Mobile Android", R.mipmap.ic_launcher, R.drawable.teachers_background, description));
        teachers.add(new Teacher("Jair","Mobile Android", R.mipmap.ic_launcher, R.drawable.teachers_background, description));
        teachers.add(new Teacher("Debora","Mobile Android", R.mipmap.ic_launcher, R.drawable.teachers_background, description));
        teachers.add(new Teacher("Fabih","Mobile Android", R.mipmap.ic_launcher, R.drawable.teachers_background, description));
        teachers.add(new Teacher("Nika","Mobile Android", R.mipmap.ic_launcher, R.drawable.teachers_background, description));
        teachers.add(new Teacher("Nika","Mobile Android", R.mipmap.ic_launcher, R.drawable.teachers_background, description));
        teachers.add(new Teacher("Nika","Mobile Android", R.mipmap.ic_launcher, R.drawable.teachers_background, description));
        teachers.add(new Teacher("Nika","Mobile Android", R.mipmap.ic_launcher, R.drawable.teachers_background, description));
        teachers.add(new Teacher("Nika","Mobile Android", R.mipmap.ic_launcher, R.drawable.teachers_background, description));
        teachers.add(new Teacher("Nika","Mobile Android", R.mipmap.ic_launcher, R.drawable.teachers_background, description));
        teachers.add(new Teacher("Nika","Mobile Android", R.mipmap.ic_launcher, R.drawable.teachers_background, description));
        teachers.add(new Teacher("Nika","Mobile Android", R.mipmap.ic_launcher, R.drawable.teachers_background, description));
        teachers.add(new Teacher("Nika","Mobile Android", R.mipmap.ic_launcher, R.drawable.teachers_background, description));
        teachers.add(new Teacher("Nika","Mobile Android", R.mipmap.ic_launcher, R.drawable.teachers_background, description));
        teachers.add(new Teacher("Nika","Mobile Android", R.mipmap.ic_launcher, R.drawable.teachers_background, description));
        teachers.add(new Teacher("Nika","Mobile Android", R.mipmap.ic_launcher, R.drawable.teachers_background, description));
        return teachers;
    }

    @Override
    public void onClick(Teacher teacher) {
        Intent intent = new Intent(this, TeacherDetailsActivity.class);
        intent.putExtra("TEACHER", teacher);
        startActivity(intent);
    }
}
