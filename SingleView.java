package com.example.karanc.myapplicationgv;

import android.app.Activity;
import android.content.Intent;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Toast;

public class SingleView extends Activity {
    public Integer pics[]={
            R.drawable.brad,
            R.drawable.canvas,
            R.drawable.chester,
            R.drawable.eminterview,
            R.drawable.emsb,
            R.drawable.images,
            R.drawable.images1,
            R.drawable.images2,
            R.drawable.images5,
            R.drawable.cam,
            R.drawable.man,
            R.drawable.fm
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_single_view);
        //Intent intent=getIntent();
        Intent intent= getIntent();
        final int position=intent.getExtras().getInt("id");
        ImageAdapter imageAdapter=new ImageAdapter(this);
        ImageView iv= (ImageView) findViewById(R.id.iv);
        //ArrayAdapter<Image> adapter=new ArrayAdapter<Image>(getApplicationContext(),)
        iv.setImageResource(imageAdapter.pics[position]);
       // iv.setImageBitmap(bm);
        iv.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                Toast.makeText(getApplicationContext(),"Image "+position,Toast.LENGTH_SHORT).show();
                return false;
            }
        });

    }


}
