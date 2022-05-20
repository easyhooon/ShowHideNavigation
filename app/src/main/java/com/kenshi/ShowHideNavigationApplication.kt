package com.kenshi

import android.app.Application
import com.kenshi.showhidenavigation.BuildConfig
import timber.log.Timber

class ShowHideNavigationApplication : Application() {
    override fun onCreate() {
        if(BuildConfig.DEBUG) {
            Timber.plant(Timber.DebugTree())
        }
        super.onCreate()
    }
}