package com.fayyad.qiuqiubola.Response;

import java.util.List;

import com.fayyad.qiuqiubola.Item.SportsItem;
import com.google.gson.annotations.SerializedName;

public class AllSportResponse{

    @SerializedName("sports")
    private List<SportsItem> sports;

    public void setSports(List<SportsItem> sports){
        this.sports = sports;
    }

    public List<SportsItem> getSports(){
        return sports;
    }
}