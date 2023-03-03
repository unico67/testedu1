package mvcexam.controller;

import mvcexam.model.dao.VisitorDAO;
import mvcexam.model.vo.VisitorVO;

import java.util.List;

public class VisitorController {
	private VisitorDAO dao;
	public VisitorController() {
		dao = new VisitorDAO();	
	}
	public void listVisitor() {			
		List<VisitorVO> list = dao.listAll(); 
		for(VisitorVO vo : list) {
			System.out.print(vo.getId()+"\t");
			System.out.print(vo.getName()+"\t");
			System.out.print(vo.getWriteDate()+"\t");
			System.out.println(vo.getMemo());
		}
	}
	public boolean oneVisitor(int id, boolean output) {			
		VisitorVO vo = dao.one(id); 
		boolean result = false;		
		if(vo != null ) { 
			result = true;
			if(output) {
				System.out.print(vo.getId()+"\t");
				System.out.print(vo.getName()+"\t");
				System.out.print(vo.getWriteDate()+"\t");
				System.out.println(vo.getMemo());
			} 		
		}
		return result;
	}
	public void searchVisitor(String keyword) {
		List<VisitorVO> list = dao.search(keyword); 
		if (list.size() == 0)
			System.out.println(keyword + "를 포함한 글은 없네요~~");
		else 
			for(VisitorVO vo : list) {
				System.out.print(vo.getId()+"\t");
				System.out.print(vo.getName()+"\t");
				System.out.print(vo.getWriteDate()+"\t");
				System.out.println(vo.getMemo());
			}	
	}	
	public void insertVisitor(String name, String memo) {
		VisitorVO vo = new VisitorVO();
		vo.setName(name);
		vo.setMemo(memo);
		System.out.println(vo);
		boolean result = dao.insert(vo);
		if (result)
			System.out.println(name +"님의 글이 성공적으로 저장했어요^^");
		else 
			System.out.println(name +"님의 글 저장 작업을 실패했어요ㅜㅜ");
	}
	public void deleteVisitor(int id) {
		boolean result = dao.delete(id);
		if (result)
			System.out.println(id +"번 글을 성공적으로 삭제했어요^^");
		else 
			System.out.println(id +"번 글이 존재하지 않아요ㅜㅜ");

	}
	public void updateVisitor(int id, String name, String memo) {
		VisitorVO vo = new VisitorVO();
		vo.setId(id);
		vo.setName(name);
		vo.setMemo(memo);
		boolean result = dao.update(vo);
		if (result)
			System.out.println(name +"님의 글이 성공적으로 수정했어요^^");
		else 
			System.out.println(name +"님의 글 수정 작업을 실패했어요ㅜㅜ");

	}
}
