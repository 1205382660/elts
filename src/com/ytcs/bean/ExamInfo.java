package com.ytcs.bean;

import java.io.Serializable;

import android.R.style;

public class ExamInfo implements Serializable{
	/*"course":"android",
	 "total":20,
	 "time":10,
	 "question":"android.json"
	 */
	private String course,question;
	private int total,time,userid;
	private User user;
	ExamInfo(String course,int total,int time,String question,User user){
		this.course=course;
		this.total=total;
		this.time=time;
		this.question=question;
		this.user=user;
	}
	ExamInfo(){
		
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public int getTime() {
		return time;
	}
	public void setTime(int time) {
		this.time = time;
	}
	
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	@Override
	public String toString() {
		userid=1001;
		if (user!=null){
		userid=user.getId();
		}
		return "考试科目："+course+"\t考生编号："+userid+"\n考题数目："+total+"\t考试时间："+time;
	}public static void main(){
		Question q=new Question();
		System.out.println("......");
	}
	
}

