package km.company.com.androiddevkit.kotlin

import android.os.Bundle
import km.company.com.androiddevkit.R
import km.company.com.androiddevkit.kotlin.base.BaseActivity
import km.company.com.androiddevkit.kotlin.utils.log

class HomeActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        log("kotlin")

        toast("kotlin toast")
    }
}
