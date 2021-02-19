package com.fayyad.qiuqiubola.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.Glide;
import com.bumptech.glide.request.target.Target;
import com.fayyad.qiuqiubola.R;
import com.fayyad.qiuqiubola.Item.TeamsItem;

import java.util.List;

public class ClubAdapter extends RecyclerView.Adapter<ClubAdapter.ClubAdapterEN> {

    private List<TeamsItem> teamsItems;

    public ClubAdapter(List<TeamsItem> teamsItems) {

        this.teamsItems = teamsItems;
    }

    @NonNull
    @Override
    public ClubAdapterEN onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_apps, parent, false);
        return new ClubAdapterEN(view);
    }

    private ClubAdapter.OnItemClickCallback onItemClickCallback;

    public void setOnItemClickCallback(ClubAdapter.OnItemClickCallback onItemClickCallback) {
        this.onItemClickCallback = onItemClickCallback;
    }

    public interface OnItemClickCallback {
        void onItemClicked(TeamsItem teamsItems);
    }

    @Override
    public void onBindViewHolder(@NonNull ClubAdapter.ClubAdapterEN holder, int position) {
        holder.strName.setText(teamsItems.get(position).getStrTeam());
        Glide.with(holder.itemView.getContext())
                .load(teamsItems.get(position).getStrTeamLogo())
                .override(Target.SIZE_ORIGINAL)
                .into(holder.strImages);
        holder.itemView.setOnClickListener(view -> onItemClickCallback.onItemClicked(teamsItems.get(holder.getAdapterPosition())));
    }

    @Override
    public int getItemCount() {

        return teamsItems.size();
    }

    public class ClubAdapterEN extends RecyclerView.ViewHolder {

        final TextView strName;
        final ImageView strImages;


        public ClubAdapterEN(@NonNull View itemView) {
            super(itemView);
            strName = itemView.findViewById(R.id.strName);
            strImages = itemView.findViewById(R.id.strImages);
        }
    }
}
