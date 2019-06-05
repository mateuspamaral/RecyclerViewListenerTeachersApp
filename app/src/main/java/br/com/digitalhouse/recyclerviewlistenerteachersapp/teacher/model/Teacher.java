package br.com.digitalhouse.recyclerviewlistenerteachersapp.teacher.model;

import android.os.Parcel;
import android.os.Parcelable;

public class Teacher implements Parcelable {
    private String name;
    private String classNmae;
    private int avatar;
    private int background;
    private String description;

    public Teacher() {
    }

    public Teacher(String name, String classNmae, int avatar, int background, String description) {
        this.name = name;
        this.classNmae = classNmae;
        this.avatar = avatar;
        this.background = background;
        this.description = description;
    }

    protected Teacher(Parcel in) {
        name = in.readString();
        classNmae = in.readString();
        avatar = in.readInt();
        background = in.readInt();
        description = in.readString();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClassNmae() {
        return classNmae;
    }

    public void setClassNmae(String classNmae) {
        this.classNmae = classNmae;
    }

    public int getAvatar() {
        return avatar;
    }

    public void setAvatar(int avatar) {
        this.avatar = avatar;
    }

    public int getBackground() {
        return background;
    }

    public void setBackground(int background) {
        this.background = background;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public static final Creator<Teacher> CREATOR = new Creator<Teacher>() {
        @Override
        public Teacher createFromParcel(Parcel in) {
            return new Teacher(in);
        }

        @Override
        public Teacher[] newArray(int size) {
            return new Teacher[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(name);
        dest.writeString(classNmae);
        dest.writeInt(avatar);
        dest.writeInt(background);
        dest.writeString(description);
    }
}
