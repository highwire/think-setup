package com.mps.think.setup.vo;

public class LableKeyLineVO {

	/**
	 * label_keyline
	 * 
	 * suppress_flag
	 * 
	 * truncate_flag
	 * 
	 * description
	 */
	private Integer lableKeylineId;

	private PublisherVO pubId;

	private String labelKeyline;

	private boolean suppressflag;

	private String description;
	
	private String currentIssue;

	private String currentVolume;
	
	private String text;

	public Integer getLableKeylineId() {
		return lableKeylineId;
	}

	public void setLableKeylineId(Integer lableKeylineId) {
		this.lableKeylineId = lableKeylineId;
	}

	public PublisherVO getPubId() {
		return pubId;
	}

	public void setPubId(PublisherVO pubId) {
		this.pubId = pubId;
	}

	public String getLabelKeyline() {
		return labelKeyline;
	}

	public void setLabelKeyline(String labelKeyline) {
		this.labelKeyline = labelKeyline;
	}

	public boolean isSuppressflag() {
		return suppressflag;
	}

	public void setSuppressflag(boolean suppressflag) {
		this.suppressflag = suppressflag;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	

	public String getCurrentIssue() {
		return currentIssue;
	}

	public void setCurrentIssue(String currentIssue) {
		this.currentIssue = currentIssue;
	}


	public String getCurrentVolume() {
		return currentVolume;
	}

	public void setCurrentVolume(String currentVolume) {
		this.currentVolume = currentVolume;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	@Override
	public String toString() {
		return "LableKeyLineVO [lableKeylineId=" + lableKeylineId + ", pubId=" + pubId + ", labelKeyline="
				+ labelKeyline + ", suppressflag=" + suppressflag + ", description=" + description + ", currentIssue="
				+ currentIssue + ", currentVolume=" + currentVolume + ", text=" + text + "]";
	}

}
