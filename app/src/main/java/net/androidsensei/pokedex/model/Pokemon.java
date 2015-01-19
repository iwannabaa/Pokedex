package net.androidsensei.pokedex.model;

import android.os.Parcel;
import android.os.Parcelable;

public class Pokemon implements Parcelable {

    private String name;
    private String avatar;
    private String height;
    private String weight;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getHeight() { return height; }

    public void setHeight(String height) {
        this.height = height;
    }

    public String getWeight() { return weight; }

    public void setWeight(String weight) { this.weight = weight; }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.name);
        dest.writeString(this.avatar);
        dest.writeString(this.height);
        dest.writeString(this.weight);
    }

    public Pokemon() {
    }

    private Pokemon(Parcel in) {
        this.name = in.readString();
        this.avatar = in.readString();
        this.height = in.readString();
        this.weight = in.readString();
    }

    public static final Parcelable.Creator<Pokemon> CREATOR = new Parcelable.Creator<Pokemon>() {
        public Pokemon createFromParcel(Parcel source) {
            return new Pokemon(source);
        }

        public Pokemon[] newArray(int size) {
            return new Pokemon[size];
        }
    };
}
