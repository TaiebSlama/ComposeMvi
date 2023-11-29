package com.proxym.mvi.base.viewModel

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel


/**
 * Created by slama.taieb@proxym-group.com on 8/30/2023 .
 * Copyright (c) 2023. All rights reserved.
 *
 * @author Slama Taieb
 * @version 1.0
 * @since 1.0
 */

abstract class MVIViewModel<STATE, EVENT> : ViewModel() {

    open val viewStates: MutableState<STATE?> = mutableStateOf(null)

    abstract suspend fun initStates()

    abstract fun handleEvents(viewEvent: EVENT)

    fun moveToState(state: STATE) {
        viewStates.value = null
        viewStates.value = state
    }

}