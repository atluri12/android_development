package a12krishna.teamice;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class RegActivity extends AppCompatActivity {

    private WebView webView1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reg);

        webView1 = (WebView) findViewById(R.id.web2);
        webView1.getSettings().setJavaScriptEnabled(true);
        webView1.loadUrl("http://jntuhweb.in/registrar");
    }
}
