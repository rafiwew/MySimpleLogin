package com.piwew.mysimplelogin

import android.app.Application
import com.piwew.mysimplelogin.di.AppComponent
import com.piwew.mysimplelogin.di.DaggerAppComponent

open class MyApplication : Application() {
    val appComponent: AppComponent by lazy {
        DaggerAppComponent.factory().create(applicationContext)
    }
}