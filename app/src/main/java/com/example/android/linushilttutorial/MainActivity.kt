package com.example.android.linushilttutorial

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.android.linushilttutorial.navigate.AppNavigator
import com.example.android.linushilttutorial.navigate.Screens
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    @Inject lateinit var navigator: AppNavigator

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        if (savedInstanceState == null) {
            navigator.navigateTo(Screens.LinusFragment)
        }
    }

    override fun onBackPressed() {
        super.onBackPressed()
        if (supportFragmentManager.backStackEntryCount == 0) {
            finish()
        }
    }
}