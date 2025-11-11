package com.example.crearcuenta

import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.activity.R
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.textfield.TextInputEditText

class CrearCuenta : AppCompatActivity() {

    private lateinit var nombreEditText: TextInputEditText
    private lateinit var contrasenaEditText: TextInputEditText
    private lateinit var correoEditText: TextInputEditText
    private lateinit var telefonoEditText: TextInputEditText
    private lateinit var fechaNacimientoEditText: TextInputEditText
    private lateinit var registrarseButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.crearcuenta)

        nombreEditText = findViewById(R.id.nombreEditText)
        contrasenaEditText = findViewById(R.id.contrasenaEditText)
        correoEditText = findViewById(R.id.correoEditText)
        telefonoEditText = findViewById(R.id.telefonoEditText)
        fechaNacimientoEditText = findViewById(R.id.fechaNacimientoEditText)
        registrarseButton = findViewById(R.id.registrarseButton)

        registrarseButton.setOnClickListener {
            val nombre = nombreEditText.text.toString().trim()
            val contrasena = contrasenaEditText.text.toString().trim()
            val correo = correoEditText.text.toString().trim()
            val telefono = telefonoEditText.text.toString().trim()
            val fechaNacimiento = fechaNacimientoEditText.text.toString().trim()

            if (nombre.isEmpty() || contrasena.isEmpty() || correo.isEmpty() || telefono.isEmpty() || fechaNacimiento.isEmpty()) {
                Toast.makeText(this, "Por favor completa todos los campos", Toast.LENGTH_SHORT).show()
            } else {
                // Aquí puedes guardar los datos en la base de datos o enviarlos a otra activity
                Toast.makeText(this, "Registro completado: $nombre", Toast.LENGTH_LONG).show()
            }
        }
    }
}
