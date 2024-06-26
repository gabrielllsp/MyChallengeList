package com.gabriel.mychallengelist.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp


@Composable
fun ContactInformation(
    modifier: Modifier = Modifier,
    name: String,
    telephone: String,
    horizontal: Alignment.Horizontal,
    vertical: Arrangement.Vertical
) {
    Column(
        modifier = modifier.fillMaxSize(),
        verticalArrangement = vertical,
        horizontalAlignment = horizontal
    ) {
        Text(
            text = name,
            style = MaterialTheme.typography.titleMedium,
        )

        Text(
            text =  telephone,
            style = MaterialTheme.typography.bodyMedium,
            color = Color.Gray
        )
    }
}

