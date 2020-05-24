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

            //입력한 아이디 admin@tje.com이면, 관리자 입니다. 토스트
            //student이면, 학생입니다.
            //parent이면, 학부모입니다.
            //teacher이면, 선생님입니다.
            //그 외에는 입력한 아이디는 ?입니다.

            when(inputEmail){
                "admin@tje.com"->{Toast.makeText(this, "관리자입니다.", Toast.LENGTH_SHORT).show()}
                "student"->{Toast.makeText(this, "학생입니다.", Toast.LENGTH_SHORT).show()}
                "parent"->{Toast.makeText(this, "학부모입니다.", Toast.LENGTH_SHORT).show()}
                "teacher"->{Toast.makeText(this, "선생님입니다.", Toast.LENGTH_SHORT).show()}
                else->{
                    val formattedMsg="입력한 아이디는 ${inputEmail}입니다."
                    Toast.makeText(this, formattedMsg, Toast.LENGTH_SHORT).show()
                }
            }

            if(inputEmail=="admin@tje.com"){
                Toast.makeText(this, "관리자입니다.", Toast.LENGTH_SHORT).show()
            }
            else{
                val formattedStr="입력한 아이디는 ${inputEmail}입니다."

                Toast.makeText(this, formattedStr, Toast.LENGTH_SHORT).show()
            }


        }

        loginButton.setOnLongClickListener {

            //로그로 0부터 5까지의 숫자를 출력
            for (i in 0..5){
                Log.d("for문연습", "${i}")
            }

            Log.d("로그인버튼", "버튼을 길게 누름")
            return@setOnLongClickListener false

            //return@힘수이름=>해당함수의 결과로 설정 명시.
            //return true : 롱클릭만전용처리. false : 일반클릭도 같이 실행.

        }


    }
}
