package com.zinitsolutions.maildialog;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by dmitrij on 5/20/16.
 */
public class DialogFragment extends android.app.DialogFragment {
    private EditText mEmail;
    private Button mOk;
    private Button mCancel;

    private final OnClickListener mOkClickListener = new OnClickListener() {
        @Override
        public void onClick(View v) {
            sendMail(mEmail.getText().toString());
        }
    };

    private final OnClickListener mCancelClickListener = new OnClickListener() {
        @Override
        public void onClick(View v) {
            dismiss();
        }
    };

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_dialog, container, false);

        mEmail = (EditText) view.findViewById(R.id.fragment_dialog_mail);
        mOk = (Button) view.findViewById(R.id.fragment_dialog_ok);
        mCancel = (Button) view.findViewById(R.id.fragment_dialog_cancel);

        mOk.setOnClickListener(mOkClickListener);
        mCancel.setOnClickListener(mCancelClickListener);

        return view;
    }

    private void sendMail(String mail) {
        Intent sendEmailIntent = new Intent(Intent.ACTION_SEND);

        sendEmailIntent.setType("text/plain");
        sendEmailIntent.putExtra(Intent.EXTRA_EMAIL, new String[]{mail}); // recipients
        sendEmailIntent.putExtra(Intent.EXTRA_SUBJECT, "File by mail");
        sendEmailIntent.putExtra(Intent.EXTRA_TEXT, "Some body");
        //sendEmailIntent.putExtra(Intent.EXTRA_STREAM, Uri.parse("content://path/to/email/attachment"))

        startActivity((Intent.createChooser(sendEmailIntent, "Mail title")));

        dismiss();
    }
}
