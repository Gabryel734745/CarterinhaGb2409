package com.CarterinhaDocap.gbzin.feature.login.data.repository

import com.CarterinhaDocap.gbzin.feature.login.domain.model.UsuarioLogado

interface LoginRepository {
    suspend fun login( usuario:String, senha:String): Result<UsuarioLogado>
}