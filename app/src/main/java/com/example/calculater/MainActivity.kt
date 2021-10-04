package com.example.calculater

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    var isNewOp=true
    var OldNum=""
    var Op="+"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    val bt1=findViewById<Button>(R.id.bt1)
    val bt2 =findViewById<Button>(R.id.bt2)
    val bt3 =findViewById<Button>(R.id.bt3)
    val bt4 =findViewById<Button>(R.id.bt4)
    val bt5 =findViewById<Button>(R.id.bt5)
    val bt6 =findViewById<Button>(R.id.bt6)
    val bt7 =findViewById<Button>(R.id.bt7)
    val bt8 =findViewById<Button>(R.id.bt8)
    val bt9 =findViewById<Button>(R.id.bt9)
    val bt0=findViewById<Button>(R.id.bt0)

    val btPls=findViewById<Button>(R.id.btPls)
    val btMinus=findViewById<Button>(R.id.btMinus)
    val btPN=findViewById<Button>(R.id.btPN)
    val btDot=findViewById<Button>(R.id.btDot)
    val btDiv=findViewById<Button>(R.id.btDiv)
    val btMult=findViewById<Button>(R.id.btMulti)

var etCalc=findViewById<EditText>(R.id.etCalc)
    fun NumberEvent(view: View) {
        var numSelect:String=etCalc.text.toString()
        var btSelect: Button =view as Button
        when(btSelect.id){
            bt1.id->numSelect+="1"
            bt2.id->numSelect+="2"
            bt3.id->numSelect+="3"
            bt4.id->numSelect+="4"
            bt5.id->numSelect+="5"
            bt6.id->numSelect+="6"
            bt7.id->numSelect+="7"
            bt8.id->numSelect+="8"
            bt9.id->numSelect+="9"
            bt0.id->numSelect+="0"

            btDot.id->numSelect+="."
            btPN.id->numSelect="-$numSelect"
        }
        etCalc.setText(numSelect)

    }

    fun OprtarotEvent(view: View) {
        isNewOp=true
        OldNum=etCalc.text.toString()
        var btSelect:Button=view as Button
        when(btSelect.id){

            btPls.id->Op="+"
            btMinus.id->Op="-"
            btDiv.id->Op="/"
            btMult.id->Op="*"
        }
    }

    fun EqualEvent(view: View) {
        var NewNum :String=etCalc.text.toString()
        var result=0.0
        when(Op){
            "+"->{result=OldNum.toDouble()+NewNum.toDouble()}
            "-"->{result=OldNum.toDouble()-NewNum.toDouble()}
            "/"->{result=OldNum.toDouble()/NewNum.toDouble()}
            "*"->{result=OldNum.toDouble()*NewNum.toDouble()}
        }
        etCalc.setText(result.toString())
    }

}