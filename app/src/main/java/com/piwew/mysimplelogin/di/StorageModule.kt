package com.piwew.mysimplelogin.di

import android.content.Context
import com.piwew.mysimplelogin.SessionManager
import dagger.Module
import dagger.Provides

@Module
class StorageModule {
    @Provides
    fun provideSessionManager(context: Context): SessionManager = SessionManager(context)
}