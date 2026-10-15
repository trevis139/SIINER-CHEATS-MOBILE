package com.siiner.clean

import android.app.Activity
import android.os.Bundle
import android.widget.TextView

class MainActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val texto = TextView(this)
        texto.text = "SIINER CHEATS MOBILE"
        texto.textSize = 24f

        setContentView(texto)
    }
}
