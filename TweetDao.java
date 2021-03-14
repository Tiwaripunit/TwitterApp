package com.tweetapp.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.tweetapp.CP;

public class TweetDao {


	public static boolean insertInDb(String messages, String userId) {
		boolean f = false;
		try {
			Connection con = CP.create();
			String q = "insert into tweet(messages, userId) values(?,?)";
			// Prepared Statement
			PreparedStatement pstmt = con.prepareStatement(q);
			// set the value of parameters
			pstmt.setString(1, messages);
			pstmt.setString(2, userId);

			// execute
			pstmt.executeUpdate();
			f = true;
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return f;// TODO Auto-generated method stub
	}

	public static void showAllTweets() {
		try {
			ResultSet resultSet = null;
			Connection con = CP.create();
			String q = "select * from tweet";
			// Prepared Statement
			PreparedStatement pstmt = con.prepareStatement(q);
			// set the value of parameters
			resultSet = pstmt.executeQuery();
			System.out.println("\ttweetId\t=====Messages=====\tUserid");
			System.out.println("\t\t\t");

			while (resultSet.next()) {
				System.out.println("\t"+ resultSet.getInt(1) + "\t\t" + resultSet.getString(2) + "\t" + resultSet.getInt(3));
			}

		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

}
