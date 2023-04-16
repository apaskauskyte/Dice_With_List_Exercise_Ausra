package lt.ausra.dice_with_list_exercise_ausra

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
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
    lateinit var sumOfDice: TextView
    lateinit var rollDiceButton: Button
    lateinit var moreDiceButton: Button
    lateinit var lessDiceButton: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rollDiceButton = findViewById(R.id.rollDiceButton)
        moreDiceButton = findViewById(R.id.moreDiceButton)
        lessDiceButton = findViewById(R.id.lessDiceButton)
        firstDice = findViewById(R.id.firstDice)
        secondDice = findViewById(R.id.secondDice)
        thirdDice = findViewById(R.id.thirdDice)
        fourthDice = findViewById(R.id.fourthDice)
        fifthDice = findViewById(R.id.fifthDice)
        sixthDice = findViewById(R.id.sixthDice)
        sumOfDice = findViewById(R.id.sumOfDice)

        rollDiceButton.setOnClickListener {
            rollDice()
        }
    }

    private fun rollDice() {

        val diceValuesList = mutableListOf<Int>()
        var diceSum = 0

        for (i in 1..6) {
            val diceRoll = (1..6).random()
            diceValuesList.add(diceRoll)
            diceSum += diceRoll
        }

        firstDice.text = diceValuesList[0].toString()
        secondDice.text = diceValuesList[1].toString()
        thirdDice.text = diceValuesList[2].toString()
        fourthDice.text = diceValuesList[3].toString()
        fifthDice.text = diceValuesList[4].toString()
        sixthDice.text = diceValuesList[5].toString()
        sumOfDice.text = diceSum.toString()
    }

}

