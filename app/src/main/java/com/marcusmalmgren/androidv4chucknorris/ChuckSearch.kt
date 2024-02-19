package com.marcusmalmgren.androidv4chucknorris

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun ChuckSearch(chuckVM : ChuckViewModel,) {
    Column {
        Text(text = "Search", modifier = Modifier.background(Color.White))
    }
}

@Preview
@Composable
fun ChuckSearchPreview() {
    ChuckSearch(ChuckViewModel())
}