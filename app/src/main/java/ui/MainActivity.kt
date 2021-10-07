package ui

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.animation.expandHorizontally
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.mobilevtb.R
import com.example.mobilevtb.ui.theme.MobileVTBTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MobileVTBTheme {
                Surface(color = MaterialTheme.colors.background) {
                    beginScreen()
                }
            }
        }
    }
}

@Composable
fun beginScreen() {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = Modifier.fillMaxWidth()
    ) {
        Image(
            painter = painterResource(id = R.drawable.payment_solid),
            contentDescription = "Payment solid",
            modifier = Modifier
                .align(Alignment.CenterHorizontally)
                .weight(6f)
                .fillMaxWidth()
        )
        Text(
            text = "Повышение финансовой грамотности - в наше время важная хуйня",
            textAlign = TextAlign.Center,
            fontSize = 26.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier
                .weight(3f)
                .padding(10.dp)
        )

        Row(
            horizontalArrangement = Arrangement.SpaceBetween,
            modifier = Modifier
                .weight(1f)
                .padding(20.dp)
                .fillMaxWidth()
        ) {
            Text("Skip")
            Text("Next")
        }
    }
}


@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    MobileVTBTheme {
        beginScreen()
    }
}