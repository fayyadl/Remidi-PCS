package com.fayyad.qiuqiubola.Fragment;

import android.content.Intent;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.fayyad.qiuqiubola.Adapter.ClubAdapter;
import com.fayyad.qiuqiubola.Api.ClientApi;
import com.fayyad.qiuqiubola.Item.TeamsItem;
import com.fayyad.qiuqiubola.Overview.OverviewClubsActivity;
import com.fayyad.qiuqiubola.R;
import com.fayyad.qiuqiubola.Response.ClubResponse;

import java.util.ArrayList;
import java.util.List;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class ClubPremierFragment extends Fragment {

    private List<TeamsItem> list = new ArrayList<>();
    private RecyclerView recyclerclub;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_clubs, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        recyclerclub = view.findViewById(R.id.recyclerclub);
        recyclerclub.setHasFixedSize(true);
        recyclerclub.setLayoutManager(new LinearLayoutManager(getActivity()));
        ClubAdapter clubsAdapter = new ClubAdapter(list);
        recyclerclub.setAdapter(clubsAdapter);
        GetAllClubs();
    }

    private void GetAllClubs() {
        Call<ClubResponse> call = ClientApi.getInstance().getApirest().getLigaInggris("English Premier League");

        call.enqueue(new Callback<ClubResponse>() {
            @Override
            public void onResponse(Call<ClubResponse> call, Response<ClubResponse> response) {
                list = response.body().getTeams();
                ClubAdapter clubsAdapter = new ClubAdapter(list);
                clubsAdapter.setOnItemClickCallback(new ClubAdapter.OnItemClickCallback() {
                    @Override
                    public void onItemClicked(TeamsItem teamsItems) {
                        Intent pindahOverviewClubsActivity = new Intent(getContext(), OverviewClubsActivity.class);
                        pindahOverviewClubsActivity.putExtra(OverviewClubsActivity.DESC_LIST, teamsItems);
                        startActivity(pindahOverviewClubsActivity);
                    }
                });
                recyclerclub.setAdapter(clubsAdapter);
            }

            @Override
            public void onFailure(Call<ClubResponse> call, Throwable t) {
            }
        });
    }
}