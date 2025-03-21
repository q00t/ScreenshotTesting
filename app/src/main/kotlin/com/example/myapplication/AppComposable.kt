package com.example.myapplication

import androidx.compose.runtime.Composable
import androidx.compose.material.Text
import androidx.compose.ui.tooling.preview.PreviewLightDark

@Composable
fun AppComposable() {
    Text(
        text = "Hello, World!"
    )
}

@PreviewLightDark
@Composable
internal fun AppComposablePreview() {
    AppComposable()
}