package com.gabriel.mychallengelist.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.gabriel.mychallengelist.R
import com.gabriel.mychallengelist.data.Person

@Composable
fun ItemContactColumn(
    modifier: Modifier = Modifier,
    person: Person
) {
    Card(
        modifier = modifier
            .fillMaxWidth()
            .padding(start = 16.dp, end = 16.dp, bottom = 8.dp)
            .height(80.dp),
        elevation = CardDefaults.cardElevation(defaultElevation = 2.dp),
        shape = RoundedCornerShape(24.dp),
        colors = CardDefaults.cardColors(MaterialTheme.colorScheme.primaryContainer)
    ) {
        Row(
            modifier = modifier
                .fillMaxSize()
                .padding(start = 16.dp),
            horizontalArrangement = Arrangement.Start,
            verticalAlignment = Alignment.CenterVertically
        ) {
            ContactIcon(contactIcon = person.image)
            Spacer(modifier = modifier.width(8.dp))
            ContactInformation(
                name = person.name,
                telephone = person.telephone,
                horizontal = Alignment.Start,
                vertical = Arrangement.Center
            )

        }
    }
}

@Preview
@Composable
private fun ItemContactColumnPreview() {
    ItemContactColumn(
        modifier = Modifier,
        Person(
            image = R.drawable.rita_alves,
            name = "Rita Alves",
            telephone = "12345678"
        )
    )
}