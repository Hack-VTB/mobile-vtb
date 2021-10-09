package ui.lessons

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.R
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.mobilevtb.ui.theme.MobileVTBTheme
import com.google.accompanist.pager.ExperimentalPagerApi
import ui.routes.RoutesScreen
import ui.routes.listRoutes

@Composable
fun lesson1Screen1() {
    Column(
        modifier = Modifier.fillMaxSize()
    ) {
        Text(
            "Эпизод №1",
            textAlign = TextAlign.Center,
            fontSize = 30.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier
                .padding(10.dp)
        )
        lesson1Screen1Head()


    }
}

@Composable
fun lesson1Screen1Head()
{
    Row(
        horizontalArrangement = Arrangement.SpaceBetween,
        modifier = Modifier.fillMaxWidth()
    ) {
        Card(
            shape = RoundedCornerShape(10.dp),
            elevation = 20.dp,
            modifier = Modifier
                .padding(15.dp),
            backgroundColor = colorResource(com.example.mobilevtb.R.color.blueCard)
        ) {
            Row(
                horizontalArrangement = Arrangement.SpaceBetween,
                modifier = Modifier.padding(7.dp)
            ) {
                Icon(Icons.Default.ArrowBack, "back")
                Text("К урокам")
            }
        }

        Card(
            shape = RoundedCornerShape(10.dp),
            elevation = 20.dp,
            modifier = Modifier
                .padding(15.dp),
            backgroundColor = colorResource(com.example.mobilevtb.R.color.blueCard)
        ) {
            Text(
                "Акция - это прибыль",
                modifier = Modifier.padding(7.dp)
            )
        }

    }
}



@Preview
@Composable
fun lesson1Screen1Prev() {
    MobileVTBTheme {
        Surface(color = MaterialTheme.colors.background) {
            lesson1Screen1()
        }
    }
}
