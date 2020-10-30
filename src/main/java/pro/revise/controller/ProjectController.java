/**
 * 
 */
package pro.revise.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Admin
 *
 */

@Controller
public class ProjectController {

	/**
	 * 
	 */
	public ProjectController() {
		// TODO Auto-generated constructor stub
	}

	@RequestMapping("/projects")
	public String getProjects(Model model) {
		Map<String, String> values = new HashMap<String, String>();
		values.put("greeting", "Welcome to List Project");
		model.addAllAttributes(values);
		return "projects";
	}

}
