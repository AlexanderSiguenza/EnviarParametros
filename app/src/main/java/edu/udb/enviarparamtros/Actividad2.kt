package edu.udb.enviarparamtros

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class Actividad2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_actividad2)

        val bundle = intent.extras
        val dato = bundle?.getString("direccion")

        val tv1=findViewById<TextView>(R.id.tv1)

        val webView1=findViewById<WebView>(R.id.webView1)
        val boton1=findViewById<Button>(R.id.button)

        tv1.text = bundle?.getString("direccion")


        webView1.loadUrl("https://${dato}")
        boton1.setOnClickListener {
            finish();
        }
    }
}