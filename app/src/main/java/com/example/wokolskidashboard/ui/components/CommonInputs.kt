package com.example.wokulskidashboard.ui.components
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable


@Composable
fun WokulskiTextField(  //funkcja jest komponentem UI
    value: String,
    onChange: (String) -> Unit,  //przekazuje wartość po wpisaniu urzytkownika
    label: String //etykieta
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
    onClick: () -> Unit //funkcja wywoływana po kliknięciu
) {
    Button(onClick = onClick){ //przekazujemy akcję kliknięcia
        Text(text) //widoczny tekst
    }
}