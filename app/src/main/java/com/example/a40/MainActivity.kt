package com.example.a40

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        class Solution {
            fun solution(n: Int): Int {
                var answer: Int = 0
                var intBy3 = n.toString(3)
                intBy3 = intBy3.reversed()
                answer = intBy3.toInt(3)
                return answer
            }
        }
        val a = Solution()
        a.solution(45)
        a.solution(125)
    }
}