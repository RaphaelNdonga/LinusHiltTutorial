package com.example.android.linushilttutorial.navigate

import androidx.fragment.app.FragmentActivity
import com.example.android.linushilttutorial.R
import com.example.android.linushilttutorial.ui.LinusFragment
import com.example.android.linushilttutorial.ui.MuemaFragment
import javax.inject.Inject

class AppNavigatorImpl @Inject constructor(private val activity: FragmentActivity) : AppNavigator {
    override fun navigateTo(screens: Screens) {
        val fragment = when (screens) {
            Screens.LinusFragment -> LinusFragment()
            Screens.MuemaFragment -> MuemaFragment()
        }
        activity.supportFragmentManager.beginTransaction().replace(R.id.main_container, fragment)
            .addToBackStack(fragment::class.java.canonicalName).commit()
    }
}