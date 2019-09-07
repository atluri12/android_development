package a12krishna.teamice;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class ContactActivity extends AppCompatActivity {
    private WebView wEbview;;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact);

        wEbview = (WebView) findViewById(R.id.web5);
        wEbview.getSettings().setJavaScriptEnabled(true);
        wEbview.loadUrl("http://jntuhweb.in/contact-us");
    }
}
