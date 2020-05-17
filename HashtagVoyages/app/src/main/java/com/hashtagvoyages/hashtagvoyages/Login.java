package com.hashtagvoyages.hashtagvoyages;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class Login extends AppCompatActivity {

    private EditText loginEmail;
    private EditText loginPass;
    private Button loginBtn;
    TextView forgetpass1;
    ProgressBar progress1;

    private FirebaseAuth mAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        mAuth = FirebaseAuth.getInstance();

        loginEmail = (EditText) findViewById(R.id.loginEmail);
        loginPass = (EditText) findViewById(R.id.loginPass);
        loginBtn = (Button) findViewById(R.id.liginBtn);
        progress1 = (ProgressBar) findViewById(R.id.progressBar2);
        forgetpass1 = (TextView) findViewById(R.id.forgetpass);

        loginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                final String email = loginEmail.getText().toString();
                final String password = loginPass.getText().toString();

                if (TextUtils.isEmpty(email)) {
                    loginEmail.setError("Email is Required");
                    return;
                }
                if (TextUtils.isEmpty(password) || password.length() < 6) {
                    loginPass.setError("Invalid Password");
                    return;
                }

                progress1.setVisibility(View.VISIBLE);

                mAuth.signInWithEmailAndPassword(email, password)
                        .addOnCompleteListener(Login.this, new OnCompleteListener<AuthResult>() {
                            @Override
                            public void onComplete(@NonNull Task<AuthResult> task) {
                                if (task.isSuccessful()) {
                                    Intent mainIntent = new Intent(Login.this, mainmenu.class);
                                    mainIntent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
                                    startActivity(mainIntent);
                                    finish();

                                } else {
                                    Log.w("asd", "createUserWithEmail:failure", task.getException());
                                    Toast.makeText(Login.this, "No record found, please fill correct email/pass",
                                            Toast.LENGTH_SHORT).show();
                                    progress1.setVisibility(View.INVISIBLE);
                                    // updateUI(null);
                                }

                            }

                        });
            }

        });
    }

    public void onStart() {
        super.onStart();
        // Check if user is signed in (non-null) and update UI accordingly.
        FirebaseUser currentUser = mAuth.getCurrentUser();
        // updateUI(currentUser);
    }

    public void opensignup(View view) {

        Intent Intent1 = new Intent(Login.this, signup.class);
        startActivity(Intent1);
        finish();

    }

    public void openforgetpass(View v) {
        final EditText resetmail = new EditText(v.getContext());
        AlertDialog.Builder passresetdial = new AlertDialog.Builder(v.getContext());
        passresetdial.setTitle("Reset Password?");
        passresetdial.setMessage("Enter your valid Email to get link for reset password");
        passresetdial.setView(resetmail);
        passresetdial.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                String mailr = resetmail.getText().toString();
                mAuth.sendPasswordResetEmail(mailr).addOnSuccessListener(new OnSuccessListener<Void>() {
                    @Override
                    public void onSuccess(Void aVoid) {
                        Toast.makeText(Login.this, "Reset Link Sent to mail!", Toast.LENGTH_LONG).show();
                    }
                }).addOnFailureListener(new OnFailureListener() {
                    @Override
                    public void onFailure(@NonNull Exception e) {
                        Toast.makeText(Login.this, "Error! Reset Link is not Sent!", Toast.LENGTH_SHORT).show();
                    }
                });

            }
        });
        passresetdial.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

            }
        });
        passresetdial.create().show();
    }

    private Boolean exit = false;

    public void onBackPressed() {
        if (exit) {
            Intent intent = new Intent(Intent.ACTION_MAIN);
            intent.addCategory(Intent.CATEGORY_HOME);
            intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
            startActivity(intent);
            finish();
            System.exit(0);
        } else {
            Toast.makeText(this, "Press Back again to Exit",
                    Toast.LENGTH_SHORT).show();
            exit = true;
            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {
                    exit = false;
                }
            }, 3 * 1000);

        }
    }
}

