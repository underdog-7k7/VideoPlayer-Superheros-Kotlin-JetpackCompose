package com.example.video_player

import android.graphics.drawable.Icon
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ExpandMore
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.viewinterop.AndroidView
import com.example.video_player.Data.super_hero_storage
import com.example.video_player.Model_for_video.superhero
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.YouTubePlayer
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.listeners.AbstractYouTubePlayerListener
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views.YouTubePlayerView
import androidx.compose.runtime.*
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource


val superhero_object = super_hero_storage()
val list_of_superheros= superhero_object.give_me_superhero_list()

@Composable
fun YoutubeScreen(
    videoURL: String,
    modifier: Modifier
) {
    val Video_Id = videoURL.substringAfter('=')
    val ctx = LocalContext.current
    AndroidView(factory = {
        var view = YouTubePlayerView(it)
        val fragment = view.addYouTubePlayerListener(
            object : AbstractYouTubePlayerListener() {
                override fun onReady(youTubePlayer: YouTubePlayer) {
                    super.onReady(youTubePlayer)
                    youTubePlayer.loadVideo(Video_Id, 0f)
                }
            }
        )
        view
    })

}

@Composable
fun superhero_display_unit(thesuperhero: superhero, modifier: Modifier=Modifier){
    var expanded_card by remember { mutableStateOf(false) }

    Card(modifier = Modifier) {
        Column(modifier=Modifier) {
            Row() {
                Image(painter = painterResource(id = thesuperhero.superheroimage), contentDescription = stringResource(
                    id = thesuperhero.
                ))
            }
        }
    }
}
//Animations
@Composable
fun expand_down_button(
    is_it_expanded: Boolean=false, //by default not expanded
    what_happens_on_click: ()->Unit,
    modifier: Modifier=Modifier
){
    IconButton(onClick = {what_happens_on_click},modifier=Modifier)
    {
        androidx.compose.material3.Icon(imageVector = Icons.Filled.ExpandMore, contentDescription = "Expand_down",tint = MaterialTheme.colorScheme.primary)
    }
}

@Preview
@Composable
fun tester(){
   expand_down_button(what_happens_on_click = { /*TODO*/ }, modifier = Modifier)
}

