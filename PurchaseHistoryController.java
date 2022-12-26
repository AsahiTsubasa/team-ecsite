package jp.co.internous.kingdom.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import jp.co.internous.kingdom.model.domain.dto.PurchaseHistoryDto;
import jp.co.internous.kingdom.model.mapper.TblPurchaseHistoryMapper;
import jp.co.internous.kingdom.model.session.LoginSession;

@Controller
@RequestMapping("/kingdom/history")
public class PurchaseHistoryController {
	
	@Autowired
	private TblPurchaseHistoryMapper TblPurchaseHistoryMapper;
	
	@Autowired
	private LoginSession loginSession;
	
	@RequestMapping("/")
	public String index(Model model) {
		
		int userId = loginSession.getUserId();
		
		List<PurchaseHistoryDto> history = TblPurchaseHistoryMapper.findHistory(userId);
		
		model.addAttribute("history",history);
		
		model.addAttribute("loginSession", loginSession);
		
		return "purchase_history";
	}
	
	@RequestMapping("/delete")
	@ResponseBody
	public boolean delete() {
		
		int userId = loginSession.getUserId();
	
		int result =TblPurchaseHistoryMapper.deleteId(userId);
	
		return result > 0;
	}
}
