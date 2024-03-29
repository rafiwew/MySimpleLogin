package com.piwew.mysimplelogin

import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class UserRepository @Inject constructor (private val session: SessionManager) {

    fun loginUser(username: String) {
        session.createLoginSession()
        session.saveToPreference(SessionManager.KEY_USERNAME, username)
    }

    fun getUser() = session.getFromPreference(SessionManager.KEY_USERNAME)

    fun isUserLogin() = session.isLogin

    fun logoutUser() = session.logout()
}