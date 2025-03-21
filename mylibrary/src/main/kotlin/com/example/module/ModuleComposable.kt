package com.example.module

import androidx.compose.runtime.Composable
import androidx.compose.material.Text
import androidx.compose.ui.tooling.preview.PreviewLightDark

@Composable
fun ModuleComposable() {
    Text(
        text = "Hello, Module!"
    )
}

@PreviewLightDark
@Composable
internal fun ModuleComposablePreview() {
    ModuleComposable()
}