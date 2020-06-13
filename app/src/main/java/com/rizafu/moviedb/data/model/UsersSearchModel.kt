package com.rizafu.moviedb.data.model

import com.squareup.moshi.Json
import se.ansman.kotshi.JsonSerializable

@JsonSerializable
data class UsersSearchModel(
    val incomplete_results: Boolean = false,
    val items: List<UserModel> = listOf(),
    @Json(name = "total_count") val totalCount: Int = 0
)

@JsonSerializable
data class UserModel(
    val id: Int = -1,
    val login: String = "",
    val score: Double = 0.0,
    val type: String = "",
    val url: String = "",
    @Json(name = "avatar_url") val avatarUrl: String = "",
    @Json(name = "events_url") val eventsUrl: String = "",
    @Json(name = "followers_url") val followersUrl: String = "",
    @Json(name = "following_url") val followingUrl: String = "",
    @Json(name = "gists_url") val gistsUrl: String = "",
    @Json(name = "gravatar_id") val gravatarId: String = "",
    @Json(name = "html_url") val htmlUrl: String = "",
    @Json(name = "node_id") val nodeId: String = "",
    @Json(name = "organizations_url") val organizationsUrl: String = "",
    @Json(name = "received_events_url") val receivedEventsUrl: String = "",
    @Json(name = "repos_url") val reposUrl: String = "",
    @Json(name = "site_admin") val siteAdmin: Boolean = false,
    @Json(name = "starred_url") val starredUrl: String = "",
    @Json(name = "subscriptions_url") val subscriptionsUrl: String = ""
)