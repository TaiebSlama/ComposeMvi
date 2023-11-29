package com.proxym.mvi.base

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow


/**
 * Created by slama.taieb@proxym-group.com on 8/30/2023 .
 * Copyright (c) 2023. All rights reserved.
 *
 * @author Slama Taieb
 * @version 1.0
 * @since 1.0
 */

abstract class MVIViewModel<STATE, EVENT> : ViewModel() {

    open val viewStates: MutableStateFlow<STATE?> = MutableStateFlow(null)

    abstract suspend fun initStates()

    abstract fun handleEvents(viewEvent: EVENT)

    fun moveToState(state: STATE) {
        viewStates.value = null
        viewStates.value = state
    }

}