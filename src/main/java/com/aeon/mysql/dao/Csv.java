package com.aeon.mysql.dao;

import java.sql.Timestamp;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;



@Entity
public class Csv {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int csvId;
	@Column
	private String content;
	@Column(name="dateuploaded")
	private Date dateUploaded;
	public int getCsvId() {
		return csvId;
	}
	public void setCsvId(int csvId) {
		this.csvId = csvId;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Date getDateUploaded() {
		return dateUploaded;
	}
	public void setDateUploaded(Date dateUploaded) {
		this.dateUploaded = dateUploaded;
	}
	public Csv() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Csv(String content, Timestamp dateUploaded) {
		super();
		this.content = content;
		this.dateUploaded = dateUploaded;
	}
	public Csv(int csvId, String content, Date dateUploaded) {
		super();
		this.csvId = csvId;
		this.content = content;
		this.dateUploaded = dateUploaded;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((content == null) ? 0 : content.hashCode());
		result = prime * result + csvId;
		result = prime * result + ((dateUploaded == null) ? 0 : dateUploaded.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Csv other = (Csv) obj;
		if (content == null) {
			if (other.content != null)
				return false;
		} else if (!content.equals(other.content))
			return false;
		if (csvId != other.csvId)
			return false;
		if (dateUploaded == null) {
			if (other.dateUploaded != null)
				return false;
		} else if (!dateUploaded.equals(other.dateUploaded))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Csv [csvId=" + csvId + ", content=" + content + ", dateUploaded=" + dateUploaded + "]";
	}
		
}
