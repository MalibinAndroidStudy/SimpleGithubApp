package com.example.cadi_kotlin_study.feature.Login

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.cadi_kotlin_study.R
import kotlinx.android.synthetic.main.activity_sign_up.*

class SignUpActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)

        // 회원가입완료 버튼 클릭
        btnSignUpSubmmit?.setOnClickListener {
            val name = edtSignUpName?.text.toString()
            val id = edtSignUpId?.text.toString()
            val pw = edtSignUpPw?.text.toString()
            val pwCk = edtSignUpPwCk?.text.toString()

            // 빈 곳 있는지 체크
            if (name.isEmpty() || id.isEmpty() || pw.isEmpty() || pwCk.isEmpty()) {
                Toast.makeText(this, "빈칸없이 모두 작성해주세요.", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            // 비밀번호와 비밀번호 확인이 일치하는지 체크
            if (pw != pwCk) {
                Toast.makeText(this, "비밀번호를 확인해주세요.", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            // 회원가입 요청
            val response = requestSignup(name, id, pw)

            // 회원가입 성공
            if (response) {

                val intent = Intent()
                // 회원가입 성공한 아이디 전달
                intent.putExtra("Id", id)
                intent.putExtra("Pw", pw)
                setResult(Activity.RESULT_OK,intent)
                finish()
            }
            else { // 회원가입 실패
                Toast.makeText(this, "회원가입에 실패했습니다.", Toast.LENGTH_SHORT).show()
            }
        }
    }

    private fun requestSignup(name: String, id: String, pw:String): Boolean {
        return true
    }
}
