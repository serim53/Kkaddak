package com.ssafy.kkaddak.data.remote.datasource.profile

import com.google.gson.annotations.SerializedName
import com.ssafy.kkaddak.data.remote.datasource.base.DataToDomainMapper
import com.ssafy.kkaddak.domain.entity.profile.ProfileItem

data class ProfileResponse(
    @SerializedName("memberId")
    val memberId: String,
    @SerializedName("nickname")
    val nickname: String,
    @SerializedName("profilepath")
    val profilepath: String?,
    @SerializedName("account")
    val account: String?,
    @SerializedName("myFollowers")
    val myFollowers: Int,
    @SerializedName("myFollowings")
    val myFollowings: Int,
    @SerializedName("mySongs")
    val mySongs: Int,
    @SerializedName("isMine")
    val isMine: Boolean,
    @SerializedName("isFollowing")
    val isFollowing: Boolean?
) : DataToDomainMapper<ProfileItem> {
    override fun toDomainModel(): ProfileItem =
        ProfileItem(
            memberId,
            nickname,
            profilepath,
            account,
            myFollowers,
            myFollowings,
            mySongs,
            isMine,
            isFollowing
        )
}