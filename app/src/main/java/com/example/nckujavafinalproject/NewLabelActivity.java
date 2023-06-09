package com.example.nckujavafinalproject;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class NewLabelActivity extends AppCompatActivity {

    public static final String EXTRA_REPLY = "com.example.android.restaurantlistsql.REPLY";

    private EditText mEditLabelView;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_restaurant);
        mEditLabelView = findViewById(R.id.edit_restaurant);

        final Button button = findViewById(R.id.button_save);
        button.setOnClickListener(view -> {
            Intent replyIntent = new Intent();
            if (TextUtils.isEmpty(mEditLabelView.getText())) {
                setResult(RESULT_CANCELED, replyIntent);
            } else {
                String label = mEditLabelView.getText().toString();
                replyIntent.putExtra(EXTRA_REPLY, label);
                setResult(RESULT_OK, replyIntent);
            }
            finish();
        });
    }
}