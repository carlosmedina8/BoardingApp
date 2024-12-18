package com.example.boardingapp.onBoardViews


import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.navigation.NavHostController
import com.google.accompanist.pager.ExperimentalPagerApi
import com.google.accompanist.pager.rememberPagerState
import com.example.boardingapp.R
import com.example.boardingapp.data.PageData
import com.example.boardingapp.dataStore.StoreBoarding


@OptIn(ExperimentalPagerApi::class)
@Composable
fun MainOnBoarding(modifier: NavHostController, navController: NavHostController, storeBoarding: StoreBoarding) {
    val items = ArrayList<PageData>()

    items.add(
        PageData(
            title = "titulo 1",
            description = "Descripcion 1",
            image = R.raw.page1
        )
    )

    items.add(
        PageData(
            title = "titulo 2",
            description = "Descripcion 2",
            image = R.raw.page2
        )
    )

    items.add(
        PageData(
            title = "titulo 3",
            description = "Descripcion 3",
            image = R.raw.page3
        )
    )

    val pagerState = rememberPagerState(
        pageCount = items.size,
        initialOffscreenLimit = 2,
        infiniteLoop = false,
        initialPage = 0
    )

    OnBoardingPager(item = items, pagerState = pagerState, modifier = Modifier.fillMaxWidth().background(
        Color.White), navController = navController, storeBoarding = storeBoarding)


}


