package edu.cnm.deepdive.animatedexample;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import com.daimajia.androidanimations.library.Techniques;
import com.daimajia.androidanimations.library.YoYo;

public class MainActivity extends AppCompatActivity {

  private TextView mTextview;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    mTextview = findViewById(R.id.text_view);

    Button buttonAnimate = findViewById(R.id.button_animate);
    buttonAnimate.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {
        YoYo.with(Techniques.Wobble)
            .duration(700)
            .repeat(2)
            .playOn(mTextview);
      }
    });
  }
}