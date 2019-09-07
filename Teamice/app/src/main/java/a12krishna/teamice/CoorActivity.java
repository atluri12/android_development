package a12krishna.teamice;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class CoorActivity extends AppCompatActivity {
    private WebView weBview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_coor);

        weBview = (WebView) findViewById(R.id.web4);
        weBview.getSettings().setJavaScriptEnabled(true);
        weBview.loadUrl("http://jntuhweb.in/directorate/support_details/1/3");
    }
}
