package tiermailgen.tiermailgen.model;
// Generated Mar 22, 2019 3:31:31 PM by Hibernate Tools 5.1.10.Final

import java.math.BigDecimal;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;

import javax.persistence.CascadeType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * RegistrationItems generated by hbm2java
 */
@Entity
@Table(name = "registration_items")
public class RegistrationItems implements java.io.Serializable {

	private Integer regItemUid;
	private RegistrationItems registrationItemsByParentUid;
	private RegistrationItems registrationItemsByReplacedByRegItemUid;
	private int regItemTypeUid;
	private String additionalInfo;
	private Integer applicationUid;
	private String certDescription;
	private String addCertDesc;
	private Integer certificateNo;
	private Character certifiedFlag;
	private Integer companyUid;
	private Date createdDate;
	private char currentFlag;
	private Integer discountTypeUid;
	private Integer districtUid;
	private Character distAppProofFlag;
	private Character distPermitProofFlag;
	private Character districtPermitFlag;
	private String epaCertNo;
	private Short estDaysPerWeek;
	private Short estHoursPerDay;
	private Short estWeeksPerYear;
	private BigDecimal estimatedFees;
	private Date expirationDate;
	private Character flexEngProofFlag;
	private Character flexEngRequestFlag;
	private Character fuelProofFlag;
	private Character fuelRequestFlag;
	private Character initialEval;
	private Date initialIssuanceDate;
	private Character notGoingToRenewFlag;
	private Character operationalFlag;
	private Character operationalIndicator;
	private Date ptoAppCompDate;
	private Date ptoAppDate;
	private Integer ptoAppDistId;
	private Date ptoDate;
	private Integer ptoDistrictId;
	private String ptoNo;
	private Date purchaseDate;
	private Integer regItemStatusUid;
	private int regItemSubTypeUid;
	private Integer regItemSubSubTypesUid;
	private Character renewalOpenFlag;
	private Character rentalFlag;
	private Character residencyProofFlag;
	private Character residencyRequestFlag;
	private char stolenFlag;
	private Character table1StdProofFlag;
	private Character table1StdRequestFlag;
	private Integer trackingNo;
	private char activeFlag;
	private String createModifiedBy;
	private Date createModifiedDate;
	private Integer expirationDateTypeUid;
	private Character expiredRenewalFlag;
	private Character reactivateListFlag;
	private Integer cutoffExpireDateUid;
	private Character onHwyEngRequestFlag;
	private Character identicalReplacementFlag;
//	private Set<ApptransRegRel> apptransRegRels = new HashSet<ApptransRegRel>(0);
	private Set<RegistrationItems> registrationItemsesForParentUid = new HashSet<RegistrationItems>(0);
	private Set<RegistrationItems> registrationItemsesForReplacedByRegItemUid = new HashSet<RegistrationItems>(0);
	private Set<RegitemDetails> regitemDetailses = new HashSet<RegitemDetails>(0);

	public RegistrationItems() {
	}

	public RegistrationItems(int regItemTypeUid, char currentFlag, int regItemSubTypeUid, char stolenFlag,
			char activeFlag, String createModifiedBy, Date createModifiedDate) {
		this.regItemTypeUid = regItemTypeUid;
		this.currentFlag = currentFlag;
		this.regItemSubTypeUid = regItemSubTypeUid;
		this.stolenFlag = stolenFlag;
		this.activeFlag = activeFlag;
		this.createModifiedBy = createModifiedBy;
		this.createModifiedDate = createModifiedDate;
	}

	public RegistrationItems(RegistrationItems registrationItemsByParentUid,
			RegistrationItems registrationItemsByReplacedByRegItemUid, int regItemTypeUid, String additionalInfo,
			Integer applicationUid, String certDescription, String addCertDesc, Integer certificateNo,
			Character certifiedFlag, Integer companyUid, Date createdDate, char currentFlag, Integer discountTypeUid,
			Integer districtUid, Character distAppProofFlag, Character distPermitProofFlag,
			Character districtPermitFlag, String epaCertNo, Short estDaysPerWeek, Short estHoursPerDay,
			Short estWeeksPerYear, BigDecimal estimatedFees, Date expirationDate, Character flexEngProofFlag,
			Character flexEngRequestFlag, Character fuelProofFlag, Character fuelRequestFlag, Character initialEval,
			Date initialIssuanceDate, Character notGoingToRenewFlag, Character operationalFlag,
			Character operationalIndicator, Date ptoAppCompDate, Date ptoAppDate, Integer ptoAppDistId, Date ptoDate,
			Integer ptoDistrictId, String ptoNo, Date purchaseDate, Integer regItemStatusUid, int regItemSubTypeUid,
			Integer regItemSubSubTypesUid, Character renewalOpenFlag, Character rentalFlag,
			Character residencyProofFlag, Character residencyRequestFlag, char stolenFlag, Character table1StdProofFlag,
			Character table1StdRequestFlag, Integer trackingNo, char activeFlag, String createModifiedBy,
			Date createModifiedDate, Integer expirationDateTypeUid, Character expiredRenewalFlag,
			Character reactivateListFlag, Integer cutoffExpireDateUid, Character onHwyEngRequestFlag,
			Character identicalReplacementFlag, Set<ApptransRegRel> apptransRegRels,
			Set<RegistrationItems> registrationItemsesForParentUid,
			Set<RegistrationItems> registrationItemsesForReplacedByRegItemUid, Set<RegitemDetails> regitemDetailses) {
		this.registrationItemsByParentUid = registrationItemsByParentUid;
		this.registrationItemsByReplacedByRegItemUid = registrationItemsByReplacedByRegItemUid;
		this.regItemTypeUid = regItemTypeUid;
		this.additionalInfo = additionalInfo;
		this.applicationUid = applicationUid;
		this.certDescription = certDescription;
		this.addCertDesc = addCertDesc;
		this.certificateNo = certificateNo;
		this.certifiedFlag = certifiedFlag;
		this.companyUid = companyUid;
		this.createdDate = createdDate;
		this.currentFlag = currentFlag;
		this.discountTypeUid = discountTypeUid;
		this.districtUid = districtUid;
		this.distAppProofFlag = distAppProofFlag;
		this.distPermitProofFlag = distPermitProofFlag;
		this.districtPermitFlag = districtPermitFlag;
		this.epaCertNo = epaCertNo;
		this.estDaysPerWeek = estDaysPerWeek;
		this.estHoursPerDay = estHoursPerDay;
		this.estWeeksPerYear = estWeeksPerYear;
		this.estimatedFees = estimatedFees;
		this.expirationDate = expirationDate;
		this.flexEngProofFlag = flexEngProofFlag;
		this.flexEngRequestFlag = flexEngRequestFlag;
		this.fuelProofFlag = fuelProofFlag;
		this.fuelRequestFlag = fuelRequestFlag;
		this.initialEval = initialEval;
		this.initialIssuanceDate = initialIssuanceDate;
		this.notGoingToRenewFlag = notGoingToRenewFlag;
		this.operationalFlag = operationalFlag;
		this.operationalIndicator = operationalIndicator;
		this.ptoAppCompDate = ptoAppCompDate;
		this.ptoAppDate = ptoAppDate;
		this.ptoAppDistId = ptoAppDistId;
		this.ptoDate = ptoDate;
		this.ptoDistrictId = ptoDistrictId;
		this.ptoNo = ptoNo;
		this.purchaseDate = purchaseDate;
		this.regItemStatusUid = regItemStatusUid;
		this.regItemSubTypeUid = regItemSubTypeUid;
		this.regItemSubSubTypesUid = regItemSubSubTypesUid;
		this.renewalOpenFlag = renewalOpenFlag;
		this.rentalFlag = rentalFlag;
		this.residencyProofFlag = residencyProofFlag;
		this.residencyRequestFlag = residencyRequestFlag;
		this.stolenFlag = stolenFlag;
		this.table1StdProofFlag = table1StdProofFlag;
		this.table1StdRequestFlag = table1StdRequestFlag;
		this.trackingNo = trackingNo;
		this.activeFlag = activeFlag;
		this.createModifiedBy = createModifiedBy;
		this.createModifiedDate = createModifiedDate;
		this.expirationDateTypeUid = expirationDateTypeUid;
		this.expiredRenewalFlag = expiredRenewalFlag;
		this.reactivateListFlag = reactivateListFlag;
		this.cutoffExpireDateUid = cutoffExpireDateUid;
		this.onHwyEngRequestFlag = onHwyEngRequestFlag;
		this.identicalReplacementFlag = identicalReplacementFlag;
	//	this.apptransRegRels = apptransRegRels;
		this.registrationItemsesForParentUid = registrationItemsesForParentUid;
		this.registrationItemsesForReplacedByRegItemUid = registrationItemsesForReplacedByRegItemUid;
		this.regitemDetailses = regitemDetailses;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "RegItem_UID", unique = true, nullable = false)
	public Integer getRegItemUid() {
		return this.regItemUid;
	}

	public void setRegItemUid(Integer regItemUid) {
		this.regItemUid = regItemUid;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "Parent_UID")
	public RegistrationItems getRegistrationItemsByParentUid() {
		return this.registrationItemsByParentUid;
	}

	public void setRegistrationItemsByParentUid(RegistrationItems registrationItemsByParentUid) {
		this.registrationItemsByParentUid = registrationItemsByParentUid;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ReplacedBy_RegItem_UID")
	public RegistrationItems getRegistrationItemsByReplacedByRegItemUid() {
		return this.registrationItemsByReplacedByRegItemUid;
	}

	public void setRegistrationItemsByReplacedByRegItemUid(RegistrationItems registrationItemsByReplacedByRegItemUid) {
		this.registrationItemsByReplacedByRegItemUid = registrationItemsByReplacedByRegItemUid;
	}

	@Column(name = "RegItemType_UID", nullable = false)
	public int getRegItemTypeUid() {
		return this.regItemTypeUid;
	}

	public void setRegItemTypeUid(int regItemTypeUid) {
		this.regItemTypeUid = regItemTypeUid;
	}

	@Column(name = "Additional_Info")
	public String getAdditionalInfo() {
		return this.additionalInfo;
	}

	public void setAdditionalInfo(String additionalInfo) {
		this.additionalInfo = additionalInfo;
	}

	@Column(name = "Application_UID")
	public Integer getApplicationUid() {
		return this.applicationUid;
	}

	public void setApplicationUid(Integer applicationUid) {
		this.applicationUid = applicationUid;
	}

	@Column(name = "Cert_Description")
	public String getCertDescription() {
		return this.certDescription;
	}

	public void setCertDescription(String certDescription) {
		this.certDescription = certDescription;
	}

	@Column(name = "Add_Cert_Desc")
	public String getAddCertDesc() {
		return this.addCertDesc;
	}

	public void setAddCertDesc(String addCertDesc) {
		this.addCertDesc = addCertDesc;
	}

	@Column(name = "Certificate_No")
	public Integer getCertificateNo() {
		return this.certificateNo;
	}

	public void setCertificateNo(Integer certificateNo) {
		this.certificateNo = certificateNo;
	}

	@Column(name = "Certified_Flag", length = 1)
	public Character getCertifiedFlag() {
		return this.certifiedFlag;
	}

	public void setCertifiedFlag(Character certifiedFlag) {
		this.certifiedFlag = certifiedFlag;
	}

	@Column(name = "Company_UID")
	public Integer getCompanyUid() {
		return this.companyUid;
	}

	public void setCompanyUid(Integer companyUid) {
		this.companyUid = companyUid;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "Created_Date", length = 19)
	public Date getCreatedDate() {
		return this.createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	@Column(name = "Current_Flag", nullable = false, length = 1)
	public char getCurrentFlag() {
		return this.currentFlag;
	}

	public void setCurrentFlag(char currentFlag) {
		this.currentFlag = currentFlag;
	}

	@Column(name = "Discount_Type_UID")
	public Integer getDiscountTypeUid() {
		return this.discountTypeUid;
	}

	public void setDiscountTypeUid(Integer discountTypeUid) {
		this.discountTypeUid = discountTypeUid;
	}

	@Column(name = "District_UID")
	public Integer getDistrictUid() {
		return this.districtUid;
	}

	public void setDistrictUid(Integer districtUid) {
		this.districtUid = districtUid;
	}

	@Column(name = "DistAppProof_Flag", length = 1)
	public Character getDistAppProofFlag() {
		return this.distAppProofFlag;
	}

	public void setDistAppProofFlag(Character distAppProofFlag) {
		this.distAppProofFlag = distAppProofFlag;
	}

	@Column(name = "DistPermitProof_Flag", length = 1)
	public Character getDistPermitProofFlag() {
		return this.distPermitProofFlag;
	}

	public void setDistPermitProofFlag(Character distPermitProofFlag) {
		this.distPermitProofFlag = distPermitProofFlag;
	}

	@Column(name = "District_Permit_Flag", length = 1)
	public Character getDistrictPermitFlag() {
		return this.districtPermitFlag;
	}

	public void setDistrictPermitFlag(Character districtPermitFlag) {
		this.districtPermitFlag = districtPermitFlag;
	}

	@Column(name = "EPA_Cert_No", length = 50)
	public String getEpaCertNo() {
		return this.epaCertNo;
	}

	public void setEpaCertNo(String epaCertNo) {
		this.epaCertNo = epaCertNo;
	}

	@Column(name = "Est_Days_Per_Week")
	public Short getEstDaysPerWeek() {
		return this.estDaysPerWeek;
	}

	public void setEstDaysPerWeek(Short estDaysPerWeek) {
		this.estDaysPerWeek = estDaysPerWeek;
	}

	@Column(name = "Est_Hours_Per_Day")
	public Short getEstHoursPerDay() {
		return this.estHoursPerDay;
	}

	public void setEstHoursPerDay(Short estHoursPerDay) {
		this.estHoursPerDay = estHoursPerDay;
	}

	@Column(name = "Est_Weeks_Per_Year")
	public Short getEstWeeksPerYear() {
		return this.estWeeksPerYear;
	}

	public void setEstWeeksPerYear(Short estWeeksPerYear) {
		this.estWeeksPerYear = estWeeksPerYear;
	}

	@Column(name = "Estimated_Fees", precision = 10)
	public BigDecimal getEstimatedFees() {
		return this.estimatedFees;
	}

	public void setEstimatedFees(BigDecimal estimatedFees) {
		this.estimatedFees = estimatedFees;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "Expiration_Date", length = 19)
	public Date getExpirationDate() {
		return this.expirationDate;
	}

	public void setExpirationDate(Date expirationDate) {
		this.expirationDate = expirationDate;
	}

	@Column(name = "Flex_Eng_Proof_Flag", length = 1)
	public Character getFlexEngProofFlag() {
		return this.flexEngProofFlag;
	}

	public void setFlexEngProofFlag(Character flexEngProofFlag) {
		this.flexEngProofFlag = flexEngProofFlag;
	}

	@Column(name = "Flex_Eng_Request_Flag", length = 1)
	public Character getFlexEngRequestFlag() {
		return this.flexEngRequestFlag;
	}

	public void setFlexEngRequestFlag(Character flexEngRequestFlag) {
		this.flexEngRequestFlag = flexEngRequestFlag;
	}

	@Column(name = "Fuel_Proof_Flag", length = 1)
	public Character getFuelProofFlag() {
		return this.fuelProofFlag;
	}

	public void setFuelProofFlag(Character fuelProofFlag) {
		this.fuelProofFlag = fuelProofFlag;
	}

	@Column(name = "Fuel_Request_Flag", length = 1)
	public Character getFuelRequestFlag() {
		return this.fuelRequestFlag;
	}

	public void setFuelRequestFlag(Character fuelRequestFlag) {
		this.fuelRequestFlag = fuelRequestFlag;
	}

	@Column(name = "Initial_Eval", length = 1)
	public Character getInitialEval() {
		return this.initialEval;
	}

	public void setInitialEval(Character initialEval) {
		this.initialEval = initialEval;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "Initial_Issuance_Date", length = 19)
	public Date getInitialIssuanceDate() {
		return this.initialIssuanceDate;
	}

	public void setInitialIssuanceDate(Date initialIssuanceDate) {
		this.initialIssuanceDate = initialIssuanceDate;
	}

	@Column(name = "Not_Going_To_Renew_Flag", length = 1)
	public Character getNotGoingToRenewFlag() {
		return this.notGoingToRenewFlag;
	}

	public void setNotGoingToRenewFlag(Character notGoingToRenewFlag) {
		this.notGoingToRenewFlag = notGoingToRenewFlag;
	}

	@Column(name = "Operational_Flag", length = 1)
	public Character getOperationalFlag() {
		return this.operationalFlag;
	}

	public void setOperationalFlag(Character operationalFlag) {
		this.operationalFlag = operationalFlag;
	}

	@Column(name = "Operational_Indicator", length = 1)
	public Character getOperationalIndicator() {
		return this.operationalIndicator;
	}

	public void setOperationalIndicator(Character operationalIndicator) {
		this.operationalIndicator = operationalIndicator;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "PTO_App_Comp_Date", length = 19)
	public Date getPtoAppCompDate() {
		return this.ptoAppCompDate;
	}

	public void setPtoAppCompDate(Date ptoAppCompDate) {
		this.ptoAppCompDate = ptoAppCompDate;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "PTO_App_Date", length = 19)
	public Date getPtoAppDate() {
		return this.ptoAppDate;
	}

	public void setPtoAppDate(Date ptoAppDate) {
		this.ptoAppDate = ptoAppDate;
	}

	@Column(name = "PTO_App_DistID")
	public Integer getPtoAppDistId() {
		return this.ptoAppDistId;
	}

	public void setPtoAppDistId(Integer ptoAppDistId) {
		this.ptoAppDistId = ptoAppDistId;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "PTO_Date", length = 19)
	public Date getPtoDate() {
		return this.ptoDate;
	}

	public void setPtoDate(Date ptoDate) {
		this.ptoDate = ptoDate;
	}

	@Column(name = "PTO_District_ID")
	public Integer getPtoDistrictId() {
		return this.ptoDistrictId;
	}

	public void setPtoDistrictId(Integer ptoDistrictId) {
		this.ptoDistrictId = ptoDistrictId;
	}

	@Column(name = "PTO_No", length = 20)
	public String getPtoNo() {
		return this.ptoNo;
	}

	public void setPtoNo(String ptoNo) {
		this.ptoNo = ptoNo;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "Purchase_Date", length = 19)
	public Date getPurchaseDate() {
		return this.purchaseDate;
	}

	public void setPurchaseDate(Date purchaseDate) {
		this.purchaseDate = purchaseDate;
	}

	@Column(name = "RegItemStatus_UID")
	public Integer getRegItemStatusUid() {
		return this.regItemStatusUid;
	}

	public void setRegItemStatusUid(Integer regItemStatusUid) {
		this.regItemStatusUid = regItemStatusUid;
	}

	@Column(name = "RegItemSubType_UID", nullable = false)
	public int getRegItemSubTypeUid() {
		return this.regItemSubTypeUid;
	}

	public void setRegItemSubTypeUid(int regItemSubTypeUid) {
		this.regItemSubTypeUid = regItemSubTypeUid;
	}

	@Column(name = "RegItemSubSubTypes_UID")
	public Integer getRegItemSubSubTypesUid() {
		return this.regItemSubSubTypesUid;
	}

	public void setRegItemSubSubTypesUid(Integer regItemSubSubTypesUid) {
		this.regItemSubSubTypesUid = regItemSubSubTypesUid;
	}

	@Column(name = "Renewal_Open_Flag", length = 1)
	public Character getRenewalOpenFlag() {
		return this.renewalOpenFlag;
	}

	public void setRenewalOpenFlag(Character renewalOpenFlag) {
		this.renewalOpenFlag = renewalOpenFlag;
	}

	@Column(name = "Rental_Flag", length = 1)
	public Character getRentalFlag() {
		return this.rentalFlag;
	}

	public void setRentalFlag(Character rentalFlag) {
		this.rentalFlag = rentalFlag;
	}

	@Column(name = "Residency_Proof_Flag", length = 1)
	public Character getResidencyProofFlag() {
		return this.residencyProofFlag;
	}

	public void setResidencyProofFlag(Character residencyProofFlag) {
		this.residencyProofFlag = residencyProofFlag;
	}

	@Column(name = "Residency_Request_Flag", length = 1)
	public Character getResidencyRequestFlag() {
		return this.residencyRequestFlag;
	}

	public void setResidencyRequestFlag(Character residencyRequestFlag) {
		this.residencyRequestFlag = residencyRequestFlag;
	}

	@Column(name = "Stolen_Flag", nullable = false, length = 1)
	public char getStolenFlag() {
		return this.stolenFlag;
	}

	public void setStolenFlag(char stolenFlag) {
		this.stolenFlag = stolenFlag;
	}

	@Column(name = "Table1_STD_Proof_Flag", length = 1)
	public Character getTable1StdProofFlag() {
		return this.table1StdProofFlag;
	}

	public void setTable1StdProofFlag(Character table1StdProofFlag) {
		this.table1StdProofFlag = table1StdProofFlag;
	}

	@Column(name = "Table1_STD_Request_Flag", length = 1)
	public Character getTable1StdRequestFlag() {
		return this.table1StdRequestFlag;
	}

	public void setTable1StdRequestFlag(Character table1StdRequestFlag) {
		this.table1StdRequestFlag = table1StdRequestFlag;
	}

	@Column(name = "Tracking_No")
	public Integer getTrackingNo() {
		return this.trackingNo;
	}

	public void setTrackingNo(Integer trackingNo) {
		this.trackingNo = trackingNo;
	}

	@Column(name = "Active_Flag", nullable = false, length = 1)
	public char getActiveFlag() {
		return this.activeFlag;
	}

	public void setActiveFlag(char activeFlag) {
		this.activeFlag = activeFlag;
	}

	@Column(name = "Create_Modified_By", nullable = false, length = 45)
	public String getCreateModifiedBy() {
		return this.createModifiedBy;
	}

	public void setCreateModifiedBy(String createModifiedBy) {
		this.createModifiedBy = createModifiedBy;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "Create_Modified_Date", nullable = false, length = 19)
	public Date getCreateModifiedDate() {
		return this.createModifiedDate;
	}

	public void setCreateModifiedDate(Date createModifiedDate) {
		this.createModifiedDate = createModifiedDate;
	}

	@Column(name = "Expiration_Date_Type_UID")
	public Integer getExpirationDateTypeUid() {
		return this.expirationDateTypeUid;
	}

	public void setExpirationDateTypeUid(Integer expirationDateTypeUid) {
		this.expirationDateTypeUid = expirationDateTypeUid;
	}

	@Column(name = "Expired_Renewal_Flag", length = 1)
	public Character getExpiredRenewalFlag() {
		return this.expiredRenewalFlag;
	}

	public void setExpiredRenewalFlag(Character expiredRenewalFlag) {
		this.expiredRenewalFlag = expiredRenewalFlag;
	}

	@Column(name = "Reactivate_List_Flag", length = 1)
	public Character getReactivateListFlag() {
		return this.reactivateListFlag;
	}

	public void setReactivateListFlag(Character reactivateListFlag) {
		this.reactivateListFlag = reactivateListFlag;
	}

	@Column(name = "Cutoff_Expire_Date_UID")
	public Integer getCutoffExpireDateUid() {
		return this.cutoffExpireDateUid;
	}

	public void setCutoffExpireDateUid(Integer cutoffExpireDateUid) {
		this.cutoffExpireDateUid = cutoffExpireDateUid;
	}

	@Column(name = "On_Hwy_Eng_Request_Flag", length = 1)
	public Character getOnHwyEngRequestFlag() {
		return this.onHwyEngRequestFlag;
	}

	public void setOnHwyEngRequestFlag(Character onHwyEngRequestFlag) {
		this.onHwyEngRequestFlag = onHwyEngRequestFlag;
	}

	@Column(name = "Identical_Replacement_Flag", length = 1)
	public Character getIdenticalReplacementFlag() {
		return this.identicalReplacementFlag;
	}

	public void setIdenticalReplacementFlag(Character identicalReplacementFlag) {
		this.identicalReplacementFlag = identicalReplacementFlag;
	}

	/*@OneToMany(fetch = FetchType.LAZY,   mappedBy = "registrationItems")
	//@Cascade({CascadeType.SAVE_UPDATE})
	public Set<ApptransRegRel> getApptransRegRels() {
		return this.apptransRegRels;
	}

	public void setApptransRegRels(Set<ApptransRegRel> apptransRegRels) {
		this.apptransRegRels = apptransRegRels;
	}
*/
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "registrationItemsByParentUid")
	public Set<RegistrationItems> getRegistrationItemsesForParentUid() {
		return this.registrationItemsesForParentUid;
	}

	public void setRegistrationItemsesForParentUid(Set<RegistrationItems> registrationItemsesForParentUid) {
		this.registrationItemsesForParentUid = registrationItemsesForParentUid;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "registrationItemsByReplacedByRegItemUid")
	public Set<RegistrationItems> getRegistrationItemsesForReplacedByRegItemUid() {
		return this.registrationItemsesForReplacedByRegItemUid;
	}

	public void setRegistrationItemsesForReplacedByRegItemUid(
			Set<RegistrationItems> registrationItemsesForReplacedByRegItemUid) {
		this.registrationItemsesForReplacedByRegItemUid = registrationItemsesForReplacedByRegItemUid;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "registrationItems")
	public Set<RegitemDetails> getRegitemDetailses() {
		return this.regitemDetailses;
	}

	public void setRegitemDetailses(Set<RegitemDetails> regitemDetailses) {
		this.regitemDetailses = regitemDetailses;
	}

}
