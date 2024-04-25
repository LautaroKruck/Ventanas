import androidx.compose.desktop.ui.tooling.preview.Preview
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.painter.BitmapPainter
import androidx.compose.ui.res.loadImageBitmap
import androidx.compose.ui.res.useResource
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.WindowState
import androidx.compose.ui.window.application
import androidx.compose.ui.window.singleWindowApplication
import java.awt.SecondaryLoop


fun main() = application {
    Window(onCloseRequest = ::exitApplication) {

    }
}

@Composable
fun MainWindow(
    icon: BitmapPainter,
    windowState: WindowState,
    onClose: () -> Unit,
    onClickOpenSecondWindow: () -> Unit
){
    singleWindowApplication(icon = icon) {
        Text("Hello World!")
    }
}

@Composable
fun SecondaryWindow(
    icon: BitmapPainter,
    windowState: WindowState,
    onClose: () -> Unit,
    onClickOpenSecondWindow: () -> Unit
){}