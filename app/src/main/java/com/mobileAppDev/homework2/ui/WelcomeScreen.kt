package com.mobileAppDev.homework2.ui

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.foundation.layout.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.sp
import androidx.compose.ui.Alignment
import androidx.compose.material.Button
import androidx.compose.material.Text

@Composable
fun WelcomeScreen(onNavigate: () -> Unit) {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "Welcome to the City Explorer App", fontSize = 20.sp)
        Box(
            contentAlignment = Alignment.Center
        ) {
            Button(onClick = { onNavigate() }) {
                Text(text = "Explore Cities")
            }
        }
    }
}