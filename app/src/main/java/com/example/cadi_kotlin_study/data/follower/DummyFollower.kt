package com.example.cadi_kotlin_study.data.follower

class DummyFollower {
    companion object{
        fun getUser() : List<FollowerItem> {
            return listOf(
                FollowerItem(
                    ImageUrl = "",
                    id = "Myid",
                    name = "Myeong Hui Cheon"
                )
            )
        }

        fun getFollowerList() : List<FollowerItem>{
            return listOf(
                FollowerItem(
                    ImageUrl = "",
                    id = "Myid",
                    name = "Myeong Hui Cheon"
                ),
                FollowerItem(
                    ImageUrl = "",
                    id = "Myid",
                    name = "Myeong Hui Cheon"
                ),
                FollowerItem(
                    ImageUrl = "",
                    id = "Myid",
                    name = "Myeong Hui Cheon"
                ),
                FollowerItem(
                    ImageUrl = "",
                    id = "Myid",
                    name = "Myeong Hui Cheon"
                ),
                FollowerItem(
                    ImageUrl = "",
                    id = "Myid",
                    name = "Myeong Hui Cheon"
                ),
                FollowerItem(
                    ImageUrl = "",
                    id = "Myid",
                    name = "Myeong Hui Cheon"
                )
            )
        }
    }
}