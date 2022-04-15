package php.spring.spring3s.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Approves")
public class Approve implements Serializable{
	
	@Id
	@Column(name = "approvedbeforeid")
	private String approvedbeforeid;

	@Column(name = "approvedbefore")
	private String approvedbefore;
	
	@Column(name = "conversiondate")
	private String conversiondate;
	
	@Column(name = "approvedafterid")
	private String approvedafterid;
	
	@Column(name = "approvedafter")
	private String approvedafter;

	public Approve() {
	}

	public Approve(String approvedbeforeid, String approvedbefore, String conversiondate, String approvedafterid,
			String approvedafter) {
		super();
		this.approvedbeforeid = approvedbeforeid;
		this.approvedbefore = approvedbefore;
		this.conversiondate = conversiondate;
		this.approvedafterid = approvedafterid;
		this.approvedafter = approvedafter;
	}

	public String getApprovedbeforeid() {
		return approvedbeforeid;
	}

	public void setApprovedbeforeid(String approvedbeforeid) {
		this.approvedbeforeid = approvedbeforeid;
	}

	public String getApprovedbefore() {
		return approvedbefore;
	}

	public void setApprovedbefore(String approvedbefore) {
		this.approvedbefore = approvedbefore;
	}

	public String getConversiondate() {
		return conversiondate;
	}

	public void setConversiondate(String conversiondate) {
		this.conversiondate = conversiondate;
	}

	public String getApprovedafterid() {
		return approvedafterid;
	}

	public void setApprovedafterid(String approvedafterid) {
		this.approvedafterid = approvedafterid;
	}

	public String getApprovedafter() {
		return approvedafter;
	}

	public void setApprovedafter(String approvedafter) {
		this.approvedafter = approvedafter;
	}
	
	
}
