package generalassembly.yuliyakaleda.startercode;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

  private EditText input;
  private TextView text;
  private Button addButton;
  private LinearLayout wishList;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    //TODO: set up all the view and event listeners.

    input = (EditText) findViewById(R.id.input);
    text  = (TextView) findViewById(R.id.text);

    addButton = (Button) findViewById(R.id.add_button);
    addButton.setOnClickListener(this);

    wishList = (LinearLayout) findViewById(R.id.wish_list);
  }

  @Override
  public void onClick(View v) {
    // TODO: 1. get the text from the input field
    //       2. animate it in the center of the screen
      String wish = input.getText().toString();
      text.setText(wish);
      Animation animation = AnimationUtils.loadAnimation(this, R.anim.animation);
      text.startAnimation(animation);
    //       3. add it to the list wish
      TextView newView = new TextView(this);
      newView.setText(wish);
      wishList.addView(newView, 0);
    //       4. clear the input field
      input.setText("");

  }
}
