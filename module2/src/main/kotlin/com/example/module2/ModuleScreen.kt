package com.example.module2

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.PreviewLightDark

@Composable
fun ModuleScreen() {
    ModuleComposable()
}

@PreviewLightDark
@Composable
internal fun ModuleScreenPreview() {
    ModuleScreen()
}