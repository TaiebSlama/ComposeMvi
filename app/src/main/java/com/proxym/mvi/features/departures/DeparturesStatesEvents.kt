package com.proxym.mvi.features.departures

/**
 * Created by taieb.slama@zeta-box.com on 12/5/2023 .
 * Copyright (c) 2023 ZETA-BOX. All rights reserved.
 */

sealed class DeparturesStates {
    object State1 : DeparturesStates()
}

sealed class DeparturesEvents {
    object Event1 : DeparturesEvents()
}