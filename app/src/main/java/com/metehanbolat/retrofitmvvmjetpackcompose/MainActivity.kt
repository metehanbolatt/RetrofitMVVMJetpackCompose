package com.metehanbolat.retrofitmvvmjetpackcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.metehanbolat.retrofitmvvmjetpackcompose.ui.theme.RetrofitMVVMJetpackComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            RetrofitMVVMJetpackComposeTheme {

            }
        }
    }
}
