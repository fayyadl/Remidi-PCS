package com.fayyad.qiuqiubola.Item;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;

public class SportsItem implements Parcelable {

    @SerializedName("idSport")
    private String idSport;

    @SerializedName("strFormat")
    private String strFormat;

    @SerializedName("strSport")
    private String strSport;

    @SerializedName("strSportThumb")
    private String strSportThumb;

    @SerializedName("strSportThumbGreen")
    private String strSportThumbGreen;

    @SerializedName("strSportDescription")
    private String strSportDescription;

    protected SportsItem(Parcel in) {
        idSport = in.readString();
        strFormat = in.readString();
        strSport = in.readString();
        strSportThumb = in.readString();
        strSportThumbGreen = in.readString();
        strSportDescription = in.readString();
    }

    public static final Creator<SportsItem> CREATOR = new Creator<SportsItem>() {
        @Override
        public SportsItem createFromParcel(Parcel in) {
            return new SportsItem(in);
        }

        @Override
        public SportsItem[] newArray(int size) {
            return new SportsItem[size];
        }
    };

    public void setIdSport(String idSport){
        this.idSport = idSport;
    }

    public String getIdSport(){
        return idSport;
    }

    public void setStrFormat(String strFormat){
        this.strFormat = strFormat;
    }

    public String getStrFormat(){
        return strFormat;
    }

    public void setStrSport(String strSport){
        this.strSport = strSport;
    }

    public String getStrSport(){
        return strSport;
    }

    public void setStrSportThumb(String strSportThumb){
        this.strSportThumb = strSportThumb;
    }

    public String getStrSportThumb(){
        return strSportThumb;
    }

    public void setStrSportThumbGreen(String strSportThumbGreen){
        this.strSportThumbGreen = strSportThumbGreen;
    }

    public String getStrSportThumbGreen(){
        return strSportThumbGreen;
    }

    public void setStrSportDescription(String strSportDescription){
        this.strSportDescription = strSportDescription;
    }

    public String getStrSportDescription(){
        return strSportDescription;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(idSport);
        dest.writeString(strFormat);
        dest.writeString(strSport);
        dest.writeString(strSportThumb);
        dest.writeString(strSportThumbGreen);
        dest.writeString(strSportDescription);
    }
}