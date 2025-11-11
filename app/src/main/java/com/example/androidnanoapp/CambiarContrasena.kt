package com.example.cambiarcontrasea

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import android.R

class CambiarContraseña : AppCompatActivity() {

    private lateinit var etCurrentPassword: EditText
    private lateinit var etNewPassword: EditText
    private lateinit var etConfirmPassword: EditText
    private lateinit var btnChangePassword: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.cambiarcontrasena)

        // Asegúrate de que estos IDs coincidan con los del archivo XML
        etCurrentPassword = findViewById(R.id.ContrasenaAcutal)
        etNewPassword = findViewById(R.id.etNewPassword)
        etConfirmPassword = findViewById(R.id.etConfirmPassword)
        btnChangePassword = findViewById(R.id.btnChangePassword)

        btnChangePassword.setOnClickListener {
            val currentPassword = etCurrentPassword.text.toString().trim()
            val newPassword = etNewPassword.text.toString().trim()
            val confirmPassword = etConfirmPassword.text.toString().trim()

            // Aquí puedes agregar la lógica para cambiar la contraseña
            if (newPassword == confirmPassword) {
                // Lógica para cambiar la contraseña
            } else {
                // Mostrar un mensaje de error
            }
        }
    }
}
