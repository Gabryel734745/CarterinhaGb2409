package com.CarterinhaDocap.gbzin.feature.unidadecurriculares.presentation

import com.CarterinhaDocap.gbzin.feature.unidadecurriculares.domain.model.UnidadeCurricular

data class UnidadeCurricularUiState(
    val listaUnidadesCurriculares: List<UnidadeCurricular> = emptyList(),
    val isLoading: Boolean = false,
    val errorMessage: String? = null
) {
}