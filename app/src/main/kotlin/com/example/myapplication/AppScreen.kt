package com.example.myapplication

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.PreviewLightDark

@Composable
fun AppScreen() {
    AppComposable()
}

@PreviewLightDark
@Composable
internal fun AppScreenPreview() {
    AppScreen()
}