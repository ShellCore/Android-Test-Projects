package com.shell.android.testapplicationproject

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.app.ActionBarDrawerToggle
import android.support.v7.widget.Toolbar
import com.shell.android.baselibrary.basewidgets.BaseToolbarImpl
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : BaseToolbarImpl() {

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        loadToolbar(mainToolbar as Toolbar)
        setNavigationDrawer()
    }

    private fun setNavigationDrawer() {
        val toogle = ActionBarDrawerToggle(this, mainContainer, R.string.nav_drawer_open, R.string.nav_drawer_close)
        toogle.isDrawerIndicatorEnabled = true
        mainContainer.addDrawerListener(toogle)
        toogle.syncState()


    }
}
