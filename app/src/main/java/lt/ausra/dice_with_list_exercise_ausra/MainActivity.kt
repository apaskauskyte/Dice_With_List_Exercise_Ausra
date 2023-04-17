package lt.ausra.dice_with_list_exercise_ausra

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.core.view.isInvisible

class MainActivity : AppCompatActivity() {

    lateinit var firstDice: TextView
    lateinit var secondDice: TextView
    lateinit var thirdDice: TextView
    lateinit var fourthDice: TextView
    lateinit var fifthDice: TextView
    lateinit var sixthDice: TextView
    lateinit var seventhDice: TextView
    lateinit var eightDice: TextView

    lateinit var sumOfDice: TextView

    lateinit var rollDiceButton: Button
    lateinit var moreDiceButton: Button
    lateinit var lessDiceButton: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        firstDice = findViewById(R.id.firstDice)
        secondDice = findViewById(R.id.secondDice)
        thirdDice = findViewById(R.id.thirdDice)
        fourthDice = findViewById(R.id.fourthDice)
        fifthDice = findViewById(R.id.fifthDice)
        sixthDice = findViewById(R.id.sixthDice)
        seventhDice = findViewById(R.id.seventhDice)
        eightDice = findViewById(R.id.eightDice)

        sumOfDice = findViewById(R.id.sumOfDice)

        rollDiceButton = findViewById(R.id.rollDiceButton)
        moreDiceButton = findViewById(R.id.moreDiceButton)
        lessDiceButton = findViewById(R.id.lessDiceButton)

        seventhDice.visibility = View.GONE
        eightDice.visibility = View.GONE

        rollDiceButton.setOnClickListener {
            rollDice()
        }

        moreDiceButton.setOnClickListener {
            moreDice()
        }
    }

    private fun rollDice() {

        val diceValues = mutableListOf<Int>()
        var diceSum = 0
        val diceHighestValue = 6
        val diceTextViews = arrayOf(
            firstDice, secondDice, thirdDice, fourthDice, fifthDice, sixthDice, seventhDice, eightDice
        )
        for (i in 1 .. diceTextViews.size) {
            val diceRoll = (1..diceHighestValue).random()
            diceValues.add(diceRoll)
            diceTextViews[i - 1].text = diceValues[i - 1].toString()
            if (diceTextViews[i - 1].isShown) {
                diceSum += diceRoll
            }
        }
        sumOfDice.text = diceSum.toString()
    }
    private fun moreDice() {
        if (!seventhDice.isShown) {
            seventhDice.visibility = View.VISIBLE
        } else {
            eightDice.visibility = View.VISIBLE
        }
    }
}

