package bo;

import java.util.ArrayList;

import com.microsoft.sqlserver.jdbc.SQLServerDataSourceObjectFactory;


import bean.aoquanbean;
import dao.aoquandao;

public class aoquanbo {
	aoquandao aqdao = new aoquandao();
	ArrayList<aoquanbean> ds;
	public ArrayList<aoquanbean> getaoquan() throws Exception{
		ds = aqdao.getaoquan();
		return ds;
		
	}
	
	public ArrayList<aoquanbean> TimMa(String maloai) throws Exception{
		ArrayList<aoquanbean> tam = new ArrayList<aoquanbean>();
		for(aoquanbean s : ds) {
			if(s.getMaloai().toLowerCase().trim().equals(maloai.toLowerCase().trim())) {
				tam.add(s);
				
			}
		}
		return tam;
		
	}
	public ArrayList<aoquanbean> Tim(String key) throws Exception{
		ArrayList<aoquanbean> tam = new ArrayList<aoquanbean>();
		for(aoquanbean s:ds)
			if(s.getTenaoquan().toLowerCase().trim().contains(key.toLowerCase().trim()) ||
					s.getMau().toLowerCase().trim().contains(key.toLowerCase().trim()))
				tam.add(s);
		return tam;
	}
	public ArrayList<aoquanbean> SuaSoLuong(String maaoquan,long slsua) throws Exception{
		int n = ds.size();
		for(int i = 0; i < n;i++) {
			aoquanbean s = ds.get(i);
			if(s.getMaaoquan().equals(maaoquan)) {
				aqdao.CapNhatSL(maaoquan,slsua);
				return ds;
			}
		}
		return ds;
	}
	public ArrayList<aoquanbean> PhanTrang(int bd,int kt){
		try {
			return aqdao.PhanTrang(bd,kt);
			
		}catch (Exception e) {
			return null;
			
		}
	}
	public ArrayList<aoquanbean> TimMa_SQL(String ml,int bd,int kt){
		try {
			return aqdao.TimMa_SQL(ml,bd,kt);
			
			
		}catch (Exception e) {
			return null;
		}
	}
	
	public ArrayList<aoquanbean> Tim_SQL(String key,int bd,int kt){
		try {
			return aqdao.Tim_SQl(key,bd,kt);
			
		}catch(Exception e) {
			return null;
		}
	}
	


	

}
