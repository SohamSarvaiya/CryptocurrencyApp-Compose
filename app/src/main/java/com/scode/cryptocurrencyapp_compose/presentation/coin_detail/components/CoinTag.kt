package com.scode.cryptocurrencyapp_compose.presentation.coin_detail.components

import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp

@Composable
fun CoinTag(
    tag: String
) {

    Box(
        modifier = Modifier
            .border(
                width = 1.dp,
                color = Color.Cyan,
                shape = RoundedCornerShape(100.dp)
            )
            .padding(10.dp)
    ) {

        Text(
            text = tag,
            color = Color.Cyan ,
            textAlign = TextAlign.Center,
            style = MaterialTheme.typography.bodyMedium
        )
    }
}