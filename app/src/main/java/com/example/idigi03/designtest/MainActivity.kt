package com.example.idigi03.designtest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.google.android.material.bottomsheet.BottomSheetBehavior
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        bottom_appbar.replaceMenu(R.menu.menu_bottomappbar)
        var view=findViewById<View>(R.id.bottomsheet)
        var behavior=BottomSheetBehavior.from(view)

        fab.setOnClickListener {
            behavior.state=BottomSheetBehavior.STATE_EXPANDED
        }
    }
}
