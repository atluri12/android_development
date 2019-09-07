package a12krishna.teamice;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class AcademicsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_academics);

        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
    }

    public void fade(View view) {
        Intent intent0 = new Intent(this, CourseActivity.class);
        startActivity(intent0);
        overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);
    }
    public void fade1(View view) {
        Intent intent1 = new Intent(this, RulesActivity.class);
        startActivity(intent1);
        overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);
    }
    public void fade2(View view) {
        Intent intent2 = new Intent(this, CollegeActivity.class);
        startActivity(intent2);
        overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);
    }

}
