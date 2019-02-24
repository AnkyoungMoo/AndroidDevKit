package km.company.com.androiddevkit.kotlin.base

import android.app.Activity
import android.content.Context
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.widget.Toast

open class BaseActivity : AppCompatActivity() {

    fun Context.toast(message: String) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
    }

    inline fun <reified T : Activity>
            Context.startActivity() {
        val intent = Intent(this, T::class.java)
        startActivity(intent)
    }
}