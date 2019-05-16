package km.company.com.androiddevkit

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import km.company.com.androiddevkit.java.HomeActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_main_go_java.setOnClickListener {
            startActivity(Intent(this, HomeActivity::class.java))
        }

        btn_main_go_kotlin.setOnClickListener {
            startActivity(Intent(this, km.company.com.androiddevkit.kotlin.recyclerview.RecyclerViewActivity::class.java))
        }
    }
}
