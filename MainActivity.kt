package pk.fsbazaar.app

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

private val Navy = Color(0xFF0D47A1)
private val Orange = Color(0xFFFF6B00)
private val Pale = Color(0xFFF5F8FF)

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent { FSBazaarApp() }
    }
}

@Composable
fun FSBazaarApp() {
    MaterialTheme(colorScheme = lightColorScheme(primary = Navy, secondary = Orange)) {
        Column(Modifier.fillMaxSize().background(Pale)) {
            Column(Modifier.fillMaxWidth().background(Navy).padding(20.dp)) {
                Text("FS Bazaar", color = Color.White, fontSize = 28.sp, fontWeight = FontWeight.Bold)
                Text("Sab Kuch, Ek Hi Jagah!", color = Color.White, fontSize = 15.sp)
                Spacer(Modifier.height(14.dp))
                Surface(shape = RoundedCornerShape(14.dp), color = Color.White) {
                    Text("  🔍  Search products, brands and more...", modifier = Modifier.fillMaxWidth().padding(14.dp), color = Color.Gray)
                }
            }
            Column(Modifier.padding(16.dp)) {
                Surface(color = Orange, shape = RoundedCornerShape(18.dp), modifier = Modifier.fillMaxWidth()) {
                    Column(Modifier.padding(18.dp)) {
                        Text("Welcome to FS Bazaar", color = Color.White, fontSize = 21.sp, fontWeight = FontWeight.Bold)
                        Text("Discover everyday essentials in one place.", color = Color.White)
                        Spacer(Modifier.height(8.dp))
                        Text("Shop Now  →", color = Navy, fontWeight = FontWeight.Bold)
                    }
                }
                Spacer(Modifier.height(18.dp))
                Text("Shop by category", color = Navy, fontSize = 20.sp, fontWeight = FontWeight.Bold)
                Spacer(Modifier.height(10.dp))
                val categories = listOf("📱 Electronics", "👕 Fashion", "🏠 Home & Living", "🛒 Grocery", "💄 Beauty", "🧸 Kids", "🚗 Auto Parts", "⚽ Sports")
                LazyVerticalGrid(columns = GridCells.Fixed(2), modifier = Modifier.weight(1f), verticalArrangement = Arrangement.spacedBy(10.dp), horizontalArrangement = Arrangement.spacedBy(10.dp)) {
                    items(categories) { category ->
                        Surface(color = Color.White, shape = RoundedCornerShape(14.dp), shadowElevation = 2.dp) {
                            Box(Modifier.fillMaxWidth().padding(16.dp), contentAlignment = Alignment.CenterStart) {
                                Text(category, color = Navy, fontWeight = FontWeight.SemiBold)
                            }
                        }
                    }
                }
                Row(Modifier.fillMaxWidth().background(Color.White).padding(12.dp), horizontalArrangement = Arrangement.SpaceAround) {
                    Text("⌂ Home", color = Orange, fontWeight = FontWeight.Bold)
                    Text("♡ Wishlist", color = Navy)
                    Text("🛒 Cart", color = Navy)
                    Text("♙ Profile", color = Navy)
                }
            }
        }
    }
}
