package com.example.boardingapp.onBoardViews

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.background
import androidx.compose.runtime.Composable
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.Modifier

@Composable
fun PagerIndicator(size:Int,currentPage:Int) {
    Row(
      horizontalArrangement = Arrangement.SpaceBetween,
        modifier = Modifier.padding(top=60.dp)
    ) {
        repeat(size){
            Indicator(isSelected = it == currentPage)
        }
    }
}
@Composable
fun Indicator(modifier: Modifier = Modifier, isSelected:Boolean){
    Box(
        modifier = Modifier
            .padding(5.dp)
            .height(10.dp)
            .width(25.dp)
            .clip(CircleShape)
            .background(color = if(isSelected) Color.Gray else Color.LightGray)
    ){
    }
}