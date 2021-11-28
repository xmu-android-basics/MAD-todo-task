package io.github.xmu_android_basics.example.tasklist

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.snackbar.Snackbar
import io.github.xmu_android_basics.example.tasklist.databinding.ActivityKotlinBinding

class KotlinActivity : AppCompatActivity() {

    private lateinit var binding: ActivityKotlinBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityKotlinBinding.inflate(layoutInflater)

        setContentView(binding.root)

        val heightStr = binding.inputHeight.text.toString()
        val weightStr = binding.inputWeight.text.toString()


        binding.btnCompute.setOnClickListener { view ->
            Snackbar.make(view, "", Snackbar.LENGTH_LONG)
                .show()
        }
    }
}