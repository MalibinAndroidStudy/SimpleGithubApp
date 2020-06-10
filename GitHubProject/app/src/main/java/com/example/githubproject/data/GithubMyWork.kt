package com.example.githubproject.data

data class GithubMyWork (
    val profile: String,
    val name: String
){
    companion object {
        val MyworkSubdata = GithubMyWork(
            name = "pci2676",
            profile = "https://avatars0.githubusercontent.com/u/13347548?v=4"
        )

        val MyworkSubdatas = listOf(
            MyworkSubdata,
            GithubMyWork(
                name = "Livenow14",
                profile = "https://avatars0.githubusercontent.com/u/48986787?v=4"
            )
        )

    }
}
