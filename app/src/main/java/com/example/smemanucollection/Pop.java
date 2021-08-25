package com.example.smemanucollection;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.provider.MediaStore;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.annotation.Nullable;

public class Pop extends Activity {

    ImageView imageView;
    Bitmap bmpImage;
    EditText PName,MRP,Landing;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.popupwindow);

        imageView=findViewById(R.id.particularImage);
        bmpImage=null;

        PName=findViewById(R.id.ProductNameEditText);
        MRP=findViewById(R.id.MRPEditText);
        Landing=findViewById(R.id.LandingEditText);

        DisplayMetrics dm=new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(dm);
        int width=dm.widthPixels;
        int height=dm.heightPixels;
        getWindow().setLayout((int)(width*0.8),(int)(height*0.6));

    }
final int CAMERA_INTENT=51;
    public void InsertPhoto(View view) {
        Intent intent =new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
        if(intent.resolveActivity(getPackageManager())!=null){
            startActivityForResult(intent,CAMERA_INTENT);
        }
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode,@Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        switch(requestCode){
            case CAMERA_INTENT:
//                if(requestCode == Activity.RESULT_OK) {
                    bmpImage = (Bitmap) data.getExtras().get("data");
                    if(bmpImage!=null){
                        imageView.setImageBitmap(bmpImage);
                    }
                    else{
                        Toast.makeText(
                                this,
                                "bitmap is null",
                                Toast.LENGTH_SHORT

                        ).show();

                }
                    break;
        }
    }

    public void SaveItem(View view) {

if(PName.getText().toString().isEmpty() || MRP.getText().toString().isEmpty() || Landing.getText().toString().isEmpty() || bmpImage== null){
    Toast.makeText(
            this,
            "item data is missing",
            Toast.LENGTH_SHORT
    ).show();
}else{
    SME sme=new SME();
    sme.setProductName(PName.getText().toString());


}
    }
}
