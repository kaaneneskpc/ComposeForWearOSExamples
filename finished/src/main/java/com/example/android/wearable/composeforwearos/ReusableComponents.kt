package com.example.android.wearable.composeforwearos

import androidx.compose.foundation.layout.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Message
import androidx.compose.material.icons.rounded.Phone
import androidx.compose.material.icons.rounded.SelfImprovement
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.semantics.contentDescription
import androidx.compose.ui.semantics.semantics
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.wear.compose.material.AppCard
import androidx.wear.compose.material.Button
import androidx.wear.compose.material.ButtonDefaults
import androidx.wear.compose.material.Chip
import androidx.wear.compose.material.Icon
import androidx.wear.compose.material.Switch
import androidx.wear.compose.material.Text
import androidx.wear.compose.material.ToggleChip

@Composable
fun ButtonExample(
    modifier: Modifier = Modifier,
    iconModifier: Modifier = Modifier
) {
    Row(
        modifier = modifier,
        horizontalArrangement = Arrangement.Center
    ) {
        Button(onClick = {}, modifier = Modifier.size(ButtonDefaults.LargeButtonSize)) {
            Icon(
                imageVector = Icons.Rounded.Phone,
                contentDescription = "triggers phone action",
                modifier = iconModifier
            )
        }
    }
}

@Composable
fun TextExample(
    modifier: Modifier = Modifier,
) {
    Text(
        modifier = modifier,
        textAlign = TextAlign.Center,
        color = Color.White,
        text = "Kaan Enes KAPICI"
    )
}


@Composable
fun CardExample(
    modifier: Modifier = Modifier,
    iconModifier: Modifier = Modifier
) {
    AppCard(
        modifier = modifier,
        appImage = {
            Icon(
                imageVector = Icons.Rounded.Message,
                contentDescription = "triggers open message action",
                modifier = iconModifier
            )
        },
        appName = { Text("Messages") },
        time = { Text("12m") },
        title = { Text("Irem Ozturk") },
        onClick = { /* ... */ }
    ) {
        Text("On my way!")
    }

}

@Composable
fun ChipExample(
    modifier: Modifier = Modifier,
    iconModifier: Modifier = Modifier
) {
    Chip(
        modifier = modifier,
        onClick = { /* ... */ },
        label = {
            Text(
                text = "5 minute Meditation",
                maxLines = 1,
                overflow = TextOverflow.Ellipsis
            )
        },
        icon = {
            Icon(
                imageVector = Icons.Rounded.SelfImprovement,
                contentDescription = "triggers meditation action",
                modifier = iconModifier
            )
        },
    )
}

@Composable
fun ToggleChipExample(modifier: Modifier = Modifier) {
    var checked by remember { mutableStateOf(true) }
    ToggleChip(
        modifier = modifier,
        checked = checked,
        toggleControl = {
            Switch(
                checked = checked,
                modifier = Modifier.semantics {
                    this.contentDescription = if (checked) "On" else "Off"
                }
            )
        },
        onCheckedChange = {
            checked = it
        },
        label = {
            Text(
                text = "Sound",
                maxLines = 1,
                overflow = TextOverflow.Ellipsis
            )
        }
    )
}
