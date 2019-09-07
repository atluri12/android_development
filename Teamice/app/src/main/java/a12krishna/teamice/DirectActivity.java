package a12krishna.teamice;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class DirectActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_direct);
    }

    public void goTo(View view) {
        Intent int1 = new Intent(this, DirActivity.class);
        startActivity(int1);
    }
    public void gooTo(View view) {
        Intent int2 = new Intent(this, CoorActivity.class);
        startActivity(int2);
    }
}
