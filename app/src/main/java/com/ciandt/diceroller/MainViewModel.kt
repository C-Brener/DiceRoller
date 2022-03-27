package com.ciandt.diceroller

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import java.util.*

class MainViewModel : ViewModel() {
    var drawableSet = MutableLiveData<Int>()

    init {
        drawableSet.value = R.drawable.empty_dice
    }

    fun rollDice() {
        when (Random().nextInt(6) + 1.toString().toInt()) {
            1 -> drawableSet.value = R.drawable.dice_1
            2 -> drawableSet.value  = R.drawable.dice_2
            3 -> drawableSet.value  =  R.drawable.dice_3
            4 -> drawableSet.value  =  R.drawable.dice_4
            5 -> drawableSet.value  =  R.drawable.dice_5
            else -> drawableSet.value  =  R.drawable.dice_6
        }
    }
}