package com.example.mailtitleinterface

import android.os.Bundle
import androidx.activity.ComponentActivity
import com.example.mailtitleinterface.adapter.Adapter
import com.example.mailtitleinterface.data.MailList
import com.example.mailtitleinterface.databinding.ActivityMainBinding

class MainActivity : ComponentActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val dataset = MailList().loadMails()
        binding.recyclerView.adapter = Adapter(this, dataset)
        binding.recyclerView.setHasFixedSize(true)
    }
}