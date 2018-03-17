package com.quiz.raghavan.firequiz;

import android.app.ProgressDialog;
import android.content.Intent;
import android.graphics.Color;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class RegistrationActivity extends AppCompatActivity {

    private EditText userName, userPassword, userEmail;
    private Button regButton;
    private FirebaseAuth firebaseAuth;
    private TextView tvPasswordStrength;
    ImageButton imageButton;
    ProgressDialog progressDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);

        setupUIViews();

        firebaseAuth = FirebaseAuth.getInstance();


        progressDialog = new ProgressDialog(RegistrationActivity.this);

        userPassword.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
            }

            @Override
            public void afterTextChanged(Editable editable) {
                // Calculate password strength
                calculateStrength(editable.toString());
            }
        });

        regButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(validate())
                {
                    String user_email = userEmail.getText().toString().trim();
                    String user_password = userPassword.getText().toString().trim();

                    progressDialog.setMessage("Submitting...");
                    progressDialog.show();

                    firebaseAuth.createUserWithEmailAndPassword(user_email, user_password).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                        @Override
                        public void onComplete(@NonNull Task<AuthResult> task) {

                            if(task.isSuccessful()){
                                Toast.makeText(RegistrationActivity.this, "Registration Successful", Toast.LENGTH_SHORT).show();
                                startActivity(new Intent(RegistrationActivity.this, MainActivity.class));
                            }else{
                                Toast.makeText(RegistrationActivity.this, "Registration Failed", Toast.LENGTH_SHORT).show();
                            }
                        }
                    });
                }
            }
        });


    }

    private void setupUIViews(){
        userName = (EditText)findViewById(R.id.etUserName);
        userPassword = (EditText)findViewById(R.id.etUserPassword);
        userEmail = (EditText)findViewById(R.id.etUserEmail);
        regButton = (Button)findViewById(R.id.btnRegister);
        tvPasswordStrength = (TextView) findViewById(R.id.tvPasswordStrength);
    }

    private Boolean validate() {
        Boolean result = false;
        /*
         * String name = userName.getText().toString();
         * String password = userPassword.getText().toString();
         * String email = userEmail.getText().toString();

         * if(name.isEmpty() || password.isEmpty() || email.isEmpty()){
         * Toast.makeText(this, "Please enter all the details", Toast.LENGTH_SHORT).show();

        */

        if (TextUtils.isEmpty(userName.getText())) {
            Toast.makeText(getApplication(), "Please Enter Name", Toast.LENGTH_SHORT).show();
            userName.setError("Name required");
        } else if (TextUtils.isEmpty(userEmail.getText())) {
            Toast.makeText(getApplicationContext(), "Please Enter Email", Toast.LENGTH_SHORT).show();
            userEmail.setError("Email required");
        } else if (TextUtils.isEmpty(userPassword.getText())) {
            Toast.makeText(getApplication(), "Please Enter Password", Toast.LENGTH_SHORT).show();
            userPassword.setError("Password required");
        } else{
            result = true;
        }
        return result;
    }



    private void calculateStrength(String passwordText) {
        int upperChars = 0, lowerChars = 0, numbers = 0,
                specialChars = 0, otherChars = 0, strengthPoints = 0;
        char c;

        int passwordLength = passwordText.length();

        if (passwordLength ==0)
        {
            tvPasswordStrength.setText("Invalid Password");
            tvPasswordStrength.setBackgroundColor(Color.RED);
            return;
        }

        //If password length is <= 5 set strengthPoints=1
        if (passwordLength <= 5) {
            strengthPoints =1;
        }
        //If password length is >5 and <= 10 set strengthPoints=2
        else if (passwordLength <= 10) {
            strengthPoints = 2;
        }
        //If password length is >10 set strengthPoints=3
        else
            strengthPoints = 3;
        // Loop through the characters of the password
        for (int i = 0; i < passwordLength; i++) {
            c = passwordText.charAt(i);
            // If password contains lowercase letters
            // then increase strengthPoints by 1
            if (c >= 'a' && c <= 'z') {
                if (lowerChars == 0) strengthPoints++;
                lowerChars = 1;
            }
            // If password contains uppercase letters
            // then increase strengthPoints by 1
            else if (c >= 'A' && c <= 'Z') {
                if (upperChars == 0) strengthPoints++;
                upperChars = 1;
            }
            // If password contains numbers
            // then increase strengthPoints by 1
            else if (c >= '0' && c <= '9') {
                if (numbers == 0) strengthPoints++;
                numbers = 1;
            }
            // If password contains _ or @
            // then increase strengthPoints by 1
            else if (c == '_' || c == '@') {
                if (specialChars == 0) strengthPoints += 1;
                specialChars = 1;
            }
            // If password contains any other special chars
            // then increase strengthPoints by 1
            else {
                if (otherChars == 0) strengthPoints += 2;
                otherChars = 1;
            }
        }

        if (strengthPoints <= 3)
        {
            tvPasswordStrength.setText("Password Strength : LOW");
            tvPasswordStrength.setBackgroundColor(Color.RED);
        }
        else if (strengthPoints <= 6) {
            tvPasswordStrength.setText("Password Strength : MEDIUM");
            tvPasswordStrength.setBackgroundColor(Color.YELLOW);
        }
        else if (strengthPoints <= 9){
            tvPasswordStrength.setText("Password Strength : STRONG");
            tvPasswordStrength.setBackgroundColor(Color.GREEN);
        }
    }
}