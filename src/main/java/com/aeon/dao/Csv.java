package com.aeon.dao;


import java.util.Date;

import org.springframework.data.cassandra.mapping.Column;
import org.springframework.data.cassandra.mapping.PrimaryKey;

import org.springframework.data.cassandra.mapping.Table;

@Table(value="csv1")
public class Csv {
     
	@PrimaryKey
	private String id;
	
	@Column(value="brand_id")
	private Integer brandId;
	
	@Column
	private String content;
	
	@Column(value="csv_row_count")
	private Integer csvRowCount;
	
	@Column(value="date_uploaded")
	private Date dateUploaded;
	
	@Column
	private Boolean deleted;
	
	@Column(value="file_name")
	private String fileName;
	
	@Column
	private String header;
	
	@Column(value="modified_by")
	private String modifiedBy;
	
	@Column(value="modified_date")
	private Date modifiedDate;
	
	@Column(value="title")
	private String title;
	
	@Column(value="uploaded_by")
	private String uploadedBy;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Integer getBrandId() {
		return brandId;
	}

	public void setBrandId(Integer brandId) {
		this.brandId = brandId;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Integer getCsvRowCount() {
		return csvRowCount;
	}

	public void setCsvRowCount(Integer csvRowCount) {
		this.csvRowCount = csvRowCount;
	}

	public Date getDateUploaded() {
		return dateUploaded;
	}

	public void setDateUploaded(Date dateUploaded) {
		this.dateUploaded = dateUploaded;
	}

	public Boolean getDeleted() {
		return deleted;
	}

	public void setDeleted(Boolean deleted) {
		this.deleted = deleted;
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public String getHeader() {
		return header;
	}

	public void setHeader(String header) {
		this.header = header;
	}

	public String getModifiedBy() {
		return modifiedBy;
	}

	public void setModifiedBy(String modifiedBy) {
		this.modifiedBy = modifiedBy;
	}

	public Date getModifiedDate() {
		return modifiedDate;
	}

	public void setModifiedDate(Date modifiedDate) {
		this.modifiedDate = modifiedDate;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getUploadedBy() {
		return uploadedBy;
	}

	public void setUploadedBy(String uploadedBy) {
		this.uploadedBy = uploadedBy;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((brandId == null) ? 0 : brandId.hashCode());
		result = prime * result + ((content == null) ? 0 : content.hashCode());
		result = prime * result + ((csvRowCount == null) ? 0 : csvRowCount.hashCode());
		result = prime * result + ((dateUploaded == null) ? 0 : dateUploaded.hashCode());
		result = prime * result + ((deleted == null) ? 0 : deleted.hashCode());
		result = prime * result + ((fileName == null) ? 0 : fileName.hashCode());
		result = prime * result + ((header == null) ? 0 : header.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((modifiedBy == null) ? 0 : modifiedBy.hashCode());
		result = prime * result + ((modifiedDate == null) ? 0 : modifiedDate.hashCode());
		result = prime * result + ((title == null) ? 0 : title.hashCode());
		result = prime * result + ((uploadedBy == null) ? 0 : uploadedBy.hashCode());
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
		if (csvRowCount == null) {
			if (other.csvRowCount != null)
				return false;
		} else if (!csvRowCount.equals(other.csvRowCount))
			return false;
		if (dateUploaded == null) {
			if (other.dateUploaded != null)
				return false;
		} else if (!dateUploaded.equals(other.dateUploaded))
			return false;
		if (deleted == null) {
			if (other.deleted != null)
				return false;
		} else if (!deleted.equals(other.deleted))
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
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (modifiedBy == null) {
			if (other.modifiedBy != null)
				return false;
		} else if (!modifiedBy.equals(other.modifiedBy))
			return false;
		if (modifiedDate == null) {
			if (other.modifiedDate != null)
				return false;
		} else if (!modifiedDate.equals(other.modifiedDate))
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
		return true;
	}

	public Csv(String id, Integer brandId, String content, Integer csvRowCount, Date dateUploaded, Boolean deleted,
			String fileName, String header, String modifiedBy, Date modifiedDate, String title, String uploadedBy) {
		super();
		this.id = id;
		this.brandId = brandId;
		this.content = content;
		this.csvRowCount = csvRowCount;
		this.dateUploaded = dateUploaded;
		this.deleted = deleted;
		this.fileName = fileName;
		this.header = header;
		this.modifiedBy = modifiedBy;
		this.modifiedDate = modifiedDate;
		this.title = title;
		this.uploadedBy = uploadedBy;
	}

	public Csv() {
		super();
		
	}

	@Override
	public String toString() {
		return "Csv [id=" + id + ", brandId=" + brandId + ", content=" + content + ", csvRowCount=" + csvRowCount
				+ ", dateUploaded=" + dateUploaded + ", deleted=" + deleted + ", fileName=" + fileName + ", header="
				+ header + ", modifiedBy=" + modifiedBy + ", modifiedDate=" + modifiedDate + ", title=" + title
				+ ", uploadedBy=" + uploadedBy + "]";
	}
	
	

	
}
