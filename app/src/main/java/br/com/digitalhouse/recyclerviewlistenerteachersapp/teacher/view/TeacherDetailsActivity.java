package br.com.digitalhouse.recyclerviewlistenerteachersapp.teacher.view;

import android.content.Intent;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import br.com.digitalhouse.recyclerviewlistenerteachersapp.teacher.model.Teacher;
import br.com.huberhack.recyclerviewlistenerteachersapp.R;

public class TeacherDetailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_teacher_details);

        ImageView imageViewAvatar = findViewById(R.id.imageViewAvatar);
        TextView textViewName = findViewById(R.id.textViewTeacherName);
        TextView textViewClassName = findViewById(R.id.textViewTeacherClassName);
        ImageView imageViewTeacherBackground = findViewById(R.id.imageViewBackground);
        TextView textViewTeacherDescription = findViewById(R.id.textViewTeacherDescription);
        ImageView imageViewTeacherArrowBack = findViewById(R.id.imageViewTeacherArrowBack);

        if (getIntent() != null && getIntent().getExtras() != null){
            Teacher teacher = getIntent().getParcelableExtra("TEACHER");

            if (teacher != null) {
                imageViewAvatar.setImageDrawable(ContextCompat.getDrawable(imageViewAvatar.getContext(), teacher.getAvatar()));
                textViewName.setText(teacher.getName());
                textViewClassName.setText(teacher.getClassNmae());
                imageViewTeacherBackground.setImageDrawable(ContextCompat.getDrawable(imageViewTeacherBackground.getContext(), teacher.getBackground()));
                textViewTeacherDescription.setText(teacher.getDescription());

                imageViewTeacherArrowBack.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(TeacherDetailsActivity.this, TeacherActivity.class);
                        startActivity(intent);
                        finish();
                    }
                });
            }
        }
    }
}
