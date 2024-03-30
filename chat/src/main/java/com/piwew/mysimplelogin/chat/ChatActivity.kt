package com.piwew.mysimplelogin.chat

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.piwew.core.SessionManager
import com.piwew.core.UserRepository
import com.piwew.mysimplelogin.chat.databinding.ActivityChatBinding

class ChatActivity : AppCompatActivity() {

    private lateinit var binding: ActivityChatBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityChatBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val session = SessionManager(this)
        val userRepository = UserRepository.getInstance(session)
        binding.tvChat.text = getString(R.string.welcome, userRepository.getUser())
    }
}