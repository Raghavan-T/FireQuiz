package com.quiz.raghavan.firequiz;

import android.app.AlertDialog;
import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class SecondActivity extends AppCompatActivity {

    private TextView userName;
    private FirebaseAuth firebaseAuth;
    Button buttonC,buttonCplusplus,buttonJava,buttonAndroid;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        setupUIViews();

        firebaseAuth = FirebaseAuth.getInstance();

        FirebaseUser user = firebaseAuth.getCurrentUser();
        if (user != null) {
            userName.setText("Welcome:" + user.getEmail());
        }

        buttonC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(SecondActivity.this,CActivity.class);
                startActivity(i);
            }
        });
        buttonCplusplus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(SecondActivity.this,CplusplusActivity.class);
                startActivity(i);
            }
        });
        buttonJava.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(SecondActivity.this,JavaActivity.class);
                startActivity(i);
            }
        });
        buttonAndroid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(SecondActivity.this,AndroidActivity.class);
                startActivity(i);
            }
        });
    }

    private void setupUIViews() {
        userName = (TextView) findViewById(R.id.userName);
        buttonC = (Button) findViewById(R.id.buttonC);
        buttonCplusplus = (Button) findViewById(R.id.buttonCplusplus);
        buttonJava = (Button) findViewById(R.id.buttonJava);
        buttonAndroid = (Button) findViewById(R.id.buttonAndroid);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int id = item.getItemId();

        switch (id) {
            case R.id.logout:
                AlertDialog.Builder alertDialog = new AlertDialog.Builder(SecondActivity.this);

                alertDialog.setTitle("Logout");
                alertDialog.setMessage("Do you want to exit?");

                alertDialog.setIcon(R.drawable.ic_exit_to_app_black_24dp);

                alertDialog.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        finish();
                        FirebaseAuth.getInstance().signOut();
                        Intent intent = new Intent(SecondActivity.this, MainActivity.class);
                        Toast.makeText(getApplicationContext(), "LogOut Successful", Toast.LENGTH_SHORT).show();
                        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
                        startActivity(intent);
                    }
                });
                alertDialog.setNegativeButton("No", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                });
                alertDialog.show();

                break;
        }
        return true;
    }
}
