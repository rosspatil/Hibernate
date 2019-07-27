package oneToone;

import java.io.Serializable;

public class Stock implements Serializable {

	private Integer stockId;
	private String stockCode;
	private String stockName;
	private StockDetails stockDetail;
	public Integer getStockId() {
		return stockId;
	}
	public void setStockId(Integer stockId) {
		this.stockId = stockId;
	}
	public String getStockCode() {
		return stockCode;
	}
	public void setStockCode(String stockCode) {
		this.stockCode = stockCode;
	}
	public String getStockName() {
		return stockName;
	}
	public void setStockName(String stockName) {
		this.stockName = stockName;
	}
	public StockDetails getStockDetail() {
		return stockDetail;
	}
	public void setStockDetail(StockDetails stockDetail) {
		this.stockDetail = stockDetail;
	}
	@Override
	public String toString() {
		return "Stock [stockId=" + stockId + ", stockCode=" + stockCode
				+ ", stockName=" + stockName + ", stockDetail=" + stockDetail
				+ "]";
	}
	
		
	
	
}
