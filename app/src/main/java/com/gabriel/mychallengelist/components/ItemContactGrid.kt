package com.gabriel.mychallengelist.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.gabriel.mychallengelist.R
import com.gabriel.mychallengelist.data.Person

@Composable
fun ItemContactGrid(
    modifier: Modifier = Modifier,
    person: Person
) {
    Card(
        modifier = modifier
            .width(160.dp)
            .padding(8.dp)
            .height(200.dp),
        shape = RoundedCornerShape(24.dp),
        colors = CardDefaults.cardColors(MaterialTheme.colorScheme.primaryContainer)
    ) {
        Column(
            modifier = modifier
                .fillMaxSize()
                .padding(16.dp),
            verticalArrangement = Arrangement.Top,
            horizontalAlignment = Alignment.CenterHorizontally

        ) {
            ContactIcon(contactIcon = person.image, modifier = modifier.size(80.dp).clip(
                RoundedCornerShape(34.dp)
            ),
                )
            Spacer(modifier = modifier.height(4.dp))

            ContactInformation(name = person.name, telephone = person.telephone, vertical = Arrangement.Top, horizontal = Alignment.CenterHorizontally)
        }
    }
}

@Preview
@Composable
private fun ItemContactGridPreview() {
    ItemContactGrid(
        modifier = Modifier,
        Person(
            image = R.drawable.rita_alves,
            name = "John Harrison",
            telephone = "12345678"
        )
    )
}