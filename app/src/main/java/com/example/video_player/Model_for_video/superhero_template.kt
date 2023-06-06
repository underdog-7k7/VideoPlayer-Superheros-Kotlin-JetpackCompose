package com.example.video_player.Model_for_video

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

/*import androidx.media3.common.util.Util
import androidx.media3.datasource.DefaultDataSourceFactory
import androidx.media3.exoplayer.DefaultLoadControl
import androidx.media3.exoplayer.DefaultRenderersFactory
import androidx.media3.exoplayer.ExoPlayer
import androidx.media3.exoplayer.SimpleExoPlayer
import androidx.media3.exoplayer.source.MediaSource
import androidx.media3.exoplayer.trackselection.DefaultTrackSelector
import androidx.media3.ui.PlayerView*/

data class superhero(
@StringRes val superherotext: Int,
@DrawableRes val superheroimage: Int,
val video_url: String
)



