package com.proxym.mvi.features.authentication

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

/**
 * Created by taieb.slama@zeta-box.com on 11/28/2023 .
 * Copyright (c) 2023 ZETA-BOX. All rights reserved.
 */

sealed class MainStates {
    data class ShowToast(var msg: String) : MainStates()
}

sealed class MainEvents {
    object Event : MainEvents()
}


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MainScreen() {
    Scaffold(
        topBar = {},
        content = { paddingValues ->

            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .verticalScroll(rememberScrollState())
                    .padding(paddingValues)
            ) {
                Text(
                    modifier = Modifier.clickable {
                    },
                    text = "Create Text"
                )
            }
        },
        bottomBar = {}
    )
}