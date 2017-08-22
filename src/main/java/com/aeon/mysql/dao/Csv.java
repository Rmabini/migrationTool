package com.aeon.mysql.dao;


import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name="csv")
public class Csv {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
    
	@Column(name="header")
	private String header;
	
	@Column(name="uploadedby")
	private String uploadedBy;
	
	@Column(name="filename")
	private String fileName;
	
	@Column(name="brandid")
	private Integer brandId;
	
	@Column(name="version")
	private Integer version;
	
	@Column(name="content")
	private String content;
	
	@Column(name = "dateuploaded")
	private Date dateUploaded;
    @Column(name="title")
	private String title;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getHeader() {
		return header;
	}
	public void setHeader(String header) {
		this.header = header;
	}
	public String getUploadedBy() {
		return uploadedBy;
	}
	public void setUploadedBy(String uploadedBy) {
		this.uploadedBy = uploadedBy;
	}
	public String getFileName() {
		return fileName;
	}
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	public Integer getBrandId() {
		return brandId;
	}
	public void setBrandId(Integer brandId) {
		this.brandId = brandId;
	}
	public Integer getVersion() {
		return version;
	}
	public void setVersion(Integer version) {
		this.version = version;
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
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Csv(int id, String header, String uploadedBy, String fileName, Integer brandId, Integer version,
			String content, Date dateUploaded, String title) {
		super();
		this.id = id;
		this.header = header;
		this.uploadedBy = uploadedBy;
		this.fileName = fileName;
		this.brandId = brandId;
		this.version = version;
		this.content = content;
		this.dateUploaded = dateUploaded;
		this.title = title;
	}
	public Csv() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((brandId == null) ? 0 : brandId.hashCode());
		result = prime * result + ((content == null) ? 0 : content.hashCode());
		result = prime * result + ((dateUploaded == null) ? 0 : dateUploaded.hashCode());
		result = prime * result + ((fileName == null) ? 0 : fileName.hashCode());
		result = prime * result + ((header == null) ? 0 : header.hashCode());
		result = prime * result + id;
		result = prime * result + ((title == null) ? 0 : title.hashCode());
		result = prime * result + ((uploadedBy == null) ? 0 : uploadedBy.hashCode());
		result = prime * result + ((version == null) ? 0 : version.hashCode());
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
		if (brandId == null) {
			if (other.brandId != null)
				return false;
		} else if (!brandId.equals(other.brandId))
			return false;
		if (content == null) {
			if (other.content != null)
				return false;
		} else if (!content.equals(other.content))
			return false;
		if (dateUploaded == null) {
			if (other.dateUploaded != null)
				return false;
		} else if (!dateUploaded.equals(other.dateUploaded))
			return false;
		if (fileName == null) {
			if (other.fileName != null)
				return false;
		} else if (!fileName.equals(other.fileName))
			return false;
		if (header == null) {
			if (other.header != null)
				return false;
		} else if (!header.equals(other.header))
			return false;
		if (id != other.id)
			return false;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		if (uploadedBy == null) {
			if (other.uploadedBy != null)
				return false;
		} else if (!uploadedBy.equals(other.uploadedBy))
			return false;
		if (version == null) {
			if (other.version != null)
				return false;
		} else if (!version.equals(other.version))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Csv [id=" + id + ", header=" + header + ", uploadedBy=" + uploadedBy + ", fileName=" + fileName
				+ ", brandId=" + brandId + ", version=" + version + ", content=" + content + ", dateUploaded="
				+ dateUploaded + ", title=" + title + "]";
	}
    
    
}
