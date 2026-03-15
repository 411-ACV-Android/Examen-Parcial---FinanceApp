package com.example.examen

import androidx.compose.ui.graphics.Color
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

data class Usuario(
    val nombre: String,
    val saldo: Double
)

data class TarjetaResumen(
    val titulo: String,
    val monto: String,
    val colorFondo: Color
)

data class Transaccion(
    val negocio: String,
    val categoria: String,
    val cantidad: Double,
    val hora: String,
    val urlImagen: String
)

val usuarioPrueba = Usuario("Abraham", 25450.0)

val listaTarjetas = listOf(
    TarjetaResumen("Actividad", "$1,200", Color(0xFFE3F2FD)),
    TarjetaResumen("Ventas", "$8,500", Color(0xFFE8F5E9)),
    TarjetaResumen("Ganancias", "$3,200", Color(0xFFFFF3E0))
)

val listaTransacciones = listOf(
    Transaccion("Walmart", "Despensa", -850.0, "10:30 AM", "https://picsum.photos/id/1/100/100"),
    Transaccion("Shell", "Gasolina", -1200.0, "11:15 AM", "https://picsum.photos/id/2/100/100"),
    Transaccion("Apple Store", "Electrónica", -25000.0, "12:00 PM", "https://picsum.photos/id/3/100/100"),
    Transaccion("Amazon", "Libros", -450.0, "02:30 PM", "https://picsum.photos/id/4/100/100"),
    Transaccion("Starbucks", "Restaurantes", -120.0, "04:45 PM", "https://picsum.photos/id/5/100/100"),
    Transaccion("Devolución", "Comida", 500.0, "06:00 PM", "https://picsum.photos/id/6/100/100")
)

@Composable
fun Encabezado(usuario: Usuario) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Column {
            Text(text = "Hola ${usuario.nombre}", fontSize = 24.sp, fontWeight = FontWeight.Bold)
            Text(text = "Bienvenido de nuevo", color = Color.Gray, fontSize = 14.sp)
        }
        IconButton(onClick = { }) {
            Icon(imageVector = Icons.Default.Menu, contentDescription = null)
        }
    }
}

@Composable
fun SeccionTarjetas(tarjetas: List<TarjetaResumen>) {
    LazyRow(
        contentPadding = PaddingValues(horizontal = 16.dp),
        horizontalArrangement = Arrangement.spacedBy(12.dp),
        modifier = Modifier.padding(vertical = 8.dp)
    ) {
        items(tarjetas) { tarjeta ->
            Card(
                colors = CardDefaults.cardColors(containerColor = tarjeta.colorFondo),
                shape = RoundedCornerShape(20.dp),
                modifier = Modifier.size(width = 160.dp, height = 110.dp)
            ) {
                Column(
                    modifier = Modifier
                        .padding(16.dp)
                        .fillMaxSize(),
                    verticalArrangement = Arrangement.Center
                ) {
                    Text(text = tarjeta.titulo, fontSize = 14.sp, color = Color.DarkGray)
                    Spacer(modifier = Modifier.height(4.dp))
                    Text(text = tarjeta.monto, fontSize = 20.sp, fontWeight = FontWeight.Bold)
                }
            }
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun ExamenTheme() {

    Column {
        Encabezado(usuarioPrueba)
        SeccionTarjetas(listaTarjetas)
    }
}