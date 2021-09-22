package edu.temple.signupform

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Debug
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import java.util.*


class FormActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var name = findViewById<EditText>(R.id.editTextTextPersonName2)
        var email = findViewById<EditText>(R.id.editTextTextEmailAddress)
        var password = findViewById<EditText>(R.id.editTextTextPassword)
        var passwordChecker = findViewById<EditText>(R.id.editTextTextPassword2)
        var saveButton = findViewById<Button>(R.id.button)



        saveButton.setOnClickListener {

            if (name.text.toString() == ""){
                name.setError("Name is a required field")
            }
            else if(email.text.toString() == ""){
                email.setError("Email is a required field")
            }
            else if(password.text.toString() == ""){
                password.setError("Password is a required field")
            }
            else if(passwordChecker.text.toString() == ""){
                passwordChecker.setError("Confirm Password is a required field")
            }
            else if(password.text.toString() != passwordChecker.text.toString()){
                passwordChecker.setError("Password and Confirm Password must match")
            }
            else {
                var toast = Toast.makeText(this, "Welcome, " + name.text.toString() + ", to the SignUpForm App", Toast.LENGTH_SHORT).show()
            }

        }




    }
}