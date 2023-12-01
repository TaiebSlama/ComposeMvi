package com.proxym.mvi.domain

/**
 * Created by taieb.slama@zeta-box.com on 12/1/2023 .
 * Copyright (c) 2023 ZETA-BOX. All rights reserved.
 * [AuthenticationManager]
 */
interface AuthenticationFunctions {

    /**
     * [AuthenticationManager.signIn]
     */
    fun signIn(username: String, pwd: String, success: () -> Unit, failure: () -> Unit)
}