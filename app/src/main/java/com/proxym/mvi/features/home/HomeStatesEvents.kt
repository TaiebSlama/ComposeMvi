package com.proxym.mvi.features.home

/**
 * Created by taieb.slama@zeta-box.com on 12/5/2023 .
 * Copyright (c) 2023 ZETA-BOX. All rights reserved.
 */

sealed class HomeStates {
    object State1 : HomeStates()
}

sealed class HomeEvents {
    object Event1 : HomeEvents()
}