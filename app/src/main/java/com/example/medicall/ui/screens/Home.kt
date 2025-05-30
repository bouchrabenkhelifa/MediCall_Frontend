package com.example.medicall.ui.screens

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.app.components.Navbar
import com.example.medicall.repository.RepositoryHolder
import com.example.medicall.ui.components.Header
import com.example.medicall.ui.components.DoctorsList
import com.example.medicall.viewmodel.DoctorModel

@Composable
fun Home() {
    var selectedItem by remember { mutableStateOf(0) }

    val doctorModel = remember { DoctorModel(RepositoryHolder.DoctorRepository) }

    Scaffold(
        bottomBar = {
            Navbar(selectedItem) { newIndex ->
                selectedItem = newIndex
            }
        }
    ) { innerPadding ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding)
        ) {
            Header(userName = "Bouchra")
            DoctorsList(doctorModel = doctorModel)
        }
    }
}

