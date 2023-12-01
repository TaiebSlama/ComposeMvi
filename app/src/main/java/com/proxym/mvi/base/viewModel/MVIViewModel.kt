package com.proxym.mvi.base.viewModel

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.channels.Channel
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach
import kotlinx.coroutines.flow.receiveAsFlow


/**
 * Created by slama.taieb@proxym-group.com on 8/30/2023 .
 * Copyright (c) 2023. All rights reserved.
 *
 * @author Slama Taieb
 * @version 1.0
 * @since 1.0
 */

abstract class MVIViewModel<STATE, EVENT> : ViewModel() {

    private val stateChannel: Channel<STATE> = Channel()

    open val viewStates: MutableState<STATE?> = mutableStateOf(null)

    init {
        stateChannel.receiveAsFlow()
            .onEach(::updateState)
            .launchIn(viewModelScope)
    }

    abstract suspend fun initStates()

    abstract fun handleEvents(viewEvent: EVENT)

    fun moveToState(state: STATE) {
        stateChannel.trySend(state)
    }

    private fun updateState(state: STATE) {
        viewStates.value = null
        viewStates.value = state
    }


}