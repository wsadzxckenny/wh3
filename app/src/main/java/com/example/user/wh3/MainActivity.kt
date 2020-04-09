package com.example.user.wh3

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var ans:String ="1234"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button.setOnClickListener{
            textView.setText(editText.text)
            var inputStr =editText.text.toString();

            var nA = 0
            var nB = 0
            for (i in 0..3) {
                for (j in 0..3) {
                    var c = ans.get(i)
                    var d = inputStr.get(j)
                    if (ans.get(i) == inputStr.get(j)) {
                        if (i == j)
                            nA++
                        else
                            nB++

                    }

                }
            }

            var ret : String =nA.toString() + "A"+ nB.toString()+ "B"
            textView.setText(ret)

        }
    }

}
