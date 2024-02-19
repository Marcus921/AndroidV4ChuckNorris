package com.marcusmalmgren.androidv4chucknorris

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun ChuckStart(
    chuckVM : ChuckViewModel,
    goSearch : () -> Unit,
    goCategories : () -> Unit
) {
    Column {
        Text(text = "Start", modifier = Modifier.background(Color.White))

        Button(onClick = {
            goSearch()
        }) {
            Text(text = "Search")
        }
        Button(onClick = {
            goCategories()
        }) {
            Text(text = "Categories")
        }
    }
}

@Preview
@Composable
fun ChuckStartPreview() {
    ChuckStart(ChuckViewModel(), {}, {})
}