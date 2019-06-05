package br.com.digitalhouse.recyclerviewlistenerteachersapp.teacher.adpter;

import android.support.annotation.NonNull;
import android.support.v4.content.ContextCompat;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import br.com.digitalhouse.recyclerviewlistenerteachersapp.teacher.RecyclerViewClickListener;
import br.com.digitalhouse.recyclerviewlistenerteachersapp.teacher.model.Teacher;
import br.com.huberhack.recyclerviewlistenerteachersapp.R;

public class RecyclerViewTeacherAdapter extends RecyclerView.Adapter<RecyclerViewTeacherAdapter.ViewHolder> {

    private List<Teacher> teachers;
    private RecyclerViewClickListener listener;

    public RecyclerViewTeacherAdapter(List<Teacher> teachers, RecyclerViewClickListener listener) {
        this.teachers = teachers;
        this.listener = listener;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View itemView = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.recycleview_item_teacher, viewGroup, false);
        ViewHolder viewHolder = new ViewHolder(itemView);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int position) {
        final Teacher teacher = teachers.get(position);
        viewHolder.bind(teacher);
        viewHolder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                listener.onClick(teacher);
            }
        });
    }

    @Override
    public int getItemCount() {
        return teachers.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        private ImageView imageViewAvatar;
        private TextView textViewName;
        private TextView textViewClassName;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            imageViewAvatar = itemView.findViewById(R.id.imageViewAvatar);
            textViewName = itemView.findViewById(R.id.textViewTeacherName);
            textViewClassName = itemView.findViewById(R.id.textViewTeacherClassName);
        }

        public void bind(Teacher teacher) {
            imageViewAvatar.setImageDrawable(ContextCompat.getDrawable(imageViewAvatar.getContext(), teacher.getAvatar()));
            textViewName.setText(teacher.getName());
            textViewClassName.setText(teacher.getClassNmae());
        }
    }
}