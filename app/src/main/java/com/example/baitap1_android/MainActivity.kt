package com.example.baitap1_android

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var a: Double = 0.0
        var b: Double = 0.0
        var c: Double = 0.0
        var caseNumber = 0
        btn_0.setOnClickListener {
            txt_text.append("0")
        }
        btn_1.setOnClickListener {
            txt_text.append("1")
        }
        btn_2.setOnClickListener {
            txt_text.append("2")
        }
        btn_3.setOnClickListener {
            txt_text.append("3")
        }
        btn_4.setOnClickListener {
            txt_text.append("4")
        }
        btn_5.setOnClickListener {
            txt_text.append("5")
        }
        btn_6.setOnClickListener {
            txt_text.append("6")
        }
        btn_7.setOnClickListener {
            txt_text.append("7")
        }
        btn_8.setOnClickListener {
            txt_text.append("8")
        }
        btn_9.setOnClickListener {
            txt_text.append("9")
        }
        btn_cong.setOnClickListener {
            a = bienA(txt_text.text.toString())
            caseNumber = 1
            txt_text.text = ""
        }
        btn_tru.setOnClickListener {
            if (txt_text.text.isEmpty()) {
                txt_text.append("-")
            } else {
                a = bienA(txt_text.text.toString())
                caseNumber = 2
                txt_text.text = ""
            }
        }
        btn_nhan.setOnClickListener {
            a = bienA(txt_text.text.toString())
            caseNumber = 3
            txt_text.text = ""
        }
        btn_chia.setOnClickListener {
            a = bienA(txt_text.text.toString())
            caseNumber = 4
            txt_text.text = ""
        }
        btn_bang.setOnClickListener {
            b = bienA(txt_text.text.toString())
            if (caseNumber == 1) {
                c = a + b
            } else if (caseNumber == 2) {
                c = a - b
            } else if (caseNumber == 3) {
                c = a * b
            } else if (caseNumber == 4) {
                c = a / b
            }
            txt_text.text = "$c"
            println("--------------------$a")
            println("----------------------$b")
            println("----------------$c")
        }
        btn_cham.setOnClickListener {

            if (txt_text.text.contains(".")) {
                txt_text.append("")
            } else {
                txt_text.append(".")
            }
        }
        btn_c.setOnClickListener {
            txt_text.text = ""
        }
        btn_del.setOnClickListener {

        }
        println(txt_text)
    }

    private fun bienA(sa: String): Double {
        var a = sa.toDouble()
        return a
    }
}
