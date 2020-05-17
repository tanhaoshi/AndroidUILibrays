package com.independent.androiduilibrays

import android.graphics.Bitmap
import android.graphics.drawable.Drawable
import android.os.Bundle
import android.os.Handler
import android.util.Log
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.snackbar.Snackbar
import androidx.core.view.GravityCompat
import androidx.appcompat.app.ActionBarDrawerToggle
import android.view.MenuItem
import androidx.drawerlayout.widget.DrawerLayout
import com.google.android.material.navigation.NavigationView
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import android.view.Menu
import android.view.View
import android.view.ViewGroup
import android.widget.CompoundButton
import android.widget.ImageView
import androidx.appcompat.widget.SwitchCompat
import com.bumptech.glide.Glide
import com.bumptech.glide.load.resource.bitmap.CircleCrop
import com.bumptech.glide.request.RequestOptions
import com.independent.androiduilibrays.circleimageview.CircleDrawable
import com.independent.androiduilibrays.glidehelper.GlideRoundTransform


class MainActivity : AppCompatActivity(), NavigationView.OnNavigationItemSelectedListener, View.OnClickListener {


    private lateinit var drawerLayout: DrawerLayout

    override fun onClick(v: View?) {
        when(v?.id){
            R.id.base_iv_back ->  drawerLayout.openDrawer(GravityCompat.START)
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        drawerLayout = findViewById(R.id.drawer_layout)

        findViewById<ImageView>(R.id.base_iv_back).setOnClickListener(this)

        findViewById<SwitchCompat>(R.id.sc_settin_testxinlv).setOnCheckedChangeListener(
            CompoundButton.OnCheckedChangeListener(){ compoundButton: CompoundButton, b: Boolean ->
                if(b){

                }else{

                }

            })

//        val toolbar: Toolbar = findViewById(R.id.toolbar)
//
//        toolbar.title = ""

//        val drawable : Drawable

//        Thread(Runnable {
//            val drawable : Bitmap? = Glide.with(this).asBitmap()
//                .load(R.mipmap.ic_launcher).submit().get()
//            runOnUiThread(Runnable {
//            val cricleDrawable : CircleDrawable = CircleDrawable(drawable)
//                toolbar.navigationIcon = cricleDrawable
//            })
//        }).start()

//        drawable = Glide.with(this)
//                        .load(R.mipmap.ic_launcher)
//            .transform(GlideRoundTransform(15)).submit().get()
//
//        toolbar.navigationIcon = drawable

//        setSupportActionBar(toolbar)

        val fab: FloatingActionButton = findViewById(R.id.fab)
        fab.setOnClickListener { view ->
            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                .setAction("Action", null).show()
        }

//        val drawerLayout: DrawerLayout = findViewById(R.id.drawer_layout)
//
//        drawerLayout.openDrawer(GravityCompat.START)

        val navView: NavigationView = findViewById(R.id.nav_view)
        val params = navView.layoutParams
        params.width = resources.displayMetrics.widthPixels * 3 / 4
        navView.layoutParams = params

//        val toggle = ActionBarDrawerToggle(
//            this, drawerLayout, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close
//        )
//
//        drawerLayout.addDrawerListener(toggle)

//        supportActionBar?.setDisplayHomeAsUpEnabled(true)

//        toggle.syncState()

        navView.setNavigationItemSelectedListener(this)
    }

    override fun onBackPressed() {
        val drawerLayout: DrawerLayout = findViewById(R.id.drawer_layout)
        if (drawerLayout.isDrawerOpen(GravityCompat.START)) {
            drawerLayout.closeDrawer(GravityCompat.START)
        } else {
            super.onBackPressed()
        }
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        return when (item.itemId) {
            R.id.action_settings -> true
            else -> super.onOptionsItemSelected(item)
        }
    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        // Handle navigation view item clicks here.
        when (item.itemId) {
            R.id.nav_home -> {
                // Handle the camera action
            }
            R.id.nav_gallery -> {

            }
            R.id.nav_slideshow -> {

            }
            R.id.nav_tools -> {

            }
            R.id.nav_share -> {

            }
            R.id.nav_send -> {

            }
        }
        val drawerLayout: DrawerLayout = findViewById(R.id.drawer_layout)
        drawerLayout.closeDrawer(GravityCompat.START)
        return true
    }
}


