package com.CarterinhaDocap.gbzin.feature.carteirinha.presetantion.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import com.CarterinhaDocap.gbzin.R // Corrigido para importar os recursos do seu projeto
import com.CarterinhaDocap.gbzin.feature.carteirinha.presetantion.component.PerfilAluno
import com.rafaelcosta.myapplication.QrCode

@Composable
fun CarteirinhaScreen(
    modifier: Modifier = Modifier
) {
    Box(
        modifier = modifier.fillMaxSize()
    ) {
        Image(
            painter = painterResource(id = R.drawable.logooo),
            contentDescription = "Fundo",
            modifier = Modifier
                .fillMaxSize()
                .alpha(0.5f),
            contentScale = ContentScale.Crop
        )
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.SpaceAround,
            modifier = Modifier.fillMaxSize()
        ) {
            Image(
                painter = painterResource(id = R.drawable.logo),
                contentDescription = "Logo Senai",
                modifier = Modifier
                    .fillMaxWidth(0.8f)
            )
            PerfilAluno(
                nome = "Gabryel Ezequias",
                curso = "Desenvolvimento de Sistemas - SENAI Anchieta"
            )
            QrCode(
                conteudo = "RA: 00001118366165 - Gabryel Ezequias - SENAI Anchieta"
            )
        }
    }
}