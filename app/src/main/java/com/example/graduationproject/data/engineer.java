package com.example.graduationproject.data;

import android.os.Parcel;
import android.os.Parcelable;

public class engineer implements  Parcelable{
    private String name;
    private String password;
    private String desc;
    private int header;
    public engineer(String name,String desc,int header){
        this.name=name;
        this.desc=desc;
        this.header=header;
    }

    protected engineer(Parcel in) {
        name = in.readString();
        desc = in.readString();
        header = in.readInt();
    }

    public static final Parcelable.Creator<engineer> CREATOR = new Parcelable.Creator<engineer>() {
        @Override
        public engineer createFromParcel(Parcel in) {
            return new engineer(in);
        }

        @Override
        public engineer[] newArray(int size) {
            return new engineer[size];
        }
    };

    public String getName(){
        return name;
    }
    public String getDesc(){
        return desc;
    }
    public int getHeader(){
        return header;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(name);
        dest.writeString(desc);
        dest.writeInt(header);
    }
}
