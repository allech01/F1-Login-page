package com.example.myapplication1;

import android.content.Intent;
import android.os.Bundle;
import android.text.InputType;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity3 extends AppCompatActivity {

    private boolean isPasswordVisible = false;
    private boolean isConfirmPasswordVisible = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        EditText passwordField = findViewById(R.id.password);
        EditText confirmPasswordField = findViewById(R.id.confirmpassword);

        ImageView viewPassword = findViewById(R.id.view_password);
        ImageView viewConfirmPassword = findViewById(R.id.view_confirmpassword);

        viewPassword.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isPasswordVisible) {
                    passwordField.setInputType(InputType.TYPE_CLASS_TEXT | InputType.TYPE_TEXT_VARIATION_PASSWORD);
                    viewPassword.setImageResource(R.drawable.view);
                } else {
                    passwordField.setInputType(InputType.TYPE_TEXT_VARIATION_VISIBLE_PASSWORD);
                    viewPassword.setImageResource(R.drawable.view);
                }
                isPasswordVisible = !isPasswordVisible;
                passwordField.setSelection(passwordField.length());
            }
        });

        viewConfirmPassword.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isConfirmPasswordVisible) {
                    confirmPasswordField.setInputType(InputType.TYPE_CLASS_TEXT | InputType.TYPE_TEXT_VARIATION_PASSWORD);
                    viewConfirmPassword.setImageResource(R.drawable.view);
                } else {
                    confirmPasswordField.setInputType(InputType.TYPE_TEXT_VARIATION_VISIBLE_PASSWORD);
                    viewConfirmPassword.setImageResource(R.drawable.view);
                }
                isConfirmPasswordVisible = !isConfirmPasswordVisible;
                confirmPasswordField.setSelection(confirmPasswordField.length());
            }
        });

        findViewById(R.id.login2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity3.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
