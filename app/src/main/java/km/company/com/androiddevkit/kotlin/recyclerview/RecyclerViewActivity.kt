package km.company.com.androiddevkit.kotlin.recyclerview

import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import km.company.com.androiddevkit.R
import km.company.com.androiddevkit.java.base.BaseActivity
import kotlinx.android.synthetic.main.activity_recyclerview.*

class RecyclerViewActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_recyclerview)

        var modelList = arrayListOf(
                RecyclerViewModel("anchovy", "KM"),
                RecyclerViewModel("anchovy", "god"),
                RecyclerViewModel("anchovy", "mogi"),
                RecyclerViewModel("anchovy", "slave")
        )

        val recyclerViewAdapter = RecyclerViewAdapter(this, modelList)
        recyclerview.adapter = recyclerViewAdapter

        // scroll type: horizontal or vertical
        val layoutManager = LinearLayoutManager(this)
        recyclerview.layoutManager = layoutManager

        // recyclerview.setHasFixedSize(true)
    }
}