package com.towntalk.domain;

import java.util.Date;

public class SayReplyVO {

	private Integer id;
	private Integer say_id;
	private String body;
	private Integer user_id;
	private Date created_at;
	private Date updated_at;
	private Date deleted_at;

	public Integer getRno() {
		return id;
	}

	public void setRno(Integer rno) {
		this.id = rno;
	}

	public Integer getSno() {
		return say_id;
	}

	public void setSno(Integer sno) {
		this.say_id = sno;
	}

	public String getReplytext() {
		return body;
	}

	public void setReplytext(String replytext) {
		this.body = replytext;
	}

	public Integer getReplyer() {
		return user_id;
	}

	public void setReplyer(Integer replyer) {
		this.user_id = replyer;
	}

	public Date getCreated_at() {
		return created_at;
	}

	public void setCreated_at(Date created_at) {
		this.created_at = created_at;
	}

	public Date getUpdated_at() {
		return updated_at;
	}

	public void setUpdated_at(Date updated_at) {
		this.updated_at = updated_at;
	}

	public Date getDeleted_at() {
		return deleted_at;
	}

	public void setDeleted_at(Date deleted_at) {
		this.deleted_at = deleted_at;
	}

	@Override
	public String toString() {
		return "SayReplyVO [rno=" + id + ", sno=" + say_id + ", replytext=" + body + ", replyer=" + user_id
				+ ", created_at=" + created_at + ", updated_at=" + updated_at + ", deleted_at=" + deleted_at + "]";
	}

}
