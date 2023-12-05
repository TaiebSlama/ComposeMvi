package com.proxym.mvi.features.nearby

/**
 * Created by taieb.slama@zeta-box.com on 12/5/2023 .
 * Copyright (c) 2023 ZETA-BOX. All rights reserved.
 */

sealed class NearbyStates {
    object State1 : NearbyStates()
}

sealed class NearbyEvents {
    object Event1 : NearbyEvents()
}