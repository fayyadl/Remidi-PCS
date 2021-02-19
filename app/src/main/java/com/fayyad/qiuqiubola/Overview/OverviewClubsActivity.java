package com.fayyad.qiuqiubola.Overview;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import com.bumptech.glide.Glide;
import com.bumptech.glide.request.target.Target;
import com.fayyad.qiuqiubola.Item.TeamsItem;
import com.fayyad.qiuqiubola.R;

public class OverviewClubsActivity extends AppCompatActivity {

    public static final String DESC_LIST = "desc_list";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_overview_clubs);

        ImageView strTeamImage = findViewById(R.id.strClubImages);
        TextView strDescClub = findViewById(R.id.strDescClub);

        TeamsItem teamsItem = getIntent().getParcelableExtra(DESC_LIST);
        strDescClub.setText(teamsItem.getStrDescriptionEN());
        Glide.with(this)
                .load(teamsItem.getStrTeamLogo())
                .override(Target.SIZE_ORIGINAL)
                .into(strTeamImage);
    }
}