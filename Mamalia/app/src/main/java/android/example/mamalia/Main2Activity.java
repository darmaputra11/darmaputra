package android.example.mamalia;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import java.util.Objects;


public class Main2Activity extends AppCompatActivity {
    ImageView imgPhoto;
    TextView tvName;
    TextView tvRemarks;
    TextView tvDesc;

    @RequiresApi(api = Build.VERSION_CODES.KITKAT)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        tvName = findViewById(R.id.tv_item_name);
        imgPhoto = findViewById(R.id.img_item_photo);
        tvRemarks = findViewById(R.id.tv_item_remarks);
        tvDesc = findViewById(R.id.tv_item_desc);

        Intent getdetail = getIntent();
        Objects.requireNonNull(getSupportActionBar()).setTitle(getdetail.getStringExtra("tvName"));
        imgPhoto.setImageResource(getdetail.getIntExtra("imgPhoto", 1));
        tvName.setText(getdetail.getStringExtra("tvName"));
        tvRemarks.setText(getdetail.getStringExtra("tvRemarks"));
        tvDesc.setText(getdetail.getStringExtra("tvDesc"));
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}

