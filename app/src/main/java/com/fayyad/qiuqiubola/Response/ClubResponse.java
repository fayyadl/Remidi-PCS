package com.fayyad.qiuqiubola.Response;

import java.util.List;

import com.fayyad.qiuqiubola.Item.TeamsItem;
import com.google.gson.annotations.SerializedName;

public class ClubResponse{

    @SerializedName("teams")
    private List<TeamsItem> teams;

    public void setTeams(List<TeamsItem> teams){
        this.teams = teams;
    }

    public List<TeamsItem> getTeams(){
        return teams;
    }
}