import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.PreviewLightDark
import com.example.myapplication.AppTheme
import com.example.myapplication.MyComposable
import com.example.mylibrary.ModuleTheme

class MyComposableTest {

    @PreviewLightDark
    @Composable
    fun ModuleThemePreview() {
        ModuleTheme {
            MyComposable()
        }
    }

    @PreviewLightDark
    @Composable
    fun AppThemePreview() {
        AppTheme {
            MyComposable()
        }
    }

    @PreviewLightDark
    @Composable
    fun MaterialThemePreview() {
        MaterialTheme {
            MyComposable()
        }
    }

}