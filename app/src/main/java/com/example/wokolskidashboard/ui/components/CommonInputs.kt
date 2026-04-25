package com.example.wokulskidashboard.ui.components
import androidx.compose.material3.*
import androidx.compose.runtime.Composable



@Composable
fun WokulskiTextField(
    value: String,
    onChange: (String) -> Unit,
    label: String
){
    TextField(
        value = value,
        onValueChange = onChange,
        label = {Text(label) }
    )
}

@Composable
fun WokulskiButton(
    text: String,
    onClick: () -> Unit
) {
    Button(onClick = onClick){
        Text(text)
    }
}