package com.app.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.PutMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.app.demo.model.Vilvah;
import com.app.demo.service.VilvahService;

@RestController
public  class VilvahController {
	@Autowired
	VilvahService vilService;
	@GetMapping("/out")
	public List<Vilvah> getAllVilvahs()
	{
		List<Vilvah> vilList = vilService.getAllVilvahs();
		return vilList;
	}
//
////http://localhost:8080/saveVilvah
//@PostMapping("/savevil")
//public Vilvah saveVilvah(@RequestBody Vilvah s)
//{
//	return vilService.saveVilvah(s);
//}
//@PutMapping(value="/updateVilvah/{pno}")
//public Vilvah updateVilvah(@RequestBody Vilvah s,@PathVariable int pno)
//{
//	return vilService.updateVilvah(s,pno);
//}
//@PutMapping(value="/updateVilvah")
//public Vilvah updateVilvah(@RequestBody Vilvah s)
//{
//	return vilService.updateVilvah(s);
//}
//@DeleteMapping(value="/deleteVilvah/{productno}")
//public void deleteVilvah(@PathVariable("productno") int productno)
//{
//     vilService.deleteVilvah(productno);
//}
////sorting
//@GetMapping("/sortVilvah/{name}")
//public List<Vilvah> sortVilvahs(@PathVariable String name)
//{
//	return vilService.sortVilvahs(name);
//}
//
////paging
//@GetMapping("/pagingVilvah/{offset}/{pageSize}")
//public Page<Vilvah> pagingVilvahs(@PathVariable int offset,@PathVariable int pageSize)
//{
//	return vilService.pagingVilvahs(offset,pageSize);
//}
//
////pagingandsorting
//@GetMapping("/pagingAndSortingVilvah/{offset}/{pageSize}/{field}")
//
//public List<Vilvah> pagingAndSorting(@PathVariable int offset,@PathVariable int pageSize,@PathVariable String field) 
//{
//	return vilService.pagingAndSorting(offset, pageSize, field);
//}
////http://localhost:9080/fetchStudentsByNamePrefix?prefix=a
//@GetMapping("/{prefix}")
//public List<Vilvah> fetchByPrefix(@RequestParam String prefix)
//{
//	return vilService.fetchTypeByPrefix(prefix);
//}
//@GetMapping("/{suffix}")
//public List<Vilvah> fetchBySuffix(@RequestParam String suffix)
//{
//	return vilService.fetchTypeBySuffix(suffix);
//}
////query
////http://localhost:8080/fetchStudentsByType/ECE/Minu
//@GetMapping("/fetchStudentsByVilvah/{type}/{name}")
//public List<Vilvah> getVilvahsByType(@PathVariable String type,@PathVariable String name)
//{
//	return vilService.getVilvahsByType(type,name);

//}
@DeleteMapping("/deleteVilvahByName/{name}")
public String deleteVilvahByName(@PathVariable String name)
{
	int result=vilService.deleteVilvahByName(name);
	if(result>0)
		return "Player record deleted";
	else
		return "Problem occured while deleting";
}

//@PutMapping("/updateVilvahByName/{type}/{name}")
//public String updateVilvahByName(@PathVariable String type,@PathVariable String name)
//{
//	int result=vilService.updateVilvahByName(type,name);
//	if(result>0)
//		return "Player record updated";
//	else
//		return "Problem occured while updating";
//}

//
//@GetMapping("/native/{type}")
//public List<Vilvah> fetchVilvahByType(@PathVariable String type )
//{
//	return vilService.fetchVilvahByType(type);
//}







}