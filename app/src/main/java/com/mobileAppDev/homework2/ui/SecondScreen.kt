package com.mobileAppDev.homework2.ui

import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.painterResource
import androidx.compose.material.Text
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Divider
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.mobileAppDev.homework2.R

@Composable
fun SecondScreen(cityName: String, onBack: () -> Unit) {
    val cities = listOf("Yerevan", "Washington", "Madrid", "New York", "Los Angeles")

    CityList(cities = cities) ;
}

@Composable
fun CityListItem(city: String) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp)
    ) {
        Text(text = city, fontSize = 20.sp)
        Divider()
    }
}

@Composable
fun CityList(cities: List<String>) {
    LazyColumn {
        items(cities) { city ->
            CityListItem(city = city)
        }
    }
}