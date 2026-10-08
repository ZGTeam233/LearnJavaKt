package com.github.zgteam233.materialdesign

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.github.zgteam233.materialdesign.databinding.ActivityFruitBinding

class FruitActivity : AppCompatActivity() {

    lateinit var binding: ActivityFruitBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFruitBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}