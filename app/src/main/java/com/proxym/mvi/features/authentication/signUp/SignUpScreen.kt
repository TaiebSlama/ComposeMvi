package com.proxym.mvi.features.authentication.signUp

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavController
import com.proxym.mvi.features.authentication.AuthenticationHosts

/**
 * Created by taieb.slama@zeta-box.com on 11/29/2023 .
 * Copyright (c) 2023 ZETA-BOX. All rights reserved.
 */

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SignUpScreen(navController: NavController) {

    val viewModel: SignUpViewModel = hiltViewModel()
    val signUpState = viewModel.viewStates

    signUpState.value?.let { state ->
        when (state) {
            is SignUpStates.SignUpFailure -> {}
            SignUpStates.SignUpSuccess -> {}
        }
    }

    var username by remember { mutableStateOf("") }

    var pwd by remember { mutableStateOf("") }

    Scaffold(modifier = Modifier.fillMaxSize(), topBar = {}, content = { padding ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(padding),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(text = "Welcome to sign up")
            Spacer(modifier = Modifier.size(50.dp))
            TextField(
                value = username,
                onValueChange = { newValue ->
                    username = newValue
                },
                placeholder = { Text(text = "Username") }
            )

            Spacer(modifier = Modifier.size(10.dp))

            TextField(
                value = pwd,
                onValueChange = { newValue ->
                    pwd = newValue
                },
                placeholder = { Text(text = "Pwd") })

            Spacer(modifier = Modifier.size(50.dp))

            Button(onClick = {

            }) {
                Text(text = "Sign Up")
            }

            Spacer(modifier = Modifier.size(10.dp))

            Button(onClick = {
                navController.navigate(AuthenticationHosts.SIGN_IN.route)
            }) {
                Text(text = "Sign in")
            }
        }
    }, bottomBar = {})
}