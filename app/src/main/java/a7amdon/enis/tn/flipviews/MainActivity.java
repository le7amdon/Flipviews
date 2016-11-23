package a7amdon.enis.tn.flipviews;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {


    RelativeLayout root = null;
    RelativeLayout face=null;
    RelativeLayout back = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        root =(RelativeLayout) findViewById(R.id.main_activity_root);
        face =(RelativeLayout) findViewById(R.id.main_activity_card_face);
        back =(RelativeLayout) findViewById(R.id.main_activity_card_back);

        /*root.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                flipCard();
            }
        });*/
    }
    public void onCardClick(View view)
    {
        flipCard();
    }
    private void flipCard()
    {
        View rootLayout = (View) findViewById(R.id.main_activity_root);
        View cardFace = (View) findViewById(R.id.main_activity_card_face);
        View cardBack = (View) findViewById(R.id.main_activity_card_back);

        FlipAnimation flipAnimation = new FlipAnimation(cardFace, cardBack);

        if (cardFace.getVisibility() == View.GONE)
        {
            flipAnimation.reverse();
        }
        rootLayout.startAnimation(flipAnimation);
    }
}
