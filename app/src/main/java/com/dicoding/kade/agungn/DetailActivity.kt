package kade.dicoding.com.appsatu

import android.R
import android.content.Intent
import android.os.Build
import android.os.Bundle
import android.support.annotation.RequiresApi
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.view.View.TEXT_ALIGNMENT_CENTER
import android.widget.EditText
import android.widget.TextView
import com.bumptech.glide.Glide
import kade.dicoding.com.appsatu.R.id.center
import kade.dicoding.com.appsatu.R.id.center_horizontal
import kotlinx.android.synthetic.main.activity_detail.*
import kotlinx.android.synthetic.main.item_list.view.*
import org.jetbrains.anko.*

/**
 * Created by admin on 21-Oct-18.
 */


class DetailActivity : AppCompatActivity() {

    @RequiresApi(Build.VERSION_CODES.JELLY_BEAN_MR1)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        var intentThatStartedThisActivity = getIntent()

        if (intentThatStartedThisActivity.hasExtra("ITEM")) {
            var item = intentThatStartedThisActivity.getStringExtra("ITEM")
            var image = intentThatStartedThisActivity.getIntExtra("IMAGE",1)
            var detail = intentThatStartedThisActivity.getStringExtra("DETAIL")


            verticalLayout{
                padding = dip(15)
                var imagev = imageView()
                imagev.setImageResource(image)
                imagev.lparams(width = matchParent, height = dip(75)){ }

                textView {
                    text = item
                    textSize = 17f
                    this.textAlignment = TEXT_ALIGNMENT_CENTER
                }

                textView {
                    text = detail
                    textSize = 12f
                }
            }
        }
    }


}