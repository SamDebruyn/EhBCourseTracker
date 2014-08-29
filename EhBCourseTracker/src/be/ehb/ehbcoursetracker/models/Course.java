package be.ehb.ehbcoursetracker.models;

import java.util.Date;

import android.text.format.Time;

public class Course {
	
	private int mID;
	private String mCourse;
	private String mLocation;
	private Date mDate;
	private Time mLessonStart;
	private Time mLessonEnd;
	
	/**
	 * Getters & Setters
	 */
	
	public int getmID() {
		return mID;
	}
	public void setmID(int mID) {
		this.mID = mID;
	}
	
	public String getmCourse() {
		return mCourse;
	}
	public void setmCourse(String mCourse) {
		this.mCourse = mCourse;
	}
	
	public String getmLocation() {
		return mLocation;
	}
	public void setmLocation(String mLocation) {
		this.mLocation = mLocation;
	}
	
	public Date getmDate() {
		return mDate;
	}
	public void setmDate(Date mDate) {
		this.mDate = mDate;
	}
	
	public Time getmLessonStart() {
		return mLessonStart;
	}
	public void setmLessonStart(Time mLessonStart) {
		this.mLessonStart = mLessonStart;
	}
	
	public Time getmLessonEnd() {
		return mLessonEnd;
	}
	public void setmLessonEnd(Time mLessonEnd) {
		this.mLessonEnd = mLessonEnd;
	}
	
	
}
