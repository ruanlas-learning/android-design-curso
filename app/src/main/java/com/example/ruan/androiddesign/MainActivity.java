package com.example.ruan.androiddesign;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements
        FragmentoRed.OnFragmentInteractionListener,
        FragmentoAzul.OnFragmentInteractionListener,
        FragmentoVerde.OnFragmentInteractionListener {

    FragmentoAzul fragmentoAzul;
    FragmentoVerde fragmentoVerde;
    FragmentoRed fragmentoRed;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fragmentoAzul = new FragmentoAzul();
        fragmentoRed = new FragmentoRed();
        fragmentoVerde = new FragmentoVerde();
    }

    @Override
    public void onFragmentInteraction(Uri uri) {

    }
}
