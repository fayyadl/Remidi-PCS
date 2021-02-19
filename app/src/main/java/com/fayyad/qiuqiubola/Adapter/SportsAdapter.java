package com.fayyad.qiuqiubola.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.List;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.Glide;
import com.bumptech.glide.request.target.Target;
import com.fayyad.qiuqiubola.R;
import com.fayyad.qiuqiubola.Item.SportsItem;


public class SportsAdapter extends RecyclerView.Adapter<SportsAdapter.SportsAdapterEN> {

    private List<SportsItem> sportsItems;

    public SportsAdapter(List<SportsItem> sportsItems) {

        this.sportsItems = sportsItems;
    }

    @NonNull
    @Override
    public SportsAdapterEN onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_apps, parent, false);
        return new SportsAdapterEN(view);
    }

    private OnItemClickCallback onItemClickCallback;

    public void setOnItemClickCallback(OnItemClickCallback onItemClickCallback) {
        this.onItemClickCallback = onItemClickCallback;
    }

    public interface OnItemClickCallback {
        void onItemClicked(SportsItem sportsItem);
    }

    @Override
    public void onBindViewHolder(@NonNull SportsAdapterEN holder, int position) {
        holder.strName.setText(sportsItems.get(position).getStrSport());
        Glide.with(holder.itemView.getContext())
                .load(sportsItems.get(position).getStrSportThumb())
                .override(Target.SIZE_ORIGINAL)
                .into(holder.strImages);
        holder.itemView.setOnClickListener(view -> onItemClickCallback.onItemClicked(sportsItems.get(holder.getAdapterPosition())));
    }

    @Override
    public int getItemCount() {

        return sportsItems.size();
    }

    public class SportsAdapterEN extends RecyclerView.ViewHolder {

        final TextView strName;
        final ImageView strImages;


        public SportsAdapterEN(@NonNull View itemView) {
            super(itemView);
            strName = itemView.findViewById(R.id.strName);
            strImages = itemView.findViewById(R.id.strImages);
        }
    }
}
