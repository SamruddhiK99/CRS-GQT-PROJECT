/**
 * 
 */
package com.gqt.crs.entity;

/**
 * @author Samruddhi
 */
public class Course {
	private int course_id;
	private String course_name;
	private int course_dur;
	private int course_fees;
	/**
	 * @param course_id
	 * @param course_name
	 * @param course_dur
	 * @param course_fees
	 */
	public Course(int course_id, String course_name, int course_dur, int course_fees) {
		super();
		this.course_id = course_id;
		this.course_name = course_name;
		this.course_dur = course_dur;
		this.course_fees = course_fees;
	}
	/**
	 * @return the course_id
	 */
	public int getCourse_id() {
		return course_id;
	}
	/**
	 * @param course_id the course_id to set
	 */
	public void setCourse_id(int course_id) {
		this.course_id = course_id;
	}
	/**
	 * @return the course_name
	 */
	public String getCourse_name() {
		return course_name;
	}
	/**
	 * @param course_name the course_name to set
	 */
	public void setCourse_name(String course_name) {
		this.course_name = course_name;
	}
	/**
	 * @return the course_dur
	 */
	public int getCourse_dur() {
		return course_dur;
	}
	/**
	 * @param course_dur the course_dur to set
	 */
	public void setCourse_dur(int course_dur) {
		this.course_dur = course_dur;
	}
	/**
	 * @return the course_fees
	 */
	public int getCourse_fees() {
		return course_fees;
	}
	/**
	 * @param course_fees the course_fees to set
	 */
	public void setCourse_fees(int course_fees) {
		this.course_fees = course_fees;
	}
	

}
