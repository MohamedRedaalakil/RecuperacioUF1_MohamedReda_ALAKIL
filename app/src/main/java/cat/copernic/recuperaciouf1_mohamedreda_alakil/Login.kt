package cat.copernic.recuperaciouf1_mohamedreda_alakil

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView


class Login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)


        registra()
        inici()

        }
    private  fun registra(){
        val registerText = findViewById<TextView>(R.id.registerText)
        registerText.setOnClickListener {
                    val intento1 = Intent(this, Registrar::class.java)
                    startActivity(intento1)
                }
    }
    private fun inici(){
        val button3 = findViewById<Button>(R.id.button3)
        button3.setOnClickListener {
            val intento1 = Intent(this, MainActivity::class.java)
            startActivity(intento1)
        }
    }

    }

