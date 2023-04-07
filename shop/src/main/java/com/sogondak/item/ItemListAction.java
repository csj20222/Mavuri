package com.sogondak.item;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sogondak.action.Action;
import com.sogondak.action.ActionForward;
import com.sogondak.item.dao.ItemDAO;

public class ItemListAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) {
		ItemDAO idao = new ItemDAO();
		ActionForward forward = new ActionForward();
		int totalCnt = idao.getItemCnt();
		
		String temp = request.getParameter("page");
		int page = 0;
		page = temp == null ? 1 : Integer.parseInt(temp);
		
		int pageSize = 10;
		int endRow = page * 10;
		int startRow = endRow - 9;
		
		int startPage = (page - 1)/pageSize * pageSize + 1;
		int endPage = startPage + pageSize - 1;
		int totalPage = (totalCnt -1)/ pageSize + 1;
		
		endPage = endPage > totalPage ? totalPage : endPage;
		
		request.setAttribute("totalCnt", totalCnt);
		
		request.setAttribute("totalPage", totalPage);
		request.setAttribute("nowPage", page);
		request.setAttribute("startPage", startPage);
		request.setAttribute("endPage", endPage);
		
		request.setAttribute("itemList", idao.getItemList(startRow, endRow));
		forward.setRedirect(false);
		forward.setPath("/shopdb.jsp");
		
		return forward;
	}

}
