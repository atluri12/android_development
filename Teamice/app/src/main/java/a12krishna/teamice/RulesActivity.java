package a12krishna.teamice;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class RulesActivity extends AppCompatActivity {

    private WebView webview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rules);

        webview = (WebView) findViewById(R.id.webV);
        webview.getSettings().setJavaScriptEnabled(true);
        webview.loadUrl("http://jntuhweb.in/rules-and-regulations");
    }
}
