package com.proxym.mvi.features.authentication.signIn

import android.util.Log
import android.widget.Toast
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
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.lifecycle.Lifecycle
import com.proxym.mvi.base.helper.ObserveLifeCycle

/**
 * Created by taieb.slama@zeta-box.com on 11/29/2023 .
 * Copyright (c) 2023 ZETA-BOX. All rights reserved.
 */

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SignInScreen() {
    val viewModel: SignInViewModel = hiltViewModel()
    val signInState = viewModel.viewStates

    signInState.value?.let { state ->
        when (state) {
            is SignInStates.SignInFailure -> Toast.makeText(
                LocalContext.current,
                state.error,
                Toast.LENGTH_SHORT
            ).show()

            SignInStates.SignInSuccess -> Toast.makeText(
                LocalContext.current,
                "SignInSuccess",
                Toast.LENGTH_SHORT
            ).show()
        }
    }


    ObserveLifeCycle {
        when (it) {
            Lifecycle.State.DESTROYED -> Log.d("ObserveLifeCycle", "Login DESTROYED")
            Lifecycle.State.INITIALIZED -> Log.d("ObserveLifeCycle", "Login INITIALIZED")
            Lifecycle.State.CREATED -> Log.d("ObserveLifeCycle", "Login CREATED")
            Lifecycle.State.STARTED -> Log.d("ObserveLifeCycle", "Login STARTED")
            Lifecycle.State.RESUMED -> Log.d("ObserveLifeCycle", "Login RESUMED")
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
            Text(text = "Welcome")
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
                viewModel.handleEvents(SignInEvents.SignIn(username = username, pwd = pwd))
            }) {
                Text(text = "Sign In")
            }

            Spacer(modifier = Modifier.size(10.dp))

            Button(onClick = {

            }) {
                Text(text = "Sign Up")
            }
        }
    }, bottomBar = {})
}