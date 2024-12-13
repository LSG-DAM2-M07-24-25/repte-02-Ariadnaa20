package com.example.reptekotlin2.view

class LaunchScreen {

    Button(
    onClick = { },
    colors = ButtonDefaults.buttonColors(
    containerColor = Color.Blue,
    contentColor = Color.Red
    ),
    border = BorderStroke(5.dp, Color.Green)
    ) {
        Text(text = "Push")
    }

}