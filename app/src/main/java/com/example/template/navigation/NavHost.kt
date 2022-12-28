package com.example.template.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.template.instructions.InstructionsScreen

@Composable
fun ApplicationNavHost(controller: NavHostController = rememberNavController()) {
    NavHost(navController = controller, startDestination = Destination.Instructions.route) {
        composable(Destination.Instructions.route, Destination.Instructions.arguments) {
            InstructionsScreen()
        }
    }
}