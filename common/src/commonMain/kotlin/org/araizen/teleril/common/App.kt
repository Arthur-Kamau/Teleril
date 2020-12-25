package org.araizen.teleril.common
import androidx.compose.foundation.layout.Column
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.runtime.*
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp




@Composable
fun App() {

    val drawerState = rememberDrawerState(DrawerValue.Closed)

    MaterialTheme {
        ModalDrawerLayout(
            drawerState = drawerState,
            gesturesEnabled = true,
            drawerContent = {
                Column {
                    Text("Text in Drawer")
                    Button(onClick = { drawerState.close() }) {
                        Text("Close Drawer")
                    }
                }
            },
            bodyContent = {
                Scaffold(
                    topBar = {
                        TopAppBar(
                            title = {
                                Text(text = "Teleril")
                            },
                            actions = {
                                IconButton(onClick = {

                                    drawerState.open()
                                }) {
                                    Icon(Icons.Filled.Menu)

                                }
                            },

                            backgroundColor = Color.Gray,
                            contentColor = Color.White,
                            elevation = 12.dp
                        )
                    }, bodyContent = {
                        //bodyContent()
                    })
            }
        )
    }
}
