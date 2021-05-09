package app.myoji.nickname.appjam

import android.graphics.Color
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.isVisible
import kotlinx.android.synthetic.main.activity_main.*
import java.lang.Exception


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val keywordList: List<String> = listOf(
                "その数字には文字は設定されていません","apple", "banana", "cat", "dog"
        )

        var countNumber: Int = 0
        var text: String = "その数字には文字は設定されていません"

        textview1.text = "0"


        plus_button.setOnClickListener{
            countNumber += 1

            try{
                text = keywordList[countNumber]
                listtext.text = text
            }catch(e:Exception){
                listtext.text = "その数字には文字は設定されていません"
            }
            if(countNumber == 0){
                textview1.setTextColor(Color.WHITE)
            }
            else if(countNumber % 3 == 0 && countNumber % 5 == 0){
                textview1.setTextColor(Color.RED)
                image_11.isVisible = true
            }

            else if( countNumber % 3 == 0 ){
                textview1.setTextColor(Color.GREEN)
            }
            else if(countNumber % 5 == 0){
                textview1.setTextColor(Color.BLUE)
            }
            else{
                textview1.setTextColor(Color.WHITE)
                image_11.isVisible = false
            }
            textview1.text = countNumber.toString()


        }

        minus_button.setOnClickListener{
            countNumber -= 1

            try{
                text = keywordList[countNumber]
                listtext.text = text
            }catch(e:Exception){
                listtext.text = "その数字には文字は設定されていません"
            }
            if(countNumber == 0) {
                textview1.setTextColor(Color.WHITE)
            }
            else if(countNumber % 3 == 0 && countNumber % 5 == 0){
                textview1.setTextColor(Color.RED)
                image_11.isVisible = true
            }

            else if( countNumber % 3 == 0 ){
                textview1.setTextColor(Color.GREEN)
            }
            else if(countNumber % 5 == 0){
                textview1.setTextColor(Color.BLUE)
            }
            else{
                textview1.setTextColor(Color.WHITE)
                image_11.isVisible = false
            }
            textview1.text = countNumber.toString()
        }

        clear_button.setOnClickListener{
            countNumber = 0
            try{
                text = keywordList[countNumber]
                listtext.text = text
            }catch(e:Exception){
                listtext.text = "その数字には文字は設定されていません"
            }
            textview1.setTextColor(Color.WHITE)
            textview1.text = countNumber.toString()
        }
    }

}
