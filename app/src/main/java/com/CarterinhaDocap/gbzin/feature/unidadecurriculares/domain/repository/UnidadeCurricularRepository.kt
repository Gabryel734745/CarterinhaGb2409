package com.CarterinhaDocap.gbzin.feature.unidadecurriculares.domain.repository

import com.CarterinhaDocap.gbzin.feature.unidadecurriculares.domain.model.UnidadeCurricular

interface UnidadeCurricularRepository {
    suspend fun listarUnidadesCurriculares(): Result<List<UnidadeCurricular>>
}