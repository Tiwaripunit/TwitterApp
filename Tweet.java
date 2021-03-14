package com.tweetapp;

public class Tweet {

	private String tweetId;
	private String messages;
	private String userId;

	public Tweet(String tweetId, String messages, String userId) {
		super();
		this.tweetId = tweetId;
		this.messages = messages;
		this.userId = userId;
	}

	public Tweet(String messages, String userId) {
		super();
		this.messages = messages;
		this.userId = userId;
	}

	public String getTweetId() {
		return tweetId;
	}

	public void setTweetId(String tweetId) {
		this.tweetId = tweetId;
	}

	public String getMessages() {
		return messages;
	}

	public void setMessages(String messages) {
		this.messages = messages;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	@Override
	public String toString() {
		return "Tweet [tweetId=" + tweetId + ", messages=" + messages + ", userId=" + userId + "]";
	}

}
