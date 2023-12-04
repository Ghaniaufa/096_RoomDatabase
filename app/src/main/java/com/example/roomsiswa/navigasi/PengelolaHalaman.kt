package com.example.roomsiswa.navigasi

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import com.example.roomsiswa.ui.theme.DestinasiEntry
import com.example.roomsiswa.ui.theme.DestinasiHome
import com.example.roomsiswa.ui.theme.EntrySiswaScreen
import com.example.roomsiswa.ui.theme.HomeScreen

@Composable
fun SiswaApp(navController: NavHostController = rememeberNavController()){
    HostNavigasi(navController = navController)
}

@Composable
fun HostNavigasi(
    navController: NavHostController,
    modifier : Modifer = Modifier
){
    navHost(navController=navController, startDestination = DestinasiHome.route, modifier = Modifier)
    {
        composable(DestinasiHome.route){
            HomeScreen(navigateToItemEntry = {navController.navigate(DestinasiEntry.route)},
            )
        }
        composable(DestinasiEntry.route){
            EntrySiswaScreen(navigateBack = {navController.popBackStack()})
        }
    }
}