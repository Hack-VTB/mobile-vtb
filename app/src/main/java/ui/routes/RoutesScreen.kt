package ui.routes

import android.graphics.Color
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.mobilevtb.ui.theme.MobileVTBTheme
import com.google.accompanist.pager.ExperimentalPagerApi
import com.example.mobilevtb.R
import com.google.accompanist.pager.HorizontalPager


data class RoutesData(
    val name: String,
    val avatar: Int
)

var listRoutes: List<RoutesData> = listOf<RoutesData>(
    RoutesData(
        "Джек",
        R.drawable.jack
    ),
    RoutesData(
        "Хью",
        R.drawable.hugh
    ),
    RoutesData(
        "Джулия",
        R.drawable.julia
    ),
    RoutesData(
        "Вика",
        R.drawable.vika
    )
)


@ExperimentalPagerApi
@Composable
fun routesScreen(data: List<RoutesData>) {
    Column {
        Text(
            text = "Выбери историю",
            fontSize = 26.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier
                .padding(start = 10.dp, top  = 8.dp)
        )
        HorizontalPager(
            count = data.size,
            modifier = Modifier.fillMaxSize()
        ) {
            for (i in data.indices) {
                routesCard(i, data[i])
            }
        }
    }
}

@Composable
fun routesCard(index: Int, route: RoutesData) {
    Card(
        shape = RoundedCornerShape(10.dp),
        elevation = 20.dp,
        modifier = Modifier
            .padding(15.dp)
            .fillMaxSize()
    ) {
        Column(
            modifier = Modifier.fillMaxSize()
        ) {
            Text(
                "Урок №$index",
                modifier = Modifier
                    .weight(1f)
                    .padding(start = 16.dp, top = 8.dp),
                textAlign = TextAlign.Start,
                fontSize = 26.sp,
                fontWeight = FontWeight.Bold,
            )
//            Text()
            Image(
                painter = painterResource(route.avatar),
                "${route.name}",
                modifier = Modifier
                    .weight(3f)
                    .fillMaxSize()
            )
        }
    }
}

//@Composable
//fun chatCloudCard(size: Float) {
//    Canvas(modifier = Modifier.fillMaxWidth()) {
//
//        drawRect(
//            color = Red,
//            size = Size(20f,30f)
//        )
//    }
//}


@ExperimentalPagerApi
@Preview
@Composable
fun routesScreenPrev() {
    MobileVTBTheme {
        Surface(color = MaterialTheme.colors.background) {
            routesScreen(listRoutes)
        }
    }
}

