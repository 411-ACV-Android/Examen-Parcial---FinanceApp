package com.example.examen.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.examen.models.Usuario

@Composable
fun SeccionSaludo(usuario: Usuario) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {

        Row(verticalAlignment = Alignment.CenterVertically) {

            Box(
                modifier = Modifier
                    .size(54.dp)
                    .clip(CircleShape)
                    .background(Color(0xFFF1E4D9)),
                contentAlignment = Alignment.Center
            ) {
                Icon(
                    imageVector = Icons.Default.AccountCircle,
                    contentDescription = "Perfil del usuario",
                    modifier = Modifier.size(46.dp),
                    tint = Color.Black
                )
            }

            Spacer(modifier = Modifier.width(12.dp))

            Column {
                Text(text = "Hola ${usuario.nombre}", fontSize = 24.sp, fontWeight = FontWeight.Bold)
                Text(text = "Bienvenido", color = Color.Gray, fontSize = 14.sp)
            }
        }

        Icon(
            imageVector = Icons.Default.Menu,
            contentDescription = "Menú",
            modifier = Modifier.size(28.dp)
        )
    }
}