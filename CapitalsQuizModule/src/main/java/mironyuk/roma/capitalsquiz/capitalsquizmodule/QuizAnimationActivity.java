package mironyuk.roma.capitalsquiz.capitalsquizmodule;

import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

/**
 * Created by Roma on 02.12.2014.
 */

public class QuizAnimationActivity extends Activity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTheme(android.R.style.Theme_Black_NoTitleBar);
        setContentView(R.layout.quiz_animation_activity);
        startAnimating();
    }

    /**
     * Helper method to start the animation on the splash screen
     */
    private void startAnimating() {
        // Fade in top title
        TextView titleView = (TextView) findViewById(R.id.titleAnimationView);
        Animation animTitleView = AnimationUtils.loadAnimation(this, R.anim.title_anim);
        titleView.startAnimation(animTitleView);
        animTitleView.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {

            }

            @Override
            public void onAnimationEnd(Animation animation) {

                // The animation has ended, transition to the Main Menu screen
                startActivity(new Intent(QuizAnimationActivity.this, QuizMenuActivity.class));
                QuizAnimationActivity.this.finish();
            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });

    }
}

