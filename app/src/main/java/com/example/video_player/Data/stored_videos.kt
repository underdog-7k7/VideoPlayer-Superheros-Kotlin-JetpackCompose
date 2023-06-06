package com.example.video_player.Data

import com.example.video_player.Model_for_video.superhero
import com.example.video_player.R

class super_hero_storage(){

    fun give_me_superhero_list(): List<superhero>{
        return  listOf<superhero>(
            superhero(R.string.superman_main,R.drawable.img_5,"https://www.youtube.com/watch?v=T6DJcgm3wNY"),
            superhero(R.string.batman_main,R.drawable.img,"https://www.youtube.com/watch?v=mqqft2x_Aa4"),
            superhero(R.string.capn_america,R.drawable.img_2,"https://www.youtube.com/watch?v=T6DJcgm3wNY"),
            superhero(R.string.iron_man_main, R.drawable.img_3,"https://www.youtube.com/watch?v=JerVrbLldXw"),
            superhero(R.string.wonder_Woman_main, R.drawable.img_4,"https://www.youtube.com/watch?v=1Q8fG0TtVAY"),
            superhero(R.string.spider_man, R.drawable.img_1,"https://www.youtube.com/watch?v=shW9i6k8cB0")
        )
    }
}

