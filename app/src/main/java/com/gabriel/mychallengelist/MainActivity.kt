package com.gabriel.mychallengelist

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.GridView
import androidx.compose.material.icons.filled.ViewAgenda
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.gabriel.mychallengelist.components.ItemContactColumn
import com.gabriel.mychallengelist.components.ItemContactGrid
import com.gabriel.mychallengelist.data.contacts
import com.gabriel.mychallengelist.ui.theme.MyChallengeListTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MyChallengeListTheme {
                MyApp()
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MyApp(
    modifier: Modifier = Modifier
) {
    var isGrid by remember { mutableStateOf(false) }


    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Text(
                        text = "Lista de Contatos",
                        style = MaterialTheme.typography.headlineMedium,
                        modifier = modifier.padding(8.dp)
                    )
                },
                actions = {
                    IconButton(onClick = { isGrid = !isGrid }) {
                        val icon: ImageVector = if (isGrid) {
                            Icons.Default.ViewAgenda
                        } else {
                            Icons.Default.GridView
                        }
                        Icon(imageVector = icon, contentDescription = "Icone de mudança do layout")
                    }
                }
            )
        }
    ) { innerPadding ->
        Box(modifier = modifier.padding(innerPadding)) {
            if (isGrid) {
                MyLazyGrid()

            } else {
                MyLazyColumn()

            }
        }
    }
}

@Composable
fun MyLazyColumn() {
    LazyColumn {
        items(contacts) { contact ->
            ItemContactColumn(person = contact)
        }
    }
}

@Composable
fun MyLazyGrid() {
    LazyVerticalGrid(columns = GridCells.Fixed(2)) {
        items(contacts) { contact ->
            ItemContactGrid(person = contact)
        }
    }
}


@Preview(showBackground = true)
@Composable
private fun MyAppPreview() {
    MyChallengeListTheme {
        MyApp()
    }
}