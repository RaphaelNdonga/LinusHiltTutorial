package com.example.android.linushilttutorial.navigate

enum class Screens{
    LinusFragment, MuemaFragment
}

interface AppNavigator{
    fun navigateTo(screens: Screens)
}