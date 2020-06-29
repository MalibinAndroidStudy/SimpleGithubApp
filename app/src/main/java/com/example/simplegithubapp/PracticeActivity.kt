package com.example.simplegithubapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.util.Log
import androidx.databinding.Observable
import androidx.databinding.ObservableField
import com.example.simplegithubapp.databinding.ActivityPracticeBinding

class PracticeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityPracticeBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val sampleData = SampleData()
        binding.sample = sampleData
        //Livedata 사용시 라이플싸이클도 넘겨줘야함
        binding.lifecycleOwner=this
        //이벤트는 계속 실행되고 있고, observable


        val handler=Handler()
        val worker=Thread{
            for(i in 1..20){
                handler.post {
                    sampleData.countUp()
                }
                Thread.sleep(1_000)
            }
        }
        worker.start()

        //메인에서 구독할거야
        //겂이 바뀌면
        sampleData.count.addOnPropertyChangedCallback(object : Observable.OnPropertyChangedCallback(){
            override fun onPropertyChanged(sender: Observable?, propertyId: Int) {
                sender as ObservableField<Int>
                Log.e("dfsd","fdfs:${sender.get()}")
            }

        })



    }
}