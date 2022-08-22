package MicroServicePayment.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="payment")
public class Payment{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;
	String name;
	String email;
	String phno;
	String accno;
	int cvv;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhno() {
		return phno;
	}
	public void setPhno(String phno) {
		this.phno = phno;
	}
	public String getAccno() {
		return accno;
	}
	public void setAccno(String accno) {
		this.accno = accno;
	}
	public int getCvv() {
		return cvv;
	}
	public void setCvv(int cvv) {
		this.cvv = cvv;
	}
	@Override
	public String toString() {
		return "Payment [id=" + id + ", name=" + name + ", email=" + email + ", phno=" + phno + ", accno=" + accno
				+ ", cvv=" + cvv + "]";
	}
	public Payment(int id, String name, String email, String phno, String accno, int cvv) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.phno = phno;
		this.accno = accno;
		this.cvv = cvv;
	}
	public Payment() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}