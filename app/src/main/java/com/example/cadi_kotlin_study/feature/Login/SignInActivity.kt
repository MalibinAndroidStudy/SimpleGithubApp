package com.example.cadi_kotlin_study.feature.login

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import com.example.cadi_kotlin_study.DB.LoginDB
import com.example.cadi_kotlin_study.MainActivity
import com.example.cadi_kotlin_study.R
import com.example.cadi_kotlin_study.databinding.ActivitySignInBinding
import kotlinx.android.synthetic.main.activity_sign_in.*

class SignInActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySignInBinding

    companion object {
        private const val REQUEST_CODE_LOGIN_ACTIVITY = 1000
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_sign_in)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_sign_in)

        autoLogin()
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (requestCode == REQUEST_CODE_LOGIN_ACTIVITY) {
            if (resultCode == Activity.RESULT_OK) {
                val id = data?.getStringExtra("Id")
                val pw = data?.getStringExtra("Pw")
                edtSignInId?.setText(id)
                edtSignInPw?.setText(pw)
            }
        }
    }

    private fun requestLogin(id: String, pw: String): Boolean {
        return true
    }

    private fun autoLogin() {
        val id = LoginDB.getUser(this)
        if (id.isNotEmpty()) {
            val intent = Intent(this, MainActivity::class.java)
            intent.putExtra("id", id)
            startActivity(intent)
        }
    }

    fun signUpClick() {
        val intent = Intent(this@SignInActivity, SignUpActivity::class.java)
        startActivityForResult(intent, REQUEST_CODE_LOGIN_ACTIVITY)
    }

    fun signInClick() {
        val id = binding.edtSignInId?.text.toString()
        val pw = binding.edtSignInPw?.text.toString()

        emptyCheckLogin(id, pw)

        userLogin(id, pw)
    }

    private fun emptyCheckLogin(id: String, pw: String) {
        if (id.isEmpty()) {
            Toast.makeText(this, "아이디를 입력해주세요.", Toast.LENGTH_SHORT).show()
        } else if (pw.isEmpty()) {
            Toast.makeText(this, "비밀번호를 입력해주세요.", Toast.LENGTH_SHORT).show()
        }
    }

    private fun userLogin(id: String, pw: String) {
        val response = requestLogin(id, pw)

        if (response) {
            LoginDB.setUser(this, id)
            val intent = Intent(this, MainActivity::class.java)
            intent.putExtra("id", id)
            startActivity(intent)
        }
        //TODO: else 사용xx 어떻게 처리?
        else {
            Toast.makeText(this, "로그인에 실패했습니다.", Toast.LENGTH_SHORT).show()
            edtSignInId?.requestFocus()
        }
    }
}
