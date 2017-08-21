package com.aeon.dao;

import java.sql.Timestamp;
import java.util.Date;

import org.springframework.data.cassandra.mapping.Column;
import org.springframework.data.cassandra.mapping.PrimaryKey;

import org.springframework.data.cassandra.mapping.Table;

@Table(value="csv")
public class Csv {
     
	@PrimaryKey
	private String csvId;
	@Column
	private String content;
	@Column
	private Date dateUploaded;
	public String getCsvId() {
		return csvId;
	}
	public void setCsvId(String csvId) {
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
	public Csv(String csvId, String content, Timestamp dateUploaded) {
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
		result = prime * result + ((csvId == null) ? 0 : csvId.hashCode());
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
		if (csvId == null) {
			if (other.csvId != null)
				return false;
		} else if (!csvId.equals(other.csvId))
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
