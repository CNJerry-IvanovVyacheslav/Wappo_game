package com.example.wappo_game.settings

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.defaultMinSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Switch
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.compose.onPrimaryDark

@Composable
fun Settings() {
    Box {
        val checkedStateSound = remember { mutableStateOf(false) }
        val checkedStateVibration = remember { mutableStateOf(false) }
        val checkedStateTheme = remember { mutableStateOf(false) }
        val textColor = remember { mutableStateOf(Color.Unspecified) }
        Column {
            Row(verticalAlignment = Alignment.CenterVertically) {
                Text(
                    "Settings",
                    fontSize = 35.sp

                )
            }
            Row(
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier
                    .border(width = 2.dp, color = Color.DarkGray, shape = RoundedCornerShape(20.dp))
                    .fillMaxWidth()
            ) {
                Text(
                    "Звук",
                    fontSize = 22.sp,
                    color = textColor.value,
                    modifier = Modifier.padding(8.dp, 10.dp)
                )
                Switch(
                    modifier = Modifier.fillMaxWidth(),
                    checked = checkedStateSound.value,
                    onCheckedChange = {
                        checkedStateSound.value = it
                        if (checkedStateSound.value) {
                            textColor.value = Color(0xFF6650a4)
                        } else textColor.value = Color.Unspecified
                    }
                )
            }
            Row(
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier.border(
                    width = 2.dp,
                    color = Color.DarkGray,
                    shape = RoundedCornerShape(20.dp)
                )
            ) {
                Text(
                    "Вибрация",
                    fontSize = 22.sp,
                    color = textColor.value,
                    modifier = Modifier.padding(8.dp, 10.dp)
                )
                Switch(
                    checked = checkedStateVibration.value,
                    onCheckedChange = {
                        checkedStateVibration.value = it
                        if (checkedStateVibration.value) {
                            textColor.value = Color(0xFF6650a4)
                        } else textColor.value = Color.Unspecified
                    }
                )
            }
            Row(
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier.border(
                    width = 2.dp,
                    color = Color.DarkGray,
                    shape = RoundedCornerShape(20.dp)
                )
            ) {
                Text(
                    "Темная тема",
                    fontSize = 22.sp,
                    color = textColor.value,
                    modifier = Modifier.padding(8.dp, 10.dp)
                )
                Switch(
                    checked = checkedStateTheme.value,
                    onCheckedChange = {
                        checkedStateTheme.value = it
                        if (checkedStateTheme.value) {
                            textColor.value = Color(0xFF6650a4)
                        } else textColor.value = Color.Unspecified
                    }
                )
            }
        }
    }
}