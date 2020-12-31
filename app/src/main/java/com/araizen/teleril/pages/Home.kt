package com.araizen.teleril.pages

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
//import androidx.compose.material.R
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.navigate
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Person
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.imageResource
import androidx.ui.tooling.preview.Preview
import com.araizen.teleril.R
import com.araizen.teleril.ui.primaryColor


@Composable
fun HomePage(navController: NavController) {



   MaterialTheme() {
       Scaffold(
           topBar = {
               TopAppBar(

                   title = {
                       Text(text = "Teleril")
                   },
                    actions = {
                        IconButton(onClick = {

                            navController.navigate("settings_screen")
                        }) {
                            Icon(Icons.Filled.Person)

                        }
                    },

                   backgroundColor = colorResource(R.color.material_blue_grey_800),//Color.DarkGray,
                    contentColor = Color.White,
                    elevation = 12.dp
               )
           }, bodyContent = {

               Column {
                   Text("Share", fontSize = 20.dp, modifier = Modifier.padding(10.dp))

                   Row(modifier = Modifier.padding(vertical = 10.dp)) {
                       Image(
                           imageResource(id = R.drawable.doc_send_rcv),
                           modifier = Modifier.width(50.dp).height(50.dp).padding(horizontal = 1.dp),
                           contentScale = ContentScale.Crop
                       )
                       Text("Recent Transfers", modifier = Modifier.padding(10.dp))
                   }
               }
           })
   }

}
