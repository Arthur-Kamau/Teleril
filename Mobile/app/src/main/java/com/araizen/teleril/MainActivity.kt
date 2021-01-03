package com.araizen.teleril

import android.os.Bundle
import android.view.WindowManager
import androidx.appcompat.app.AppCompatActivity
//import androidx.compose.foundation.Text
import androidx.compose.material.MaterialTheme
//import androidx.compose.material.Scaffold
//import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.ui.platform.setContent
import androidx.compose.ui.res.imageResource
import androidx.compose.ui.unit.dp
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.ui.tooling.preview.Preview
import com.araizen.teleril.pages.HomePage
import com.araizen.teleril.pages.ProfilePage
import com.araizen.teleril.pages.SettingsPage
import com.araizen.teleril.ui.TelerilTheme
import com.araizen.teleril.ui.primaryColor

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            ComposeNavigation()
        }
    }

    @Preview(showBackground = true)
    @Composable
    fun DefaultPreview() {
        TelerilTheme {
            ComposeNavigation()
        }
    }


    @Composable
    fun ComposeNavigation() {
//
        val navController = rememberNavController()
        NavHost(
            navController = navController,
            startDestination = "home_screen"
        ) {
            composable("home_screen") {
                HomePage(navController = navController)

            }
            composable("settings_screen") {
                SettingsPage(navController = navController)
            }
            composable("profile_screen") {
                ProfilePage(navController = navController)
            }
        }
    }
}

