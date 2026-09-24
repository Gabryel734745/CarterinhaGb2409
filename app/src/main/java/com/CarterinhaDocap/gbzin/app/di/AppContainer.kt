package com.CarterinhaDocap.gbzin.app.di

import com.CarterinhaDocap.gbzin.core.auth.AuthTokenStore
import com.CarterinhaDocap.gbzin.feature.login.data.repository.LoginRepository
import com.CarterinhaDocap.gbzin.feature.unidadecurriculares.domain.repository.UnidadeCurricularRepository

interface AppContainer {

    val loginRepository: LoginRepository

    val unidadeCurricularRepository: UnidadeCurricularRepository

    val authTokenStore: AuthTokenStore
}