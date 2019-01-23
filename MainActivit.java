package com.example.admin.login;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class MainActivit extends AppCompatActivity {

 //  private EditText Name, Password;
   // private Button Login;
    private TextView userRegistration;
    //private FirebaseAuth firebaseAuth;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

      /*  Name = (EditText)findViewById(R.id.etEmail);
        Password = (EditText)findViewById(R.id.etPassword);

        firebaseAuth = FirebaseAuth.getInstance();

        FirebaseUser user = firebaseAuth.getCurrentUser();
        if(user !=null){
            finish();
            startActivity(new Intent(MainActivit.this,HomeActivity.class));
        }
        Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                validate(Name.getText().toString(),Password.getText().toString());
            }
        });*/
        userRegistration = (TextView)findViewById(R.id.tvRegister);
        userRegistration.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivit.this,RegistrationActivity.class));
            }
        });
    }
   /* private void validate(String userName, String userPassword){

        firebaseAuth.createUserWithEmailAndPassword(userName, userPassword).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {
                if(task.isSuccessful()){
                    Toast.makeText(MainActivit.this,"Login Successful", Toast.LENGTH_SHORT).show();
                    startActivity(new Intent(MainActivit.this,HomeActivity.class));
                }else{
                    Toast.makeText(MainActivit.this,"Login Failed", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }*/
}
