package org.sopt.dosopttemplate.data

sealed class FriendSealed {

    data class MyProfile(
        val name: String,
        val profileImage: Int,
    ) : FriendSealed()

    data class FriendProfile(
        val name: String,
        val self_description: String?,
        val profileImage: Int,
    ) : FriendSealed()

    data class FriendMusic(
        val name: String,
        val self_description: String?,
        val profileImage: Int,
    ) : FriendSealed()



}