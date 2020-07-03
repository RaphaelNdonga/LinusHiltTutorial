package com.example.android.linushilttutorial.di

import com.example.android.linushilttutorial.navigate.AppNavigator
import com.example.android.linushilttutorial.navigate.AppNavigatorImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent

@InstallIn(ActivityComponent::class)
@Module
abstract class NavigationModule {
    @Binds
    abstract fun bindNavigator(impl:AppNavigatorImpl):AppNavigator
}