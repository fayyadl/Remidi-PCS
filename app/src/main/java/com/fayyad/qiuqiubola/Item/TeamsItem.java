package com.fayyad.qiuqiubola.Item;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.SerializedName;

public class TeamsItem implements Parcelable {

    @SerializedName("intStadiumCapacity")
    private String intStadiumCapacity;

    @SerializedName("strTeamShort")
    private String strTeamShort;

    @SerializedName("idLeague3")
    private String idLeague3;

    @SerializedName("idLeague2")
    private String idLeague2;

    @SerializedName("idLeague5")
    private String idLeague5;

    @SerializedName("strSport")
    private String strSport;

    @SerializedName("idLeague4")
    private String idLeague4;

    @SerializedName("idLeague7")
    private Object idLeague7;

    @SerializedName("strDescriptionCN")
    private Object strDescriptionCN;

    @SerializedName("idLeague6")
    private Object idLeague6;

    @SerializedName("strTeamJersey")
    private String strTeamJersey;

    @SerializedName("strTeamFanart2")
    private String strTeamFanart2;

    @SerializedName("strTeamFanart3")
    private String strTeamFanart3;

    @SerializedName("strTeamFanart4")
    private String strTeamFanart4;

    @SerializedName("strStadiumDescription")
    private String strStadiumDescription;

    @SerializedName("strTeamFanart1")
    private String strTeamFanart1;

    @SerializedName("intLoved")
    private String intLoved;

    @SerializedName("idLeague")
    private String idLeague;

    @SerializedName("idSoccerXML")
    private String idSoccerXML;

    @SerializedName("strTeamLogo")
    private String strTeamLogo;

    @SerializedName("strDescriptionSE")
    private Object strDescriptionSE;

    @SerializedName("strDescriptionJP")
    private String strDescriptionJP;

    @SerializedName("strDescriptionFR")
    private String strDescriptionFR;

    @SerializedName("strStadiumLocation")
    private String strStadiumLocation;

    @SerializedName("strDescriptionNL")
    private Object strDescriptionNL;

    @SerializedName("strCountry")
    private String strCountry;

    @SerializedName("strRSS")
    private String strRSS;

    @SerializedName("strDescriptionRU")
    private String strDescriptionRU;

    @SerializedName("strTeamBanner")
    private String strTeamBanner;

    @SerializedName("strDescriptionNO")
    private String strDescriptionNO;

    @SerializedName("strStadiumThumb")
    private String strStadiumThumb;

    @SerializedName("strDescriptionES")
    private String strDescriptionES;

    @SerializedName("intFormedYear")
    private String intFormedYear;

    @SerializedName("strInstagram")
    private String strInstagram;

    @SerializedName("strDescriptionIT")
    private String strDescriptionIT;

    @SerializedName("idTeam")
    private String idTeam;

    @SerializedName("strDescriptionEN")
    private String strDescriptionEN;

    @SerializedName("strWebsite")
    private String strWebsite;

    @SerializedName("strYoutube")
    private String strYoutube;

    @SerializedName("strDescriptionIL")
    private Object strDescriptionIL;

    @SerializedName("idAPIfootball")
    private String idAPIfootball;

    @SerializedName("strLocked")
    private String strLocked;

    @SerializedName("strAlternate")
    private String strAlternate;

    @SerializedName("strTeam")
    private String strTeam;

    @SerializedName("strTwitter")
    private String strTwitter;

    @SerializedName("strDescriptionHU")
    private Object strDescriptionHU;

    @SerializedName("strGender")
    private String strGender;

    @SerializedName("strDivision")
    private Object strDivision;

    @SerializedName("strStadium")
    private String strStadium;

    @SerializedName("strFacebook")
    private String strFacebook;

    @SerializedName("strTeamBadge")
    private String strTeamBadge;

    @SerializedName("strLeague2")
    private String strLeague2;

    @SerializedName("strLeague3")
    private String strLeague3;

    @SerializedName("strLeague4")
    private String strLeague4;

    @SerializedName("strLeague5")
    private String strLeague5;

    @SerializedName("strDescriptionPT")
    private String strDescriptionPT;

    @SerializedName("strLeague6")
    private String strLeague6;

    @SerializedName("strDescriptionDE")
    private String strDescriptionDE;

    @SerializedName("strLeague7")
    private String strLeague7;

    @SerializedName("strLeague")
    private String strLeague;

    @SerializedName("strManager")
    private String strManager;

    @SerializedName("strKeywords")
    private String strKeywords;

    @SerializedName("strDescriptionPL")
    private Object strDescriptionPL;

    protected TeamsItem(Parcel in) {
        intStadiumCapacity = in.readString();
        strTeamShort = in.readString();
        idLeague3 = in.readString();
        idLeague2 = in.readString();
        idLeague5 = in.readString();
        strSport = in.readString();
        idLeague4 = in.readString();
        strTeamJersey = in.readString();
        strTeamFanart2 = in.readString();
        strTeamFanart3 = in.readString();
        strTeamFanart4 = in.readString();
        strStadiumDescription = in.readString();
        strTeamFanart1 = in.readString();
        intLoved = in.readString();
        idLeague = in.readString();
        idSoccerXML = in.readString();
        strTeamLogo = in.readString();
        strDescriptionJP = in.readString();
        strDescriptionFR = in.readString();
        strStadiumLocation = in.readString();
        strCountry = in.readString();
        strRSS = in.readString();
        strDescriptionRU = in.readString();
        strTeamBanner = in.readString();
        strDescriptionNO = in.readString();
        strStadiumThumb = in.readString();
        strDescriptionES = in.readString();
        intFormedYear = in.readString();
        strInstagram = in.readString();
        strDescriptionIT = in.readString();
        idTeam = in.readString();
        strDescriptionEN = in.readString();
        strWebsite = in.readString();
        strYoutube = in.readString();
        idAPIfootball = in.readString();
        strLocked = in.readString();
        strAlternate = in.readString();
        strTeam = in.readString();
        strTwitter = in.readString();
        strGender = in.readString();
        strStadium = in.readString();
        strFacebook = in.readString();
        strTeamBadge = in.readString();
        strLeague2 = in.readString();
        strLeague3 = in.readString();
        strLeague4 = in.readString();
        strLeague5 = in.readString();
        strDescriptionPT = in.readString();
        strLeague6 = in.readString();
        strDescriptionDE = in.readString();
        strLeague7 = in.readString();
        strLeague = in.readString();
        strManager = in.readString();
        strKeywords = in.readString();
    }

    public static final Creator<TeamsItem> CREATOR = new Creator<TeamsItem>() {
        @Override
        public TeamsItem createFromParcel(Parcel in) {
            return new TeamsItem(in);
        }

        @Override
        public TeamsItem[] newArray(int size) {
            return new TeamsItem[size];
        }
    };

    public void setIntStadiumCapacity(String intStadiumCapacity){
        this.intStadiumCapacity = intStadiumCapacity;
    }

    public String getIntStadiumCapacity(){
        return intStadiumCapacity;
    }

    public void setStrTeamShort(String strTeamShort){
        this.strTeamShort = strTeamShort;
    }

    public String getStrTeamShort(){
        return strTeamShort;
    }

    public void setIdLeague3(String idLeague3){
        this.idLeague3 = idLeague3;
    }

    public String getIdLeague3(){
        return idLeague3;
    }

    public void setIdLeague2(String idLeague2){
        this.idLeague2 = idLeague2;
    }

    public String getIdLeague2(){
        return idLeague2;
    }

    public void setIdLeague5(String idLeague5){
        this.idLeague5 = idLeague5;
    }

    public String getIdLeague5(){
        return idLeague5;
    }

    public void setStrSport(String strSport){
        this.strSport = strSport;
    }

    public String getStrSport(){
        return strSport;
    }

    public void setIdLeague4(String idLeague4){
        this.idLeague4 = idLeague4;
    }

    public String getIdLeague4(){
        return idLeague4;
    }

    public void setIdLeague7(Object idLeague7){
        this.idLeague7 = idLeague7;
    }

    public Object getIdLeague7(){
        return idLeague7;
    }

    public void setStrDescriptionCN(Object strDescriptionCN){
        this.strDescriptionCN = strDescriptionCN;
    }

    public Object getStrDescriptionCN(){
        return strDescriptionCN;
    }

    public void setIdLeague6(Object idLeague6){
        this.idLeague6 = idLeague6;
    }

    public Object getIdLeague6(){
        return idLeague6;
    }

    public void setStrTeamJersey(String strTeamJersey){
        this.strTeamJersey = strTeamJersey;
    }

    public String getStrTeamJersey(){
        return strTeamJersey;
    }

    public void setStrTeamFanart2(String strTeamFanart2){
        this.strTeamFanart2 = strTeamFanart2;
    }

    public String getStrTeamFanart2(){
        return strTeamFanart2;
    }

    public void setStrTeamFanart3(String strTeamFanart3){
        this.strTeamFanart3 = strTeamFanart3;
    }

    public String getStrTeamFanart3(){
        return strTeamFanart3;
    }

    public void setStrTeamFanart4(String strTeamFanart4){
        this.strTeamFanart4 = strTeamFanart4;
    }

    public String getStrTeamFanart4(){
        return strTeamFanart4;
    }

    public void setStrStadiumDescription(String strStadiumDescription){
        this.strStadiumDescription = strStadiumDescription;
    }

    public String getStrStadiumDescription(){
        return strStadiumDescription;
    }

    public void setStrTeamFanart1(String strTeamFanart1){
        this.strTeamFanart1 = strTeamFanart1;
    }

    public String getStrTeamFanart1(){
        return strTeamFanart1;
    }

    public void setIntLoved(String intLoved){
        this.intLoved = intLoved;
    }

    public String getIntLoved(){
        return intLoved;
    }

    public void setIdLeague(String idLeague){
        this.idLeague = idLeague;
    }

    public String getIdLeague(){
        return idLeague;
    }

    public void setIdSoccerXML(String idSoccerXML){
        this.idSoccerXML = idSoccerXML;
    }

    public String getIdSoccerXML(){
        return idSoccerXML;
    }

    public void setStrTeamLogo(String strTeamLogo){
        this.strTeamLogo = strTeamLogo;
    }

    public String getStrTeamLogo(){
        return strTeamLogo;
    }

    public void setStrDescriptionSE(Object strDescriptionSE){
        this.strDescriptionSE = strDescriptionSE;
    }

    public Object getStrDescriptionSE(){
        return strDescriptionSE;
    }

    public void setStrDescriptionJP(String strDescriptionJP){
        this.strDescriptionJP = strDescriptionJP;
    }

    public String getStrDescriptionJP(){
        return strDescriptionJP;
    }

    public void setStrDescriptionFR(String strDescriptionFR){
        this.strDescriptionFR = strDescriptionFR;
    }

    public String getStrDescriptionFR(){
        return strDescriptionFR;
    }

    public void setStrStadiumLocation(String strStadiumLocation){
        this.strStadiumLocation = strStadiumLocation;
    }

    public String getStrStadiumLocation(){
        return strStadiumLocation;
    }

    public void setStrDescriptionNL(Object strDescriptionNL){
        this.strDescriptionNL = strDescriptionNL;
    }

    public Object getStrDescriptionNL(){
        return strDescriptionNL;
    }

    public void setStrCountry(String strCountry){
        this.strCountry = strCountry;
    }

    public String getStrCountry(){
        return strCountry;
    }

    public void setStrRSS(String strRSS){
        this.strRSS = strRSS;
    }

    public String getStrRSS(){
        return strRSS;
    }

    public void setStrDescriptionRU(String strDescriptionRU){
        this.strDescriptionRU = strDescriptionRU;
    }

    public String getStrDescriptionRU(){
        return strDescriptionRU;
    }

    public void setStrTeamBanner(String strTeamBanner){
        this.strTeamBanner = strTeamBanner;
    }

    public String getStrTeamBanner(){
        return strTeamBanner;
    }

    public void setStrDescriptionNO(String strDescriptionNO){
        this.strDescriptionNO = strDescriptionNO;
    }

    public String getStrDescriptionNO(){
        return strDescriptionNO;
    }

    public void setStrStadiumThumb(String strStadiumThumb){
        this.strStadiumThumb = strStadiumThumb;
    }

    public String getStrStadiumThumb(){
        return strStadiumThumb;
    }

    public void setStrDescriptionES(String strDescriptionES){
        this.strDescriptionES = strDescriptionES;
    }

    public String getStrDescriptionES(){
        return strDescriptionES;
    }

    public void setIntFormedYear(String intFormedYear){
        this.intFormedYear = intFormedYear;
    }

    public String getIntFormedYear(){
        return intFormedYear;
    }

    public void setStrInstagram(String strInstagram){
        this.strInstagram = strInstagram;
    }

    public String getStrInstagram(){
        return strInstagram;
    }

    public void setStrDescriptionIT(String strDescriptionIT){
        this.strDescriptionIT = strDescriptionIT;
    }

    public String getStrDescriptionIT(){
        return strDescriptionIT;
    }

    public void setIdTeam(String idTeam){
        this.idTeam = idTeam;
    }

    public String getIdTeam(){
        return idTeam;
    }

    public void setStrDescriptionEN(String strDescriptionEN){
        this.strDescriptionEN = strDescriptionEN;
    }

    public String getStrDescriptionEN(){
        return strDescriptionEN;
    }

    public void setStrWebsite(String strWebsite){
        this.strWebsite = strWebsite;
    }

    public String getStrWebsite(){
        return strWebsite;
    }

    public void setStrYoutube(String strYoutube){
        this.strYoutube = strYoutube;
    }

    public String getStrYoutube(){
        return strYoutube;
    }

    public void setStrDescriptionIL(Object strDescriptionIL){
        this.strDescriptionIL = strDescriptionIL;
    }

    public Object getStrDescriptionIL(){
        return strDescriptionIL;
    }

    public void setIdAPIfootball(String idAPIfootball){
        this.idAPIfootball = idAPIfootball;
    }

    public String getIdAPIfootball(){
        return idAPIfootball;
    }

    public void setStrLocked(String strLocked){
        this.strLocked = strLocked;
    }

    public String getStrLocked(){
        return strLocked;
    }

    public void setStrAlternate(String strAlternate){
        this.strAlternate = strAlternate;
    }

    public String getStrAlternate(){
        return strAlternate;
    }

    public void setStrTeam(String strTeam){
        this.strTeam = strTeam;
    }

    public String getStrTeam(){
        return strTeam;
    }

    public void setStrTwitter(String strTwitter){
        this.strTwitter = strTwitter;
    }

    public String getStrTwitter(){
        return strTwitter;
    }

    public void setStrDescriptionHU(Object strDescriptionHU){
        this.strDescriptionHU = strDescriptionHU;
    }

    public Object getStrDescriptionHU(){
        return strDescriptionHU;
    }

    public void setStrGender(String strGender){
        this.strGender = strGender;
    }

    public String getStrGender(){
        return strGender;
    }

    public void setStrDivision(Object strDivision){
        this.strDivision = strDivision;
    }

    public Object getStrDivision(){
        return strDivision;
    }

    public void setStrStadium(String strStadium){
        this.strStadium = strStadium;
    }

    public String getStrStadium(){
        return strStadium;
    }

    public void setStrFacebook(String strFacebook){
        this.strFacebook = strFacebook;
    }

    public String getStrFacebook(){
        return strFacebook;
    }

    public void setStrTeamBadge(String strTeamBadge){
        this.strTeamBadge = strTeamBadge;
    }

    public String getStrTeamBadge(){
        return strTeamBadge;
    }

    public void setStrLeague2(String strLeague2){
        this.strLeague2 = strLeague2;
    }

    public String getStrLeague2(){
        return strLeague2;
    }

    public void setStrLeague3(String strLeague3){
        this.strLeague3 = strLeague3;
    }

    public String getStrLeague3(){
        return strLeague3;
    }

    public void setStrLeague4(String strLeague4){
        this.strLeague4 = strLeague4;
    }

    public String getStrLeague4(){
        return strLeague4;
    }

    public void setStrLeague5(String strLeague5){
        this.strLeague5 = strLeague5;
    }

    public String getStrLeague5(){
        return strLeague5;
    }

    public void setStrDescriptionPT(String strDescriptionPT){
        this.strDescriptionPT = strDescriptionPT;
    }

    public String getStrDescriptionPT(){
        return strDescriptionPT;
    }

    public void setStrLeague6(String strLeague6){
        this.strLeague6 = strLeague6;
    }

    public String getStrLeague6(){
        return strLeague6;
    }

    public void setStrDescriptionDE(String strDescriptionDE){
        this.strDescriptionDE = strDescriptionDE;
    }

    public String getStrDescriptionDE(){
        return strDescriptionDE;
    }

    public void setStrLeague7(String strLeague7){
        this.strLeague7 = strLeague7;
    }

    public String getStrLeague7(){
        return strLeague7;
    }

    public void setStrLeague(String strLeague){
        this.strLeague = strLeague;
    }

    public String getStrLeague(){
        return strLeague;
    }

    public void setStrManager(String strManager){
        this.strManager = strManager;
    }

    public String getStrManager(){
        return strManager;
    }

    public void setStrKeywords(String strKeywords){
        this.strKeywords = strKeywords;
    }

    public String getStrKeywords(){
        return strKeywords;
    }

    public void setStrDescriptionPL(Object strDescriptionPL){
        this.strDescriptionPL = strDescriptionPL;
    }

    public Object getStrDescriptionPL(){
        return strDescriptionPL;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(intStadiumCapacity);
        dest.writeString(strTeamShort);
        dest.writeString(idLeague3);
        dest.writeString(idLeague2);
        dest.writeString(idLeague5);
        dest.writeString(strSport);
        dest.writeString(idLeague4);
        dest.writeString(strTeamJersey);
        dest.writeString(strTeamFanart2);
        dest.writeString(strTeamFanart3);
        dest.writeString(strTeamFanart4);
        dest.writeString(strStadiumDescription);
        dest.writeString(strTeamFanart1);
        dest.writeString(intLoved);
        dest.writeString(idLeague);
        dest.writeString(idSoccerXML);
        dest.writeString(strTeamLogo);
        dest.writeString(strDescriptionJP);
        dest.writeString(strDescriptionFR);
        dest.writeString(strStadiumLocation);
        dest.writeString(strCountry);
        dest.writeString(strRSS);
        dest.writeString(strDescriptionRU);
        dest.writeString(strTeamBanner);
        dest.writeString(strDescriptionNO);
        dest.writeString(strStadiumThumb);
        dest.writeString(strDescriptionES);
        dest.writeString(intFormedYear);
        dest.writeString(strInstagram);
        dest.writeString(strDescriptionIT);
        dest.writeString(idTeam);
        dest.writeString(strDescriptionEN);
        dest.writeString(strWebsite);
        dest.writeString(strYoutube);
        dest.writeString(idAPIfootball);
        dest.writeString(strLocked);
        dest.writeString(strAlternate);
        dest.writeString(strTeam);
        dest.writeString(strTwitter);
        dest.writeString(strGender);
        dest.writeString(strStadium);
        dest.writeString(strFacebook);
        dest.writeString(strTeamBadge);
        dest.writeString(strLeague2);
        dest.writeString(strLeague3);
        dest.writeString(strLeague4);
        dest.writeString(strLeague5);
        dest.writeString(strDescriptionPT);
        dest.writeString(strLeague6);
        dest.writeString(strDescriptionDE);
        dest.writeString(strLeague7);
        dest.writeString(strLeague);
        dest.writeString(strManager);
        dest.writeString(strKeywords);
    }
}