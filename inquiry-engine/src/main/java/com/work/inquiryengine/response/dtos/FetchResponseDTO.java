package com.work.inquiryengine.response.dtos;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Date;

public class FetchResponseDTO {
	private String registeredBillerId;

	private String determinantValue;

	private BigDecimal amountAfterDueDate;

	private String autopayflag;

	private BigDecimal billAmount;

	private Date billDueDate;

	private String billStatus;

	private String billerid;

	private String billertype;

	private Date cardExpiryDate;

	private String categoryid;

	private String createdBy;

	private Timestamp creationDate;

	private String custName;

	private String czDiscriminator;

	private String debitAccount;

	private Date endDate;

	private String extraField1;

	private String extraField2;

	private String extraField3;

	private String frequency;

	private String isFavorite;

	private BigDecimal lastPaymentAmount;

	private Date lastPaymentDate;

	private Timestamp lastUpdateDate;

	private String lastUpdatedBy;

	private BigDecimal limitAmount;

	private String limitCurrency;

	private BigDecimal objectVersionNumber;

	private String operationalarea;

	private String partyid;

	private String paymentType;

	private String regBillerNickname;

	private String scheduleflag;

	private Date startDate;

	private String status;

	public String getRegisteredBillerId() {
		return registeredBillerId;
	}

	public void setRegisteredBillerId(String registeredBillerId) {
		this.registeredBillerId = registeredBillerId;
	}

	public String getDeterminantValue() {
		return determinantValue;
	}

	public void setDeterminantValue(String determinantValue) {
		this.determinantValue = determinantValue;
	}

	public BigDecimal getAmountAfterDueDate() {
		return amountAfterDueDate;
	}

	public void setAmountAfterDueDate(BigDecimal amountAfterDueDate) {
		this.amountAfterDueDate = amountAfterDueDate;
	}

	public String getAutopayflag() {
		return autopayflag;
	}

	public void setAutopayflag(String autopayflag) {
		this.autopayflag = autopayflag;
	}

	public BigDecimal getBillAmount() {
		return billAmount;
	}

	public void setBillAmount(BigDecimal billAmount) {
		this.billAmount = billAmount;
	}

	public Date getBillDueDate() {
		return billDueDate;
	}

	public void setBillDueDate(Date billDueDate) {
		this.billDueDate = billDueDate;
	}

	public String getBillStatus() {
		return billStatus;
	}

	public void setBillStatus(String billStatus) {
		this.billStatus = billStatus;
	}

	public String getBillerid() {
		return billerid;
	}

	public void setBillerid(String billerid) {
		this.billerid = billerid;
	}

	public String getBillertype() {
		return billertype;
	}

	public void setBillertype(String billertype) {
		this.billertype = billertype;
	}

	public Date getCardExpiryDate() {
		return cardExpiryDate;
	}

	public void setCardExpiryDate(Date cardExpiryDate) {
		this.cardExpiryDate = cardExpiryDate;
	}

	public String getCategoryid() {
		return categoryid;
	}

	public void setCategoryid(String categoryid) {
		this.categoryid = categoryid;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public Timestamp getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(Timestamp creationDate) {
		this.creationDate = creationDate;
	}

	public String getCustName() {
		return custName;
	}

	public void setCustName(String custName) {
		this.custName = custName;
	}

	public String getCzDiscriminator() {
		return czDiscriminator;
	}

	public void setCzDiscriminator(String czDiscriminator) {
		this.czDiscriminator = czDiscriminator;
	}

	public String getDebitAccount() {
		return debitAccount;
	}

	public void setDebitAccount(String debitAccount) {
		this.debitAccount = debitAccount;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public String getExtraField1() {
		return extraField1;
	}

	public void setExtraField1(String extraField1) {
		this.extraField1 = extraField1;
	}

	public String getExtraField2() {
		return extraField2;
	}

	public void setExtraField2(String extraField2) {
		this.extraField2 = extraField2;
	}

	public String getExtraField3() {
		return extraField3;
	}

	public void setExtraField3(String extraField3) {
		this.extraField3 = extraField3;
	}

	public String getFrequency() {
		return frequency;
	}

	public void setFrequency(String frequency) {
		this.frequency = frequency;
	}

	public String getIsFavorite() {
		return isFavorite;
	}

	public void setIsFavorite(String isFavorite) {
		this.isFavorite = isFavorite;
	}

	public BigDecimal getLastPaymentAmount() {
		return lastPaymentAmount;
	}

	public void setLastPaymentAmount(BigDecimal lastPaymentAmount) {
		this.lastPaymentAmount = lastPaymentAmount;
	}

	public Date getLastPaymentDate() {
		return lastPaymentDate;
	}

	public void setLastPaymentDate(Date lastPaymentDate) {
		this.lastPaymentDate = lastPaymentDate;
	}

	public Timestamp getLastUpdateDate() {
		return lastUpdateDate;
	}

	public void setLastUpdateDate(Timestamp lastUpdateDate) {
		this.lastUpdateDate = lastUpdateDate;
	}

	public String getLastUpdatedBy() {
		return lastUpdatedBy;
	}

	public void setLastUpdatedBy(String lastUpdatedBy) {
		this.lastUpdatedBy = lastUpdatedBy;
	}

	public BigDecimal getLimitAmount() {
		return limitAmount;
	}

	public void setLimitAmount(BigDecimal limitAmount) {
		this.limitAmount = limitAmount;
	}

	public String getLimitCurrency() {
		return limitCurrency;
	}

	public void setLimitCurrency(String limitCurrency) {
		this.limitCurrency = limitCurrency;
	}

	public BigDecimal getObjectVersionNumber() {
		return objectVersionNumber;
	}

	public void setObjectVersionNumber(BigDecimal objectVersionNumber) {
		this.objectVersionNumber = objectVersionNumber;
	}

	public String getOperationalarea() {
		return operationalarea;
	}

	public void setOperationalarea(String operationalarea) {
		this.operationalarea = operationalarea;
	}

	public String getPartyid() {
		return partyid;
	}

	public void setPartyid(String partyid) {
		this.partyid = partyid;
	}

	public String getPaymentType() {
		return paymentType;
	}

	public void setPaymentType(String paymentType) {
		this.paymentType = paymentType;
	}

	public String getRegBillerNickname() {
		return regBillerNickname;
	}

	public void setRegBillerNickname(String regBillerNickname) {
		this.regBillerNickname = regBillerNickname;
	}

	public String getScheduleflag() {
		return scheduleflag;
	}

	public void setScheduleflag(String scheduleflag) {
		this.scheduleflag = scheduleflag;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public FetchResponseDTO() {
	}

	public FetchResponseDTO(String registeredBillerId, String determinantValue, BigDecimal amountAfterDueDate,
			String autopayflag, BigDecimal billAmount, Date billDueDate, String billStatus, String billerid,
			String billertype, Date cardExpiryDate, String categoryid, String createdBy, Timestamp creationDate,
			String custName, String czDiscriminator, String debitAccount, Date endDate, String extraField1,
			String extraField2, String extraField3, String frequency, String isFavorite, BigDecimal lastPaymentAmount,
			Date lastPaymentDate, Timestamp lastUpdateDate, String lastUpdatedBy, BigDecimal limitAmount,
			String limitCurrency, BigDecimal objectVersionNumber, String operationalarea, String partyid,
			String paymentType, String regBillerNickname, String scheduleflag, Date startDate, String status) {
		super();
		this.registeredBillerId = registeredBillerId;
		this.determinantValue = determinantValue;
		this.amountAfterDueDate = amountAfterDueDate;
		this.autopayflag = autopayflag;
		this.billAmount = billAmount;
		this.billDueDate = billDueDate;
		this.billStatus = billStatus;
		this.billerid = billerid;
		this.billertype = billertype;
		this.cardExpiryDate = cardExpiryDate;
		this.categoryid = categoryid;
		this.createdBy = createdBy;
		this.creationDate = creationDate;
		this.custName = custName;
		this.czDiscriminator = czDiscriminator;
		this.debitAccount = debitAccount;
		this.endDate = endDate;
		this.extraField1 = extraField1;
		this.extraField2 = extraField2;
		this.extraField3 = extraField3;
		this.frequency = frequency;
		this.isFavorite = isFavorite;
		this.lastPaymentAmount = lastPaymentAmount;
		this.lastPaymentDate = lastPaymentDate;
		this.lastUpdateDate = lastUpdateDate;
		this.lastUpdatedBy = lastUpdatedBy;
		this.limitAmount = limitAmount;
		this.limitCurrency = limitCurrency;
		this.objectVersionNumber = objectVersionNumber;
		this.operationalarea = operationalarea;
		this.partyid = partyid;
		this.paymentType = paymentType;
		this.regBillerNickname = regBillerNickname;
		this.scheduleflag = scheduleflag;
		this.startDate = startDate;
		this.status = status;
	}

	@Override
	public String toString() {
		return "BillFetchResponseDTO [registeredBillerId=" + registeredBillerId + ", determinantValue="
				+ determinantValue + ", amountAfterDueDate=" + amountAfterDueDate + ", autopayflag=" + autopayflag
				+ ", billAmount=" + billAmount + ", billDueDate=" + billDueDate + ", billStatus=" + billStatus
				+ ", billerid=" + billerid + ", billertype=" + billertype + ", cardExpiryDate=" + cardExpiryDate
				+ ", categoryid=" + categoryid + ", createdBy=" + createdBy + ", creationDate=" + creationDate
				+ ", custName=" + custName + ", czDiscriminator=" + czDiscriminator + ", debitAccount=" + debitAccount
				+ ", endDate=" + endDate + ", extraField1=" + extraField1 + ", extraField2=" + extraField2
				+ ", extraField3=" + extraField3 + ", frequency=" + frequency + ", isFavorite=" + isFavorite
				+ ", lastPaymentAmount=" + lastPaymentAmount + ", lastPaymentDate=" + lastPaymentDate
				+ ", lastUpdateDate=" + lastUpdateDate + ", lastUpdatedBy=" + lastUpdatedBy + ", limitAmount="
				+ limitAmount + ", limitCurrency=" + limitCurrency + ", objectVersionNumber=" + objectVersionNumber
				+ ", operationalarea=" + operationalarea + ", partyid=" + partyid + ", paymentType=" + paymentType
				+ ", regBillerNickname=" + regBillerNickname + ", scheduleflag=" + scheduleflag + ", startDate="
				+ startDate + ", status=" + status + "]";
	}

}
