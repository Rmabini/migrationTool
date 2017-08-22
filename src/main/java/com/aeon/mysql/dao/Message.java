package com.aeon.mysql.dao;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name="message")
public class Message {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column
    private String title;
    
	@Column
    private String status;
    
	@Column
    private String messageen;
    
	@Column
    private String messagesc;
    
	@Column
    private Date scheduledatetimefrom;
    
	@Column
    private Date scheduledatetimeto;
    
	@Column
    private Integer noofdays;
	
	@Column
	private Date  creationdate;
    
	@Column
	private String createdby;
    
	@Column
    private String lastupdatedby;
    
	@Column
    private Date lastupdateddatetime;
    
	@Column
    private Integer csvid;
    
	@Column
    private Integer brandid;
    
	@Column
    private Integer version;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getMessageen() {
		return messageen;
	}

	public void setMessageen(String messageen) {
		this.messageen = messageen;
	}

	public String getMessagesc() {
		return messagesc;
	}

	public void setMessagesc(String messagesc) {
		this.messagesc = messagesc;
	}

	public Date getScheduledatetimefrom() {
		return scheduledatetimefrom;
	}

	public void setScheduledatetimefrom(Date scheduledatetimefrom) {
		this.scheduledatetimefrom = scheduledatetimefrom;
	}

	public Date getScheduledatetimeto() {
		return scheduledatetimeto;
	}

	public void setScheduledatetimeto(Date scheduledatetimeto) {
		this.scheduledatetimeto = scheduledatetimeto;
	}

	public Integer getNoofdays() {
		return noofdays;
	}

	public void setNoofdays(Integer noofdays) {
		this.noofdays = noofdays;
	}

	public Date getCreationdate() {
		return creationdate;
	}

	public void setCreationdate(Date creationdate) {
		this.creationdate = creationdate;
	}

	public String getCreatedby() {
		return createdby;
	}

	public void setCreatedby(String createdby) {
		this.createdby = createdby;
	}

	public String getLastupdatedby() {
		return lastupdatedby;
	}

	public void setLastupdatedby(String lastupdatedby) {
		this.lastupdatedby = lastupdatedby;
	}

	public Date getLastupdateddatetime() {
		return lastupdateddatetime;
	}

	public void setLastupdateddatetime(Date lastupdateddatetime) {
		this.lastupdateddatetime = lastupdateddatetime;
	}

	public Integer getCsvid() {
		return csvid;
	}

	public void setCsvid(Integer csvid) {
		this.csvid = csvid;
	}

	public Integer getBrandid() {
		return brandid;
	}

	public void setBrandid(Integer brandid) {
		this.brandid = brandid;
	}

	public Integer getVersion() {
		return version;
	}

	public void setVersion(Integer version) {
		this.version = version;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((brandid == null) ? 0 : brandid.hashCode());
		result = prime * result + ((createdby == null) ? 0 : createdby.hashCode());
		result = prime * result + ((creationdate == null) ? 0 : creationdate.hashCode());
		result = prime * result + ((csvid == null) ? 0 : csvid.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((lastupdatedby == null) ? 0 : lastupdatedby.hashCode());
		result = prime * result + ((lastupdateddatetime == null) ? 0 : lastupdateddatetime.hashCode());
		result = prime * result + ((messageen == null) ? 0 : messageen.hashCode());
		result = prime * result + ((messagesc == null) ? 0 : messagesc.hashCode());
		result = prime * result + ((noofdays == null) ? 0 : noofdays.hashCode());
		result = prime * result + ((scheduledatetimefrom == null) ? 0 : scheduledatetimefrom.hashCode());
		result = prime * result + ((scheduledatetimeto == null) ? 0 : scheduledatetimeto.hashCode());
		result = prime * result + ((status == null) ? 0 : status.hashCode());
		result = prime * result + ((title == null) ? 0 : title.hashCode());
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
		Message other = (Message) obj;
		if (brandid == null) {
			if (other.brandid != null)
				return false;
		} else if (!brandid.equals(other.brandid))
			return false;
		if (createdby == null) {
			if (other.createdby != null)
				return false;
		} else if (!createdby.equals(other.createdby))
			return false;
		if (creationdate == null) {
			if (other.creationdate != null)
				return false;
		} else if (!creationdate.equals(other.creationdate))
			return false;
		if (csvid == null) {
			if (other.csvid != null)
				return false;
		} else if (!csvid.equals(other.csvid))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (lastupdatedby == null) {
			if (other.lastupdatedby != null)
				return false;
		} else if (!lastupdatedby.equals(other.lastupdatedby))
			return false;
		if (lastupdateddatetime == null) {
			if (other.lastupdateddatetime != null)
				return false;
		} else if (!lastupdateddatetime.equals(other.lastupdateddatetime))
			return false;
		if (messageen == null) {
			if (other.messageen != null)
				return false;
		} else if (!messageen.equals(other.messageen))
			return false;
		if (messagesc == null) {
			if (other.messagesc != null)
				return false;
		} else if (!messagesc.equals(other.messagesc))
			return false;
		if (noofdays == null) {
			if (other.noofdays != null)
				return false;
		} else if (!noofdays.equals(other.noofdays))
			return false;
		if (scheduledatetimefrom == null) {
			if (other.scheduledatetimefrom != null)
				return false;
		} else if (!scheduledatetimefrom.equals(other.scheduledatetimefrom))
			return false;
		if (scheduledatetimeto == null) {
			if (other.scheduledatetimeto != null)
				return false;
		} else if (!scheduledatetimeto.equals(other.scheduledatetimeto))
			return false;
		if (status == null) {
			if (other.status != null)
				return false;
		} else if (!status.equals(other.status))
			return false;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
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
		return "Message [id=" + id + ", title=" + title + ", status=" + status + ", messageen=" + messageen
				+ ", messagesc=" + messagesc + ", scheduledatetimefrom=" + scheduledatetimefrom
				+ ", scheduledatetimeto=" + scheduledatetimeto + ", noofdays=" + noofdays + ", creationdate="
				+ creationdate + ", createdby=" + createdby + ", lastupdatedby=" + lastupdatedby
				+ ", lastupdateddatetime=" + lastupdateddatetime + ", csvid=" + csvid + ", brandid=" + brandid
				+ ", version=" + version + "]";
	}

	public Message(Long id, String title, String status, String messageen, String messagesc, Date scheduledatetimefrom,
			Date scheduledatetimeto, Integer noofdays, Date creationdate, String createdby, String lastupdatedby,
			Date lastupdateddatetime, Integer csvid, Integer brandid, Integer version) {
		super();
		this.id = id;
		this.title = title;
		this.status = status;
		this.messageen = messageen;
		this.messagesc = messagesc;
		this.scheduledatetimefrom = scheduledatetimefrom;
		this.scheduledatetimeto = scheduledatetimeto;
		this.noofdays = noofdays;
		this.creationdate = creationdate;
		this.createdby = createdby;
		this.lastupdatedby = lastupdatedby;
		this.lastupdateddatetime = lastupdateddatetime;
		this.csvid = csvid;
		this.brandid = brandid;
		this.version = version;
	}

	public Message() {
		super();
		// TODO Auto-generated constructor stub
	}

	

}
