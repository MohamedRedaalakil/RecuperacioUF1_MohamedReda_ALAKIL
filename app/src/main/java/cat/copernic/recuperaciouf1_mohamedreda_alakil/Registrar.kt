package cat.copernic.recuperaciouf1_mohamedreda_alakil

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Registrar : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registrar)
        registrat()
    }

    private fun registrat() {
       val button = findViewById<Button>(R.id.button)
        button.setOnClickListener {
            val intento1 = Intent(this, Login::class.java)
            startActivity(intento1)
        }
    }
}