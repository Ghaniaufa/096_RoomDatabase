package com.example.roomsiswa.navigasi

import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.TopAppBarScrollBehavior
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

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SiswaTopAppBar(
    title:String,
    canNavigateBack: Boolean,
    modifier: Modifier = Modifier,
    scrollBehavior: TopAppBarScrollBehavior = null,
    navigateUp: () -> Unit = {}
){}

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