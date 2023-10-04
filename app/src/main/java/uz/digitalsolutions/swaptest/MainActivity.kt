package uz.digitalsolutions.swaptest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val someClass = SomeClass()
        greetUser(someClass.someText)
        Log.d("SWAP", "onCreate")

    }

    private fun greetUser(somText: String) {
        findViewById<TextView>(R.id.text).text = "$somText!"
    }
}