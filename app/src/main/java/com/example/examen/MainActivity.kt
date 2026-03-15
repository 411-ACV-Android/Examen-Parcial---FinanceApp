package com.example.examen

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.examen.components.SeccionSaludo
import com.example.examen.components.SeccionTarjeta
import com.example.examen.models.usuarioPrueba
import com.example.examen.models.listaTarjetas
import com.example.examen.ui.theme.ExamenTheme
import com.example.examen.components.SeccionMovimientos
import com.example.examen.models.listaTransacciones
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ExamenTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    PantallaInicio(
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun PantallaInicio(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .padding(horizontal = 15.dp)
            .padding(top = 30.dp)
    ) {

        SeccionSaludo(usuario = usuarioPrueba)

        Spacer(modifier = Modifier.height(16.dp))

        SeccionTarjeta(tarjetas = listaTarjetas)

        Spacer(modifier = Modifier.height(8.dp))


        SeccionMovimientos(movimientos = listaTransacciones)

    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun VistaPreviaExamen() {
    ExamenTheme {
        PantallaInicio()
    }
}