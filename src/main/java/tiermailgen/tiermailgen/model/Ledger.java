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
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Ledger generated by hbm2java
 */
@Entity
@Table(name = "ledger")
public class Ledger implements java.io.Serializable {

	private Integer ledgerUid;
	private AppTransactions appTransactions;
	private Ledger ledger;
	private int ledgerActionTypeUid;
	private int companyUid;
	private String referencedPid;
	private String refundPid;
	private Integer invoiceUid;
	private Integer paymentStatusUid;
	private Integer paymentMethodUid;
	private BigDecimal amount;
	private Date creationDate;
	private char activeFlag;
	private String createModifiedBy;
	private Date createModifiedDate;
	private Set<Ledger> ledgers = new HashSet<Ledger>(0);

	public Ledger() {
	}

	public Ledger(AppTransactions appTransactions, int ledgerActionTypeUid, int companyUid, BigDecimal amount,
			char activeFlag, String createModifiedBy, Date createModifiedDate) {
		this.appTransactions = appTransactions;
		this.ledgerActionTypeUid = ledgerActionTypeUid;
		this.companyUid = companyUid;
		this.amount = amount;
		this.activeFlag = activeFlag;
		this.createModifiedBy = createModifiedBy;
		this.createModifiedDate = createModifiedDate;
	}

	public Ledger(AppTransactions appTransactions, Ledger ledger, int ledgerActionTypeUid, int companyUid,
			String referencedPid, String refundPid, Integer invoiceUid, Integer paymentStatusUid,
			Integer paymentMethodUid, BigDecimal amount, Date creationDate, char activeFlag, String createModifiedBy,
			Date createModifiedDate, Set<Ledger> ledgers) {
		this.appTransactions = appTransactions;
		this.ledger = ledger;
		this.ledgerActionTypeUid = ledgerActionTypeUid;
		this.companyUid = companyUid;
		this.referencedPid = referencedPid;
		this.refundPid = refundPid;
		this.invoiceUid = invoiceUid;
		this.paymentStatusUid = paymentStatusUid;
		this.paymentMethodUid = paymentMethodUid;
		this.amount = amount;
		this.creationDate = creationDate;
		this.activeFlag = activeFlag;
		this.createModifiedBy = createModifiedBy;
		this.createModifiedDate = createModifiedDate;
		this.ledgers = ledgers;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "Ledger_UID", unique = true, nullable = false)
	public Integer getLedgerUid() {
		return this.ledgerUid;
	}

	public void setLedgerUid(Integer ledgerUid) {
		this.ledgerUid = ledgerUid;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "AppTrans_UID", nullable = false)
	public AppTransactions getAppTransactions() {
		return this.appTransactions;
	}

	public void setAppTransactions(AppTransactions appTransactions) {
		this.appTransactions = appTransactions;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "Payment_UID")
	public Ledger getLedger() {
		return this.ledger;
	}

	public void setLedger(Ledger ledger) {
		this.ledger = ledger;
	}

	@Column(name = "LedgerActionType_UID", nullable = false)
	public int getLedgerActionTypeUid() {
		return this.ledgerActionTypeUid;
	}

	public void setLedgerActionTypeUid(int ledgerActionTypeUid) {
		this.ledgerActionTypeUid = ledgerActionTypeUid;
	}

	@Column(name = "Company_UID", nullable = false)
	public int getCompanyUid() {
		return this.companyUid;
	}

	public void setCompanyUid(int companyUid) {
		this.companyUid = companyUid;
	}

	@Column(name = "Referenced_pid", length = 45)
	public String getReferencedPid() {
		return this.referencedPid;
	}

	public void setReferencedPid(String referencedPid) {
		this.referencedPid = referencedPid;
	}

	@Column(name = "Refund_PID", length = 45)
	public String getRefundPid() {
		return this.refundPid;
	}

	public void setRefundPid(String refundPid) {
		this.refundPid = refundPid;
	}

	@Column(name = "Invoice_UID")
	public Integer getInvoiceUid() {
		return this.invoiceUid;
	}

	public void setInvoiceUid(Integer invoiceUid) {
		this.invoiceUid = invoiceUid;
	}

	@Column(name = "PaymentStatus_UID")
	public Integer getPaymentStatusUid() {
		return this.paymentStatusUid;
	}

	public void setPaymentStatusUid(Integer paymentStatusUid) {
		this.paymentStatusUid = paymentStatusUid;
	}

	@Column(name = "PaymentMethod_UID")
	public Integer getPaymentMethodUid() {
		return this.paymentMethodUid;
	}

	public void setPaymentMethodUid(Integer paymentMethodUid) {
		this.paymentMethodUid = paymentMethodUid;
	}

	@Column(name = "Amount", nullable = false, precision = 10)
	public BigDecimal getAmount() {
		return this.amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "Creation_Date", length = 10)
	public Date getCreationDate() {
		return this.creationDate;
	}

	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
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

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "ledger")
	public Set<Ledger> getLedgers() {
		return this.ledgers;
	}

	public void setLedgers(Set<Ledger> ledgers) {
		this.ledgers = ledgers;
	}

}
