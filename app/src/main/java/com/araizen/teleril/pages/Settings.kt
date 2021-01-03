package com.araizen.teleril.pages

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Person
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.imageResource
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.navigate
import com.araizen.teleril.R

@Composable
fun SettingsPage(navController: NavController) {
    Scaffold(
        topBar = {
            TopAppBar(

                navigationIcon = {
                    IconButton(onClick = {

                        navController.navigate("home_screen")
                    }) {
                        Icon(Icons.Filled.ArrowBack)

                    }
                },
                title = {
                    Text(text = "Account ")
                },

                backgroundColor = colorResource(R.color.material_blue_grey_800),//Color.DarkGray,
                contentColor = Color.White,
                elevation = 12.dp
            )
        }, bodyContent = {
            Column(modifier = Modifier.padding(top = 25.dp)) {

                Row(modifier = Modifier.padding(start = 15.dp)) {
                    Image(
                        imageResource(id = R.drawable.emoji),
                        modifier = Modifier.width(25.dp).height(25.dp).padding(horizontal = 1.dp),
                        contentScale = ContentScale.Crop
                    )
                    Text(
                        "Feedback",
                        modifier = Modifier.padding(bottom = 2.dp, start = 10.dp),
                        fontSize = TextUnit.Em(2.4)
                    )
                }

                Row(modifier = Modifier.padding(top = 15.dp)) {}
                Row(modifier = Modifier.padding(start = 15.dp)) {
                    Image(
                        imageResource(id = R.drawable.share),
                        modifier = Modifier.width(25.dp).height(25.dp),
                        contentScale = ContentScale.Crop
                    )
                    Text(
                        "Tell a friend",
                        modifier = Modifier.padding(bottom = 2.dp, start = 10.dp),
                        fontSize = TextUnit.Em(2.4)
                    )
                }
            }
        })

}