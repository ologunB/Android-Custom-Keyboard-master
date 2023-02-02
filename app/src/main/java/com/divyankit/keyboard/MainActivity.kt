package com.divyankit.keyboard

import android.app.Activity
import android.content.Intent
import android.os.Build
import android.os.Bundle
import android.support.annotation.RequiresApi
import android.widget.Toast

class MainActivity : Activity() {
    @RequiresApi(Build.VERSION_CODES.M)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val text = intent.getCharSequenceExtra(Intent.EXTRA_PROCESS_TEXT)
        val readonly = intent.getBooleanExtra(Intent.EXTRA_PROCESS_TEXT_READONLY, false)

        if(!readonly && text != null){
            val outgoingIntent = Intent()
            outgoingIntent.putExtra(Intent.EXTRA_PROCESS_TEXT, text.toString())
            setResult(RESULT_OK, outgoingIntent)
        } else {
            Toast.makeText(this, "Text cannot be modified", Toast.LENGTH_SHORT).show()
        }

        finish()
    }
}