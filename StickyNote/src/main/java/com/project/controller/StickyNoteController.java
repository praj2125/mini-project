package com.project.controller;
import java.time.LocalDate;
import java.util.List;
import java.util.Map;
import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import com.project.entity.StickyEntity;
import com.project.exception.StickyNoteServiceException;
import com.project.service.StickyNoteService;

@Controller
public class StickyNoteController {
	int sid;
	@Autowired
	private StickyNoteService stickyNoteService;
	
         /*----------------------------------------Inserting Stickys--------------------------------------------*/
	@RequestMapping("/addSticky.project")
	public String addSticky(HttpServletRequest request, Map<String, String> model, HttpSession session) {
		StickyEntity stickys = new StickyEntity();
		stickys.setTitle(request.getParameter("title"));
		stickys.setDescription(request.getParameter("description"));
		stickys.setTarget_date(LocalDate.parse(request.getParameter("target_date")));
		stickys.setRemark(request.getParameter("remark"));
		session = request.getSession();
		int uid = (Integer) session.getAttribute("user");
		stickys.setUsers(uid);
		try {
			stickyNoteService.addSticky(stickys);
			model.put("message", "Sticky added successfully");
			return "redirect:/fetchSticky.project";
		} catch (StickyNoteServiceException e) {
			model.put("message", e.getMessage());
			return "Login.jsp";
		}
	}
	
	 /*----------------------------------------Update/Edit Stickys--------------------------------------------*/
	@RequestMapping("/updateSticky.project")
	public String objFetch(HttpServletRequest request, Map model, HttpSession session) {
		int ui = Integer.parseInt(request.getParameter("ud"));
		sid = ui;
		StickyEntity s = stickyNoteService.findSticky(ui);
		model.put("ls", s);
		return "updateSticky.jsp";
	}

	@RequestMapping("/editSticky.project")
	public String stickyEdit(HttpServletRequest request, Map model, HttpSession session) {
		StickyEntity stickyEntity = new StickyEntity();
		stickyEntity.setTitle(request.getParameter("title"));
		stickyEntity.setDescription(request.getParameter("description"));
		stickyEntity.setTarget_date(LocalDate.parse(request.getParameter("target_date")));
		stickyEntity.setRemark(request.getParameter("remark"));
		stickyEntity.setId(sid);
		stickyEntity.setUsers((Integer) session.getAttribute("user"));
		stickyNoteService.update(stickyEntity);
		return "redirect:/fetchSticky.project";
	}
	
	/*----------------------------------------Deleting Stickys--------------------------------------------*/
	@RequestMapping("/deleteSticky.project")
	public String stickyDelete(HttpServletRequest request, Map model) {
		int uid = Integer.parseInt(request.getParameter("id"));
		System.out.println(uid);
		stickyNoteService.delete(uid);
		return "redirect:/fetchSticky.project";
	}

	/*----------------------------------------Fetching Stickys--------------------------------------------*/
	@RequestMapping("/fetchSticky.project")
	public String registeredCustomers(HttpServletRequest request, Map<String, Object> model, HttpSession session) {
		session = request.getSession();
		System.out.println(session.getAttribute("user"));
		int uid = (Integer) session.getAttribute("user");
		List<StickyEntity> list = stickyNoteService.fetchAll(uid);
		model.put("list", list);
		return "StickyList.jsp";
	}

}
