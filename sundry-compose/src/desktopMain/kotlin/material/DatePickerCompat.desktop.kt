package net.lsafer.sundry.compose.material

import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.window.DialogProperties

@OptIn(ExperimentalComposeUiApi::class)
internal actual fun createDialogProperties(scrimColor: Color): DialogProperties {
    return DialogProperties(scrimColor = scrimColor)
}
