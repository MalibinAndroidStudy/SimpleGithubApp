package com.example.cadi_kotlin_study.feature.Login

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import com.example.cadi_kotlin_study.R
import com.example.cadi_kotlin_study.databinding.ActivitySignUpBinding
import kotlinx.android.synthetic.main.activity_sign_up.*

class SignUpActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySignUpBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_sign_up)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_sign_up)
    }

    private fun requestSignup(name: String, id: String, pw:String): Boolean {
        return true
    }

    fun submmitClick(){
        val name = binding.edtSignUpName?.text.toString()
        val id = binding.edtSignUpId?.text.toString()
        val pw = binding.edtSignUpPw?.text.toString()
        val pwCk = binding.edtSignUpPwCk?.text.toString()

        emptyCheckInfo(name,id, pw, pwCk)

        signUp(name,id,pw)
    }

    private fun emptyCheckInfo(name: String,id: String,pw: String,pwCk:String){
        if (name.isEmpty() || id.isEmpty() || pw.isEmpty() || pwCk.isEmpty()) {
            Toast.makeText(this, "빈칸없이 모두 작성해주세요.", Toast.LENGTH_SHORT).show()
        }

        if (pw != pwCk) {
            Toast.makeText(this, "비밀번호를 확인해주세요.", Toast.LENGTH_SHORT).show()
        }
    }

    private fun signUp(name: String,id: String,pw: String){
        val response = requestSignup(name, id, pw)

        if (response) {
            val intent = Intent()
            // 회원가입 성공한 아이디 전달
            intent.putExtra("Id", id)
            intent.putExtra("Pw", pw)
            setResult(Activity.RESULT_OK,intent)
            finish()
        }
        // TODO: else 사용xx 어떻게 처리?
        else {
            Toast.makeText(this, "회원가입에 실패했습니다.", Toast.LENGTH_SHORT).show()
        }
    }
}
