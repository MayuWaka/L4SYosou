package app.wakayama.tama.l4syosou

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    val people = arrayOf("スケルトンたまご", "カラシュート", "ラップぐでたま", "プンプンぐでたま")
    val food = arrayOf("カレー", "味噌汁", "チャーハン", "エビチリ", "卵焼き", "パンケーキ")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

        fun serveFood(View: View?) {

            val randomName = Random()
            val index = randomName.nextInt(4)
            val name = people[index]
            nameTextView.text = name + "に"

            foodTextView.text = food[Random().nextInt(6)] + "を"

            val yosou = arrayOf("よそえました^^", "よそえませんでした!")
            val random = Random()
            val num = random.nextInt(2)
            verbTtextView.text = yosou[num]

            if (num == 1) {
                verbTtextView.setTextSize(40F)
            } else {
                verbTtextView.setTextSize(30F)
            }
        }

}