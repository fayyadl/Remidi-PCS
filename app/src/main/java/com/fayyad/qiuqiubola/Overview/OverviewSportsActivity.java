package com.fayyad.qiuqiubola.Overview;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import com.bumptech.glide.Glide;
import com.bumptech.glide.request.target.Target;
import com.fayyad.qiuqiubola.Item.SportsItem;
import com.fayyad.qiuqiubola.R;

public class OverviewSportsActivity extends AppCompatActivity {

    public static final String DESC_LIST = "desc_list";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_overview_sports);

        ImageView strTeamImage = findViewById(R.id.strSportImages);
        TextView strDesc = findViewById(R.id.strDesc);

        SportsItem sportsItems = getIntent().getParcelableExtra(DESC_LIST);
        strDesc.setText(sportsItems.getStrSportDescription());
        Glide.with(this)
                .load(sportsItems.getStrSportThumb())
                .override(Target.SIZE_ORIGINAL)
                .into(strTeamImage);
    }
}