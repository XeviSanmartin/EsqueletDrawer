package cat.institutmontivi.esqueletdrawer.ui.pantalles

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview

@Preview
@Composable
fun PantallaA (viewModel: PantallaAViewModel = androidx.lifecycle.viewmodel.compose.viewModel())
{
    val estat = viewModel.estat
    Box(Modifier.fillMaxSize(). background(color = MaterialTheme.colorScheme.surfaceVariant))
    {
        Text(text = "Pantalla A",
            modifier = Modifier.align(Alignment.Center),
            style = MaterialTheme.typography.displayLarge,
            color = MaterialTheme.colorScheme.onSurfaceVariant,
            textAlign = TextAlign.Center)
    }
}