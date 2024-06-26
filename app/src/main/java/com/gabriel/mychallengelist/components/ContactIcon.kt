package com.gabriel.mychallengelist.components

import androidx.annotation.DrawableRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.gabriel.mychallengelist.R

@Composable
fun ContactIcon(
    modifier: Modifier = Modifier,
    @DrawableRes contactIcon: Int
) {
    Image(
        modifier = modifier
            .size(50.dp)
            .clip(RoundedCornerShape(24.dp)),
        contentScale = ContentScale.Crop,
        painter = painterResource(id = contactIcon),
        contentDescription = "Contact Icon"
    )
}

@Preview
@Composable
private fun ContactIconPreview() {
    ContactIcon(contactIcon = R.drawable.rita_alves)
}