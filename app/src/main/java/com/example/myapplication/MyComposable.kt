package com.example.myapplication

import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.material.Text
import com.example.mylibrary.ModuleTheme

@Composable
fun MyComposable() {
    Text(
        text = "Hello, World!"
    )
}

class MyComposableTest {

    @Composable
    fun ModuleThemePreview() {
        ModuleTheme {
            MyComposable()
        }
    }

    @Composable
    fun AppThemePreview() {
        AppTheme {
            MyComposable()
        }
    }

    @Composable
    fun MaterialThemePreview() {
        MaterialTheme {
            MyComposable()
        }
    }

}
