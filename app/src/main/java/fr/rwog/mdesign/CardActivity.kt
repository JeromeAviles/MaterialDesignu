package fr.rwog.mdesign

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import kotlinx.android.synthetic.main.activity_card.*
import org.jetbrains.anko.*

class CardActivity : AppCompatActivity(), AnkoLogger {
    var toggleHeart = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_card)
        MyId.setOnClickListener { toggleHeart(MyId) }



    }


    fun toggleHeart(image: ImageView) {
        if (toggleHeart) {
            image.setImageResource(R.drawable.heart)
            toast("So sad...")
            toggleHeart = false
        } else {
            image.setImageResource(R.drawable.heart_color)
            toast("I love it !")
            toggleHeart = true
        }
    }



}
