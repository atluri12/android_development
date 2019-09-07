package a12krishna.teamice;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class DirActivity extends AppCompatActivity {
    private WebView webvieW;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dir);

        webvieW = (WebView) findViewById(R.id.web3);
        webvieW.getSettings().setJavaScriptEnabled(true);
        webvieW.loadUrl("http://jntuhweb.in/directorate/director_details/1");
    }
}
