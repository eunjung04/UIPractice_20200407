package com.example.uipractice_20200407

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        loginButton.setOnClickListener {

            Log.d("로그인버튼", "버튼 클릭됨")

            //로그인버튼이 눌리면 할 일 지정.

            val inputEmail=emailEdt.text.toString()

            //입력한 아이디는 ?입니다.
            val formattedStr="입력한 아이디는 ${inputEmail}입니다."
            Toast.makeText(this, formattedStr, Toast.LENGTH_SHORT).show()

        }

        loginButton.setOnLongClickListener {

            Log.d("로그인버튼", "버튼을 길게 누름")
            return@setOnLongClickListener false

            //return@힘수이름=>해당함수의 결과로 설정 명시.
            //return true : 롱클릭만전용처리. false : 일반클릭도 같이 실행.

        }


    }
}
