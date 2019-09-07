package a12krishna.teamice;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class VcActivity extends AppCompatActivity {

    private WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vc);

        webView = (WebView) findViewById(R.id.web1);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.loadUrl("http://jntuhweb.in/vice-chancellor");
    }
}
