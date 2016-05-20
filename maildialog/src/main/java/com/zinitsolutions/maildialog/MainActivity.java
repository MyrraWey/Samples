package com.zinitsolutions.maildialog;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button mSendEmail;

    private final OnClickListener mSendEmailClickListener = new OnClickListener() {
        @Override
        public void onClick(View v) {
            DialogFragment dialogFragment = new DialogFragment();
            dialogFragment.show(getFragmentManager(), null);
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mSendEmail = (Button) findViewById(R.id.activity_main_send_email);

        mSendEmail.setOnClickListener(mSendEmailClickListener);
    }
}
