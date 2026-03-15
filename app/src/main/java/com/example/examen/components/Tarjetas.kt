package com.example.examen.components

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.examen.models.TarjetaR

@Composable
fun SeccionTarjeta(tarjetas: List<TarjetaR>) {
    LazyRow(
        contentPadding = PaddingValues(horizontal = 16.dp),
        horizontalArrangement = Arrangement.spacedBy(12.dp)
    ) {
        items(tarjetas) { tarjeta ->
            Card(
                colors = CardDefaults.cardColors(containerColor = tarjeta.colorFondo),
                shape = RoundedCornerShape(24.dp),
                modifier = Modifier.size(width = 160.dp, height = 110.dp)
            ) {
                Column(modifier = Modifier.padding(16.dp).fillMaxSize(), verticalArrangement = Arrangement.Center) {
                    Text(text = tarjeta.titulo, fontSize = 14.sp, color = androidx.compose.ui.graphics.Color.DarkGray)
                    Text(text = tarjeta.monto, fontSize = 22.sp, fontWeight = FontWeight.Bold)
                }
            }
        }
    }
}