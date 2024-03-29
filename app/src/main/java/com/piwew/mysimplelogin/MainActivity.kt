package com.piwew.mysimplelogin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.piwew.mysimplelogin.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var userRepository: UserRepository

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val session = SessionManager(this)
        userRepository = UserRepository.getInstance(session)

        if (userRepository.isUserLogin()) {
            moveToHomeActivity()
        }

        binding.btnLogin.setOnClickListener { saveSession() }
    }

    private fun saveSession() {
        userRepository.loginUser(binding.edUsername.text.toString())
        moveToHomeActivity()
    }

    private fun moveToHomeActivity() {
        startActivity(Intent(this, HomeActivity::class.java))
        finish()
    }
}