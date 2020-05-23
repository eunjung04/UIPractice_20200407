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

            Toast.makeText(this, "로그인 버튼 눌림", Toast.LENGTH_SHORT).show()

        }

        loginButton.setOnClickListener {

            Log.d("로그인버튼", "버튼을 길게 누름")
            return@setOnClickListener false

            //return@힘수이름=>해당함수의 결과로 설정 명시.
            //return true : 롱클릭만전용처리. false : 일반클릭도 같이 실행.

        }


    }
}
