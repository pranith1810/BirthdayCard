package com.example.birthdaycard

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.birthdaycard.databinding.MainActivityBinding

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        var binding: MainActivityBinding = DataBindingUtil.setContentView(this, R.layout.main_activity)

    }
}
