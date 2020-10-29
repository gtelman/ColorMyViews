package com.wcc.colormyviews

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var currentColor = R.color.grey
    //var boxOneColor =
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setColorButtonsAction()
        setBoxColor()
    }

    override fun onDestroy() {
        super.onDestroy()

        //salvar na sharedPreferences cor da caixa um
    }

    private fun setColorButtonsAction(){
        redButton.setOnClickListener {
            currentColor = R.color.red
        }
        yellowButton.setOnClickListener{
            currentColor = R.color.yellow
        }
        greenButton.setOnClickListener{
            currentColor = R.color.green
        }

    }

    private fun setBoxColor(){
        box_one_text.setOnClickListener{
            it.setBackgroundResource(currentColor)
        }
        box_two_text.setOnClickListener{
            it.setBackgroundResource(currentColor)
        }
        box_three_text.setOnClickListener{
            it.setBackgroundResource(currentColor)
        }
        box_four_text.setOnClickListener{
            it.setBackgroundResource(currentColor)
        }
        box_five_text.setOnClickListener{
            it.setBackgroundResource(currentColor)
        }
    }


}