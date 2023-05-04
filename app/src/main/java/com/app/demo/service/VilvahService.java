package com.app.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.data.domain.Page;
//import org.springframework.data.domain.PageRequest;
//import org.springframework.data.domain.Sort;
//import org.springframework.data.domain.Sort.Direction;
//import org.springframework.stereotype.Service;
import org.springframework.stereotype.Service;

import com.app.demo.model.Vilvah;
import com.app.demo.repository.VilvahRepository;

import jakarta.transaction.Transactional;

@Service
public class VilvahService {
	@Autowired
	VilvahRepository vilRepository;
	public List<Vilvah> getAllVilvahs(){
	List<Vilvah> vilList = vilRepository.findAll();
	return vilList;
	}
	public Vilvah saveVilvah(Vilvah s)
	{
		Vilvah obj = vilRepository.save(s);
		
		return obj;
	}
	public Vilvah updateVilvah(Vilvah s)
	{
		Vilvah obj = vilRepository.save(s);
		
		return obj;
	}
     public Vilvah updateVilvah(Vilvah s,int jno)
     {
    	 Optional <Vilvah>optional = vilRepository.findById(jno);
    	 Vilvah obj = null;
    	 if(optional.isPresent())
    	 {
    		 obj=optional.get();
////    		 obj.setJerseyno(s.getJerseyno());
////    		 obj.setName(s.getName());
////    		 obj.setRollplay(s.getRollplay());
////    		 obj.setTeam(s.getTeam());
    		 vilRepository.save(s);
    	 }
    	 return obj;
     }
	
//	public void deleteVilvah(int jerseyno)
//	{
//		vilRepository.deleteById(jerseyno);
//	}
//	public List<Vilvah> sortVilvahs(String name) 
//	{
//	    // Ascending Order return playRepository.findAll(Sort.by(name));
//		return vilRepository.findAll(Sort.by(Direction.DESC,name));
//		
//	}
//	public Page<Vilvah> pagingVilvahs(int offset, int pageSize) 
//	{
//		PageRequest paging = PageRequest.of(offset, pageSize);
//		Page<Vilvah> vilData=vilRepository.findAll(paging);
//		//List<Vilvah> vilList=vilData.getContent();
//		return vilData;
//	}
//	
//	public List<Vilvah>pagingAndSorting(int offset,int pageSize,String field)
//	{
//		PageRequest paging = PageRequest.of(offset,pageSize).withSort(Sort.by(field));
//		Page<Vilvah> vil = vilRepository.findAll(paging);
//		return vil.getContent();
//	}
//	public List<Vilvah> fetchTypeByPrefix(String prefix)
//	{
//		return vilRepository.findByNameStartingWith(prefix);
//	}
//	public List<Vilvah> fetchTypeBySuffix(String suffix)
//	{
//		return vilRepository.findByNameEndingWith(suffix);
//	}
	
//	public List<Vilvah> getVilvahsByType(String type,String name)
//	{
//		return vilRepository.getVilvahsByType(type,name);
//	}
	
	@Transactional
	public int deleteVilvahByName(String name)
	{
		return vilRepository.VilvahByName(name);
	}

//	@Transactional
//	public int updateVilvahByName(String type,String name)
//	{
//		return vilRepository.updateVilvahByName(type,name);
//	}
//		
//	public List<Vilvah> fetchVilvahByType(String type)
//	{
//		return vilRepository.fetchVilvahByType(type);
	//}

	
}
