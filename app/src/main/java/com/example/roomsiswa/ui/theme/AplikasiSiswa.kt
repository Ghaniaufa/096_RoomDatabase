package com.example.roomsiswa.ui.theme

import android.app.Application
import com.example.roomsiswa.repositori.ContainerApp
import com.example.roomsiswa.repositori.ContainerDataApp

class AplikasiSiswa : Application() {
    /**
    *AppContainer instance digunakan oleh kelas-kelas lainnya untuk mendapatkan
     * depedensi
     */

    lateinit var container: ContainerApp

    override fun onCreate() {
        super.onCreate()
        container = ContainerDataApp(this)
    }
}