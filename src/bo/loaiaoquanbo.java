package bo;

import java.util.ArrayList;

import bean.loaiaoquanbean;
import dao.loaiaoquandao;

public class loaiaoquanbo {
	loaiaoquandao ldao = new  loaiaoquandao();
	public ArrayList<loaiaoquanbean> getLoai() throws Exception{
		return ldao.getloai();
	}

}
