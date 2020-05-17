package com.hashtagvoyages.hashtagvoyages;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
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

public class signup extends AppCompatActivity {

    EditText name, email, password, phno;
    TextView signup;
    Button register, backtologin;
    ProgressBar progress;
    FirebaseAuth  firebaseauth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        signup = findViewById(R.id.Signuptext);
        name = findViewById(R.id.name);
        email = findViewById(R.id.loginEmail);
        password = findViewById(R.id.loginPass);
        phno = findViewById(R.id.phno);
        register = findViewById(R.id.registerBtn);
        backtologin = findViewById(R.id.backtologinBtn);
        progress = findViewById(R.id.progressBar3);
        firebaseauth = FirebaseAuth.getInstance();
    }

    public void register(View view) {
        String name1 = name.getText().toString().trim();
        String email1 = email.getText().toString().trim();
        String pass1 = password.getText().toString().trim();
        String phno1 = phno.getText().toString().trim();

        if (TextUtils.isEmpty(name1)){
            name.setError("Name Required");
        }

        if (TextUtils.isEmpty(email1)){
            email.setError("Email is Required");
            return;
        }
        if (TextUtils.isEmpty(pass1) || pass1.length() < 6){
            password.setError("Password not valid");
            return;
        }
        if (TextUtils.isEmpty(phno1) || phno.length() != 10){
            phno.setError("Phone Number not valid");
            return;
        }

        progress.setVisibility(View.VISIBLE);

        firebaseauth.createUserWithEmailAndPassword(email1, pass1).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {
                if (task.isSuccessful()){

                    FirebaseUser user = firebaseauth.getCurrentUser();
                    user.sendEmailVerification().addOnSuccessListener(new OnSuccessListener<Void>() {
                        @Override
                        public void onSuccess(Void aVoid) {
                            Toast.makeText(signup.this, "Verification mail sent to Email", Toast.LENGTH_SHORT).show();
                        }
                    }).addOnFailureListener(new OnFailureListener() {
                        @Override
                        public void onFailure(@NonNull Exception e) {
                            Toast.makeText(signup.this, "Verification mail not sent ", Toast.LENGTH_SHORT).show();
                        }
                    });

                    Toast.makeText(signup.this,"User Registered Successfully", Toast.LENGTH_SHORT).show();
                    startActivity(new Intent(getApplicationContext(), mainmenu.class));
                }

                else {
                    Toast.makeText(signup.this, "User Registration Failed "+ task.getException().getMessage(), Toast.LENGTH_SHORT).show();
                    progress.setVisibility(View.INVISIBLE);
                }
            }
        });



    }

    public void backtologin(View view) {
        Intent intent3 =new Intent(signup.this, Login.class );
        startActivity(intent3);
        finish();
    }
}
