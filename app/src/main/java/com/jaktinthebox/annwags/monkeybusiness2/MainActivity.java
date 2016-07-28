package com.jaktinthebox.annwags.monkeybusiness2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends Activity {
    ImageButton mImageButton;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mImageButton = (ImageButton) findViewById(R.id.imageButton);
        mImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(view.getContext(), MonkeyBusiness.class);
                startActivity(myIntent);
            }
        });
    }
}

   // public static class MainActivity extends Activity {

      //  @Override
      //  protected void onCreate(Bundle savedInstanceState) {
          //  super.onCreate(savedInstanceState);
         //   requestWindowFeature(Window.FEATURE_NO_TITLE);
           // getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
          //  setContentView(new GamePanel(this));
      //  }
   // }
//}