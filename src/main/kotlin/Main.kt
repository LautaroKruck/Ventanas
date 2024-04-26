import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.BitmapPainter
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.*


@Composable
fun MainWindow(
    onClick: () -> Unit,
    onClose: () -> Unit,
    icon: BitmapPainter,
    windowState: WindowState
) {
    Window(
        onCloseRequest = onClose,
        title = "Ventana Principal",
        icon = icon,
        state = windowState
    ) {
        Column(
            modifier = Modifier.fillMaxSize().padding(50.dp),
            verticalArrangement = Arrangement.spacedBy(100.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text("Estás en la Ventana Principal")
            Button(onClick = onClick) {
                Text("Abrir Segunda Ventana")
            }
        }
    }
}

@Composable
fun SecondWindow(
    onClick: () -> Unit,
    onClose: () -> Unit,
    icon: BitmapPainter,
    windowState: WindowState) {
    Window(
        onCloseRequest = onClose,
        title = "Ventana Secundaria",
        icon = icon,
        state = windowState
    ) {
        Column(
            modifier = Modifier.fillMaxSize().padding(50.dp),
            verticalArrangement = Arrangement.spacedBy(100.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text("Estás en la Ventana Secundaria")
            Button(onClick = onClick) {
                Text("Volver a Ventana Principal")
            }
        }
    }
}

fun main() {
    val mainWindowState = rememberWindowState()
    val secondWindowState = rememberWindowState()

    var isMainWindowOpen by remember { mutableStateOf(true) }
    var isSecondWindowOpen by remember { mutableStateOf(false) }


}
