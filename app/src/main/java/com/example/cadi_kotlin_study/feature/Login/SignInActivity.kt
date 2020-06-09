package com.example.cadi_kotlin_study.feature.Login

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.cadi_kotlin_study.DB.Login
import com.example.cadi_kotlin_study.R
import com.example.cadi_kotlin_study.feature.follower_list.FollowerListActivity
import kotlinx.android.synthetic.main.activity_sign_in.*

class SignInActivity : AppCompatActivity() {

    val REQUEST_CODE_LOGIN_ACTIVITY =1000

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_in)

        // 자동로그인
        val id = Login.getUser(this)
        if(id.isNotEmpty()){
            val intent = Intent(this, FollowerListActivity::class.java)
            // id 함께 전달
            intent.putExtra("id", id)
            startActivity(intent)
        }

        // 회원가입버튼 클릭
        btnSignUp?.setOnClickListener(
            object : View.OnClickListener {
                override fun onClick(view : View?) {
                    // 회원가입 페이지로 이동
                    val intent = Intent(this@SignInActivity, SignUpActivity::class.java)
                    startActivityForResult(intent,REQUEST_CODE_LOGIN_ACTIVITY)
                }
            }
        )

        // 로그인버튼 클릭
        btnSignIn?.setOnClickListener {
            val id = edtSignInId?.text.toString()
            val pw = edtSignInPw?.text.toString()

            // ID와 PW 비었는지 검사
            if (id.isEmpty()) {
                Toast.makeText(this, "아이디를 입력해주세요.", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }
            else if(pw.isEmpty()){
                Toast.makeText(this, "비밀번호를 입력해주세요.", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            // 로그인 요청
            val response = requestLogin(id, pw)

            // 로그인 성공
            if (response) {
                // 로그인 정보 저장
                Login.setUser(this,id)
                // 팔로워 페이지로 이동
                val intent = Intent(this, FollowerListActivity::class.java)
                // id 함께 전달
                intent.putExtra("id", id)
                startActivity(intent)
            }
            else { // 로그인 실패
                Toast.makeText(this, "로그인에 실패했습니다.", Toast.LENGTH_SHORT).show()
                edtSignInId?.requestFocus()
            }
        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if(requestCode==REQUEST_CODE_LOGIN_ACTIVITY){
            if(resultCode== Activity.RESULT_OK){
                val id=data!!.getStringExtra("Id")
                val pw=data!!.getStringExtra("Pw")
                edtSignInId?.setText(id)
                edtSignInPw?.setText(pw)
            }
        }
    }

    private fun requestLogin(id: String, pw: String): Boolean {
        return true
    }
}
