package com.piwew.mysimplelogin

import org.koin.dsl.module

val storageModule = module {
    factory {
        SessionManager(get())
    }

    factory {
        UserRepository(get())
    }
}