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

import com.fayyad.qiuqiubola.Adapter.SportsAdapter;
import com.fayyad.qiuqiubola.Api.ClientApi;
import com.fayyad.qiuqiubola.Item.SportsItem;
import com.fayyad.qiuqiubola.Overview.OverviewSportsActivity;
import com.fayyad.qiuqiubola.R;
import com.fayyad.qiuqiubola.Response.AllSportResponse;

import java.util.ArrayList;
import java.util.List;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


public class SportsFragment extends Fragment {


    private List<SportsItem> list = new ArrayList<>();
    private RecyclerView recycler;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_sports, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        recycler = view.findViewById(R.id.recycler);
        recycler.setHasFixedSize(true);
        recycler.setLayoutManager(new LinearLayoutManager(getActivity()));
        SportsAdapter sportsAdapter = new SportsAdapter(list);
        recycler.setAdapter(sportsAdapter);
        GetAllSport();
    }

    private void GetAllSport() {
        Call<AllSportResponse> call = ClientApi.getInstance().getApirest().GetAllSport();

        call.enqueue(new Callback<AllSportResponse>() {
            @Override
            public void onResponse(Call<AllSportResponse> call, Response<AllSportResponse> response) {
                list = response.body().getSports();
                SportsAdapter sportsAdapter = new SportsAdapter(list);
                sportsAdapter.setOnItemClickCallback(new SportsAdapter.OnItemClickCallback() {
                    @Override
                    public void onItemClicked(SportsItem sportsItem) {
                        Intent pindahOverviewActivity = new Intent(getContext(), OverviewSportsActivity.class);
                        pindahOverviewActivity.putExtra(OverviewSportsActivity.DESC_LIST, sportsItem);
                        startActivity(pindahOverviewActivity);
                    }
                });
                recycler.setAdapter(sportsAdapter);
            }

            @Override
            public void onFailure(Call<AllSportResponse> call, Throwable t) {
            }
        });
    }
}