package com.example.examen.components

import androidx.compose.foundation.layout.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.examen.models.Usuario

@Composable
fun SeccionSaludo(usuario: Usuario) {
    Row(
        modifier = Modifier.fillMaxWidth().padding(16.dp),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Column {
            Text(text = "Hola ${usuario.nombre}", fontSize = 24.sp, fontWeight = FontWeight.Bold)
            Text(text = "Bienvenido de nuevo", color = androidx.compose.ui.graphics.Color.Gray, fontSize = 14.sp)
        }
        Icon(imageVector = Icons.Default.Menu, contentDescription = null)
    }
}