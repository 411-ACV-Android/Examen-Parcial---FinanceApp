package com.example.examen.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.examen.models.Transaccion
import com.example.examen.ui.theme.Positivo
import com.example.examen.ui.theme.Negativo

@Composable
fun SeccionMovimientos(movimientos: List<Transaccion>) {
    Column(modifier = Modifier.padding(top = 16.dp)) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(text = "Transacciones", fontSize = 18.sp, fontWeight = FontWeight.Bold)
            Text(text = "Ver todo", color = Color.Gray, fontSize = 14.sp)
        }

        Spacer(modifier = Modifier.height(12.dp))

        LazyColumn(modifier = Modifier.fillMaxSize().padding(horizontal = 16.dp)) {
            items(movimientos) { mov ->
                Row(
                    modifier = Modifier.fillMaxWidth().padding(vertical = 10.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Box(
                        modifier = Modifier
                            .size(50.dp)
                            .clip(CircleShape)
                            .background(Color.LightGray.copy(alpha = 0.3f)),
                        contentAlignment = Alignment.Center
                    ) {

                        Icon(
                            imageVector = mov.icono,
                            contentDescription = mov.categoria,
                            tint = Color.DarkGray, // Color del ícono
                            modifier = Modifier.size(26.dp)
                        )
                    }

                    Spacer(modifier = Modifier.width(16.dp))

                    Column(modifier = Modifier.weight(1f)) {
                        Text(text = mov.negocio, fontWeight = FontWeight.Bold)
                        Text(text = mov.categoria, color = Color.Gray, fontSize = 12.sp)
                    }

                    Column(horizontalAlignment = Alignment.End) {
                        val colorMonto = if (mov.cantidad < 0) Negativo else Positivo
                        val signo = if (mov.cantidad > 0) "+" else ""

                        Text(text = "$signo$${mov.cantidad}", color = colorMonto, fontWeight = FontWeight.Bold)
                        Text(text = mov.hora, color = Color.Gray, fontSize = 11.sp)
                    }
                }
            }
        }
    }
}