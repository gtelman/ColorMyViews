package com.wcc.colormyviews

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var currentColor = R.color.grey
    var boxOneColor = R.color.grey
    //var boxOneColor =
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val sharedPreferences = this.getSharedPreferences("colors", Context.MODE_PRIVATE)
        val color = sharedPreferences.getInt("color_box_one", R.color.grey)
        box_one_text.setBackgroundColor(color)
        setColorButtonsAction()
        setBoxColor()
    }

    override fun onStop() {
        super.onStop()
        val sharedPreferences = this.getSharedPreferences("colors", Context.MODE_PRIVATE)
        val sharedPreferencesEditor = sharedPreferences.edit()
        sharedPreferencesEditor.putInt("color_box_one", boxOneColor)
        sharedPreferencesEditor.apply()
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

    fun saveBoxOneBackground(){

        val background = box_one_text.background
        /*
        * acessar a cor de fundo definida em uma caixa quando o app for finalixado
        * -sbrir o share preferences
        * salvar cor da caixa um
        * */
    }

    private fun setBoxColor(){
        box_one_text.setOnClickListener{
            it.setBackgroundResource(currentColor)
            boxOneColor = currentColor
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