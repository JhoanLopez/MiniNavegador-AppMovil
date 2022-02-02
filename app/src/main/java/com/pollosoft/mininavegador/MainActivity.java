package com.pollosoft.mininavegador;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText editTexturl;
    Button buttonClear, buttonNavigate;
    WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonClear = findViewById(R.id.buttonClear);
        buttonNavigate = findViewById(R.id.buttonNavegar);
        webView = findViewById(R.id.webView);
        editTexturl = findViewById(R.id.editTextUrl);

        buttonClear.setOnClickListener( v -> editTexturl.setText(""));

        buttonNavigate.setOnClickListener(v -> navegar(v));

    }

    public void navegar (View v) {

        webView.setWebViewClient(new WebViewClient());
        webView.getSettings().setJavaScriptEnabled(true);

        webView.loadUrl(editTexturl.getText().toString());

    }
}