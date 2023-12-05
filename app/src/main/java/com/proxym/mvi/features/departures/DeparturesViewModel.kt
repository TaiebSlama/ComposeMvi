package com.proxym.mvi.features.departures

import com.proxym.mvi.app.common.viewModel.MVIViewModel

/**
 * Created by taieb.slama@zeta-box.com on 12/5/2023 .
 * Copyright (c) 2023 ZETA-BOX. All rights reserved.
 */

class DeparturesViewModel : MVIViewModel<DeparturesStates, DeparturesEvents>() {
    override suspend fun initStates() {}

    override fun handleEvents(viewEvent: DeparturesEvents) {
        when (viewEvent) {
            DeparturesEvents.Event1 -> {}
        }
    }
}