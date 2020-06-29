package com.example.cadi_kotlin_study.data.repository

class DummyRepo {
    companion object{
        fun getRepoList() : List<RepoItem>{
            return listOf(
                RepoItem(
                    title = "SoptStagram",
                    desc = "IT 창업 동아리 SOPT 안드로이드 교육 프로젝트",
                    language = "Kotlin",
                    color = 0
                ),
                RepoItem(
                    title = "artic_android",
                    desc = "Forked from artic_development/artic_android",
                    language = "Kotlin",
                    color = 0
                ),
                RepoItem(
                    title = "CalculatorWithEspresso",
                    desc = "UI Test with Espresso + Unit Test Calculator",
                    language = "Kotlin",
                    color = 0
                ),
                RepoItem(
                    title = "problemSovingGuZongMan",
                    desc = "프로그래밍 대회에서 배우는 알고리즘 문제해결전략 공부하자",
                    language = "Java",
                    color = 1
                ),
                RepoItem(
                    title = "SoptStagram",
                    desc = "IT 창업 동아리 SOPT 안드로이드 교육 프로젝트",
                    language = "Kotlin",
                    color = 0
                ),
                RepoItem(
                    title = "artic_android",
                    desc = "Forked from artic_development/artic_android",
                    language = "Kotlin",
                    color = 0
                ),
                RepoItem(
                    title = "CalculatorWithEspresso",
                    desc = "UI Test with Espresso + Unit Test Calculator",
                    language = "Kotlin",
                    color = 0
                )
            )
        }
    }
}