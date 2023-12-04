package com.example.roomsiswa.navigasi

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController

@Composable
fun SiswaApp(navController: NavHostController = rememeberNavController()){
    HostNavigasi(navController = navController)
}