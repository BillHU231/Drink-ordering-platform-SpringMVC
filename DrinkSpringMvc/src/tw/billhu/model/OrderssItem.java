package tw.billhu.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;


@Entity@Table(name="OrderssItem")
@Component(value = "OrderssItem")
public class OrderssItem  implements Serializable{
	
	private int OrderssID;
	@Id@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int OitemID;
	private String poructName;
	private double actualprice;
	private int QTY;
	private double itemtot;
	public int getOrderssID() {
		return OrderssID;
	}
	public void setOrderssID(int orderssID) {
		OrderssID = orderssID;
	}
	public int getOitemID() {
		return OitemID;
	}
	public void setOitemID( int oitemID) {
		OitemID = oitemID;
	}
	public String getPoructName() {
		return poructName;
	}
	public void setPoructName(String poructName) {
		this.poructName = poructName;
	}
	public double getActualprice() {
		return actualprice;
	}
	public void setActualprice(double actualprice) {
		this.actualprice = actualprice;
	}
	public int getQTY() {
		return QTY;
	}
	public void setQTY(int qTY) {
		QTY = qTY;
	}
	public double getItemtot() {
		return itemtot;
	}
	public void setItemtot(double itemtot) {
		this.itemtot = itemtot;
	}

	public OrderssItem(int orderssID, String poructName, double actualprice, int qTY, double itemtot) {
		super();
		OrderssID = orderssID;
		this.poructName = poructName;
		this.actualprice = actualprice;
		QTY = qTY;
		this.itemtot = itemtot;
	}
	public OrderssItem() {
		super();
	}
	
	

}
